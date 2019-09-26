package ej_2;

import java.io.IOException;

import java.io.*;

public class ManejadorBinario {

	public void EscribirBinario(String nombre, int edad) throws IOException {
		File fichero = new File("PruebaFicheroBinario.dat");
		FileOutputStream fileout = new FileOutputStream(fichero);
		DataOutputStream dataOS = new DataOutputStream(fileout);
		dataOS.writeUTF(nombre);
		dataOS.writeInt(edad);
		dataOS.close();
	}

	public void LeerBinario() throws IOException {
		File fichero = new File(
				"//home//skoll///git/repository//CEPEDA_MARINEZ_ANTONIO_M_AD-UT1-EJ1//PruebaFicheroBinario.dat");
		FileInputStream filein = new FileInputStream(fichero);
		DataInputStream dataIS = new DataInputStream(filein);
		String n;
		int e;
		try {
			while (true) {
				n = dataIS.readUTF();
				e = dataIS.readInt();
				System.out.println("Nombre: " + n + ", edad: " + e);
			}
		} catch (EOFException eo) {
		}
		dataIS.close();
	}

}
