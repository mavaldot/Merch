package ui;

import java.util.Scanner;

import model.Puerto;


public class Main {

	Scanner s;
	Puerto p;

	public Main() {
		init();
	}
	
	public void init() {
		s = new Scanner(System.in);
		p = new Puerto();
	}

	public void run() {
		
		String msg = s.nextLine();
		
		System.out.println(msg);
		System.out.println(msg);
		
		boolean ejecutando = true;
		int eleccion = 0;
		
		while(ejecutando) {
			System.out.println("Bienvenido");
			System.out.println("Elija una opcion:");
			System.out.println("1. Crear un contenedor");
			System.out.println("2. Calcular el volumen total");
			System.out.println("3. Calcular el volumen promedio");
			System.out.println("4. Salir");
			
			eleccion = s.nextInt();
			
			switch(eleccion) {
				
				case 1:
				
				System.out.println("Digite la altura del contenedor");
				double nombre = s.nextDouble();
				System.out.println("Digite el ancho del contenedor");
				double nombre = s.nextDouble();
				System.out.println("Digite el largo del contenedor");
				double nombre = s.nextDouble();
				
				break;
				
				case 2: 
				
				break;
				
				case 3:
				
				break;
				
				case 4:
				
				ejecutando = false;
				break;
				
			}
		}
		
		
		
		
	}

	public static void main(String[] args) {
	
		Main m = new Main();
	
		m.run();
	
	}

}