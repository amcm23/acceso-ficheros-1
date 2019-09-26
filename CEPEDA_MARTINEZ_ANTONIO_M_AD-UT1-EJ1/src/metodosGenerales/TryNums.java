package metodosGenerales;

public class TryNums {

	/**
	 * Método boolean que retorna true si el número insertado es capicúa
	 * 
	 * @param numero num a comprobar si es capicua
	 * @return
	 */
	public boolean esCapicua(int numero) {
		String aux = Integer.toString(numero);
		String aux2 = ""; // auxiliar usado para guardar el numero del reves
		for (int i = aux.length() - 1; i >= 0; i--) {
			aux2 += aux.charAt(i);
		}
		if (aux2.equalsIgnoreCase(aux)) {
			return true;
		} else {
			return false;
		}
	}

}
