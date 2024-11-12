package odyssey.utilities;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class OdysseyXlUtilities {
    FileInputStream Od_input;
    XSSFWorkbook Od_workbook;
    public XSSFSheet Od_sheet;
    String Od_User, Od_Password;
    public int Od_count;
    public void OdysseyPropertyUtilities() throws IOException {
        Od_input=new FileInputStream("C:\\Users\\santhosh.krishnan\\eclipse-workspace\\Odyssey\\src\\test\\java\\odyssey\\testdata\\user_data.xlsx");
        Od_workbook=new XSSFWorkbook(Od_input);
        Od_sheet=Od_workbook.getSheetAt(0);
        Od_count=Od_sheet.getPhysicalNumberOfRows();

    }

    //public int Od_count=Od_sheet.getPhysicalNumberOfRows();

    int i=0,j=0;
    public String getUsername_Od()
    {
//        if(i<Od_count)
//        {
//            Od_User=Od_sheet.getRow(i).getCell(0).getStringCellValue();
//            //String Od_Password=Od_sheet.getRow(i).getCell(1).getStringCellValue();
//            i++;
//        }
//        return Od_User;
        return Od_sheet.getRow(1).getCell(0).getStringCellValue();
    }
    public String getPassword_Od()
    {
//        if(j<Od_count)
//        {
//            Od_Password=Od_sheet.getRow(i).getCell(1).getStringCellValue();
//            j++;
//        }

        return Od_sheet.getRow(1).getCell(1).getStringCellValue();

    }


}
