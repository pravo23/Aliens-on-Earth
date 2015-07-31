package export;

import java.io.*;
import java.util.*;
import java.text.SimpleDateFormat;



public class TextWrite extends Exporter {

    
    @Override
    public void export(Map<String, String> data, String fileName) {
        String FileName = new SimpleDateFormat("'" + fileName + "'yyyy-MM-dd hh-mm-ss'." + "txt'").format(new Date());
        BufferedWriter br = null;
        try {
            br = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(new File(FileName))));
            br.append("registration of aliens");
            br.newLine();
            br.append(">>..");
            int i=0;
            for (Map.Entry<String, String> var : data.entrySet()) {
                i++;
                br.newLine();
                br.append(var.getKey() + " " + var.getValue());
                if(i%5 == 0) {
                    br.newLine();
                    br.append(">>..");
                }
            }

            System.out.println("generated file location: " + FileName);

        } catch (IOException e) {
            System.out.println("exception occured into text file writing");
        } finally {
            if(br != null) {
                try {
                    br.flush();
                    br.close();
                } catch (IOException e) {
                    System.out.println("IOExeption Occured");
                }
            }
        }
    }

}
