package n1exercici3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String linea;
		String pais;
		String capital;
		int puntuacion = 0;
		// Crear HashMap
		HashMap<String, String> paisesCapitales = new HashMap<String, String>();

		// Leer archivo y capturar error por si no existe el archivo
		try {
			FileReader archivo = new FileReader("/Users/alexfernandez/eclipse-workspace/Tasca S1.03/src/n1exercici3/countries.txt");
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
		//Obtener nombre usuari@
		Scanner entrada = new Scanner(System.in);
		System.out.println("Indica tu nombre");
		String nom = entrada.next();
		//Acceso a los valores del hashMap para realizar preguntas y obtener puntuacion
		Object[] paisCapitalRand = paisesCapitales.keySet().toArray();
		for (int i = 0; i < 10; i++) {
			Object paisKey = paisCapitalRand[new Random().nextInt(paisCapitalRand.length)];
			System.out.println("Que capital corresponde a " + paisKey);
			String capitalUser = entrada.next();
			String capitalHash = paisesCapitales.get(paisKey);
			if (capitalUser.equalsIgnoreCase(capitalHash)) {
				puntuacion++;
			}
		}
		//Crear y/o modificar archivo clasificacion.txt para registrar usuari@
		try {
			File archivo = new File ("/Users/alexfernandez/eclipse-workspace/Tasca S1.03/src/n1exercici3/puntuacion.txt");
			FileWriter escribir = new FileWriter(archivo.getAbsoluteFile(),true);
			escribir.write(nom + " " + puntuacion + "\n");
			escribir.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		entrada.close();
	}
}