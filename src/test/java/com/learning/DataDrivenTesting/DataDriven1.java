package com.learning.DataDrivenTesting;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class DataDriven1 {

    public static void main(String args[]) throws IOException {

        //
        //initialize file path
    }

    public ArrayList getData(String testcasename) throws IOException {
        ArrayList a = new ArrayList<String>();
        File src = new File("./TestData/TestData.xlsx");
        //taking file path into FileInputStream
        FileInputStream fis = new FileInputStream(src);

        System.out.println(fis);
        //creating object of XSSFWorkbook to initilize and providing fileinputstream object to XSSFWorkbook class
        XSSFWorkbook xssfWorkbook  = new XSSFWorkbook(fis);
        //getting the total sheet count from Excel file
        System.out.println(xssfWorkbook.getNumberOfSheets());
        int sheetCount = xssfWorkbook.getNumberOfSheets();
        for(int i =0;i<sheetCount;i++){
            if(xssfWorkbook.getSheetName(i).equalsIgnoreCase(testcasename)){
                XSSFSheet xssfSheet = xssfWorkbook.getSheetAt(i);
                Iterator<Row> rows = xssfSheet.iterator();
                Row firstRow = rows.next();
                Iterator<Cell> cell = firstRow.cellIterator();
                int k=0;
                int col = 0;
                while (cell.hasNext()){
                    Cell value = cell.next();
                    if(value.getStringCellValue().equalsIgnoreCase("username")){
                        col=k;
                    }
                    k++;
                }
                System.out.println(col);
                while (rows.hasNext()){
                    Row r = rows.next();
                    if(r.getCell(col).getStringCellValue().equalsIgnoreCase("sujeet")){
                        Iterator<Cell> cv = r.cellIterator();
                        while (cv.hasNext()){
                            System.out.println(cv.next().getStringCellValue());
                            a.add(cv.next().getStringCellValue());
                        }
                    }

                }
            }
        }

        return a;
    }
    }


