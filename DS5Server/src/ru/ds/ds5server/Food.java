package ru.ds.ds5server;

public class Food {

	String name;
	int protein;
	int fat;
	int carbo;

	public Food(String name, int protein, int fat, int carbo) {
		this.name = name;
		this.protein = protein;
		this.fat = fat;
		this.carbo = carbo;
	}

	public int getProtein() {
		return protein;
	}
	
	public int getFat() {
		return fat;
	}

	public int getCarbo() {
		return carbo;
	}
}