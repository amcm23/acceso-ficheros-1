package ej_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		boolean salir = false;
		while (!salir) {
			System.out.println(
					"Bienvenido al programa, ¿Qué acción desea realizar? \n1.Insertar persona.\n2.Consultar personas.\n3.Salir.");
			ManejadorBinario handler = new ManejadorBinario();
			BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
			int n = Integer.parseInt(r.readLine());
			switch (n) {
			case 1:
				System.out.println("Inserte el nombre.");
				String nombre = r.readLine();
				System.out.println("Inserte la edad.");
				int edad = Integer.parseInt(r.readLine());
				handler.EscribirBinario(nombre, edad);
				System.out.println("Completado.");
				break;
			case 2:
				handler.LeerBinario();
				break;
			case 3:
				salir = true;
				break;

			default:
				break;
			}

		}
		System.out.println("Hasta pronto.");

	}
}
