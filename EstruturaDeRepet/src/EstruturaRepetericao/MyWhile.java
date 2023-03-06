package EstruturaRepetericao;

public class MyWhile {

	public static void main(String[] args) {
		int numero = 0;
		
		while(numero <= 10) {  /*Estrutura verificar e depois executa*/
			System.out.println("O número atual é :" + numero);
			
			numero++;
			
			
			/*---------------------------------------------------*/
			
			int numero2 = 0;
		
			do { /* Primeiro Executa e depois verifica*/
				
				System.out.println("O número atual é : " + numero2);
				numero2++;
			}while(numero2<=60);
		}

	}
}
