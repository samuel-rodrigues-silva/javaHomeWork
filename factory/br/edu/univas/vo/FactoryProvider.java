package br.edu.univas.vo;

public class FactoryProvider {

	public static AbstractFactory getFactory(AnimalHabitat habitat) {
		if (habitat.equals(AnimalHabitat.AQUATIC)) {
			return new AquaticAnimalFactory();
		} else if (habitat.equals(AnimalHabitat.TERRESTRIAL)) {
			return new TerrestrialAnimalFactory();
		}
		return null;
	}
	
}
