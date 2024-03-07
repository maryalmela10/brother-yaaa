package arrayList_agenda;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int opcion,id;
		String sector,telefono,email,direccion,nombre,apellidos;
		
		ListaContactos lista=new ListaContactos();
		
		System.out.println("1.Alta");
		System.out.println("2.Baja");
		System.out.println("3.Modificar tlf");
		System.out.println("4.Listar");
		System.out.println("5.Empresas por sector");
		System.out.println("6.Listar por email");
		System.out.println("7.Salir");
		opcion=Integer.parseInt(teclado.nextLine());
		
		while(opcion!=7) {
			String opcion2;
			Contacto_Persona contactoPersona;
			Contacto_Empresa contactoEmpresa;
			switch(opcion) {
			case 1:
				System.out.println("Id:");
				id=Integer.parseInt(teclado.nextLine());
				System.out.println("Teléfono:");
				telefono=teclado.nextLine();
				System.out.println("Email:");
				email=teclado.nextLine();
				System.out.println("Opcion");
				System.out.println("Persona (p)/Empresa(e)");
				opcion2=teclado.nextLine();
				while((!opcion2.equalsIgnoreCase("p")) 
						&& (!opcion2.equalsIgnoreCase("e"))) {
					System.out.println("Persona (p)/Empresa(e)");
					opcion2=teclado.nextLine();
				}
				
				if(opcion2.equalsIgnoreCase("p")) {
					System.out.println("Nombre:");
					nombre=teclado.nextLine();
					System.out.println("Apellido:");
					apellidos=teclado.nextLine();
					lista.altaPersona(new Contacto_Persona(id,telefono,email,nombre,apellidos));
				}else {
					System.out.println("Sector:");
					sector=teclado.nextLine();
					System.out.println("Dirección:");
					direccion=teclado.nextLine();
					lista.altaEmpresa(new Contacto_Empresa(id,telefono,email,direccion,sector));
				}
				
				break;
			case 2:
				System.out.println("Ingresa el id");
				id=Integer.parseInt(teclado.nextLine());
				lista.baja(id);
				break;
			case 3:
				System.out.println("Ingresa el id del contacto");
				id=Integer.parseInt(teclado.nextLine());
				System.out.println("Ingresa nuevo número");
				telefono=teclado.nextLine();
				lista.modificarTelefono(id, telefono);
				break;
			case 4:
				lista.listarDatos();
				break;
			case 5:
				lista.numeroEmpresasPorSector();
				break;
			case 6:
				lista.listarPorEmail();
				break;
			default:System.out.println("Opcion incorrecta");
			}
			
			System.out.println("1.Alta");
			System.out.println("2.Baja");
			System.out.println("3.Modificar tlf");
			System.out.println("4.Listar");
			System.out.println("5.Empresas por sector");
			System.out.println("6.Listar por email");
			System.out.println("7.Salir");
			opcion=Integer.parseInt(teclado.nextLine());
			
		}
		
		/*Agenda agenda=new Agenda();
		//String tipo, int id, int telefono, String correo, String nombre, String apellido
		//String tipo, int id, int telefono, String correo, int direccion_postal, String sector
		Contacto contactoEmpresaLuz=new Contacto("Empresa",1,722204388, "maryalmela@gmail.com",28016,"Energia");
		Contacto contactoEmpresaMary=new Contacto("Persona",2,722204388, "maryalmela@gmail.com","Mary","Almela");
		System.out.println(agenda.altaDeContacto(contactoEmpresaLuz));		
		System.out.println(agenda.altaDeContacto(contactoEmpresaMary));
		System.out.println();
		agenda.listarContactos();*/
		System.out.println("Adios");
	}
}
