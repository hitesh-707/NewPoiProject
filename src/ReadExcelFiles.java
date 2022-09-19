import org.apache.poi.ss.usermodel.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadExcelFiles {
    public static void main(String[]args) throws IOException {
        File f = new File("//Users//shrunjalmehta//Desktop//TextEdit//myExeclFiles.xlsx");
        FileInputStream fbb = new FileInputStream(f);
        Workbook workbook = WorkbookFactory.create(fbb);
        Sheet sheet0 = workbook.getSheetAt(0);
        Row row0 = sheet0.getRow(0);
        Cell cellA = row0.getCell(0);
        System.out.println(cellA);
        fbb.close();

    }
}
