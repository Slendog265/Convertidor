package ui;

import java.util.Scanner;

import dol.CBK;

public class kiloConmega {
		
		Scanner entry = new Scanner(System.in);
		menu m = new menu();
		
		Double Kilobytes, Megabytes = (double) 0;
		short OP;
		
		
		public void Ecuacion() {
			CBK resultado = new CBK( Kilobytes, Megabytes);
			System.out.println("Por favor escriba una cantidad de Kilobytes.");
			Kilobytes = entry.nextDouble();
			
			Megabytes = Megabytes  / 1000;
			resultado.setKilobytes(Kilobytes);
			
			System.out.printf("Su respuesta seria %s%n%n", resultado.getKilobytes());
			System.out.println("Quiere seguir?");
			System.out.println("1.Continuar");
			System.out.println("2.Salir");
			
			OP = entry.nextShort();
			switch(OP) {
			
			case 1:
				m.Menu();
				break;
			case 2:
				System.exit(OP);
				break;
				default:
					System.out.println("Opcion no valida");
					break;
			}

			
			
		}

	
	}
