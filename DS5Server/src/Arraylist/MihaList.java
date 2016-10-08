package Arraylist;

public class MihaList {

	Object[] list = new Object[10];

	int size = 0;
	
	
	public void add(int addEL) {
		list[size] = addEL;
		size++;
	}

	public Object get(int number) {
		return list[number];
	}

	public int getSize() {
		return size;
	}

	public void clean() {
		for (int i = 0; i < size; i++) {
			list[i] = null;
		}
	}

	public void remove(int number) {
		for (int i = number; i <= size; i++) {
			list[number] = list[number + 1];
			list[i + 1] = list[i];
		}
	}
}
