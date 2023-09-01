import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in); 

        System.out.println("Defina o valor inicial do contador: ");
        int numeroInicial = scan.nextInt();
        System.out.println("Defina o valor final do contador: ");
        int numeroFinal = scan.nextInt();
        System.out.println("Iniciando contador: ");
        scan.close();

        try {
			contar(numeroInicial, numeroFinal);
		}catch (Exception e) {
			System.out.println("Ocorreu um erro: " + e);
		    }		
    }
    
	static void contar(int numeroInicial, int numeroFinal ) throws ParametrosInvalidosException {
		int contagem = numeroFinal - numeroInicial;
        
        if(contagem > 0){
            for(int i = numeroInicial; i <= numeroFinal; i++){
                System.out.println("Número " + i);}
        }else{
            throw new ParametrosInvalidosException("Numero inicial deve ser menor que número final.");
        }
    }

}
