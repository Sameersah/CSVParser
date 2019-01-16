package com.lordabbett.csvParser.csvParser;

public class Row {

	String data;
	
	protected Row() {
		data = new String();
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}
	
}
