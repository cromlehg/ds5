package Arraylist;

public class MihaList {

	int[] list;
	

	// public MihaList() {
	// this.mihaList = mihaList;
	// this.number = number;
	// this.addEl = addEl;
	// }

	public void add(int addEL) {
        int i = list.length;
        list[i+1] = addEL;
        	
	}

	public int get(int number) {
		return list[number];
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

	public void remove(int number) {
		for (int i = number; i <= list.length; i++) {
			list[number] = list[number+1];
			list[i+1] = list[i];
		}
	}
}
