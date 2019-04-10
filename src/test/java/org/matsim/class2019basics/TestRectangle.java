package org.matsim.class2019basics;


import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestRectangle {

	@Test
	public void testCountArea() {
		Rectangle rect = new Rectangle(4, 3);
		double area = rect.countArea();
			System.out.println("The area is: " + area);
			assertEquals(12.0, area, 0.0001);
		}
	}
	

