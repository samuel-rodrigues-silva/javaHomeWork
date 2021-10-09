package noFactory.main;

import java.util.Scanner;

import br.edu.univas.vo.Cat;
import br.edu.univas.vo.Dog;
import br.edu.univas.vo.Fish;

public class StartApp {

	public static void main(String[] args) {
		  Scanner animal = new Scanner(System.in);
		  String type;
		    System.out.printf("Insert a type of animal:\n");
		     type = animal.nextLine(); 
		if (type.contains("terrestrial")) {
			Dog dog = new Dog();
			dog.move();
			
			Cat cat = new Cat();
			cat.move();
			
		} else if (type.contains("aquatic")) {
			Fish fish = new Fish();
			fish.move();

		} else {
			System.out.println("Animal not found");
		}

	}

}
