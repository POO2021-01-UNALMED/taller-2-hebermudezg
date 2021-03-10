package test;

public class Asiento {
	// Atributos ***
	String color;
	int precio;
	int registro;
	
	// Métodos ***
	public void cambiarColor(String colorAsignar) {
		if (colorAsignar.equals("rojo")) {
			this.color = "rojo"; 
		}else if(colorAsignar.equals("verde")) {
			this.color = "verde";
		}else if(colorAsignar.equals("amarillo")){
			this.color = "amarillo";
		}else if(colorAsignar.equals("negro")) {
			this.color = "negro";
		}else if(colorAsignar.equals("blanco")) {
			this.color = "blanco";
		}else {
			System.out.print("No se pudo cambiar el color");
		}
	}

}
