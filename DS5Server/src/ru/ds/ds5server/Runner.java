package ru.ds.ds5server;

public class Runner {

	public static void main(String arfs[]) {

		Human vasya = new Human(21);

		DietSolver doctor = new DietSolver();

		Diet diet;

		diet = doctor.solveDiet(vasya);


		System.out.println(diet);

	}
}
