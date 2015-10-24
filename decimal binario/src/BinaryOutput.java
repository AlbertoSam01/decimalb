import java.util.Scanner;
public class BinaryOutput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numero;
		double numerobinario;
		int exponent;
		int digito;
		do{
		System.out.println("Inserte un numero mayor o igual a zero");
		Scanner user_input = new Scanner(System.in);
		
		numero = user_input.nextInt();
		}while (numero <0 );
		exponent=0;
        numerobinario=0;
        while(numero!=0){
                digito = numero % 2;                         	
                numerobinario = numerobinario + digito * Math.pow(10, exponent);  
                exponent++;
                numero = numero/2;
        }
        System.out.printf("Binario: %.0f %n", numerobinario);
	}

}