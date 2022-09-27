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

import com.sms.admin.entity.NewTeacher;


public class AllTeachersData {
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
			  "Addres",
			  "Idno",
			  "Phone",
			  "Adress",
			  "Isclass",
			  "Section" };
  static String SHEET = "Teachers";
  public static ByteArrayInputStream TeachersdataToExcel(List<NewTeacher> newTeachers) {
    try (Workbook workbook = new XSSFWorkbook(); ByteArrayOutputStream out = new ByteArrayOutputStream();) {
      Sheet sheet = workbook.createSheet(SHEET);
      // Header
      Row headerRow = sheet.createRow(0);
      for (int col = 0; col < HEADERs.length; col++) {
        Cell cell = headerRow.createCell(col);
        cell.setCellValue(HEADERs[col]);
      }
      int rowIdx = 1;
      for (NewTeacher teacher : newTeachers) {
        Row row = sheet.createRow(rowIdx++);
        row.createCell(0).setCellValue(teacher.getFirstname());
        row.createCell(1).setCellValue(teacher.getLastname());
        row.createCell(2).setCellValue(teacher.getBloodgroup());
        row.createCell(3).setCellValue(teacher.getGender());
        row.createCell(4).setCellValue(teacher.getFathername());
        row.createCell(5).setCellValue(teacher.getMothername());
        row.createCell(6).setCellValue(teacher.getDateofbirth());
        row.createCell(7).setCellValue(teacher.getReligion());
        row.createCell(8).setCellValue(teacher.getEmail());
        row.createCell(9).setCellValue(teacher.getIsclass());
        row.createCell(10).setCellValue(teacher.getAddres());
        row.createCell(11).setCellValue(teacher.getIdno());
        row.createCell(12).setCellValue(teacher.getPhone());
        row.createCell(13).setCellValue(teacher.getAdress());
       
        row.createCell(15).setCellValue(teacher.getSection());
      }
      workbook.write(out);
      return new ByteArrayInputStream(out.toByteArray());
    } catch (IOException e) {
      throw new RuntimeException("fail to import data to Excel file: " + e.getMessage());
    }
  }
}
