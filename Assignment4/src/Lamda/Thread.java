package Lamda;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

public class Thread {

	public static void main(String[] args) {
		ArrayList<Integer> n = new ArrayList<>();

		n.add(40);
		n.add(43);
		n.add(56);
		n.add(80);
		n.add(89);
		n.add(13);

		Thread t = new Thread(new Runnable() {
		@Override
			public void run() {

				n.stream().forEach(x -> System.out.println(x));
			}

		});

		t.run();

	}
}

			
