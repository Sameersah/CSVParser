package com.lordabbett.csvParser.csvParser;

import java.util.ArrayList;
import java.util.List;

public class Coloumn {

	public Coloumn() {
		rows = new ArrayList<Row>();
	}
	
	public Coloumn(String header) {
		rows = new ArrayList<Row>();
		Row row = new Row();
		row.setData(header);
		rows.add(row);
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

		for (Row row : rows) {
			if (row.getData().equalsIgnoreCase(data)) {
				return row;
			}
		}
		return null;
	}

	public Row updateRow(String data) {
		for (Row row : rows) {
			if (row.getData().equalsIgnoreCase(data)) {
				return row;
			}
		}
		return null;
	}
	
	public void addRow(int index, String data) {
		Row row = new Row();
		row.setData(data);
		rows.add(index,row);
	}

}
