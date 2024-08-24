# Read Email and Password from Excel Sheet

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadExcel {
    public static void main(String[] args) {
        String excelFilePath = "path/to/your/excel/file.xlsx";
        try (FileInputStream fis = new FileInputStream(new File(excelFilePath));
             Workbook workbook = new XSSFWorkbook(fis)) {

            Sheet sheet = workbook.getSheetAt(0);
            Row row = sheet.getRow(1); // Assuming email and password are in the second row
            Cell emailCell = row.getCell(0); // Email in the first column
            Cell passwordCell = row.getCell(1); // Password in the second column

            String email = emailCell.getStringCellValue();
            String password = passwordCell.getStringCellValue();

            System.out.println("Email: " + email);
            System.out.println("Password: " + password);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
