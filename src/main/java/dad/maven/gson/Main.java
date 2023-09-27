package dad.maven.gson;

import java.util.Scanner;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Introduce tu nombre: ");
		String nombre = scanner.nextLine();
		
		System.out.println("Introduce tus apellidos: ");
		String apellidos = scanner.nextLine();
		
		System.out.println("Introduce tu edad: ");
		int edad = Integer.parseInt(scanner.nextLine());
		
		Persona p = new Persona(nombre, apellidos, edad);
		
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		String json = gson.toJson(p);
		System.out.println(json);
		
	}

}
