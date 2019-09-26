package metodosGenerales;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TryCatch {
	
	public BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));

	/* ||||||METODO PARA LOS NÚMEROS||||||| */

	/**
	 * Método que controla las excepciones para los enteros
	 * 
	 * @return
	 * @throws IOException
	 */
	public int tryInt() throws IOException { // método try catch para enteros
		boolean error;
		int comprobar = 0;
		do { // evita introducir no entero o carácteres
			try {
				error = true;
				comprobar = Integer.parseInt(leer.readLine());
			} catch (NumberFormatException e) {
				error = false;
				System.out.println("Error " + e.getMessage());
				System.out.println("Introduzca un número entero");
			}
		} while (!error);
		return comprobar;
	}

	/**
	 * Método que controla las excepciones para los float
	 * 
	 * @return
	 * @throws IOException
	 */
	public float tryFloat() throws IOException { // método try catch para float
		boolean error;
		float comprobar = 0;
		do { // evita introducir no float o carácteres
			try {
				error = true;
				comprobar = Float.parseFloat(leer.readLine());
			} catch (NumberFormatException e) {
				error = false;
				System.out.println("Error " + e.getMessage());
				System.out.println("Introduzca un número");
			}
		} while (!error);
		return comprobar;
	}

	/**
	 * Método que controla las excepciones para los long
	 * 
	 * @return
	 * @throws IOException
	 */
	public long tryLong() throws IOException { // método try catch para long
		boolean error;
		long comprobar = 0;
		do { // evita introducir no entero o carácteres
			try {
				error = true;
				comprobar = Long.parseLong(leer.readLine());
			} catch (NumberFormatException e) {
				error = false;
				System.out.println("Error " + e.getMessage());
				System.out.println("Introduzca un número tipo long");
			}
		} while (!error);
		return comprobar;
	}

	/**
	 * Método que controla las excepciones para los double
	 * 
	 * @return
	 * @throws IOException
	 */
	public double tryDouble() throws IOException { // método try catch para double
		boolean error;
		double comprobar = 0;
		do { // evita introducir no double o carácteres
			try {
				error = true;
				comprobar = Double.parseDouble(leer.readLine());
			} catch (NumberFormatException e) {
				error = false;
				System.out.println("Error " + e.getMessage());
				System.out.println("Introduzca un número");
			}
		} while (!error);
		return comprobar;
	}

	// métodos trymax, trymin, tryminmax que añaden límites aparte de controlar las
	// excepciones

	/**
	 * Método que aparte de controlar las excepciones controla un mínimo y un máximo
	 * para los enteros
	 * 
	 * @param min
	 * @param max
	 * @return
	 * @throws IOException
	 */
	public int tryMinMaxInt(int min, int max) throws IOException { // método try catch para enteros con mínimo y máximo
		boolean error;
		int comprobar = 0;
		do { // evita introducir no entero o carácteres
			try {
				error = true;
				comprobar = Integer.parseInt(leer.readLine());
			} catch (NumberFormatException e) {
				error = false;
				System.out.println("Error " + e.getMessage());
				System.out.println("Introduzca un número entero");
			}
			if (comprobar < min || comprobar > max) { // evita meter un nº fuera del rango deseado
				System.out.println("Introduzca un número dentro de los parámetros establecidos");
				error = false;
			}
		} while (!error);
		return comprobar;
	}

	/**
	 * Método que aparte de controlar las excepciones controla un mínimo para los
	 * enteros
	 * 
	 * @param min
	 * @return
	 * @throws IOException
	 */
	public int tryMinInt(int min) throws IOException { // método try catch para enteros con mínimo
		boolean error;
		int comprobar = 0;
		do { // evita introducir no entero o carácteres
			try {
				error = true;
				comprobar = Integer.parseInt(leer.readLine());
			} catch (NumberFormatException e) {
				error = false;
				System.out.println("Error " + e.getMessage());
				System.out.println("Introduzca un número entero");
			}
			if (comprobar < min) { // evita meter un nº fuera del rango deseado
				System.out.println("Introduzca un número dentro de los parámetros establecidos");
				error = false;
			}
		} while (!error);
		return comprobar;
	}

	/**
	 * Método que aparte de controlar las excepciones controla un máximo para los
	 * enteros
	 * 
	 * @param max
	 * @return
	 * @throws IOException
	 */
	public int tryMaxInt(int max) throws IOException { // método try catch para enteros con máximo
		boolean error;
		int comprobar = 0;
		do { // evita introducir no entero o carácteres
			try {
				error = true;
				comprobar = Integer.parseInt(leer.readLine());
			} catch (NumberFormatException e) {
				error = false;
				System.out.println("Error " + e.getMessage());
				System.out.println("Introduzca un número entero");
			}
			if (comprobar > max) { // evita meter un nº fuera del rango deseado
				System.out.println("Introduzca un número dentro de los parámetros establecidos");
				error = false;
			}
		} while (!error);
		return comprobar;
	}

	/**
	 * Método que aparte de controlar las excepciones controla un mínimo y un máximo
	 * para los float
	 * 
	 * @param min
	 * @param max
	 * @return
	 * @throws IOException
	 */
	public float tryMinMaxFloat(int min, int max) throws IOException { // método try catch para float con mínimo y
																		// máximo
		boolean error;
		float comprobar = 0;
		do { // evita introducir no float o carácteres
			try {
				error = true;
				comprobar = Float.parseFloat(leer.readLine());
			} catch (NumberFormatException e) {
				error = false;
				System.out.println("Error " + e.getMessage());
				System.out.println("Introduzca un número");
			}
			if (comprobar < min || comprobar > max) { // evita meter un nº fuera del rango deseado
				System.out.println("Introduzca un número dentro de los parámetros establecidos");
				error = false;
			}
		} while (!error);
		return comprobar;
	}

	/**
	 * Método que aparte de controlar las excepciones controla un mínimo para los
	 * float
	 * 
	 * @param min
	 * @return
	 * @throws IOException
	 */
	public float tryMinFloat(int min) throws IOException { // método try catch para float con mínimo
		boolean error;
		float comprobar = 0;
		do { // evita introducir no float o carácteres
			try {
				error = true;
				comprobar = Float.parseFloat(leer.readLine());
			} catch (NumberFormatException e) {
				error = false;
				System.out.println("Error " + e.getMessage());
				System.out.println("Introduzca un número");
			}
			if (comprobar < min) { // evita meter un nº fuera del rango deseado
				System.out.println("Introduzca un número dentro de los parámetros establecidos");
				error = false;
			}
		} while (!error);
		return comprobar;
	}

	/**
	 * Método que aparte de controlar las excepciones controla un máximo para los
	 * float
	 * 
	 * @param max
	 * @return
	 * @throws IOException
	 */
	public float tryMaxFloat(int max) throws IOException { // método try catch para float con máximo
		boolean error;
		float comprobar = 0;
		do { // evita introducir no float o carácteres
			try {
				error = true;
				comprobar = Float.parseFloat(leer.readLine());
			} catch (NumberFormatException e) {
				error = false;
				System.out.println("Error " + e.getMessage());
				System.out.println("Introduzca un número");
			}
			if (comprobar > max) { // evita meter un nº fuera del rango deseado
				System.out.println("Introduzca un número dentro de los parámetros establecidos");
				error = false;
			}
		} while (!error);
		return comprobar;
	}

	/**
	 * Método que aparte de controlar las excepciones controla un mínimo y un máximo
	 * para los long
	 * 
	 * @param min
	 * @param max
	 * @return
	 * @throws IOException
	 */
	public long tryMinMaxLong(int min, int max) throws IOException { // método try catch para long con mínimo y máximo
		boolean error;
		long comprobar = 0;
		do { // evita introducir no entero o carácteres
			try {
				error = true;
				comprobar = Long.parseLong(leer.readLine());
			} catch (NumberFormatException e) {
				error = false;
				System.out.println("Error " + e.getMessage());
				System.out.println("Introduzca un número tipo long");
			}
			if (comprobar < min || comprobar > max) { // evita meter un nº fuera del rango deseado
				System.out.println("Introduzca un número dentro de los parámetros establecidos");
				error = false;
			}
		} while (!error);
		return comprobar;
	}

	/**
	 * Método que aparte de controlar las excepciones controla un mínimo para los
	 * long
	 * 
	 * @param min
	 * @return
	 * @throws IOException
	 */
	public long tryMinLong(int min) throws IOException { // método try catch para long con mínimo
		boolean error;
		long comprobar = 0;
		do { // evita introducir no entero o carácteres
			try {
				error = true;
				comprobar = Long.parseLong(leer.readLine());
			} catch (NumberFormatException e) {
				error = false;
				System.out.println("Error " + e.getMessage());
				System.out.println("Introduzca un número tipo long");
			}
			if (comprobar < min) { // evita meter un nº fuera del rango deseado
				System.out.println("Introduzca un número dentro de los parámetros establecidos");
				error = false;
			}
		} while (!error);
		return comprobar;
	}

	/**
	 * Método que aparte de controlar las excepciones controla un máximo para los
	 * long
	 * 
	 * @param max
	 * @return
	 * @throws IOException
	 */
	public long tryMaxLong(int max) throws IOException { // método try catch para long con máximo
		boolean error;
		long comprobar = 0;
		do { // evita introducir no entero o carácteres
			try {
				error = true;
				comprobar = Long.parseLong(leer.readLine());
			} catch (NumberFormatException e) {
				error = false;
				System.out.println("Error " + e.getMessage());
				System.out.println("Introduzca un número tipo long");
			}
			if (comprobar > max) { // evita meter un nº fuera del rango deseado
				System.out.println("Introduzca un número dentro de los parámetros establecidos");
				error = false;
			}
		} while (!error);
		return comprobar;
	}

	/**
	 * Método que aparte de controlar las excepciones controla un mínimo y un máximo
	 * para los double
	 * 
	 * @param min
	 * @param max
	 * @return
	 * @throws IOException
	 */
	public double tryMinMaxDouble(int min, int max) throws IOException { // método try catch para double con mínimo y
																			// máximo
		boolean error;
		double comprobar = 0;
		do { // evita introducir no double o carácteres
			try {
				error = true;
				comprobar = Double.parseDouble(leer.readLine());
			} catch (NumberFormatException e) {
				error = false;
				System.out.println("Error " + e.getMessage());
				System.out.println("Introduzca un número");
			}
			if (comprobar < min || comprobar > max) { // evita meter un nº fuera del rango deseado
				System.out.println("Introduzca un número dentro de los parámetros establecidos");
				error = false;
			}
		} while (!error);
		return comprobar;
	}

	/**
	 * Método que aparte de controlar las excepciones controla un mínimo para los
	 * double
	 * 
	 * @param min
	 * @return
	 * @throws IOException
	 */
	public double tryMinDouble(int min) throws IOException { // método try catch para double con mínimo
		boolean error;
		double comprobar = 0;
		do { // evita introducir no double o carácteres
			try {
				error = true;
				comprobar = Double.parseDouble(leer.readLine());
			} catch (NumberFormatException e) {
				error = false;
				System.out.println("Error " + e.getMessage());
				System.out.println("Introduzca un número");
			}
			if (comprobar < min) { // evita meter un nº fuera del rango deseado
				System.out.println("Introduzca un número dentro de los parámetros establecidos");
				error = false;
			}
		} while (!error);
		return comprobar;
	}

	/**
	 * Método que aparte de controlar las excepciones controla un máximo para los
	 * double
	 * 
	 * @param max
	 * @return
	 * @throws IOException
	 */
	public double tryMaxDouble(int max) throws IOException { // método try catch para double con máximo
		boolean error;
		double comprobar = 0;
		do { // evita introducir no double o carácteres
			try {
				error = true;
				comprobar = Double.parseDouble(leer.readLine());
			} catch (NumberFormatException e) {
				error = false;
				System.out.println("Error " + e.getMessage());
				System.out.println("Introduzca un número");
			}
			if (comprobar > max) { // evita meter un nº fuera del rango deseado
				System.out.println("Introduzca un número dentro de los parámetros establecidos");
				error = false;
			}
		} while (!error);
		return comprobar;
	}

}
