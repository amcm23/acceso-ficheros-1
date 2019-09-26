package metodosGenerales;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class TryFicheros {

	/**
	 * Crea un fichero de texto en el directorio actual con el nombre recibido por
	 * parámetro.
	 * 
	 * @param nombreArchivo
	 */
	public void crearArchivo(String nombreArchivo) {
		File archivo = new File(nombreArchivo);
		try {
			PrintWriter salida = new PrintWriter(new FileWriter(archivo));
			salida.close();
			System.out.println("El archivo se ha creado correctamente\n");
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}

	/**
	 * Sobreescribe lo escrito en un archivo
	 * 
	 * @param nombreArchivo
	 */
	public void reEscribirArchivo(String nombreArchivo) {
		File archivo = new File(nombreArchivo);
		try {
			PrintWriter salida = new PrintWriter(new FileWriter(archivo));
			String contenido = "Contenido a escribir en el archivo";
			salida.println(contenido);
			salida.println();
			salida.println("Fin de escritura");
			salida.close();
			System.out.println("Se ha escrito correctamente al archivo\n");
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}

	/**
	 * Te imprime el archivo por consola.
	 * 
	 * @param nombreArchivo
	 */
	public void leerArchivo(String nombreArchivo) {
		File archivo = new File(nombreArchivo);
		try {
			BufferedReader entrada = new BufferedReader(new FileReader(archivo));
			String lectura;
			lectura = entrada.readLine();
			while (lectura != null) {
				System.out.println("Lectura: " + lectura);
				lectura = entrada.readLine();
			}
			entrada.close();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}

	/**
	 * Añade texto a un archivo
	 * 
	 * @param nombreArchivo
	 */
	public void anexarArchivo(String nombreArchivo) {
		File archivo = new File(nombreArchivo);
		try {
			PrintWriter salida = new PrintWriter(new FileWriter(archivo, true));
			String contenido = "Anexando informacional archivo";
			salida.println(contenido);
			salida.println();
			salida.println("Fin de anexar");
			salida.close();
			System.out.println("Se ha anexado la informacioncorrectamente\n");
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}

}
