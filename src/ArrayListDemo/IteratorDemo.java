package ArrayListDemo;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {
	public static void main(String[] args) {
		ArrayList al = new ArrayList<>();
		for (int i = 1; i <= 20; i++) {
			al.add(i);
		}	
		Iterator itr = al.iterator();
		while (itr.hasNext()) {
			Integer I = (Integer) itr.next();
			if (I % 2 == 0) {
				//System.out.println(I);
			} else
				itr.remove();
		}
		System.out.println(al);
	}

}
