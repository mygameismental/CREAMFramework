package com.codedifferently.collections.map;

import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Alberto's property
 * read at your own discretion
 * you may go blind
 *
 */
class UnsortedMapTest {

	private UnsortedMap unsortedNames;

	@BeforeEach
	public void before(){
		unsortedNames = new UnsortedMap();
		unsortedNames.put(0,"Zaria");
	}

	@Test
	void put() {
		unsortedNames.put(1,"Berto");
		unsortedNames.put(2,"Rue");

		int actual = unsortedNames.size();
		int expected = 3;

		Assert.assertEquals(expected,actual);
	}

	@Test
	void display(){
		String actual = unsortedNames.display();
		String expected = "0,Zaria";
		Assert.assertEquals(expected,actual);
	}

	@Test
	void displayUnsorted(){
		unsortedNames.put(2,"Rue");
		unsortedNames.put(1,"Berto");

		String expected = "0,Zaria" + "\n" + "2,Rue" + "\n" + "1,Berto";
		String actual = unsortedNames.display();

		Assert.assertEquals(expected,actual);
	}

	@Test
	void remove() {
		unsortedNames.put(1,"Berto");
		unsortedNames.put(2,"Rue");
		unsortedNames.remove(1);

		String expected = "0,Zaria" + "\n" + "2,Rue";
		String actual = unsortedNames.display();

		Assert.assertEquals(expected,actual);
	}

	@Test
	void containsKey() {
		unsortedNames.put(1,"Berto");
		unsortedNames.put(2,"Rue");
		Assert.assertTrue(unsortedNames.containsKey(1));
	}
}