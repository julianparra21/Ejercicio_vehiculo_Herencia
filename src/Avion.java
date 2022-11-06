
public class Avion extends Aereo{
public String tipoAvion;
	
	public void hacerRecorrido() {
		System.out.println("El Avion de tipo "+tipoAvion+" "
				+ "Hace el recorrido aereo");
	}

	@Override
	public String toString() {
		return "INFORMACION Avion\n"
				+ "tipo Avion=" + tipoAvion + "\n"
				+ "nivel de altura=" + getNivelDeAltura() + "\n"
				+ "nombre Vehiculo=" + getNombreVehiculo()
				+ "\n\n";
		
		
		
	}
}
