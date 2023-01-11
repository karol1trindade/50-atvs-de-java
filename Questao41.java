import java.util.Scanner;
public class Questao41 {
    /*Elabore um programa que permita receber o peso (double) e a altura (double) de
uma pessoa adulta. O programa deverá exibir uma das seguintes mensagens:
“Parabéns peso ideal”, “Engorde XXX Kg” ou “Emagreça XXX Kg” de acordo com a
tabela abaixo:
 */ 
    public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	
	double peso,altura=0;
	
	System.out.println("Altura: ");
	altura = entrada.nextDouble();
	
	System.out.println("Peso: ");
	peso = entrada.nextDouble();

	if (altura <= 1.50 && peso == 50) {
		System.out.println("Parabéns. Peso ideal");
	} else if (altura <= 1.50 && peso > 50) {
		System.out.println("Emagreça " + (peso - 50) + " Kg");
	} else if (altura <= 1.50 && peso < 50) {
		System.out.println("Engorde " + (50 - peso) + " Kg");
	} else if (altura >= 1.51 && altura <= 1.90 && peso == 70) {
		System.out.println("Parabéns. Peso ideal");
	} else if (altura >= 1.51 && altura <= 1.90 && peso > 70) {
		System.out.println("Emagreça " + (peso - 70) + " Kg");
	} else if (altura >= 1.51 && altura <= 1.90 && peso < 70) {
		System.out.println("Engorde " + (70 - peso) + " Kg");
	} else if (altura > 1.91 && peso == 100) {
		System.out.println("Parabéns. Peso ideal");
	} else if (altura > 1.91 && peso > 100) {
		System.out.println("Emagreça " + (peso - 100) + " Kg");
	} else if (altura > 1.91 && peso < 100) {
		System.out.println("Engorde " + (100 - peso) + " Kg");
	}	
}
}
