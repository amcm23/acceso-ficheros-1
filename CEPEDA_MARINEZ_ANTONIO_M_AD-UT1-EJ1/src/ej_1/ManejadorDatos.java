package ej_1;

import java.io.*;

public class ManejadorDatos {
	
	File fichero;

	public void EscribirFichero(int id, String apellido, int dep, float salario) throws IOException {

		File testFile = new File("PruebaFicherosAleatorios.txt");
		RandomAccessFile file = new RandomAccessFile(testFile, "rw");
		long size = file.length();
		file.seek(size);
		StringBuffer buffer = null;
		file.writeInt(id);
		buffer = new StringBuffer(apellido);
		buffer.setLength(12);
		file.writeChars(buffer.toString());
		file.writeInt(dep);
		file.writeDouble(salario);
		file.close();

	}

	public void LeerFichero() throws IOException {
		File fichero = new File(
				"PruebaFicherosAleatorios.txt");
		RandomAccessFile file = new RandomAccessFile(fichero, "r");
		int id, dep, posicion = 0;
		Double salario;
		char apellido1[] = new char[12], aux;

		while (true) {
			file.seek(posicion);
			id = file.readInt();
			for (int i = 0; i < apellido1.length; i++) {
				aux = file.readChar();
				apellido1[i] = aux;
			}
			String apellidos = new String(apellido1);
			dep = file.readInt();
			salario = file.readDouble();
			if(id!=-1)System.out.println(
					"ID: " + id + ", apellido: "+ apellidos +"\nDepartamento: " + dep + ",Salario: " + salario+"\n");
			posicion = posicion + 40;
			if (file.getFilePointer() == file.length())
				break;
		}
		file.close();
	}
	
	public long BuscarEmpleado(int idEmpleado) throws IOException {
		fichero=new File("PruebaFicherosAleatorios.txt");
		RandomAccessFile file=new RandomAccessFile(fichero, "rw");
		int id=0;
		char[]apellido=new char[12];
		int dep=0;
		int position=0;
		double salario=0;
		char aux;
		while(true) {
			if(file.getFilePointer()==file.length()) break;
			file.seek(position);
			id=file.readInt();
			if(id==idEmpleado) {
				long pointer=position;
				return pointer;
			}
			for (int i = 0; i < apellido.length; i++) {
				aux=file.readChar();
				apellido[i]=aux;
			}
			String apellidos=new String(apellido);
			dep=file.readInt();
			salario=file.readDouble();
			position+=40;
			
		}
		file.close();
		return 0;		
	}
	
	public void modificarEmpleado(int id, String apellido, int dep, float salario) throws IOException {
		File testFile = new File("PruebaFicherosAleatorios.txt");
		RandomAccessFile file = new RandomAccessFile(testFile, "rw");
		long position = BuscarEmpleado(id);
		file.seek(position);
		StringBuffer buffer = null;
		file.writeInt(id);
		buffer = new StringBuffer(apellido);
		buffer.setLength(12);
		file.writeChars(buffer.toString());
		file.writeInt(dep);
		file.writeDouble(salario);
		file.close();
	}
	
	public void eliminarEmpleado(int id) throws IOException {
			fichero=new File("PruebaFicherosAleatorios.txt");
			RandomAccessFile file=new RandomAccessFile(fichero, "rw");
			long posicion= BuscarEmpleado(id);
			file.seek(posicion);
			StringBuffer buffer=null;
			file.writeInt(-1);
			buffer=new StringBuffer("");
			buffer.setLength(12);
			file.writeChars(buffer.toString());
			file.writeInt(0);
			file.writeDouble(0);
			file.close();
		
	}

}
