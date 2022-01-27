package Assignments;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
/***
 * 
 * @author Abdul Hafeez
 *
 */
public class ExcelUtility {

	static String excelPath="./testResources/testData.xlsx";
	/**
	 * This method is used to read string data from an excel file
	 * @param sheet name provide the sheet name where the test data is located
	 * @param rowNum provide the row number where the test data is located
	 * @param cellNum provide the cell number which we want to read
	 * @return it returns the data in that respective sheet, row, cell in the form of String
	 */
	
	public static String readStringData(String sheetName,int rowNum,int cellNum)  {
		Workbook workbook = null;
		File absolutePath = new File(excelPath);
		FileInputStream fis;
		try {
			fis = new FileInputStream(absolutePath);
			workbook = WorkbookFactory.create(fis);
		}catch(FileNotFoundException A) {
			A.printStackTrace();
		}catch(EncryptedDocumentException B) {
			B.printStackTrace();
		}catch(IOException C) {
			C.printStackTrace();
		}
		return workbook.getSheet(sheetName).getRow(rowNum).getCell(cellNum).getStringCellValue();

	}

	/**
	 * This method is used to read string data from an excel file
	 * @param sheet name provide the sheet name where the test data is located
	 * @param rowNum provide the row number where the test data is located
	 * @param cellNum provide the cell number which we want to read
	 * @return it returns the data in that respective sheet, row, cell in the form of Boolean
	 */
	
	public static boolean readBooleanData(String sheetName,int rowNum,int cellNum) {

		Workbook workbook = null;
		File absolutePath = new File(excelPath);
		FileInputStream fis;
		try {
			fis=new FileInputStream(absolutePath);
			workbook=WorkbookFactory.create(fis);
		}catch(FileNotFoundException M) {
			M.printStackTrace();
		}catch(EncryptedDocumentException N) {
			N.printStackTrace();
		}catch(IOException O) {
			O.printStackTrace();
		}
		return workbook.getSheet(sheetName).getRow(rowNum).getCell(cellNum).getBooleanCellValue();

	}

	/**
	 * This method is used to read string data from an excel file
	 * @param sheet name provide the sheet name where the test data is located
	 * @param rowNum provide the row number where the test data is located
	 * @param cellNum provide the cell number which we want to read
	 * @return it returns the data in that respective sheet, row, cell in the form of Double
	 */

	public static double readNumericData(String sheetName,int rowNum,int cellNum) {

		Workbook workbook=null;
		File absolutePath=new File(excelPath);
		FileInputStream fis;
		try {
			fis=new FileInputStream(absolutePath);
			workbook=WorkbookFactory.create(fis);
		}catch(FileNotFoundException X) {
			X.printStackTrace();
		}catch(EncryptedDocumentException Y) {
			Y.printStackTrace();
		}catch(IOException Z) {
			Z.printStackTrace();
		}
		return workbook.getSheet(sheetName).getRow(rowNum).getCell(cellNum).getNumericCellValue();

	}

	/**
	 * This method is used to read string data from an excel file
	 * @param sheet name provide the sheet name where the test data is located
	 * @param rowNum provide the row number where the test data is located
	 * @param cellNum provide the cell number which we want to read
	 * @return it returns the data in that respective sheet, row, cell in the form of LocalDateTime
	 */
	public static LocalDateTime readLocalTimeDate(String sheetName,int rowNum,int cellNum) {

		Workbook workbook=null;
		File absolutePath=new File(excelPath);
		FileInputStream fis;
		try {
			fis=new FileInputStream(absolutePath);
			workbook=WorkbookFactory.create(fis);
		}catch(FileNotFoundException I) {
			I.printStackTrace();
		}catch(EncryptedDocumentException J) {
			J.printStackTrace();
		}catch(IOException K) {
			K.printStackTrace();
		}
		return workbook.getSheet(sheetName).getRow(rowNum).getCell(cellNum).getLocalDateTimeCellValue();

	}
}


