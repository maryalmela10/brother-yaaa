package dw1a_2023_3eva_almelaMary;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.RandomAccessFile;
import java.util.ArrayList;


public class Utilidades {

	public static void metodo1() {
		try (BufferedReader lecturaFicheroPaises = new BufferedReader(new FileReader("paises.txt"));) {
			String linea = null;
			int i = 1;
					try (PrintWriter ficheroPaisesConFormato = new PrintWriter(
							new FileWriter("paisesConFormato.txt"));) {
					linea = lecturaFicheroPaises.readLine();
					while (linea != null) {
							if (i == 1) {
								ficheroPaisesConFormato.print(linea + ";");
								i++;
							} else if (i == 2) {
								ficheroPaisesConFormato.print(linea + "*");
								i++;
							} else if (i == 3) {
								ficheroPaisesConFormato.print(linea + ";");
								i++;
							} else {
								ficheroPaisesConFormato.print(linea+"\r\n");
								i = 1;
							}
							linea = lecturaFicheroPaises.readLine();
						} 

					}
					catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	
	public static ArrayList<Pais> metodo2() {
		ArrayList<Pais> paises = new ArrayList<Pais>();
		String nombre;
		Double poblacion;
		Double extension;
		Double pib;
		String linea = null;
		String lineaModificada;
		Pais pais;
		try (BufferedReader lecturaFicheroPaisesConFormato = new BufferedReader(new FileReader("paisesConFormato.txt"));) {
			linea = lecturaFicheroPaisesConFormato.readLine();
			while (linea != null) {
					lineaModificada=linea.replace('*', ';');
					String[] split=lineaModificada.split(";");
					nombre=split[0];
					poblacion=Double.parseDouble(split[1]);
					extension=Double.parseDouble(split[2]);
					pib=Double.parseDouble(split[3]);
					pais=new Pais(nombre,poblacion,extension,pib);
					if(extension>500000&&(poblacion>=30000000&&poblacion<=250000000)){
						paises.add(pais);
					}
					linea = lecturaFicheroPaisesConFormato.readLine();
				}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return paises;
	}
	
	public static ArrayList<Pais> leer() {
		ArrayList<Pais> paises = new ArrayList<Pais>();
		String nombre;
		Double poblacion;
		Double extension;
		Double pib;
		String linea = null;
		String lineaModificada;
		Pais pais;
		try (BufferedReader lecturaFicheroPaisesConFormato = new BufferedReader(new FileReader("paisesConFormato.txt"));) {
			linea = lecturaFicheroPaisesConFormato.readLine();
			while (linea != null) {
					lineaModificada=linea.replace('*', ';');
					String[] split=lineaModificada.split(";");
					nombre=split[0];
					poblacion=Double.parseDouble(split[1]);
					extension=Double.parseDouble(split[2]);
					pib=Double.parseDouble(split[3]);
					pais=new Pais(nombre,poblacion,extension,pib);
						paises.add(pais);
					linea = lecturaFicheroPaisesConFormato.readLine();
				}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return paises;
	}
	
	public static void metodo3(ArrayList<Pais> paises) {
		for(Pais p: paises) {
			if(p.getExtension()>600000) {
					String nombre = rellenar(p.getNombre());
					Double poblacion;
					try(RandomAccessFile file = new RandomAccessFile("paises.mar", "rw")) {
						file.seek(file.length());
						file.writeChars(nombre);
						file.writeDouble(p.getPoblacion());
					} catch (FileNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
		}
		
	}
	
	public static String rellenar(String palabra) {
		
		String palabraFinal=palabra;
		int NUMERONOMBRE = 50;
		for(int i=palabra.length();i<NUMERONOMBRE;i++) {
			palabraFinal+="#";
		}
		return palabraFinal;
	}
	
}
