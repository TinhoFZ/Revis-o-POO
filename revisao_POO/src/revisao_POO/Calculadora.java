package revisao_POO;

import java.util.Scanner;

public class Calculadora {

public static double num1, num2, som, sub, mult, divi;
public static Scanner teclado = new Scanner (System.in);

	static void soma() {
		 som = num1 + num2;
		 System.out.println("A soma de ambos números é igual a: " + som);
	}
	
	static void sub() {
		sub = num1 - num2;
		System.out.println("A diferença entre os números é: " + sub);
	}
	
	static void multiplicacao() {
		mult = num1 * num2;
		System.out.println("O produto dos dois números é: " + mult);
	}
	
	static void divisao() {
		divi = num1 / num2;
		System.out.println("A divisao do primeiro número pelo segundo é: " + divi);
	}

	public static void main(String[] args) {

		String mSom, mSub, mMult, mDivi;
		
		System.out.println("Bem vindo a calculadora! Qual o primeiro número que deseja calcular?"); 
		num1 = teclado.nextDouble();
		System.out.println("Qual o segundo número que deseja calcular?");
		num2 = teclado.nextDouble();
		
		
		System.out.println("Deseja ver a soma? (Digite 'y' para sim e 'n' para não)");
		mSom = teclado.nextLine();
		if (mSom = "y") {
			soma();
		}
		sub();
		multiplicacao();
		divisao();
		
	}

}
