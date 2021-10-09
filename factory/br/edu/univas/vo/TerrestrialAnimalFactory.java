package br.edu.univas.vo;

public class TerrestrialAnimalFactory implements AbstractFactory {

	@Override
	public AnimalKind getAnimal(AnimalType animalType) {
		if (animalType.equals(AnimalType.DOG)) {
			return new Dog();
		} else if (animalType.equals(AnimalType.CAT)) {
			return new Cat();
		}
		
		return null;
	}

}
