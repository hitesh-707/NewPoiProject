import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class NewPoiReadingLoop {
    public static void main(String[]args) throws IOException {
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet0 = workbook.createSheet("NEW SHEET");
        Row row0 = sheet0.createRow(0);
        Row row1 = sheet0.createRow(1);
        Cell cellA = row0.createCell(0);
        Cell cellB = row0.createCell(1);
        Cell cellAa = row1.createCell(0);
        Cell cellBb = row1.createCell(1);
        cellA.setCellValue("First Name");
        cellB.setCellValue("Last Name");
        cellAa.setCellValue(10);
        cellBb.setCellValue(20);
        File f = new File("//Users//shrunjalmehta//Desktop//TextEdit//myExcelFile2.xlsx");
        FileOutputStream fss = new FileOutputStream(f);
        workbook.write(fss);
        workbook.close();
        System.out.println("File edited ");



    }
}