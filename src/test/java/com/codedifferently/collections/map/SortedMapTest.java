package com.codedifferently.collections.map;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Alberto's property
 * read at your own discretion
 * you may go blind
 *
 */
class SortedMapTest {

	private SortedMap sortedMap;

	@BeforeEach
	public void before(){
		sortedMap = new SortedMap();
	}

	@Test
	void sort() {
		sortedMap.put(10,"last");
		sortedMap.put(1,"first");
		sortedMap.put(5,"middle");
		sortedMap.sort();

		String actual = sortedMap.display();
		String expected = "1,first" + "\n" + "5,middle" + "\n" + "10,last";

		Assert.assertEquals(expected,actual);
	}

	@Test
	void displaySorted(){
		sortedMap.put(2,"WonderWomen");
		sortedMap.put(1,"Batman");
		sortedMap.put(10,"Robin");
		String expected = "1,Batman" + "\n" + "2,WonderWomen" + "\n" + "10,Robin";
		String actual = sortedMap.display();

		Assert.assertEquals(expected,actual);
	}
}