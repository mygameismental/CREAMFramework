package com.codedifferently.collections.interfaces;

import com.codedifferently.collections.map.Entry;

import java.util.ArrayList;

public interface Map{
	ArrayList<Entry> put (Integer key, String value);
	void remove (Integer key);
	boolean containsKey(Integer key);
}
