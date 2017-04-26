package Presentation;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by Familia on 4/10/2017.
 */
public class LeerArchivo {
    ArrayList<String> celda = new ArrayList();
    String rray = " ";

    public LeerArchivo() {
    }

    public void LeerFromArchivo() {
        try {
            FileInputStream e = null;
            e = new FileInputStream(new File("Datos.xlsx"));
            XSSFWorkbook workbook = new XSSFWorkbook(e);
            XSSFSheet sheet = workbook.getSheetAt(0);
            Iterator rowIterator = sheet.iterator();

            while(rowIterator.hasNext()) {
                Row row = (Row)rowIterator.next();
                Iterator cellIterator = row.cellIterator();

                while(cellIterator.hasNext()) {
                    Cell cell = (Cell)cellIterator.next();
                    switch(cell.getCellType()) {
                        case 0:
                            rray += cell.getNumericCellValue()+",";
                            break;
                        case 1:
                            rray += cell.getStringCellValue() + ",";
                    }
                }


            }

            celda.add(rray);

            e.close();
        } catch (FileNotFoundException var8) {
            var8.printStackTrace();
        } catch (Exception var9) {
            var9.printStackTrace();
        }

    }

    public ArrayList<String> getCelda() {
        return this.celda;
    }
}
