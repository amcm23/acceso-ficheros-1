package metodosGenerales;

public class TryNums {

	/**
	 * M�todo boolean que retorna true si el n�mero insertado es capic�a
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
