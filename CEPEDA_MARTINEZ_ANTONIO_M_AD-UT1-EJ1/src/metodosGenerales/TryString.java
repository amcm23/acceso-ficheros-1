package metodosGenerales;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.util.StringTokenizer;

public class TryString {

	BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
	/* ||||||||METODOS PARA LAS STRING||||||||| */

	/**
	 * Método que evita introducir un dni que no sea de 8 dígitos y 1 carácter
	 * 
	 * @param s
	 * @return
	 * @throws IOException
	 */
	public String TryDNI(String dni) throws IOException {
		String DNI = dni;
		boolean error = false;
		char c;
		do {
			error = false;
			while (DNI.length() != 9) { // comprueba que la longitud del string sea de 9
				System.out.println("Longitud del DNI incorrecta, vuelva a introducirlo");
				DNI = leer.readLine();
			}
			for (int i = 0; i < 8; i++) { // comprueba que los 8 primeros carácteres sean dígitos
				c = DNI.charAt(i);
				if (!Character.isDigit(c)) {
					error = true;
					break;
				}
			}
			if (!Character.isAlphabetic(DNI.charAt(8))) // si el carácter 9 no es letra salta error
				error = true;
			if (error) {
				System.out.println("DNI no válido, introduzcalo de nuevo");
				DNI = leer.readLine();
			}
		} while (error);
		return DNI;
	}
	 
	public LocalDate TryFecha(String fecha) {
		int anio;
		int mes;
		int dia;
		StringTokenizer st = new StringTokenizer(fecha);
	        anio=Integer.parseInt(st.nextToken("-"));
	        mes=Integer.parseInt(st.nextToken("-"));
	        dia=Integer.parseInt(st.nextToken("-"));
	    LocalDate date=LocalDate.of(anio, mes, dia);
		return date;
	}

	/**
	 * Método que comprueba que la cadena introducida sea completamente alfabética
	 * 
	 * @param cadena cadena a comprobar
	 * @return
	 * @throws IOException
	 */
	public String TryAlfabetico(String cadena) throws IOException {

		boolean error;
		do {
			error = true;
			for (int i = 0; i < cadena.length(); i++) {

				if (!Character.isAlphabetic(cadena.charAt(i)) && (!Character.isWhitespace(cadena.charAt(i)))) {
					error = false;
					System.out.println("Inserte una cadena exclusivamente alfabética: ");
					cadena = leer.readLine();
				}
			}

		} while (!error);
		return cadena;
	}

	/**
	 * Método que permite elegir la longitud máxima del String
	 * 
	 * @param max longitud máxima del string
	 * @return
	 * @throws IOException
	 */
	public String minmaxString(int max) throws IOException {
		String palabra = leer.readLine();
		while (palabra.length() > max) {
			System.out.println("Inserte una palabra con la longitud correcta: ");
			palabra = leer.readLine();

		}
		return palabra;
	}

	public void contarVocales(String palabra) {

		int contador = 0;
		for (int i = 0; i < palabra.length(); i++) {
			if (palabra.charAt(i) == 'a' || palabra.charAt(i) == 'e' || palabra.charAt(i) == 'i'
					|| palabra.charAt(i) == 'o' || palabra.charAt(i) == 'u') {
				contador++;
			}
		}
		System.out.println("La palabra " + palabra + " tiene " + contador + " vocales.");
	}

	/**
	 * Metodo que permite introducir una cadena de caracteres por parámetro y
	 * sustituir una palabra o trozo de la cadena por otra palabra o trozo de cadena
	 * de caracteres
	 * 
	 * @param palabras   cadena String en la que se quiere sustituir algo
	 * @param reemplazar palabra a reemplazar
	 * @param reemplazo  palabra reemplazadora
	 * @return
	 */
	public String sustituirString(String palabras, String reemplazar, String reemplazo) {

		palabras = palabras.replace(reemplazar, reemplazo);
		return palabras;
	}

	/**
	 * Metodo que permite introducir una cadena de caracteres y eliminar los
	 * espacios en dicha cadena
	 * 
	 * @param cadena cadena a eliminar los espacios
	 * @return
	 */
	public String borrarEspacios(String cadena) {

		cadena = cadena.replace(" ", "");
		return cadena;

	}

	/**
	 * Metodo que imprime una cadena invertida
	 * 
	 * @param cadena a invertir
	 */
	public void invierteString(String cadena) {
		for (int i = cadena.length() - 1; i >= 0; i--) {
			System.out.print(cadena.charAt(i));
		}
	}

	/**
	 * método que retorna true si la cadena insertada es palíndroma
	 * 
	 * @param cadena cadena a comprobar si es palíndroma
	 * @return
	 */
	public boolean esPalindromo(String cadena) {

		String aux = ""; // este auxiliar guarda la cadena del revés para compararla con la cadena
							// original
		for (int i = cadena.length() - 1; i >= 0; i--) {
			aux += cadena.charAt(i);
		}
		if (aux.equalsIgnoreCase(cadena))
			return true;
		else
			return false;
	}

	/**
	 * Clase que separa los nombres y las notas del resto del String mediante el
	 * método StringTokenizer
	 * 
	 * @param cadena
	 * @return
	 */
	public void miStringTokenizer(String cadena) {

		String notas = "Juan Carlos\n 8.5\n Andrés\n 4.9\n Pedro\n 3.8\n Juan\n 6.3";
		StringTokenizer st = new StringTokenizer(notas, "\n"); // aquí delimito que las \n separarán los tokens
		while (st.hasMoreTokens()) {
			System.out.println("El alumno " + st.nextToken() + " ha sacado la nota" + st.nextToken()
					+ "."); /*
							 * st.nextToken() me imprime un token y pasa al siguiente (borra este token ya
							 * imprimido del array de tokens)
							 */
		}
	}

}
