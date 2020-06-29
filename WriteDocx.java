/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package readwritedocx;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;

/**
 *
 * @author 62813
 */
public class WriteDocx {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        String teks = "Write adalah kebalikan dari read.";
        
        XWPFDocument documentDocx = new XWPFDocument();
        
        String outDocxEn = "D:writeDocx.docx";
        try (FileOutputStream outDocx = new FileOutputStream(new File(outDocxEn))) {
            XWPFParagraph paragraphDocx = documentDocx.createParagraph();
            XWPFRun runDocx = paragraphDocx.createRun();
            runDocx.setText(teks);
            
            documentDocx.write(outDocx);
        }
        System.out.println("docx written successfully");
    }
}
