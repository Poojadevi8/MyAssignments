package week6.homeass;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRed {

	
		public static String[][] Redexcel(String filename) throws IOException{
			// TODO Auto-generated method stub
			//String fileLocation=
			 XSSFWorkbook workbook = new XSSFWorkbook("./data/"+filename+".xlsx");
		        XSSFSheet sheet = workbook.getSheetAt(0);
	XSSFRow row=sheet.getRow(1);
	String name=sheet.getRow(1).getCell(0).getStringCellValue();
	int rowCount=sheet.getLastRowNum();
	int cellCount=row.getLastCellNum();

	String[][] data=new String[rowCount][cellCount];
		System.out.println("no of Rows:"+rowCount);
	System.out.println(name);
	System.out.println(cellCount);
	for (int i = 1; i <=rowCount; i++) {
		XSSFRow row2 = sheet.getRow(i);
		for (int j = 0; j <cellCount; j++) {
			String data1 = row2.getCell(j).getStringCellValue();
			System.out.println("data"+":"+ data1);
			data[i-1][j]=data1;
		}
	}	
	workbook.close();
	return data;
	}

	}

	
