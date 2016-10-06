package ru.ds.ds5server;

public class Diet {

	Food[] food;

	public Diet(Food[] food) {
		this.food = food;

	}

	public Food[] getFood() {
		return food;
	}

	public String toString() {
		String a = "";

		for (int i = 0; i < food.length; i++)
			a += food[i].getName() + "\n";
		return a;
	}

}
