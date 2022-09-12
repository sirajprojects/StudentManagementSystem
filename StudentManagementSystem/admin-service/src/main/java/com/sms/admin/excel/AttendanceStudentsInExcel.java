package com.sms.admin.excel;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.sms.admin.entity.Attendence;

public class AttendanceStudentsInExcel {
	
	
  public static String TYPE = "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet";
  static String[] HEADERs = { "One",
		  "Two",
		  "Three",
		  "Fourt",
		  "Five",
		  "Six",
		  "Seven",
		  "Eight",
		  "Nine",
		  "Ten",
		  "Eleven",
		  "Twelve",
		  "Thirteen",
		  "Fourteen",
		  "Fifteen",
		  "Sixteen",
		  "Seventeen",
		  "Eighteen",
		  "Nineteen",
		  "Twenty",
		  "Twentyone",
		  "Twentytwo",
		  "Twentythree",
		  "Wentyfour",
		  "Twentyfive",
		  "Twentysix",
		  "Twentyseven",
		  "Twentyeight",
		  "Twentynine",
		  "Thirty",
		  "Thirtyone"};
  
  static String SHEET = "Attendances";
  public static ByteArrayInputStream AttendanceToExcel(List<Attendence> attendences) {
    try (Workbook workbook = new XSSFWorkbook(); ByteArrayOutputStream out = new ByteArrayOutputStream();) {
      Sheet sheet = workbook.createSheet(SHEET);
      // Header
      Row headerRow = sheet.createRow(0);
      for (int col = 0; col < HEADERs.length; col++) {
        Cell cell = headerRow.createCell(col);
        cell.setCellValue(HEADERs[col]);
      }
      int rowIdx = 1;
      for (Attendence attendance : attendences) {
        Row row = sheet.createRow(rowIdx++);
        row.createCell(0).setCellValue(false);
        row.createCell(1).setCellValue(false);
        row.createCell(2).setCellValue(false);
        row.createCell(3).setCellValue(false);
        row.createCell(4).setCellValue(false);
        row.createCell(5).setCellValue(false);
        row.createCell(6).setCellValue(false);
        row.createCell(7).setCellValue(false);
        row.createCell(8).setCellValue(false);
        row.createCell(9).setCellValue(false);
        row.createCell(10).setCellValue(false);
        row.createCell(11).setCellValue(false);
        row.createCell(12).setCellValue(false);
        row.createCell(13).setCellValue(false);
        row.createCell(14).setCellValue(false);
        row.createCell(15).setCellValue(false);
        row.createCell(16).setCellValue(false);
        row.createCell(17).setCellValue(false);
        row.createCell(18).setCellValue(false);
        row.createCell(19).setCellValue(false);
        row.createCell(20).setCellValue(false);
        row.createCell(21).setCellValue(false);
        row.createCell(22).setCellValue(false);
        row.createCell(23).setCellValue(false);
        row.createCell(24).setCellValue(false);
        row.createCell(25).setCellValue(false);
        row.createCell(26).setCellValue(false);
        row.createCell(27).setCellValue(false);
        row.createCell(28).setCellValue(false);
        row.createCell(29).setCellValue(false);
        row.createCell(30).setCellValue(false);
        row.createCell(31).setCellValue(false);
        row.createCell(32).setCellValue(false);

      }
      workbook.write(out);
      return new ByteArrayInputStream(out.toByteArray());
    } catch (IOException e) {
      throw new RuntimeException("fail to import data to Excel file: " + e.getMessage());
    }
  }
}
