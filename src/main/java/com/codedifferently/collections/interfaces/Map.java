package com.codedifferently.collections.interfaces;

public interface Map<K,V> {
	V put (K key,V value);
	V remove (Object key);
	boolean containsKey(Object key);
}
