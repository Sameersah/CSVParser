package com.lordabbett.csvParser.csvParser;

import java.util.ArrayList;
import java.util.List;

public class Coloumn {
	
	protected Coloumn() {
		rows = new ArrayList<Row>();
	}

	List<Row> rows;

	public List<Row> getRows() {
		return rows;
	}

	public void setRows(List<Row> rows) {
		this.rows = rows;
	}

	public Row getRow(int index) {
		return rows.get(index);
	}
	
	public void addRow(Row row) {
		rows.add(row);
	}
	
	public Row getRow(String data) {
		 
		for(Row row: rows) {
			if(row.getData().equalsIgnoreCase(data)) {
				return row;
			}
		}
		 return null;
	}
	
	public Row updateRow(String data) {
		for(Row row: rows) {
			if(row.getData().equalsIgnoreCase(data)) {
				return row;
			}
		}
		 return null;
	}
	
	
}
