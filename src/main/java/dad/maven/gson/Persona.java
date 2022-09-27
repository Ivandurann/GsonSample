package dad.maven.gson;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.util.Scanner;


public class Persona {
	
	String nombre;
	String apellidos;
	int edad;

	
		public static void main(String[] args) {
		
		Persona p = new Persona();	
			
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introduzca un nombre: ");
		p.nombre = scanner.nextLine();
		System.out.println("Introduzca un apellido: ");
		p.apellidos = scanner.nextLine();
		System.out.println("Introduzca su edad: ");
		p.edad = scanner.nextInt();
		
		
		
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		String json = gson.toJson(p);
		System.out.println(json);
	
		}
	}
