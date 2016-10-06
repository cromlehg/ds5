package ru.ds.ds5server;

public class DietSolver {

	Food[] foods;

	public DietSolver() {

		foods = new Food[4];
		foods[0] = new Food("chiken", 20, 5, 1);
		foods[1] = new Food("oil", 1, 30, 1);
		foods[2] = new Food("mindal", 7, 20, 5);
		foods[3] = new Food("sugar", 0, 0, 60);
	}

	public Diet solveDiet(Human human) {
		int i = 0;
		int p = 0;
		while (p < human.getWeight()) {
			p += foods[i].getProtein();
			i++;
		}

		Food[] arrayDietFoods = new Food[i];
		for (int m = 0; m < i; m++) {
			arrayDietFoods[m] = foods[m];
		}

		Diet diet = new Diet(arrayDietFoods);
		return diet;

	}

}
