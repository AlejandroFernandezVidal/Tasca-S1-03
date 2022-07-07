package n1exercici3;

import java.util.Random;
import java.util.Scanner;

public class JuegoPreguntas {
	static Scanner entrada = new Scanner(System.in);
	
	public static String usuario() {
		System.out.println("Indica tu nombre");
		String nom = entrada.next();
		return nom;
	}
	
	public static int preguntas() {
		
		int puntuacion = 0;
		//Acceso a los valores del hashMap para realizar preguntas y obtener puntuacion
		Object[] paisCapitalRand = AccionesFichero.paisesCapitales.keySet().toArray();
		for (int i = 0; i < 10; i++) {
			Object paisKey = paisCapitalRand[new Random().nextInt(paisCapitalRand.length)];
			System.out.println("Que capital corresponde a " + paisKey);
			String capitalUser = entrada.next();
			String capitalHash = AccionesFichero.paisesCapitales.get(paisKey);
			if (capitalUser.equalsIgnoreCase(capitalHash)) {
				puntuacion++;
			}
		}
		return puntuacion;
	}
}