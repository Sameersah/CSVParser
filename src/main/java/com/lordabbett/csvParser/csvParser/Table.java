package com.lordabbett.csvParser.csvParser;

import java.util.ArrayList;
import java.util.List;

public class Table {

	protected Table() {
		coloumns = new ArrayList<Coloumn>();
	}

	List<Coloumn> coloumns;

	protected List<Coloumn> getColoumns() {
		return coloumns;
	}

	protected void setColoumns(List<Coloumn> coloumns) {
		this.coloumns = coloumns;
	}

	protected Coloumn getColoumn(int index) {
		return coloumns.get(index);
	}

	protected void addColoumn(Coloumn coloumn) {
		coloumns.add(coloumn);
	}

	protected void updateColoumn(int index, Coloumn coloumn) {
		coloumns.set(index, coloumn);
	}
	
	public Coloumn addColoumn(int index,String coloumnName) {
		Coloumn coloumn = new Coloumn();
		
		 coloumn.addRow(0,coloumnName);
		 coloumns.add(index,coloumn);
		 return coloumn;
	}

	public Coloumn getColoumn(String coloumnName) {
		for (Coloumn coloumn : coloumns) {
			if (coloumn.getRow(0).getData().equalsIgnoreCase(coloumnName)) {
				return coloumn;
			}
		}
		return null;
	}

	public Coloumn updateColoumn(String coloumnName) {
		for (Coloumn coloumn : coloumns) {
			if (coloumn.getRow(0).getData().equalsIgnoreCase(coloumnName)) {
				return coloumn;
			}
		}
		return null;
	}

}
