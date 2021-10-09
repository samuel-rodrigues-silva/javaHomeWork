package br.edu.univas.vo;

public interface AbstractFactory {

	AnimalKind getAnimal(AnimalType animalType);
	
}
