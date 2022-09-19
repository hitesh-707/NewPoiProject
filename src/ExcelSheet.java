/*import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public  class ExcelSheet {
    public static void main(String[] args) throws IOException {
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet0 = workbook.createSheet("Fist Sheet");
        Row row0 = sheet0.createRow(0);
        Cell cellA = row0.createCell(0);
        Cell cellB = row0.createCell(1);
        cellA.setCellValue("First cell");
        cellB.setCellValue("Second cell");
        File f = new File("//Users//shrunjalmehta//Desktop//TextEdit//myExeclFiles.xlsx");
        FileOutputStream fps = new FileOutputStream(f);
        workbook.write(fps);
        fps.close();
        System.out.println("File created successfully");

    }
}

*/