package Presentation;



import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by Familia on 3/27/2017.
 */
public class LeerArchivo {

    ArrayList<String> celda = new ArrayList<String>();

    public void LeerFromArchivo() {

        try {
            FileInputStream file = null;
            file = new FileInputStream(new File("Datos.xlsx"));
            XSSFWorkbook workbook = new XSSFWorkbook(file);
            XSSFSheet sheet = workbook.getSheetAt(0);
            Iterator<Row> rowIterator = sheet.iterator();
            while (rowIterator.hasNext()) {
                Row row = rowIterator.next();
                //For each row, iterate through all the columns
                 Iterator<Cell> cellIterator = row.cellIterator();
                 while (cellIterator.hasNext()) {
                     Cell cell = cellIterator.next();
                     //Check the cell type and format accordingly
                     switch (cell.getCellType()) {
                         case Cell.CELL_TYPE_NUMERIC:
                         celda.add(cell.getNumericCellValue() + "d");
                             break;
                         case Cell.CELL_TYPE_STRING:
                             celda.add(cell.getStringCellValue() + "t");
                             break;
                     }
                 }
                celda.add(" ");
            }
            file.close();
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public ArrayList<String> getCelda() {
        return celda;
    }
}

