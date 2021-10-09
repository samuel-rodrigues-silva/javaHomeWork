package main;

import br.edu.univas.vo.AbstractFactory;
import br.edu.univas.vo.AnimalHabitat;
import br.edu.univas.vo.AnimalKind;
import br.edu.univas.vo.AnimalType;
import br.edu.univas.vo.FactoryProvider;


public class StartApp {

	public static void main(String[] args) {
		
		AbstractFactory abstractFactory = FactoryProvider.getFactory(AnimalHabitat.TERRESTRIAL);
		
		AnimalKind dog = abstractFactory.getAnimal(AnimalType.DOG);
		dog.move();
		
		AnimalKind cat = abstractFactory.getAnimal(AnimalType.CAT);
		cat.move();
	}
}
