package com.meganexus.mis.testartifacts;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFDateUtil;
import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFCreationHelper;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFHyperlink;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XlsReader {

  public static String path;
  public static InputStream fis = null;
  public static FileOutputStream fileOut = null;
  private static XSSFWorkbook workbook = null;
  private static XSSFSheet sheet = null;
  private static XSSFRow row = null;
  private static XSSFCell cell = null;
  private static String TDSheet = ".\\TestData\\MIS Wales Import Template.xlsx";

  public XlsReader(final String path) {

    try {
      fis = new FileInputStream(TDSheet);
      workbook = new XSSFWorkbook(fis);
      // sheet = workbook.getSheetAt(0); // first sheet
      // sheet = workbook.getSheet("Data");

      fis.close();
    } catch (Exception e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }

  }

  /*
   * returns the row count in a sheet public static int getRowCount(String sheetName){ int index =
   * workbook.getSheetIndex(sheetName); if(index==-1) return 0; else{ sheet =
   * workbook.getSheetAt(index); int number=sheet.getLastRowNum()+1; return number; }
   *
   * }
   */
  // returns the row count in a sheet
  public static int getRowCount(final String Sheetname) {
    try {
      fis = new FileInputStream(TDSheet);
      workbook = new XSSFWorkbook(fis);
      sheet = workbook.getSheet(Sheetname);
      fis.close();

      int index = workbook.getSheetIndex(Sheetname);
      if (index == -1)
        return 0;
      else {
        sheet = workbook.getSheetAt(index);
        int number = sheet.getLastRowNum() + 1;
        return number;
      }

    } catch (Exception e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    return 0;

  }

  public static String getCellData(final String sheetName, final int colNum, final int rowNum) {
    //System.out.print("rowNum: " + rowNum + " ,colNum: " + colNum + " ");
    int index = workbook.getSheetIndex(sheetName);
    // if sheet not found return
    if (index == -1) {
      System.out.println("No Excel sheet found with name : " + sheetName);
      return "";
    }
    Sheet selectedSheet = workbook.getSheetAt(index);
    XSSFRow row = sheet.getRow(rowNum - 1);
    XSSFCell  cell = row.getCell(colNum);
    if (cell != null) {
      switch (cell.getCellTypeEnum()) {
        case STRING:
          //System.out.println("Cell.CELL_TYPE_STRING " + cell.getStringCellValue());
          return cell.getStringCellValue();
        case BOOLEAN:
          //System.out.println("Cell.CELL_TYPE_BOOLEAN " + cell.getBooleanCellValue());
          return cell.getStringCellValue();
        case FORMULA: // precomputed value based on formula
          //System.out.println("Cell.CELL_TYPE_FORMULA " + String.format("%s", cell.getNumericCellValue()));
          return Integer.toString((int) cell.getNumericCellValue());
        case NUMERIC:
          //System.out.print("Cell.CELL_TYPE_NUMERIC ");
          String cellText = "";// = String.valueOf(cell.getNumericCellValue());
          if (HSSFDateUtil.isCellDateFormatted(cell)) {
            // format in form of MM/DD/YYYY
            DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
            Date date = cell.getDateCellValue();
            Calendar cal = Calendar.getInstance();
            cal.setTime(date);
            cellText = formatter.format(date);
            //System.out.println(" is a date: " + cellText);
            return cellText;
          } else {
        	  //System.out.println("cell "+cell.getNumericCellValue());
            double numCellValue = cell.getNumericCellValue();
            //System.out.println(" is a number: " + numCellValue);
            if(numCellValue % 1 == 0){
            cellText = Integer.toString((int)numCellValue );
            //System.out.println(" is an integer number: " + cellText);
            }
            else{
            	cellText = Double.toString((double)numCellValue );
            	//System.out.println(" is a double number: " + numCellValue);
            }
            return cellText;
          }
        default:
          //System.out.println("Cell Type not recognized.");
          return "";
      }
    }
    //System.out.println("Cell empty/not found.");
    return "";
  }

  // returns true if data is set successfully else false
  public static void setCellData(final String Sheetname, final String colName, final int rowNum, final String data) {
    try {
      fis = new FileInputStream(TDSheet);
      workbook = new XSSFWorkbook(fis);
      sheet = workbook.getSheet(Sheetname);
      fis.close();


      int colNum = 0;
      row = sheet.getRow(0);
      for (int i = 0; i < row.getLastCellNum(); i++) {
        if (row.getCell(i).getStringCellValue().trim().equals(colName)) {
          colNum = i;
          break;
        }
      }
      row = sheet.getRow(rowNum - 1);
      cell = row.getCell(colNum);
      cell.setCellValue(data);


      fileOut = new FileOutputStream(TDSheet);
      workbook.write(fileOut);
      fileOut.close();

    } catch (Exception e) {
      e.printStackTrace();

    }

  }

  // returns true if data is set successfully else false
  public static boolean setCellData(final String sheetName, final String colName, final int rowNum, final String data,
      final String url) {
    // System.out.println("setCellData setCellData******************");
    try {
      fis = new FileInputStream(path);
      workbook = new XSSFWorkbook(fis);

      if (rowNum <= 0)
        return false;

      int index = workbook.getSheetIndex(sheetName);
      int colNum = -1;
      if (index == -1)
        return false;


      sheet = workbook.getSheetAt(index);
      // System.out.println("A");
      row = sheet.getRow(0);
      for (int i = 0; i < row.getLastCellNum(); i++) {
        // System.out.println(row.getCell(i).getStringCellValue().trim());
        if (row.getCell(i).getStringCellValue().trim().equalsIgnoreCase(colName))
          colNum = i;
      }

      if (colNum == -1)
        return false;
      sheet.autoSizeColumn(colNum); // ashish
      row = sheet.getRow(rowNum - 1);
      if (row == null)
        row = sheet.createRow(rowNum - 1);

      cell = row.getCell(colNum);
      if (cell == null)
        cell = row.createCell(colNum);

      cell.setCellValue(data);
      XSSFCreationHelper createHelper = workbook.getCreationHelper();

      // cell style for hyperlinks
      // by default hypelrinks are blue and underlined
      CellStyle hlink_style = workbook.createCellStyle();
      XSSFFont hlink_font = workbook.createFont();
      hlink_font.setUnderline(XSSFFont.U_SINGLE);
      hlink_font.setColor(IndexedColors.BLUE.getIndex());
      hlink_style.setFont(hlink_font);
      // hlink_style.setWrapText(true);

      XSSFHyperlink link = createHelper.createHyperlink(XSSFHyperlink.LINK_FILE);
      link.setAddress(url);
      cell.setHyperlink(link);
      cell.setCellStyle(hlink_style);

      fileOut = new FileOutputStream(path);
      workbook.write(fileOut);

      fileOut.close();

    } catch (Exception e) {
      e.printStackTrace();
      return false;
    }
    return true;
  }



  // returns true if sheet is created successfully else false
  public static boolean addSheet(final String sheetname) {

    FileOutputStream fileOut;
    try {
      workbook.createSheet(sheetname);
      fileOut = new FileOutputStream(path);
      workbook.write(fileOut);
      fileOut.close();
    } catch (Exception e) {
      e.printStackTrace();
      return false;
    }
    return true;
  }

  // returns true if sheet is removed successfully else false if sheet does not exist
  public static boolean removeSheet(final String sheetName) {
    int index = workbook.getSheetIndex(sheetName);
    if (index == -1)
      return false;

    FileOutputStream fileOut;
    try {
      workbook.removeSheetAt(index);
      fileOut = new FileOutputStream(path);
      workbook.write(fileOut);
      fileOut.close();
    } catch (Exception e) {
      e.printStackTrace();
      return false;
    }
    return true;
  }

  // returns true if column is created successfully
  public static boolean addColumn(final String sheetName, final String colName) {
    // System.out.println("**************addColumn*********************");

    try {
      fis = new FileInputStream(path);
      workbook = new XSSFWorkbook(fis);
      int index = workbook.getSheetIndex(sheetName);
      if (index == -1)
        return false;

      XSSFCellStyle style = workbook.createCellStyle();
      style.setFillForegroundColor(HSSFColor.GREY_40_PERCENT.index);
      style.setFillPattern(HSSFCellStyle.SOLID_FOREGROUND);

      sheet = workbook.getSheetAt(index);

      row = sheet.getRow(0);
      if (row == null)
        row = sheet.createRow(0);

      // cell = row.getCell();
      // if (cell == null)
      // System.out.println(row.getLastCellNum());
      if (row.getLastCellNum() == -1)
        cell = row.createCell(0);
      else
        cell = row.createCell(row.getLastCellNum());

      cell.setCellValue(colName);
      cell.setCellStyle(style);

      fileOut = new FileOutputStream(path);
      workbook.write(fileOut);
      fileOut.close();

    } catch (Exception e) {
      e.printStackTrace();
      return false;
    }

    return true;


  }

  // removes a column and all the contents
  public static boolean removeColumn(final String sheetName, final int colNum) {
    try {
      if (!isSheetExist(sheetName))
        return false;
      fis = new FileInputStream(path);
      workbook = new XSSFWorkbook(fis);
      sheet = workbook.getSheet(sheetName);
      XSSFCellStyle style = workbook.createCellStyle();
      style.setFillForegroundColor(HSSFColor.GREY_40_PERCENT.index);
      // XSSFCreationHelper createHelper = workbook.getCreationHelper();
      style.setFillPattern(HSSFCellStyle.NO_FILL);

      for (int i = 0; i < getRowCount(sheetName); i++) {
        row = sheet.getRow(i);
        if (row != null) {
          cell = row.getCell(colNum);
          if (cell != null) {
            cell.setCellStyle(style);
            row.removeCell(cell);
          }
        }
      }
      fileOut = new FileOutputStream(path);
      workbook.write(fileOut);
      fileOut.close();
    } catch (Exception e) {
      e.printStackTrace();
      return false;
    }
    return true;

  }

  // find whether sheets exists
  public static boolean isSheetExist(final String sheetName) {
    int index = workbook.getSheetIndex(sheetName);
    if (index == -1) {
      index = workbook.getSheetIndex(sheetName.toUpperCase());
      if (index == -1)
        return false;
      else
        return true;
    } else
      return true;
  }

  // returns number of columns in a sheet
  public static int getColumnCount(final String sheetName) {
    // check if sheet exists
    if (!isSheetExist(sheetName))
      return -1;

    sheet = workbook.getSheet(sheetName);
    row = sheet.getRow(0);

    if (row == null)
      return -1;

    return row.getLastCellNum();



  }

  // String sheetName, String testCaseName,String keyword ,String URL,String message
  public static boolean addHyperLink(final String sheetName, final String screenShotColName,
      final String testCaseName, final int index, String url, final String message) {
    // System.out.println("ADDING addHyperLink******************");

    url = url.replace('\\', '/');
    if (!isSheetExist(sheetName))
      return false;

    sheet = workbook.getSheet(sheetName);

    for (int i = 2; i <= getRowCount(sheetName); i++) {
      if (getCellData(sheetName, 0, i).equalsIgnoreCase(testCaseName)) {
        // System.out.println("**caught "+(i+index));
        setCellData(sheetName, screenShotColName, i + index, message, url);
        break;
      }
    }


    return true;
  }

  public static int getCellRowNum(final String sheetName, final int colNum, final String cellValue) {
    try {
      fis = new FileInputStream(TDSheet);
      workbook = new XSSFWorkbook(fis);
      sheet = workbook.getSheetAt(0); // first sheet
      fis.close();

      for (int i = 1; i <= getRowCount(sheetName); i++) {
        if (getCellData(sheetName, colNum, i).equalsIgnoreCase(cellValue)) {
          return i;
        }
      }
    } catch (Exception e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    return -1;
  }


  public static int getCellRowCount(final String sheetName, final int colNum, final String cellValue) {
    try {
      int count = 0;
      fis = new FileInputStream(TDSheet);
      workbook = new XSSFWorkbook(fis);
      sheet = workbook.getSheetAt(0); // first sheet
      fis.close();

      for (int i = 1; i < getRowCount(sheetName); i++) {
        if (getCellData(sheetName, colNum, i).equalsIgnoreCase(cellValue)) {
          count++;
        }
      }
      return count;
    } catch (Exception e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    return -1;
  }

}
