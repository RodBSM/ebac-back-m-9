package br.com.rodbsm;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		scanner.useLocale(Locale.US);
		
		System.out.println("Insira um número: ");
        int input = scanner.nextInt();
        
        Integer wrapInteger = input;
        
        System.out.println("Este é o primitivo: " + input + " e este é o Wrapper: " + wrapInteger) ;
    	
	}
	
	private static Integer parseIntOrNull(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            return null;
        }
    }
}
