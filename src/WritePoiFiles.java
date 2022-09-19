import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.streaming.SXSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WritePoiFiles {
    public static void main(String[] args) throws IOException {
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet0 = workbook.createSheet("First Sheet");
        Row row0 = sheet0.createRow(0);
        //Row row1 = sheet0.createRow(1);
        Cell cellA = row0.createCell(0);
        Cell cellB = row0.createCell(1);
        Cell cellC = row0.createCell(2);
        //Cell cella = row1.createCell(0);
        cellA.setCellValue("First Name");
        cellB.setCellValue("Last Name");
        cellC.setCellValue("Mid ell Name");
        //cella.setCellValue(23);




        File f = new File("//Users//shrunjalmehta//Desktop//TextEdit//myExeclFiles1.xlsx");
        FileOutputStream fws = new FileOutputStream(f);
        workbook.write(fws);
        workbook.close();
        System.out.println("Files Has been created successfully");
    }
}
