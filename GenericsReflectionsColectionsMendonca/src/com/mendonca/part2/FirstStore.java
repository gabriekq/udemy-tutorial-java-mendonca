package com.mendonca.part2;

import java.io.Serializable;

public class FirstStore<T extends Serializable > {

	private Serializable item;
	
	public Serializable getItem() {
		return this.item;
	}
	
	public void setItem(Serializable item) {
		this.item = item;
	}
	
	
}
