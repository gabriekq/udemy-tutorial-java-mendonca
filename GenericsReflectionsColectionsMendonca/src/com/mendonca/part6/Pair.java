package com.mendonca.part6;

public class Pair {

	private String url;
	private String data;
	
	public Pair(String url, String data) {
		this.url = url;
		this.data = data;
	}



	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Pair [url=" + url + ", data=" + data + "]";
	}
	
}
