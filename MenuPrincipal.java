package Presentacion;

import java.util.Scanner;

import ManejoDatosOperaciones.CajeroOperacionesImpl;

public class MenuPrincipal {

	public static void main(String [] args) {
		Scanner in = new Scanner(System.in);
		int opcion = -1;
		CajeroOperacionesImpl operaciones = new  CajeroOperacionesImpl();
		
		while (opcion != 0) {
			
			System.out.println("Elija una opcion del 1 al 6 \n" + 
			"1.Depostitar dinero: \n"+
			"2.Retirar dinero: \n"+
			"3.Ver movimientos: \n"+
			"4.Ver saldo cuenta: \n"+
			"0.Salir");
			
			opcion = Integer.parseInt(in.nextLine());
			
			switch(opcion) {
			case 1:  
				System.out.println("Ingrese la cantidad a depositar");
				int dinero = Integer.parseInt(in.nextLine());
				operaciones.depositarDinero(dinero);
				break;
			   case 2:  
					System.out.println("Ingrese la cantidad a retirar");
					int  dineroR = Integer.parseInt(in.nextLine());
					operaciones.retirarDinero(dineroR);
					break;
			   case 3: 
				   operaciones.verMovimientos();
				   break;
			   case 4:
				   operaciones.verCantidadDinero();
				   break;
			   case 0:  
				   System.out.println("Hasta pronto");
				   break;
			   default:
					  System.out.println("Opcion invalida");
					  break;
					
			}
				
			
			
			
			
			}
		
			in.close();
			
			
		}
		
		
		
		
		
}
	

