package odyssey.utilities;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class OdysseyXlCreateAccount {
    FileInputStream Od_input_Create;
    XSSFWorkbook Od_workbook_Create;
    public XSSFSheet Od_sheet_Create;
    String Od_User, Od_Password_Create;
    public int Od_count_Create;
    public void OdysseyXlCreateAccountmethod() throws IOException {
        Od_input_Create=new FileInputStream("C:\\Users\\santhosh.krishnan\\eclipse-workspace\\Odyssey\\src\\test\\java\\odyssey\\testdata\\OdysseyCA.xlsx");
        Od_workbook_Create=new XSSFWorkbook(Od_input_Create);
        Od_sheet_Create=Od_workbook_Create.getSheet("Sheet1");
        Od_count_Create=Od_sheet_Create.getPhysicalNumberOfRows();
    }

    public String getFirstname()
    {
        return Od_sheet_Create.getRow(0).getCell(0).getStringCellValue();
    }

    public String getLastname()
    {
        return Od_sheet_Create.getRow(0).getCell(1).getStringCellValue();
    }
    public String CreateUsername()
    {
        return Od_sheet_Create.getRow(0).getCell(2).getStringCellValue();
    }

    public String CreatePassword()
    {
        return Od_sheet_Create.getRow(0).getCell(3).getStringCellValue();
    }


}
