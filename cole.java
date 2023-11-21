import java.util.Scanner;

public class Trabajo {

	public static void main(String[] args) {
		Scanner imput = new Scanner(System.in);
		String nombre;
		String texto;
		String cuenta;
		double saldo = 0;
		String log = " ";
		String gastos = " ";
		int opcion;
		int opcion2;
		int opcion3;
		int ingresos;
		int retirar;
		int cantidad;
		boolean seguir = true;
		System.out.println("Introduce tu nombre: ");
		nombre = imput.nextLine();
		System.out.println("Introduce tu fecha de nacimiento:");
		texto = imput.next();
		System.out.println("Introduce tu numero de cuenta:");
		cuenta = imput.next();
		System.out.println("Tu saldo inicial es de 0�");
		while (seguir == true) {
			System.out.println("Seleccione una opción: \n" + "1. Datos de la cuenta \n" + "2. Ingresar  \n"
					+ "3. Retirar \n" + "4. Ver la equivalencia del saldo en otras monedas \n"
					+ "5. Ver la cantidad de ingresos realizados \n" + "6. Ver la cantidad de gastos realizados \n"
					+ "7. Salir \n" + ">>");
			opcion = imput.nextInt();
			switch (opcion) {
			case 1:
				System.out.println(nombre);
				System.out.println(texto);
				System.out.println(cuenta);
				System.out.println(saldo);
				break;
			case 2:
				System.out.println("Introduzca la cantidad que desea ingresar: ");
				ingresos = imput.nextInt();
				saldo += ingresos;
				System.out.println("El dinero actual es de +" + saldo );
                //Añadimos el log de ingresar.
                log += "+ " + ingresos;
                
				break;
			case 3:
				System.out.println("Introduzca la cantidad que desea retirar: ");
				retirar = imput.nextInt();
				if (retirar > saldo) {
					System.out.println("Esta seguro que desea retirar?: \n" + "1. Si \n" + "2. No \n" + ">>");

					opcion2 = imput.nextInt();
					switch (opcion2) {
					case 1:
						 saldo-= retirar;
						 gastos += "-" + retirar;
						System.out.println("Retirada realizada: " + saldo );
						
						break;
					case 2:
						System.out.println(" ");
					}
				} else {
					//Añadimos el log de retirar 
					 gastos += "-" + retirar;
					 saldo-= retirar;
					System.out.println("El dinero actual es de " + saldo );
				}
         System.out.println("Su dinero actual en la cuenta es de: " + saldo + "�.");
        
				break;
			case 4:
				System.out.println("Introduzca la cantidad que quiera ver:");
				cantidad = imput.nextInt();
				System.out.println("Que equivalencia quiere obtener?: \n" + "1. Dólares estadounidenses \n"
						+ "2. Libras esterlinas \n" + "3. Yuanes chinos \n" + ">>");
				opcion3 = imput.nextInt();
				switch (opcion3) {
				case 1:
					System.out.println(" El resultado de la equivalencia es: " + (cantidad * 0.95));
					break;
				case 2:
					System.out.println("El resultado de la equivalencia es: " + (cantidad * 1.15));
					break;
				case 3:
					System.out.println("El resultado de la equivalencia es: " + (cantidad * 0.13));
					break;

				}
			case 5:
				System.out.println("Sus ingresos realizados son " + log + "�");
				break;
			case 6:
				System.out.println( "Sus gastos realizados son " + gastos + "�");
				break;
			case 7:
				System.out.println("Fin del programa.");
				seguir = false;
				break;
				default:
					System.out.println("ERROR. El numero introducido no es valido.");
			}
		}
	}

	}
