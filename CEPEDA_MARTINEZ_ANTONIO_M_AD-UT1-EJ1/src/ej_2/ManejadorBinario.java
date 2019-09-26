package ej_2;

import java.io.IOException;
import java.util.HashMap;
import java.io.*;

public class ManejadorBinario implements Serializable {
	FileInputStream filein;
	ObjectInputStream objectIS;

	HashMap<Integer, Departamento> departaments = new HashMap<Integer, Departamento>();

	public void EscribirBinario(HashMap<Integer, Departamento> departaments2) throws IOException {
		FileOutputStream fileout = new FileOutputStream("PruebaFicheroBinario.dat");
		ObjectOutputStream objectOS = new ObjectOutputStream(fileout);
		objectOS.writeObject(departaments2);
		fileout.close();
		objectOS.close();
	}

	public void LeerBinario() throws IOException, ClassNotFoundException {

		try {
			filein = new FileInputStream("PruebaFicheroBinario.dat");
			objectIS = new ObjectInputStream(filein);
			departaments = (HashMap<Integer, Departamento>) objectIS.readObject();
			objectIS.close();
			filein.close();
		} catch (FileNotFoundException e) {
			System.out.println("Fichero no encontrado, se creará el archivo.");
			File file = new File("PruebaFicheroBinario.dat");
			PrintWriter initialize = new PrintWriter(new FileWriter(file));
			initialize.close();
			LeerBinario();
		} catch (EOFException e) {
			filein.close();
		}

		try {
			System.out.println("Nombre: " + departaments.get(0).nombre);
		} catch (NullPointerException e) {
			System.out.println("No hay departamentos todavía.");
		}
	}

}
