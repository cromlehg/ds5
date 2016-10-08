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
		for (int i = number-1; i < size; i++) {
			list[i] = list[i+1];
			
		}
	}
}
