package Arraylist;

public class MihaList {

	Object[] list = new Object[10];

	int size = 0;

	public void add(int addEL) {
		if(size > list.length) {
			Object[] listnew = new Object[size+1];
			for(int i=0; i < list.length; i++) {
				listnew[i]=list[i];
			}
	
		}
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
		size = 0;
	}

	public void remove(int number) {
		for (int i = number - 1; i < size; i++) {
			list[i] = list[i + 1];

		}
		size--;
	}
}
