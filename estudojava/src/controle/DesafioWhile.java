package controle;

import java.util.Scanner;

public class DesafioWhile {
public static void main(String[] args) {
	
	Scanner entrada = new Scanner(System.in);
	
	int quantDeNotas = 0;
	double nota = 0;
	double total = 0;
	
	while(nota != -1) {
		System.out.printf("Informe uma nota (ou -1 p/ sair): ");
		nota = entrada.nextDouble();
		
		if (nota >= 0 && nota <= 10) {
		
		total += nota;
		quantDeNotas ++;
		} else if (nota !=-1) {
			System.out.println("Nota inválida!!");
		}
	}
	
	//Calcular a média
	double media = total / quantDeNotas;
	System.out.println("Média = " + media);
	
	entrada.close();
	
	
	}
}
