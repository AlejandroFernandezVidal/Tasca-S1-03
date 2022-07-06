package n2exercici1;

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