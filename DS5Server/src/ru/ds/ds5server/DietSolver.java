package ru.ds.ds5server;

public class DietSolver {

	Food[] foods;
	int p, f, c;
	int weight;

	public DietSolver() {

		foods = new Food[3];
		foods[0] = new Food("chiken", 20, 5, 1);
		foods[1] = new Food("oil", 1, 30, 1);
		foods[2] = new Food("sugar", 0, 0, 60);
	}

	// metod poiska edu
	public Diet solveDiet(Human human) {
		int i = 0;
		while (i < 100 && p < weight * 2) {
			p = foods[i].getProtein();
			i++;

			return Diet;
		}

	}
}
