package com.lordabbett.csvTester;

import com.lordabbett.csvParser.csvParser.CSVConstants;
import com.lordabbett.csvParser.csvParser.CSVParser;
import com.lordabbett.csvParser.csvParser.Coloumn;
import com.lordabbett.csvParser.csvParser.Row;
import com.lordabbett.csvParser.csvParser.Table;

public class CSVDriver {

	public static void main(String args[]) {
		
		String csvString = "seq,first,last,age,street,city,state,zip,dollar,pick,date\r\n" + 
				"1,Manuel_EN-US,Erickson,19,Kago Circle,Puemooh,MT,26257,$9129.20,WHITE,08/02/1957\r\n" + 
				"2,Douglas_EN-US,Gregory,58,Diane Street,Tuhesti,KS,07054,$6974.02,YELLOW,12/01/1981\r\n" + 
				"3,Ernest_EN-US,Lynch,48,Coegu Plaza,Ipkoluci,DE,51381,$7308.92,GREEN,02/16/2029\r\n" + 
				"4,Agnes_EN-US,Wong,64,Esivi Junction,Acwatus,IA,94643,$657.56,WHITE,04/30/2016\r\n" + 
				"5,Tillie_EN-US,Vasquez,64,Tupod Ridge,Socucun,ND,32834,$660.39,YELLOW,07/04/2005\r\n" + 
				"6,Theresa_EN-US,Yates,25,Cehso Glen,Uvunimfu,RI,74046,$8021.54,RED,04/12/2070\r\n" + 
				"7,Aaron_EN-US,Hopkins,39,Cobzu View,Ahofaer,OK,13551,$6892.84,WHITE,05/22/2004\r\n" + 
				"8,Andre_EN-US,Briggs,50,Wiki Manor,Cohzugpe,OK,66699,$413.32,RED,02/15/2047\r\n" + 
				"9,Floyd_EN-US,Santiago,21,Kolar Parkway,Bizruso,LA,84036,$8216.94,YELLOW,02/19/2015\r\n" + 
				"10,Jeffrey_EN-US,Willis,42,Maji Junction,Zejokaba,KY,48778,$9783.00,BLUE,03/13/2042\r\n" + 
				"";
		
		
		//------------
		
//		CSVParser parser = new CSVParser();
//		Table table = parser.mapCSVToTable(csvString);
		// table.updateColoumn("first").updateRow("Manuel").setData("deepak");
		// table.updateColoumn("last").updateRow("Erickson").setData("sah");
		
//		table.updateColoumn("first").updateRow("Ernest").setData("Ernest_US_EN");
//		 String modifiedCSV =   parser.mapTableToCSV(table);
		 
//		 String data = table.getColoumn("first").getRow(4).getData();
		
//		 System.out.println("getting data from csv"+data);
		 
		//-------------
		 
//		 System.out.println(modifiedCSV);
		
		 //To do - add new coloumns
		
		System.out.println(CSVConstants.csv1);
		CSVParser parser = new CSVParser();
		Table table = parser.mapCSVToTable(CSVConstants.csv1);
		Coloumn col = table.getColoumn("first");
		
		Coloumn col3 = table.getColoumn("age");
		Coloumn col2 = table.getColoumn("city");
		Coloumn col4 = new Coloumn("Language");
		Coloumn col5 = table.getColoumn("state");
		
		for(int i=1;i<col.getRows().size();i++) {
			String data = col.getRow(i).getData();
			String language = data.substring(data.indexOf("_")+1);
			col4.addRow(i, language);
		}
		
		
		
		Table table2 = new Table();
		table2.addColoumn(0, col);
		table2.addColoumn(1, col2);
		table2.addColoumn(2, col3);
		table2.addColoumn(3, col4);
		table2.addColoumn(4, col5);
		String modifiedCsv = parser.mapTableToCSV(table2);
		
		System.out.println(modifiedCsv);
		
		//-------------------------------
		//System.out.println(CSVConstants.csv2);
	//	CSVParser parser = new CSVParser();
	//	Table table3 = parser.mapCSVToTable(CSVConstants.csv2);
	//	String modifiedcsv2=parser.mapTableToCSV(table3);
	//	System.out.println(modifiedcsv2);
		   
	}
}
