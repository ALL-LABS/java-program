package dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.JTable;
import javax.swing.table.TableModel;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

class ReadDataFromExcel {
	
}
class JTableDemo{
	private JTable myTable;
	private String [][] tableData;
	private String [] tableColumns;
	private File fileName;

	public JTableDemo(File fileName) {
		
		this.fileName = fileName;
		
		
		myTable = new JTable(tableData,tableColumns);
		
	}
	

	public void readFile() throws IOException{

		System.out.println(fileName.getAbsolutePath());
		FileInputStream fis = new FileInputStream(fileName);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(0);
		FormulaEvaluator fe = wb.getCreationHelper().createFormulaEvaluator();
		int firstRowNumber=sheet.getFirstRowNum();
		int lastRowNumber = sheet.getLastRowNum();
		tableColumns = new String[sheet.getRow(lastRowNumber).getLastCellNum()];
	
		tableData = new String[firstRowNumber][sheet.getRow(lastRowNumber).getLastCellNum()];
		//for (Row row : sheet) {
			for(int i=firstRowNumber+1;i<lastRowNumber;i++) {
			
			for (int j=sheet.getRow(firstRowNumber).getFirstCellNum() ; j<	sheet.getRow(i).getLastCellNum();j++) {
				switch (fe.evaluateInCell(sheet.getRow(i).getCell(j)).getCellType()) {
				case Cell.CELL_TYPE_NUMERIC:
					System.out.print((sheet.getRow(i).getCell(j)).getNumericCellValue() + "\t\t");
					tableData[i][j] = String.valueOf((sheet.getRow(i).getCell(j)).getNumericCellValue());
					break;
				case Cell.CELL_TYPE_STRING:
					System.out.print((sheet.getRow(i).getCell(j)).getStringCellValue() + "\t\t");
					tableData[i][j] = String.valueOf((sheet.getRow(i).getCell(j)).getStringCellValue());
					break;
				}
				
			}
			
			System.out.println();
		}
		
		
	}
	
}
public class Experiment16 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Read an Excel Sheet");
		String fileName = scan.nextLine();
		File myFile = new File(fileName);
		try {
			new JTableDemo(myFile).readFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		scan.close();
	}
}
