package ru.ds.ds5server;

public class DietSolver {

	Food[] foods;

	public DietSolver() {

		foods = new Food[3];
		foods[0] = new Food("chiken", 20, 5, 1);
		foods[1] = new Food("oil", 1, 30, 1);
		foods[2] = new Food("sugar", 0, 0, 60);
	}

	// metod poiska edu
	public Diet solveDiet(Human human) {
		
		
		return new Diet(foods);
	}

}
