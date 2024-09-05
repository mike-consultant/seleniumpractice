package utilities;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtil {

	public static void main (String [] args) throws IOException {
		Object [][] data=readExcel ("testdata/mytestdata.xlsx", "LoginData");
		
		for (int i=0; i<data.length; i++) {
			for (int j=0; j<data[1].length; j++) {
				System.out.println(data[i][j]);
			}
		}

	}
	
	public static Object[][] readExcel(String path, String sheet) throws IOException {
		XSSFWorkbook book = new XSSFWorkbook (path); 
		XSSFSheet sheet1 = book.getSheet(sheet);
		int totalRow=sheet1.getLastRowNum();
		System.out.println("Rows: "+totalRow);
		
		XSSFRow	row = sheet1.getRow(1);
		int totalColumn=row.getLastCellNum();
		System.out.println("Columns: "+totalColumn);
		//XSSFCell cell = row.getCell(1);
		//String value = cell.getStringCellValue();
		
		Object data [][] = new Object [totalRow][totalColumn];

		for (int i=1; i<totalRow; i++) {
			String userName=sheet1.getRow(i).getCell(0).getStringCellValue();
			String password=sheet1.getRow(i).getCell(1).getStringCellValue();
			String valid=sheet1.getRow(i).getCell(2).getStringCellValue();
//			System.out.println("Username: "+userName);
//			System.out.println("Password: "+password);
//			System.out.println("Valid: "+valid);
			data[i-1][0]=userName;
			data[i-1][1]=password;
			data[i-1][2]=valid;
		}
		book.close();
		return data;
	}
}
