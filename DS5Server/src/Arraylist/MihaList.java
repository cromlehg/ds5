package Arraylist;

public class MihaList {

	int[] list;
	int number;
	int addEl;
	int element;

	// public MihaList() {
	// this.mihaList = mihaList;
	// this.number = number;
	// this.addEl = addEl;
	// }

	public void add() {

		for (int i = number; i <= list.length; i++) {
			list[number] = list[addEl];
			list[i] = list[i + 1];
		}
	}

	public int get() {
		return element = list[number];
	}

	public int getSize() {
		int i = 0;
		while (list[0] != 0) {
			i = 0;
		}
		return i;
	}

	public void clean() {
		for (int i = 0; i < list.length; i++) {
			list[i] = 0;
		}
	}

	public void remove() {
		for (int i = number; i <= list.length; i++) {
			list[number] = list[number+1];
			list[i+1] = list[i];
		}
	}
}
