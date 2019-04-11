package org.matsim.class2019basics;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class MapTest {
	
	@Test
	public void testRectangle() {
		Map<String,Rectangle> maps = new HashMap<>();
		maps.put("gelb", new Rectangle(3, 4));
		maps.put("blau", new Rectangle(1, 2));
		maps.put("rot", new Rectangle(4, 8));
		maps.put("schwarz", new Rectangle(1, 9));
	
	for(Map.Entry<String, Rectangle> map : maps.entrySet()) {
		System.out.println(map.getValue().countArea());
	}
	}
}
