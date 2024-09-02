package request;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write {
	public static void main(String[] args) throws IOException{
		String [][] data= {{"username","password"},{"dhivya","12234"}};
		
		File f = new File(".\\Excel\\test.xlsx");
		FileInputStream stream = new FileInputStream(f);
		Workbook wk = new XSSFWorkbook(stream);
		Sheet sheet = wk.createSheet("userss");
		for (int i=0;i< 2; i++) {
			Row row = sheet.createRow(i);
			for(int j=0;j< 2; j++) {
				Cell cell = row.createCell(j);
				cell.setCellValue(data[i][j]);
			}
		}
		FileOutputStream fo = new FileOutputStream(f);
    	wk.write(fo);
		wk.close();
System.out.println("writing process completed....");
	}


}
