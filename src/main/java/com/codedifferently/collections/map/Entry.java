package com.codedifferently.collections.map;

/**
 * Alberto's property
 * read at your own discretion
 * you may go blind
 *
 */

public class Entry {
	private String value;
	private Integer key;

	Entry(Integer key,String value){
		this.key = key;
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public Integer getKey() {
		return key;
	}

	public void setKey(Integer key) {
		this.key = key;
	}
}
