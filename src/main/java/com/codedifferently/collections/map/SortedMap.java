package com.codedifferently.collections.map;


import java.util.ArrayList;
import java.util.Comparator;


public class SortedMap extends UnsortedMap {


	SortedMap(){}

	public void sort() {
		entries.sort(Comparator.comparing(Entry::getKey));
	}

	@Override
	public ArrayList<Entry> put(Integer key, String value) {

		super.put(key, value);
		entries.sort(Comparator.comparing(Entry::getKey));
		return entries;
	}
}
