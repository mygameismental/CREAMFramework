package com.codedifferently.collections.map;

import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Test;

class UnsortedMapTest {

	private UnsortedMap<Integer, String> unsortedNames;

	@Before
	public void before(){
		unsortedNames = new UnsortedMap<Integer, String>();
	}

	@Test
	void put() {
		unsortedNames.put(0,"Zaria");
		unsortedNames.put(1,"Berto");
		unsortedNames.put(2,"Rue");

		int actual = unsortedNames.size();
		int expected = 3;

		Assert.assertEquals(actual, expected);
	}

	@Test
	void remove() {
	}

	@Test
	void containsKey() {
	}
}