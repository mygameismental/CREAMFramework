package com.codedifferently.collections.map;


import com.codedifferently.collections.interfaces.Map;
import com.codedifferently.collections.list.ArrayList;

public class UnsortedMap <K,V> implements Map<K,V>{


	public UnsortedMap() {

	}

	@Override
	public V put(K key, V value) {
		return null;
	}

	@Override
	public V remove(Object key) {
		return null;
	}

	@Override
	public boolean containsKey(Object key) {
		return false;
	}

	public int size(){
		return 0;
	}

}
