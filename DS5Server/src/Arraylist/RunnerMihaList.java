package Arraylist;

public class RunnerMihaList {

	public static void main(String args[]) {
		

	MihaList list = new MihaList();
	
	int addEL=5;
	
	list.add(addEL);
	
	list.add(addEL);
	
	list.clean();
		
	System.out.println(list.getSize());
	
	}
}
