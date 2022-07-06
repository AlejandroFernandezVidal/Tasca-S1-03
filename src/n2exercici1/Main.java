package n2exercici1;

import java.util.HashSet;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creamos HashSet según enunciado y objetos Restaurant para desarrollo del mismo
		HashSet<Restaurant> restaurantes = new HashSet<Restaurant>();
		Restaurant restaurant1 = new Restaurant("Can Roca",10);
		Restaurant restaurant2 = new Restaurant("Can Roca",9);
		//Condicion para añadir restaurantes en HashSet
		if (restaurant1.getNom().equals(restaurant2.getNom()) && (restaurant1.getPuntuacio()==restaurant2.getPuntuacio())) {
			System.out.println("No podemos añadir restaurantes con el mismo nombre y la misma puntuacion");
		} else {
		restaurantes.add(restaurant1);
		restaurantes.add(restaurant2);
		}
		//Comprobamos tamaño del hashMap para saber si funciona correctamente
		System.out.println(restaurantes.size());
	}
}