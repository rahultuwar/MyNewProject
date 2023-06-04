package module1_Library;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class UtilityClass {
	public static String testData(int rowIndex,int columnIndex) throws EncryptedDocumentException, IOException {
FileInputStream File=new FileInputStream("G:\\velcoity\\SELENIUM\\OpenEMRTestData.xlsx");
Sheet S1=WorkbookFactory.create(File).getSheet("TestData");
String value=S1.getRow(rowIndex).getCell(columnIndex).getStringCellValue();
return value;   

}
}