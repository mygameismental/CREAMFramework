package com.codedifferently.collections.map;


import com.codedifferently.collections.interfaces.Map;
import java.util.ArrayList;

/**
 * Alberto's property
 * read at your own discretion
 * you may go blind
 */
public class UnsortedMap implements Map{
	private Entry entry;
	protected ArrayList <Entry> entries = new ArrayList<>();

	public UnsortedMap() {

	}

	public int size(){
		return entries.size();
	}

	public String display(){
		StringBuilder stringBuilder = new StringBuilder();
		for(Entry entry: entries){
			stringBuilder.append(entry.getKey()).append(",").append(entry.getValue()).append("\n");
		}
		return stringBuilder.toString().trim();
	}

	@Override
	public ArrayList<Entry> put(Integer key, String value) {
		entry = new Entry(key,value);
		entries.add(entry);
		return entries;
	}

	@Override
	public void remove(Integer key) {
		entries.removeIf(entry -> entry.getKey().equals(key));
	}

	@Override
	public boolean containsKey(Integer key) {
		boolean doesContain = false;
		for (Entry entry:entries) {
			if(entry.getKey().equals(key)){
				doesContain = true;
			}
		}
		return doesContain;
	}
}
