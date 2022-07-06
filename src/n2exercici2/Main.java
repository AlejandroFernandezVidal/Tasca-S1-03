package n2exercici2;

import java.util.HashSet;
import java.util.TreeSet;

import n2exercici1.Restaurant;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Crear HashSet y objetos de la clase Restaurant del ejercicio anterior,
		// añadimos uno repetido para prueba en el TreeSet
		HashSet<Restaurant> restaurantes2 = new HashSet<Restaurant>();
		Restaurant restaurante1 = new Restaurant("Can Roca", 10);
		Restaurant restaurante2 = new Restaurant("Pepe", 8);
		Restaurant restaurante3 = new Restaurant("Goal", 6);
		Restaurant restaurante4 = new Restaurant("Zebras", 9);
		Restaurant restaurante5 = new Restaurant("Pepe", 9);
		Restaurant restaurante6 = new Restaurant("Can Roca", 10);
		restaurantes2.add(restaurante1);
		restaurantes2.add(restaurante2);
		restaurantes2.add(restaurante3);
		restaurantes2.add(restaurante4);
		restaurantes2.add(restaurante5);
		restaurantes2.add(restaurante6);
		// Ordenar mediante TreeSet los objetos almacenados
		TreeSet<Restaurant> ordenar = new TreeSet<Restaurant>();
		ordenar.addAll(restaurantes2);
		System.out.println(restaurantes2.size());
		System.out.println(ordenar.size());
		for (Restaurant restaurante : ordenar) {
			System.out.println("Nombre : " + restaurante.getNom() + " " + " Puntuacion : " + restaurante.getPuntuacio());
		}
	}
}