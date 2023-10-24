package week6.homeass;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class IntegrationExcelW3Schools {
public static String[][] w3School(String filename) throws IOException {
	XSSFWorkbook work=new XSSFWorkbook("./data/"+filename+".xlsx");
	XSSFSheet sheet=work.getSheetAt(0);
	XSSFRow row=sheet.getRow(0);
		int Row=sheet.getLastRowNum();
		System.out.println("no.of rows"+Row);
	int Col=row.getLastCellNum();
	System.out.println("no of col :"+Col);
	String[][] list=new String[Row][Col];
	for (int i = 1; i <= Row; i++) {
		XSSFRow Row1 = sheet.getRow(i);
		
		for (int j = 0; j <Col; j++) {
			String names=Row1.getCell(j).getStringCellValue();
			System.out.println("data:"+names);
			list[i-1][j]=names;
		}
				
	}
	work.close();
	return list;
	}}
	