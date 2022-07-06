package n1exercici1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Month> meses = new ArrayList<Month>();
		Month mes1 = new Month("Enero");
		meses.add(mes1);
		Month mes2 = new Month("Febrero");
		meses.add(mes2);
		Month mes3 = new Month("Marzo");
		meses.add(mes3);
		Month mes4 = new Month("Abril");
		meses.add(mes4);
		Month mes5 = new Month("Mayo");
		meses.add(mes5);
		Month mes6 = new Month("Junio");
		meses.add(mes6);
		Month mes7 = new Month("Julio");
		meses.add(mes7);
		Month mes9 = new Month("Septiembre");
		meses.add(mes9);
		Month mes10 = new Month("Octubre");
		meses.add(mes10);
		Month mes11 = new Month("Noviembre");
		meses.add(mes11);
		Month mes12 = new Month("Diciembre");
		meses.add(mes12);
		
		for (Month mes : meses) {
			System.out.println(mes.getName());//Recorremos ArrayList para verla
		}
		
		 Month mes8 = new Month("Agosto");
		 meses.add(7, mes8);//añadimos Agosto a la ArrayList en la posicion correspodiente (7)y mantiene el orden de la ArrayList
		 System.out.println();
		 
		 for (Month mes : meses) {
			 System.out.println(mes.getName());//Volvemos a recorrer ArrayList para comprobar el mes añadido en su lugar
		 }
		 System.out.println();
		 
		 //Convertimos ArrayList en HashSet
		 HashSet<Month> hashSetMeses = new HashSet<Month>(meses);
		 
		 //añadimos meses repetidos pero al reealizar la salida por pantalla del tamaño vemos que no incrementa con meses repetidos, pero sí con meses "nuevos" ej.mes13
		 System.out.println(hashSetMeses.size());
		 hashSetMeses.add(mes1);//Meses repetidos que no se añaden al HashSet
		 hashSetMeses.add(mes8);//Meses repetidos que no se añaden al HashSet
		 Month mes13 = new Month("A");
		 hashSetMeses.add(mes13);//Añadimos "nuevo" mes para ver que se incrementa al no ser un mes repetido
		 System.out.println(hashSetMeses.size());
		 System.out.println();
		 
		 //Recorremos la lista con un foreach
		 for (Month mes : hashSetMeses ) {
			 System.out.println(mes.getName());
		 }
		 System.out.println();

		 //Recorremos la lista con un iterador
		 Iterator<Month> mes = hashSetMeses.iterator();
		 while(mes.hasNext()) {
		 System.out.println(mes.next().getName());
		 }
	}
}