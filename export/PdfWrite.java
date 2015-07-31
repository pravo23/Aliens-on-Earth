package export;

import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.*;
import java.util.*;
import java.text.SimpleDateFormat;

public class PdfWrite extends Exporter {

    public void export(Map<String, String> data, String fileName) {
        String FileName = new SimpleDateFormat("'" + fileName + "'MM-dd-yyyy hh-mm-ss'." + "pdf'").format(new Date());
        try {
            OutputStream out = new FileOutputStream(new File(FileName));
            Document doc = new Document();
            
            PdfWriter.getInstance(doc, out);
            doc.open();
            
            doc.add(new Paragraph("registration of alien"));
            doc.add(new Paragraph(">>.."));
            int i=1;
            for(Map.Entry<String,String> var : data.entrySet()) {
                doc.add(new Paragraph(var.getKey()+" : "+var.getValue()));
                if(i%5==0)
                {
                    doc.add(new Paragraph(">>.."));
                }
                i++;
            }
            
            doc.close();
            out.flush();
            out.close();
            
            System.out.println("generated file location::"+ FileName);
        } catch (Exception e) {
            System.out.println("Exception occured while writng into pdf file");
        }
    }

}
