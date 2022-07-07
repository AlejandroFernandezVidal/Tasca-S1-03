package n1exercici3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Leer archivo y capturar error por si no existe el archivo
		AccionesFichero.leerArchivo();
	
		//Obtener nombre usuari@ y puntuacion
		String nom = JuegoPreguntas.usuario();
		int puntuacion = JuegoPreguntas.preguntas();

		//Crear y/o modificar archivo clasificacion.txt para registrar usuari@
		AccionesFichero.escribirArchivo(nom , puntuacion);
	}
}