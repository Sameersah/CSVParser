package com.lordabbett.csvParser.csvParser;

public class CSVParser {
	
	public Table mapCSVToTable(String csvString ) {
		Table table = new Table();
		String rows[] = csvString.split("\r\n");
		
		for(int i=0;i<rows.length;i++) {
			String cells[] = rows[i].split(",");
			Row row;
			Coloumn col;
		//	System.out.println("This row has"+cells.length+" elements.");
			for(int j=0;j<cells.length;j++) {		
				 row = new Row();
				row.setData(cells[j]);
				
				if(i==0) {
					 col = new Coloumn();
					 col.addRow(row);
					table.addColoumn(col);
				}
				else {
					try {
					col = table.getColoumn(j);
				//	System.out.println("got existing coloumn"+table.getColoumns().get(i));
					col.addRow(row);
					table.updateColoumn(j,col);
					}catch(Exception e) {
						col = new Coloumn();
						col.addRow(row);
						table.addColoumn(col);
					}
					
					
					
				
					
				}	
				
			}
		}
		return table;
	}
	
	public String mapTableToCSV(Table table) {
		String modifiedCSVString = "";
		int rowCount = table.getColoumn(0).getRows().size();
		int coloumnsCount = table.getColoumns().size();
		for(int j=0;j<rowCount;j++) {
			for(int i=0;i<coloumnsCount-1;i++) {
				modifiedCSVString = modifiedCSVString+ table.getColoumn(i).getRow(j).getData()+",";
			}
			modifiedCSVString = modifiedCSVString+ table.getColoumn(coloumnsCount-1).getRow(j).getData()+"\r\n";
		}
		
		modifiedCSVString = modifiedCSVString.substring(0, modifiedCSVString.lastIndexOf(","));
		
		return modifiedCSVString;
	}
}