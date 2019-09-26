package metodosGenerales;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Random;

public class TryArray {

	BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));

	/* |||||||METODOS PARA LOS ARRAYS, MATRICES Y ARRAYLIST||||||| */

	/**
	 * M�todo que rellena un array con n�meros aleatorios
	 * 
	 * @param array array a ordenar
	 * @param max   numero m�ximo que se desea en el array
	 * @return
	 */
	public int[] rellenaArrayInt(int[] array, int max) {
		Random r = new Random();
		for (int i = 0; i < array.length; i++) {
			array[i] = r.nextInt(max) + 1;
		}
		return array;
	}

	/**
	 * M�todo que imprime por pantalla un array Entero
	 * 
	 * @param array Array entero ya creado
	 */
	public void imprimeArrayInt(int[] array) {
		System.out.print("(");
		for (int i = 0; i < array.length; i++) {
			if (i != (array.length - 1)) {
				System.out.print(array[i] + ",");
			} else {
				System.out.println(array[i] + ")");
			}
		}
	}

	/**
	 * m�todo que ordena un array ascendentemente
	 * 
	 * @param array array a ordenar
	 * @return
	 */
	public int[] ordenaArrayAscendente(int[] array) {
		int aux;
		boolean error = true;
		while (error) {
			error = false;
			for (int j = 0; j < array.length - 1; j++) {
				if (array[j] > array[j + 1]) {
					aux = array[j + 1];
					array[j + 1] = array[j];
					array[j] = aux;
					error = true;
				}
			}
		}
		return array;
	}

	/**
	 * m�todo que ordena un array descendentemente
	 * 
	 * @param array array a ordenar
	 * @return
	 */
	public int[] ordenaArrayDescendente(int[] array) {
		int aux;
		boolean error = true;
		while (error) {
			error = false;
			for (int j = 0; j < array.length - 1; j++) {
				if (array[j] < array[j + 1]) {
					aux = array[j + 1];
					array[j + 1] = array[j];
					array[j] = aux;
					error = true;
				}
			}
		}
		return array;
	}

	public int cuentaParesArray(int[] array) {
		int contador = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0)
				contador++;
		}
		return contador;
	}

	/**
	 * M�todo que rellena una matriz entera con n�meros aleatorios
	 * 
	 * @param matriz Matriz entera ya creada
	 * @param max    M�ximo deseado para los n�meros aleatorios
	 * @return
	 */
	public int[][] rellenaMatrizInt(int[][] matriz, int max) {
		Random r = new Random();
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = r.nextInt(max) + 1;
			}
		}
		return matriz;
	}

	/**
	 * M�todo que imprime una matriz bidimensional Entera
	 * 
	 * @param matriz Matriz entera ya creada
	 */
	public void imprimeMatrizInt(int[][] matriz) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (matriz[i][j] < 10) {
					System.out.print("0" + matriz[i][j] + ",");
				} else
					System.out.print(matriz[i][j] + ",");
			}
			System.out.println();
		}
	}

	/**
	 * ordena la fila de una matriz ascendentemente por el m�todo de la burbuja
	 * 
	 * @param matriz matriz a ordenar
	 * @param num    n�mero de fila a ordenar
	 * @return
	 */
	public int[][] ordenaFilaMatrizAscendenteBurbuja(int[][] matriz, int num) {
		int aux;
		boolean error = true;
		while (error) {
			error = false;
			for (int j = 0; j < matriz[num].length - 1; j++) {
				if (matriz[num][j] > matriz[num][j + 1]) {
					aux = matriz[num][j + 1];
					matriz[num][j + 1] = matriz[num][j];
					matriz[num][j] = aux;
					error = true;
				}
			}
		}
		return matriz;
	}

	/**
	 * ordena la fila de una matriz ascendentemente por el m�todo de inserci�n
	 * directa
	 * 
	 * @param matriz matriz a ordenar
	 * @param num    n�mero de fila a ordenar
	 * @return
	 */
	public int[][] ordenaFilaMatrizAscendenteInsercion(int[][] matriz, int num) {
		int aux = 0;
		int i = 0;
		for (int j = 0; j < matriz[num].length; j++) {
			i = j - 1;
			aux = matriz[num][j];
			while ((i >= 0) && (aux < matriz[num][i])) {
				matriz[num][i + 1] = matriz[num][i];
				i--;
			}
			matriz[num][i + 1] = aux;
		}
		return matriz;
	}

	/**
	 * ordena la fila de una matriz descendentemente por el m�todo de la burbuja
	 * 
	 * @param matriz matriz a ordenar
	 * @param num    n�mero de fila a ordenar
	 * @return
	 */
	public int[][] ordenaFilaMatrizDescendenteBurbuja(int[][] matriz, int num) {
		int aux;
		boolean error = true;
		while (error) {
			error = false;
			for (int j = 0; j < matriz[num].length - 1; j++) {
				if (matriz[num][j] < matriz[num][j + 1]) {
					aux = matriz[num][j + 1];
					matriz[num][j + 1] = matriz[num][j];
					matriz[num][j] = aux;
					error = true;
				}
			}
		}
		return matriz;
	}

	/**
	 * ordena la fila de una matriz descendentemente por el m�todo de inserci�n
	 * directa
	 * 
	 * @param matriz matriz a ordenar
	 * @param num    n�mero de fila a ordenar
	 * @return
	 */
	public int[][] ordenaFilaMatrizDescendenteInsercion(int[][] matriz, int num) {
		int aux = 0;
		int i = 0;
		for (int j = 0; j < matriz[num].length; j++) {
			i = j - 1;
			aux = matriz[num][j];
			while ((i >= 0) && (aux > matriz[num][i])) {
				matriz[num][i + 1] = matriz[num][i];
				i--;
			}
			matriz[num][i + 1] = aux;
		}
		return matriz;
	}

	/**
	 * ordena la columna de una matriz ascendentemente por el m�todo de la burbuja
	 * 
	 * @param matriz matriz a ordenar
	 * @param num    n�mero de columna a ordenar
	 * @return
	 */
	public int[][] ordenaColumnaMatrizAscendenteBurbuja(int[][] matriz, int num) {
		int aux;
		boolean error = true;
		while (error) {
			error = false;
			for (int j = 0; j < matriz.length - 1; j++) {
				if (matriz[j][num] > matriz[j + 1][num]) {
					aux = matriz[j + 1][num];
					matriz[j + 1][num] = matriz[j][num];
					matriz[j][num] = aux;
					error = true;
				}
			}
		}
		return matriz;
	}

	/**
	 * ordena la columna de una matriz ascendentemente por el m�todo de inserci�n
	 * directa
	 * 
	 * @param matriz matriz a ordenar
	 * @param num    n�mero de columna a ordenar
	 * @return
	 */
	public int[][] ordenaColumnaMatrizAscendenteInsercion(int[][] matriz, int num) {
		int aux = 0;
		int i = 0;
		for (int j = 0; j < matriz.length; j++) {
			i = j - 1;
			aux = matriz[j][num];
			while ((i >= 0) && (aux < matriz[i][num])) {
				matriz[i + 1][num] = matriz[i][num];
				i--;
			}
			matriz[i + 1][num] = aux;
		}
		return matriz;
	}

	/**
	 * ordena la columna de una matriz descendentemente por el m�todo de la burbuja
	 * 
	 * @param matriz matriz a ordenar
	 * @param num    n�mero de columna a ordenar
	 * @return
	 */
	public int[][] ordenaColumnaMatrizDescendenteBurbuja(int[][] matriz, int num) {
		int aux;
		boolean error = true;
		while (error) {
			error = false;
			for (int j = 0; j < matriz.length - 1; j++) {
				if (matriz[j][num] < matriz[j + 1][num]) {
					aux = matriz[j + 1][num];
					matriz[j + 1][num] = matriz[j][num];
					matriz[j][num] = aux;
					error = true;
				}
			}
		}
		return matriz;
	}

	/**
	 * ordena la columna de una matriz descendentemente por el m�todo de inserci�n
	 * directa
	 * 
	 * @param matriz matriz a ordenar
	 * @param num    n�mero de columna a ordenar
	 * @return
	 */
	public int[][] ordenaColumnaMatrizDescendenteInsercion(int[][] matriz, int num) {
		int aux = 0;
		int i = 0;
		for (int j = 0; j < matriz.length; j++) {
			i = j - 1;
			aux = matriz[j][num];
			while ((i >= 0) && (aux > matriz[i][num])) {
				matriz[i + 1][num] = matriz[i][num];
				i--;
			}
			matriz[i + 1][num] = aux;
		}
		return matriz;
	}

	/**
	 * M�todo que imprime los n�meros m�nimo y m�ximo de una matriz entera con su
	 * posici�n en la misma
	 * 
	 * @param matriz Matriz entera ya creada
	 */
	public void minmaxMatrizInt(int[][] matriz) {
		int maximo = matriz[0][0];
		int minimo = matriz[0][0];
		int maxX = 0;
		int maxY = 0;
		int minX = 0;
		int minY = 0;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (matriz[i][j] > maximo) {
					maximo = matriz[i][j];
					maxX = i;
					maxY = j;
				}
				if (matriz[i][j] < minimo) {
					minimo = matriz[i][j];
					minX = i;
					minY = j;
				}
			}
		}
		System.out.println("El m�ximo de la matriz es: " + maximo + " cuya posici�n es (" + maxX + "," + maxY + ")");
		System.out.println("El m�nimo de la matriz es " + minimo + " cuya posici�n es (" + minX + "," + minY + ")");
	}

	/**
	 * m�todo que saca el m�nimo de la fila elegida de una matriz
	 * 
	 * @param matriz
	 * @param num    fila a sacar el m�nimo
	 */
	public void ImprimeminFilaMatrizInt(int[][] matriz, int num) {

		int minimo = matriz[num][0];
		int minY = 0;

		for (int j = 0; j < matriz[num].length; j++) {
			if (matriz[num][j] < minimo) {
				minimo = matriz[num][j];
				minY = j;
			}
		}

		System.out.println("El m�nimo de la matriz es " + minimo + " ubicado en la posici�n " + num + "," + minY + ".");
	}

	public int minFilaMatrizInt(int[][] matriz, int num) {

		int minimo = matriz[num][0];

		for (int j = 0; j < matriz[num].length; j++) {
			if (matriz[num][j] < minimo) {
				minimo = matriz[num][j];
			}
		}

		return minimo;
	}

	public int minColumnaMatrizInt(int[][] matriz, int num) {

		int maximo = matriz[0][num];

		for (int j = 0; j < matriz.length; j++) {
			if (matriz[j][num] < maximo) {
				maximo = matriz[j][num];
			}
		}

		return maximo;
	}

	/**
	 * m�todo que saca el m�ximo de la fila elegida de una matriz
	 * 
	 * @param matriz
	 * @param num    fila a sacar el m�ximo
	 */
	public void ImprimemaxFilaMatrizInt(int[][] matriz, int num) {

		int maximo = matriz[num][0];
		int maxY = 0;

		for (int j = 0; j < matriz.length; j++) {
			if (matriz[num][j] > maximo) {
				maximo = matriz[num][j];
				maxY = j;
			}
		}
		System.out.println("El m�ximo de la matriz es " + maximo + " ubicado en la posici�n " + num + "," + maxY + ".");
	}

	public int maxFilaMatrizInt(int[][] matriz, int num) {

		int maximo = matriz[num][0];

		for (int j = 0; j < matriz.length; j++) {
			if (matriz[num][j] > maximo) {
				maximo = matriz[num][j];
			}
		}
		return maximo;
	}

	public int maxColumnaMatrizInt(int[][] matriz, int num) {

		int maximo = matriz[0][num];

		for (int j = 0; j < matriz.length; j++) {
			if (matriz[j][num] > maximo) {
				maximo = matriz[j][num];
			}
		}
		return maximo;
	}

	/**
	 * Imprime el contenido de un arrayList por pantalla
	 * 
	 * @param Lista arrayList a imprimir
	 */
	public void imprimeArrayListString(ArrayList<String> Lista) {
		for (int i = 0; i < Lista.size(); i++) {
			System.out.print(Lista.get(i) + ",");
		}
		System.out.println("");
	}

	/**
	 * genera una matriz cuadrada en forma caracol con el tama�o deseado.
	 * 
	 * @return
	 * @throws IOException
	 */
	public int[][] generaMatrizCaracol() throws IOException {
		Try t = new Try();
		System.out.println("Inserte el tama�o de la matriz cuadrada: ");
		int tamano = t.tryMinInt(1);
		int contador = 1;
		int principio = 0;
		int fin = tamano - 1;
		int[][] matriz = new int[tamano][tamano];
		while (contador <= tamano * tamano) {
			for (int i = principio; i <= fin; i++) {
				matriz[principio][i] = contador++;
			}
			for (int i = principio + 1; i <= fin; i++) {
				matriz[i][fin] = contador++;
			}
			for (int i = fin - 1; i >= principio; i--) {
				matriz[fin][i] = contador++;
			}
			for (int i = fin - 1; i >= principio + 1; i--) {
				matriz[i][principio] = contador++;
			}
			principio++;
			fin--;
		}

		return matriz;
	}

	/**
	 * comprueba si un vector est� contenido en alguna columna de una matriz
	 * 
	 * @param matriz
	 * @param vector
	 * @return
	 */
	public int columnaMatrizIgualVectorNxN(int[][] matriz, int[] vector) {
		int[] comprobar = new int[vector.length];
		int columna = -1;
		boolean igual = false;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				comprobar[j] = matriz[i][j];
				if (comprobar[j] == vector[j])
					igual = true;
			}
			if (igual) {
				columna = i;
				break;
			}
		}
		return columna;
	}

	/**
	 * m�todo que imprime el n�mero y las coordenadas de un punto de silla en la
	 * matriz
	 * 
	 * @param n      tama�o de la matriz cuadrada
	 * @param matriz matriz a comprobar si hay punto de silla
	 */
	public void puntoSilla(int n, int[][] matriz) {
		Try t = new Try();
		t.rellenaMatrizInt(matriz, 99);
		t.imprimeMatrizInt(matriz);
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (matriz[i][j] == t.minFilaMatrizInt(matriz, i)
						&& (matriz[i][j] == t.maxColumnaMatrizInt(matriz, j))) {
					System.out.println(
							"El n�mero " + matriz[i][j] + " de la coordenada " + i + "," + j + " es un punto silla");
				}
			}
		}
	}

	/**
	 * Este m�todo consiste en seleccionar el elemento m�s peque�o de nuestra lista
	 * para colocarlo al inicio y as� excluirlo de la lista. Para ahorrar espa cio,
	 * siempre que vayamos a colocar un elemento en su posici�n correcta lo
	 * intercambiaremos por aquel que la est� ocupando en ese momento.
	 * 
	 * @param A
	 */
	public void ordenaSeleccionEnteros(int[] A) {
		// El tama�o del array
		int n = A.length;
		// las n-1 pasadas.En la primera pasadai=0, y en la �ltima i=n-2
		for (int i = 0; i < n - 1; i++) {
			// Buscamos el m�nimo supondremos que es el primero
			int posMin = i;
			// nos movemos por el resto
			for (int j = i + 1; j < n; j++) {
				// si este es menor aun
				if (A[j] < A[posMin]) {
					// tomamos nota de su posici�n
					posMin = j;
				}
			}
			// intercambiar la posici�n i y elm�nimo encontrado
			int iaux = A[i];
			A[i] = A[posMin];
			A[posMin] = iaux;
		}
	}

}
