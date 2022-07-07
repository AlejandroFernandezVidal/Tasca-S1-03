package n1exercici3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

public class AccionesFichero {

	static HashMap<String, String> paisesCapitales = new HashMap<String, String>();

	public static void leerArchivo() {
		String linea;
		String pais;
		String capital;
		// Crear HashMap

		try {
			FileReader archivo = new FileReader(
					"/Users/alexfernandez/eclipse-workspace/Tasca S1.03/src/n1exercici3/countries.txt");
			BufferedReader lectura = new BufferedReader(archivo);
			// Registrar pais y capital
			while ((linea = lectura.readLine()) != null && !linea.isEmpty()) {
				String lineaPalabra[] = linea.split(" ");
				pais = lineaPalabra[0];
				capital = lineaPalabra[1];
				paisesCapitales.put(pais, capital);
			}
			lectura.close();
		} catch (FileNotFoundException e) {
			System.out.println("No existe el archivo");
		} catch (IOException e) {
			System.out.println("Error");
		}

	}

	public static void escribirArchivo(String nom, int puntuacion) {
		// Crear y/o modificar archivo clasificacion.txt para registrar usuari@
		try {
			File archivo = new File(
					"/Users/alexfernandez/eclipse-workspace/Tasca S1.03/src/n1exercici3/puntuacion.txt");
			FileWriter escribir = new FileWriter(archivo.getAbsoluteFile(), true);
			escribir.write(nom + " " + puntuacion + "\n");
			escribir.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}