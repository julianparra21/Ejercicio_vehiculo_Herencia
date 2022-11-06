
public class Aereo extends Vehiculo {
  private int nivelDeAltura;

public int getNivelDeAltura() {
	return nivelDeAltura;
}

public void setNivelDeAltura(int nivelDeAltura) {
	this.nivelDeAltura = nivelDeAltura;
}
public void volar() {
	System.out.println(getNombreVehiculo()+" Esta volando con una altura de "+getNivelDeAltura());
}
}
