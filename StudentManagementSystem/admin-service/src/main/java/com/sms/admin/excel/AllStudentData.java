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

import com.sms.admin.entity.StudentAdmitForm;


public class AllStudentData {
  public static String TYPE = "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet";
  
  static String[] HEADERs =
	  
	  {"Firstname",
			  "Lastname",
			  "Bloodgroup",
			  "Gender",
			  "Fathername",
			  "Mothername",
			  "Dateofbirth",
			  "Religion",
			  "Email",
			  "Inclass",
			  "Admissionid",
			  "Roll",
			  "Phone",
			  "Adress",
			  "Isclass",
			  "Section" };
  static String SHEET = "Teachers";
  public static ByteArrayInputStream StudentsdataToExcel(List<StudentAdmitForm> studentAdmitForm) {
    try (Workbook workbook = new XSSFWorkbook(); ByteArrayOutputStream out = new ByteArrayOutputStream();) {
      Sheet sheet = workbook.createSheet(SHEET);
      // Header
      Row headerRow = sheet.createRow(0);
      for (int col = 0; col < HEADERs.length; col++) {
        Cell cell = headerRow.createCell(col);
        cell.setCellValue(HEADERs[col]);
      }
      int rowIdx = 1;
      for (StudentAdmitForm student : studentAdmitForm) {
        Row row = sheet.createRow(rowIdx++);
        row.createCell(0).setCellValue(student.getFirstname());
        row.createCell(1).setCellValue(student.getLastname());
        row.createCell(2).setCellValue(student.getBloodgroup());
        row.createCell(3).setCellValue(student.getGender());
        row.createCell(4).setCellValue(student.getFathername());
        row.createCell(5).setCellValue(student.getMothername());
        row.createCell(6).setCellValue(student.getDateofbirth());
        row.createCell(7).setCellValue(student.getReligion());
        row.createCell(8).setCellValue(student.getEmail());
        row.createCell(9).setCellValue(student.getIsclass());
        row.createCell(10).setCellValue(student.getRoll());
        row.createCell(11).setCellValue(student.getAdmissionid());
        row.createCell(12).setCellValue(student.getPhone());
        row.createCell(13).setCellValue(student.getAddress());
        row.createCell(14).setCellValue(student.getIsclass());
        row.createCell(15).setCellValue(student.getSection());
      }
      workbook.write(out);
      return new ByteArrayInputStream(out.toByteArray());
    } catch (IOException e) {
      throw new RuntimeException("fail to import data to Excel file: " + e.getMessage());
    }
  }
}
