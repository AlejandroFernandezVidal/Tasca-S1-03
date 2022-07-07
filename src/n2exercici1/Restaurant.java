package n2exercici1;

import java.util.Objects;

public class Restaurant implements Comparable<Restaurant> {
	// Atributos
	private String nom;
	private int puntuacio;

	public Restaurant(String nom, int puntuacio) {
		this.nom = nom;
		this.puntuacio = puntuacio;
	}

	// Getter
	public String getNom() {
		return this.nom;
	}

	public int getPuntuacio() {
		return this.puntuacio;
	}

	// Setter
	public void setNom(String nom) {
		this.nom = nom;
	}

	public void setPuntuacio(int puntuacio) {
		this.puntuacio = puntuacio;
	}

	
	@Override
	public int hashCode() {
		return Objects.hash(nom, puntuacio);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Restaurant other = (Restaurant) obj;
		return Objects.equals(nom, other.nom) && puntuacio == other.puntuacio;
	}

	@Override
	public int compareTo(Restaurant o) {
		// TODO Auto-generated method stub
		if (this.nom.compareTo(o.getNom()) == 0) {
			if (this.puntuacio < o.getPuntuacio()) {
				return 1;
			} else if (o.getPuntuacio() < this.puntuacio) {
				return -1;
			} else {
				return 0;
			}
		} else {
			return this.nom.compareTo(o.getNom());
		}
	}
}