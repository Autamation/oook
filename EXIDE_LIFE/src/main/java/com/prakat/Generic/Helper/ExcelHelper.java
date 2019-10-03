package com.prakat.Generic.Helper;
	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.IOException;
	import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
	import org.apache.poi.ss.usermodel.Row;
	import org.apache.poi.ss.usermodel.Sheet;
	import org.apache.poi.ss.usermodel.Workbook;
	import org.apache.poi.ss.usermodel.WorkbookFactory;

	public class ExcelHelper {	
		public Sheet sh;
		public Row row;
		public Workbook wb;  

		public String getExcelData(String SheetName, int RowNum, int CellNum) throws Throwable, IOException {
			wb = getWorkBook();
			sh = wb.getSheet(SheetName);     
			row = sh.getRow(RowNum);
			String data = row.getCell(CellNum).getStringCellValue();
			return data;
		}

		private Workbook getWorkBook() throws FileNotFoundException, IOException, InvalidFormatException {
			String filePath = ConstantHelper.FilePath;
			FileInputStream file = new FileInputStream(filePath);
			Workbook wb = WorkbookFactory.create(file);
			return wb;
		}

		public int getRowCount(int SheetNum) throws Exception {
			wb = getWorkBook();   
			sh = wb.getSheetAt(SheetNum);
			int rowCount = sh.getLastRowNum() + 1;
			return rowCount;
		}

		
		public int getColCount() throws Exception {
			wb = getWorkBook();
			sh = wb.getSheetAt(0);
			row = sh.getRow(0);
			int cellCount = row.getLastCellNum();
			return cellCount;
			}
	}

