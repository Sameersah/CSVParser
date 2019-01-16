package com.lordabbett.csvParser.csvParser;


import java.util.ArrayList;
import java.util.List;

public class Table {
	
	protected Table() {
		coloumns = new ArrayList<Coloumn>();
	}

	List<Coloumn> coloumns;

	public List<Coloumn> getColoumns() {
		return coloumns;
	}

	public void setColoumns(List<Coloumn> coloumns) {
		this.coloumns = coloumns;
	}
	
	public Coloumn getColoumn(int index) {
		return coloumns.get(index);
	}
	
	public void addColoumn(Coloumn coloumn) {
		coloumns.add(coloumn);
	}
	
	public void updateColoumn(int index, Coloumn coloumn) {
		coloumns.set(index, coloumn);
	}
	
	public Coloumn getColoumn(String coloumnName) {
		for(Coloumn coloumn: coloumns ) {
			if(coloumn.getRow(0).getData().equalsIgnoreCase(coloumnName)) {
				return coloumn;
			}
		}
		return null;
	}
	
	public Coloumn updateColoumn(String coloumnName) {
		for(Coloumn coloumn: coloumns ) {
			if(coloumn.getRow(0).getData().equalsIgnoreCase(coloumnName)) {
				return coloumn;
			}
		}
		return null;
	}
	
	

	
}
