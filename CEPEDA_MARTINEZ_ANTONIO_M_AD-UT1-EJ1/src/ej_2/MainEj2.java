package ej_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

import metodosGenerales.Try;

public class MainEj2 {
	
	

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Try tryclass = new Try();
		Departamento departamento = new Departamento();
		HashMap<Integer, Departamento> departaments = new HashMap<Integer, Departamento>();
		boolean salir = false;
		while (!salir) {
			System.out.println(
					"Bienvenido al programa, ¿Qué acción desea realizar? \n1.Insertar departamento.\n2.Consultar departamento.\n3.Salir.");
			ManejadorBinario handler = new ManejadorBinario();
			BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
			int n = tryclass.tryInt();
			switch (n) {
			case 1:
				System.out.println("Inserte el id del departamento a insertar:");
				int idDep = tryclass.tryInt();
				System.out.println("Inserte el nombre del departamento: ");
				departamento.nombre = r.readLine();
				System.out.println("Inserte la localidad.");
				departamento.localidad = r.readLine();
				departaments.put(idDep, departamento);
				handler.EscribirBinario(departaments);
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
