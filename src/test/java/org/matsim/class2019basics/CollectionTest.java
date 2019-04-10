package org.matsim.class2019basics;

import java.util.List;
import java.util.ArrayList;

import org.junit.Test;

public class CollectionTest {
	
	@Test
	public void listExample() {
		List<Rectangle> myList = new ArrayList<>(); 
		myList.add(new Rectangle(2, 3));
		myList.add(new Rectangle(3, 4));
		myList.add(new Rectangle(5, 6));
		myList.add(new Rectangle(2, 9));
		myList.add(new Rectangle(2, 7));
		
		for(Rectangle rect : myList ) {
			System.out.println(rect.countArea());
		}
		
	}

}
