package ui;

import java.util.Scanner;

public class menu {

	
	Scanner entry = new Scanner(System.in);
	Short OP;
	
	public void displayOptions() {
		System.out.println("Bienvenido a esta calculadora de bytes a Kilobytes y de KiloBytes a Megabytes.");
		System.out.println("1.Convertir bytes a Kilobytes");
		System.out.println("2.Convertir Kilobytes a Megabytes");
		System.out.println("3.Salir");
		
	}
		
	public void Menu() {
		
		displayOptions();
		OP = entry.nextShort();
		
		do 
			switch (OP) {
			
			case 1:
				bytConkil B = new bytConkil();
				B.Ecuacion();
				
				break;
				
			case 2:
				kiloConmega M = new kiloConmega();
				M.Ecuacion();
				
				break;
				
			case 3:
				System.exit(0);
				break;
				
				default:
					System.out.println("El valor no es Valido" );
					break;
			
			}
		
		while (OP == 3);
		
		
	}
	
	
}
