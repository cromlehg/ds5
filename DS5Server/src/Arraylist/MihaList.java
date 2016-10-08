package Arraylist;

public class MihaList {

	int[] mihaList;
	int number;
	int addEl;

	public MihaList(int[] mihaList, int number, int addEl) {
		this.mihaList = mihaList;
		this.number = number;
        this.addEl=addEl;
	}

	public int[] Add(int[] mihaList, int number, int addEl) {

		for (int i = number; i <= mihaList.length; i++) {
			mihaList[number] = mihaList[addEl];
			mihaList[i] = mihaList[i + 1];

		}

		return mihaList;

	}

}
