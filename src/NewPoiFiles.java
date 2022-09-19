import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class NewPoiFiles {
    public static void main(String[] args) throws IOException {
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet0 = workbook.createSheet("Sheet Name ");
        Row row0 = sheet0.createRow(0);
        Cell cellA = row0.createCell(0);
        Cell cellB = row0.createCell(1);
        cellA.setCellValue("Fist name");
        cellB.setCellValue("Last Name");
        File f = new File("");
        FileOutputStream fg = new FileOutputStream(f);
        workbook.write(fg);
        workbook.close();
        System.out.println("New Generated");


    }
}
