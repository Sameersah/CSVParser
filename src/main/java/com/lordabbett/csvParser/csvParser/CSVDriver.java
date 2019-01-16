package com.lordabbett.csvParser.csvParser;

public class CSVDriver {

	public static void main(String args[]) {
		
		String csvString = "seq,first,last,age,street,city,state,zip,dollar,pick,date\r\n" + 
				"1,Manuel,Erickson,19,Kago Circle,Puemooh,MT,26257,$9129.20,WHITE,08/02/1957\r\n" + 
				"2,Douglas,Gregory,58,Diane Street,Tuhesti,KS,07054,$6974.02,YELLOW,12/01/1981\r\n" + 
				"3,Ernest,Lynch,48,Coegu Plaza,Ipkoluci,DE,51381,$7308.92,GREEN,02/16/2029\r\n" + 
				"4,Agnes,Wong,64,Esivi Junction,Acwatus,IA,94643,$657.56,WHITE,04/30/2016\r\n" + 
				"5,Tillie,Vasquez,64,Tupod Ridge,Socucun,ND,32834,$660.39,YELLOW,07/04/2005\r\n" + 
				"6,Theresa,Yates,25,Cehso Glen,Uvunimfu,RI,74046,$8021.54,RED,04/12/2070\r\n" + 
				"7,Aaron,Hopkins,39,Cobzu View,Ahofaer,OK,13551,$6892.84,WHITE,05/22/2004\r\n" + 
				"8,Andre,Briggs,50,Wiki Manor,Cohzugpe,OK,66699,$413.32,RED,02/15/2047\r\n" + 
				"9,Floyd,Santiago,21,Kolar Parkway,Bizruso,LA,84036,$8216.94,YELLOW,02/19/2015\r\n" + 
				"10,Jeffrey,Willis,42,Maji Junction,Zejokaba,KY,48778,$9783.00,BLUE,03/13/2042\r\n" + 
				"";
		
		
		CSVParser parser = new CSVParser();
		Table table = parser.mapCSVToTable(csvString);
		 table.updateColoumn("first").updateRow("Manuel").setData("sameer sah");
		 String modifiedCSV =   parser.mapTableToCSV(table);
		 System.out.println(modifiedCSV);
		
		
		
		
		   
	}
}
