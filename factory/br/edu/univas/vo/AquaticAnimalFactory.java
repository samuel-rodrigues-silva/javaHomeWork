package br.edu.univas.vo;

public class AquaticAnimalFactory implements AbstractFactory {

	@Override
	public AnimalKind getAnimal(AnimalType animalType) {
		if (animalType.equals(AnimalType.FISH)) {
			return new Fish();
		}
		return null;
	}

}
