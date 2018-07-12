package Utility;
import java.io.FileInputStream;

import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;

import org.apache.poi.xssf.usermodel.XSSFRow;

import org.apache.poi.xssf.usermodel.XSSFSheet;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import org.apache.poi.ss.usermodel.Row;

public class ExcelUtils 
{
//basic read/write methods
	private static XSSFSheet ExcelWSheet;
	 
	private static XSSFWorkbook ExcelWBook;

	private static XSSFCell Cell;

	private static XSSFRow xRow;
	
	//method to set file path and open the Excel file 
	public static void setExcelFile(String Path,String SheetName) throws Exception
	{
		try
		{
			//Open Excel file
			FileInputStream ExcelFile = new FileInputStream(Path);
			ExcelWBook = new XSSFWorkbook(ExcelFile);
			ExcelWSheet = ExcelWBook.getSheet(SheetName);
		}catch(Exception e){
			throw(e);
		}
	}
	//This method is to read the test data from the Excel cell, in this we are passing parameters as Row num and Col num
	public static String getCellData(int RowNum, int ColNum) throws Exception{
		 
			try{

  			Cell = ExcelWSheet.getRow(RowNum).getCell(ColNum);

  			String CellData = Cell.getStringCellValue();

  			return CellData;

  			}catch (Exception e){

				return"";

  			}

      }
	//This method is to write in the Excel cell, Row num and Col num are the parameters
	 
	public static void setCellData(String Result,  int RowNum, int ColNum) throws Exception	{

			try{

  			xRow  = ExcelWSheet.getRow(RowNum);

			Cell = xRow.getCell(ColNum, Row.MissingCellPolicy.RETURN_BLANK_AS_NULL);

			if (Cell == null) {

				Cell = xRow.createCell(ColNum);

				Cell.setCellValue(Result);

				} else {

					Cell.setCellValue(Result);

				}
			FileOutputStream fileOut = new FileOutputStream(Constant.Path_Testdata + Constant.File_TestData);
			 
				ExcelWBook.write(fileOut);

				fileOut.flush();

				fileOut.close();

			}catch(Exception e){

				throw (e);

		}

	}

}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
