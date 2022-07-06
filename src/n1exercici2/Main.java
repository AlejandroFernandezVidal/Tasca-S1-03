package n1exercici2;

import java.util.ArrayList;
//import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Creación de la primera lista
		List<Integer> lista1 = new ArrayList<Integer>();
		
		//Añadimos valores a la lista
		lista1.add(0);
		lista1.add(1);
		lista1.add(2);
		lista1.add(3);
		lista1.add(4);
		//otros métodos para crear y añadir valores a la lista
		//List<Integer> lista1 = Arrays.asList(0, 1, 2, 3);
		//List<Integer> lista1 = new ArrayList<Integer>(Arrays.asList(0, 1, 2, 3));
		//List<Integer> lista1 = List.of(/*null,*/ 1, 2, 3);//No admite valores null
		//List<Integer> lista1 = new ArrayList<Integer>(List.of(/*null,*/ 1, 2, 3));//No admite valores null
		
		//Creación de la segunda lista
		List<Integer> lista2 = new ArrayList<Integer>();
		//método para insertar valores a la inversa
		ListIterator<Integer> posicion = lista1.listIterator(lista1.size());
			while(posicion.hasPrevious())
			lista2.add(posicion.previous());
				//System.out.println(posicion.previous());
		
		//Salida pantalla
		System.out.println(lista1);
		System.out.println(lista2);
		}
	}