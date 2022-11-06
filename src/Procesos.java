
import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.JOptionPane;

public class Procesos {

	ArrayList<Barco> barcosList;
	ArrayList<Velero> velerosList;
	ArrayList<Helicoptero> helicopterosList;
	ArrayList<Avion> avionList;
	HashMap<String, Barco> mapaBarco;
	HashMap<String, Velero> mapaVelero;
	HashMap<String, Helicoptero> mapaHelicoptero;
	HashMap<String, Avion> mapaAvion;

	public Procesos() {
		barcosList = new ArrayList<Barco>();
		velerosList = new ArrayList<Velero>();
		helicopterosList = new ArrayList<Helicoptero>();
		avionList = new ArrayList<Avion>();
		mapaBarco = new HashMap<String, Barco>();
		mapaVelero = new HashMap<String, Velero>();
		mapaHelicoptero = new HashMap<String, Helicoptero>();
		mapaAvion = new HashMap<String, Avion>();
	}

	public void iniciar() {

		String menu = "MENU\n";
		menu += "1. Crear Barco\n";
		menu += "2. Crear Velero\n";
		menu += "3. Crear Avion\n";
		menu += "4. Crear Helicoptero\n";
		menu += "5. Imprimir listas\n";
		menu += "6. salir\n";
		menu += "Ingrese una opcion";
		int opc = 0;
		do {
			opc = Integer.parseInt(JOptionPane.showInputDialog(menu));
			presentarMenu(opc);
			System.out.println();
		} while (opc != 6);

		System.out.println("Termina...");

	}

	private void presentarMenu(int opc) {

		switch (opc) {
		case 1:
			crearBarco();
			break;
		case 2:
			crearVelero();
			break;
		case 3:
			crearAvion();
			break;
		case 4:
			crearHelicoptero();
			break;
		case 5:
			imprimirListas();
			break;
		case 6:
			System.out.println("Chao");
			break;
		default:
			System.out.println("No existe la opción");
			break;
		}

	}

	private void crearHelicoptero() {
		// TODO Auto-generated method stub
		Helicoptero miHelicoptero = new Helicoptero();
		String codigo = JOptionPane.showInputDialog("Ingrese el codigo del Helicoptero");
		miHelicoptero.setCodigoVehiculo(codigo);
		miHelicoptero.tipoHelicopteros = (JOptionPane.showInputDialog("Ingrese el tipo de Helicoptero"));
		miHelicoptero.setNombreVehiculo(JOptionPane.showInputDialog("Ingrese el nombre del helicoptero"));
		int nivelAltura = Integer
				.parseInt(JOptionPane.showInputDialog("Ingrese el nivel de altura a la que vuela helicoptero"));
		miHelicoptero.setNivelDeAltura(nivelAltura);
		miHelicoptero.encender();
		miHelicoptero.volar();
		miHelicoptero.hacerRecorrido();
		System.out.println(miHelicoptero);
		helicopterosList.add(miHelicoptero);
		mapaHelicoptero.put(codigo, miHelicoptero);
	}

	private void crearAvion() {
		// TODO Auto-generated method stub
		Avion miAvion = new Avion();
		String codigo = JOptionPane.showInputDialog("Ingrese el codido del avion");
		miAvion.setCodigoVehiculo(codigo);
		miAvion.tipoAvion = (JOptionPane.showInputDialog("Ingrese el tipo de avion"));
		miAvion.setNombreVehiculo(JOptionPane.showInputDialog("Ingrese el nombre del avion"));
		int nivelAltura = Integer
				.parseInt(JOptionPane.showInputDialog("ingrese el nivel de  altura a la que vuela el Avion"));
		miAvion.setNivelDeAltura(nivelAltura);
		miAvion.encender();
		miAvion.volar();
		miAvion.hacerRecorrido();
		System.out.println(miAvion);
		avionList.add(miAvion);
		mapaAvion.put(codigo, miAvion);

	}

	private void imprimirListas() {
		String menu2 = "MENU IMPRIMIR"
						+ "\n1.Barcos"  
						+"\n2.Veleros"
						+ "\n3.Aviones"
						+ "\n4.Helicopteros";
		int opc = Integer.parseInt(JOptionPane.showInputDialog(menu2));

		switch (opc) {
		case 1:
			imprimirBarco();
			break;
		case 2:
			System.out.println(mapaVelero);
			break;

		case 3:
			imprimirAvion();
			break;

		case 4:
			imprimirHelicoptero();
			break;
		default:
			System.out.println("No es una opción");
			break;
		}

	}

	private void imprimirAvion() {
		// TODO Auto-generated method stub
		String msj = "";
		System.out.println("********************");
		for (int i = 0; i < avionList.size(); i++) {
			msj += "Nombre: " + avionList.get(i).getNombreVehiculo() + "\n";
			msj += "Nivel altura: " + avionList.get(i).getNivelDeAltura() + "\n";
			msj += "Tipo: " + avionList.get(i).tipoAvion + "\n\n";
			System.out.println("************************************");

		}
		System.out.println(msj);
	}

	private void imprimirHelicoptero() {
		// TODO Auto-generated method stub
		String msj = "";
		System.out.println("********************");
		for (int i = 0; i < helicopterosList.size(); i++) {
			msj += "Nombre: " + helicopterosList.get(i).getNombreVehiculo() + "\n";
			msj += "Nivel altura: " + helicopterosList.get(i).getNivelDeAltura() + "\n";
			msj += "Tipo: " + helicopterosList.get(i).tipoHelicopteros + "\n\n";
			System.out.println("************************************");

		}
		System.out.println(msj);
	}

	private void imprimirBarco() {
		String msj = "";
		System.out.println("********************");
		for (int i = 0; i < barcosList.size(); i++) {
			msj += "Nombre: " + barcosList.get(i).getNombreVehiculo() + "\n";
			msj += "Nivel Flote: " + barcosList.get(i).getNivelDeFlote() + "\n";
			msj += "Tipo: " + barcosList.get(i).tipoBarco + "\n\n";
		}
		System.out.println(msj);
	}

	private void crearBarco() {
		Barco miBarco = new Barco();
		String codigo = JOptionPane.showInputDialog("Ingrese el codigo del Barco");
		miBarco.setCodigoVehiculo(codigo);
		miBarco.tipoBarco = "Barco de turismo";
		miBarco.setNombreVehiculo(JOptionPane.showInputDialog("Ingrese el nombre del barco"));
		int nivelFlote = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el nivel de flote del barco"));
		miBarco.setNivelDeFlote(nivelFlote);
		miBarco.encender();
		miBarco.navegar();
		miBarco.hacerRecorrido();
		System.out.println(miBarco);
		barcosList.add(miBarco);
		// System.out.println(barcosList);
		mapaBarco.put(codigo, miBarco);
	}

	private void crearVelero() {
		Velero miVelero = new Velero();
		String codigo = JOptionPane.showInputDialog("Ingrese el codigo del Velero");
		miVelero.setCodigoVehiculo(codigo);
		String nombre = JOptionPane.showInputDialog("Ingrese el nombre del velero");
		miVelero.setNombreVehiculo(nombre);
		int nivelFlote = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el nivel de flote"));
		miVelero.setNivelDeFlote(nivelFlote);
		String tipoTela = JOptionPane.showInputDialog("Ingrese el tipo de tela");
		miVelero.setTipoVela(tipoTela);
		miVelero.izarVelas();
		miVelero.encender();
		miVelero.navegar();

		System.out.println(miVelero);
		velerosList.add(miVelero);
		// System.out.println(velerosList);
		mapaVelero.put(miVelero.getCodigoVehiculo(), miVelero);

	}

}
