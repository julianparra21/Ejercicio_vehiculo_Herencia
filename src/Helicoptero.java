
public class Helicoptero extends Aereo{
public String tipoHelicopteros;
	
	public void hacerRecorrido() {
		System.out.println("El helicoptero de tipo "+tipoHelicopteros+" "
				+ "Hace el recorrido aereo");
	}

	@Override
	public String toString() {
		return "INFORMACION Helicoptero\n"
				+ "tipo helicoptero=" + tipoHelicopteros + "\n"
				+ "nivel de altura=" + getNivelDeAltura() + "\n"
				+ "nombreVehiculo=" + getNombreVehiculo()
				+ "\n\n";
		
		
		
	}
}
