package com.example.project;

import java.util.Scanner;

public class Exercise1 {

	public static void main(final String[] args) {

		Exercise1 obj = new Exercise1();
		Scanner sc = new Scanner(System.in);
		while (true) {
			int n = sc.nextInt();
			System.out.println(obj.esCuadradoPerfecto(n));			
		}
	}

	public boolean esCuadradoPerfecto(int numero) {
		int indice = 1;
	   	int valor = evaluarCuadrado(numero, indice);
	    
	    	if(valor==1)
	        	return true;
	    	return false;
	}
	public int evaluarCuadrado(int num, int index){
		if(Math.pow(index,2)==num)
	        	return 1;
	    	else if(Math.pow(index,2)>num){
	        	return -1;
	    	}
	    	return evaluarCuadrado(num, index+1);	
	}
}
