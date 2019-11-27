package potencia2;

import java.util.Scanner;

public class Potencia2 {

	public static void main(String[] args) {
	
		int base,exp;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Escribir una base");
		base=teclado.nextInt();
		System.out.println("Escribir un exponente");
		exp=teclado.nextInt();
		System.out.println(potencia(base,exp));

		teclado.close();
	}
	public static double potencia(int a, int b){
		double resultado=1;
		
		for (int i=1;i<b ;i++){
			resultado*=a;
		}
		return(resultado);
	}
	
}
