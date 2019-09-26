package ej_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import metodosGenerales.Try;

public class Main {

	public static void main(String[] args) throws IOException {
		Try tryclass = new Try();
		boolean salir = false;
		while (!salir) {
			System.out.println(
					"Bienvenido al programa, ¿Qué acción desea realizar? \n1.Insertar empleado.\n2.Consultar empleados.\n3.Modificar Empleado.\n4.Eliminar Empleado.\n5.Salir");
			ManejadorDatos handler = new ManejadorDatos();
			BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
			int n =tryclass.tryInt();
			switch (n) {
			case 1:
				System.out.println("Inserte el id del empleado.");
				int id = tryclass.tryInt();
				System.out.println("Inserte el apellido del empleado.");
				String apellido = r.readLine();
				System.out.println("Inserte el departamento del empleado.");
				int dep = tryclass.tryInt();
				System.out.println("Inserte el salario del empleado.");
				float salario = tryclass.tryFloat();
				handler.EscribirFichero(id, apellido, dep, salario);
				System.out.println("Completado.");
				break;
			case 2:
				handler.LeerFichero();
				break;
			case 3:

				System.out.println("Empleados disponibles: ");
				handler.LeerFichero();
				System.out.println("\nInserte el id del empleado a modificar: ");
				id = Integer.parseInt(r.readLine());
				System.out.println("Inserte el apellido nuevo: ");
				apellido = r.readLine();
				System.out.println("Inserte el departamento nuevo: ");
				dep = Integer.parseInt(r.readLine());
				System.out.println("Inserte el salario nuevo: ");
				salario = Float.parseFloat(r.readLine());
				handler.modificarEmpleado(id, apellido, dep, salario);
				break;
			case 4:
				System.out.println("Inserte el id del empleado a eliminar: ");
				id = Integer.parseInt(r.readLine());
				handler.eliminarEmpleado(id);
				break;
			case 5:
				salir = true;
				break;

			default:
				break;
			}

		}
		System.out.println("Hasta pronto.");

	}
}
