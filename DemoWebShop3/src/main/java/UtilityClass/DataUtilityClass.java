package UtilityClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DataUtilityClass {

	public String readingDataFromPropertyFile(String path, String key) throws IOException {
		// TODO Auto-generated method stub
		File file = new File(path);
		FileInputStream fis = new FileInputStream(file);
		Properties prop = new Properties();
		prop.load(fis);

		String data = (String) prop.get(key);
		return data;
	}

	public String readingSingleCellFromExcel(String path,int rowNum,int cellNum,String sheetName) throws EncryptedDocumentException, IOException {

		File file2 = new File(path);
		FileInputStream fis2 = new FileInputStream(file2);

		Workbook workbook = WorkbookFactory.create(fis2);
		Sheet sheet = workbook.getSheet(sheetName);

		String data=sheet.getRow(rowNum).getCell(cellNum).toString();
		return data;

	}

	private String[] readDataFromMultipleRowSingleColumn(String path,String sheetName) throws EncryptedDocumentException, IOException {

		File file = new File(path);
		FileInputStream fis = new FileInputStream(file);

		Workbook workbook = WorkbookFactory.create(fis);
		Sheet sheet = workbook.getSheet(sheetName);

		int rowNum = sheet.getPhysicalNumberOfRows();

		String[] data=new String[rowNum];
		
		for (int i = 0; i < rowNum; i++) {
			data[i]= sheet.getRow(i).getCell(0).toString();
			
		}
		return data;
	}

	public String[][] readDataFromMultipleRow(String path, String sheetName) throws EncryptedDocumentException, IOException {

		File file = new File(path);
		FileInputStream fis = new FileInputStream(file);

		Workbook workbook = WorkbookFactory.create(fis);
		Sheet sheet = workbook.getSheet(sheetName);
		
		int rownum=sheet.getPhysicalNumberOfRows();
		int colnum=sheet.getRow(0).getPhysicalNumberOfCells();
		
		String[][] data1=new String[rownum-1][colnum];
		
		for(int i=1;i<rownum;i++) {
			for(int j=0;j<colnum;j++) {
				data1[i-1][j]=sheet.getRow(i).getCell(j).toString();
			}
		}
		return data1;
	}

}
