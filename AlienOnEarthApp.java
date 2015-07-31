import Alien.AliensInfo;
import export.Exporter;
import java.io.*;
import java.util.*;


public class AlienOnEarthApp {
    
    public static List<AliensInfo> readAlienInfo() {
        List<AliensInfo> aliens = new ArrayList<AliensInfo>();
        BufferedReader br = null;
    
        try{
            br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter 'quit' to quit ");
            
            do{
            AliensInfo alien = new AliensInfo();
            System.out.println("Enter Alien codeName:");
            alien.setcodeName(br.readLine());
            
            System.out.println("Enter Alien bloodColor:");
            alien.setbloodColor(br.readLine());
            
            System.out.println("Enter noOfAntennas:");
            alien.setnoOfAntenas(Integer.parseInt(br.readLine()));
            
            System.out.println("Enter noOflegs:");
            alien.setnoOfLegs(Integer.parseInt(br.readLine()));
            
            System.out.println("Enter Alien homePlanet:");
            alien.sethomePlanet(br.readLine());
            
            aliens.add(alien);
            }while(!br.readLine().equalsIgnoreCase("quit"));
            
    }catch(IOException e) {
          System.out.println("Exception occured while reading values");
     }
     catch(NumberFormatException e) {
          System.out.println("Exception occred while parsing");
      }
        finally {
            if(br == null) {
                System.out.println("Error in reading.");
            }
            return aliens;
        }
    } 
    
    
    
     public static Map<String,String> generateExportMap(List<AliensInfo> alienArray) {
        Map<String,String> data = new LinkedHashMap<String,String>();
        for(int i=0; i < alienArray.size(); i++) {
        AliensInfo registerAliens = alienArray.get(i);
        data.put("CodeName of Alien "+i,registerAliens.getcodeName());
        data.put("BloodColor of Alien "+i,registerAliens.getbloodColor());
        data.put("NoOfAntennas of Alien "+i,String.valueOf(registerAliens.getnoOfAntennas()));
        data.put("NoOfLegs of Alien "+i,String.valueOf(registerAliens.getnoOfLegs()));
        data.put("HomePlanet of Alien "+i,registerAliens.gethomePlanet());
        }       
        return data;
    }
     
     // main funtion
     
     public static void main(String args[]) {
        
        System.out.println("Alien Registration Application");
        
        List<AliensInfo> aliens = readAlienInfo();
        
        System.out.println("Enter export format as Text or Pdf:");
        BufferedReader br = null;
        Exporter ex = null;
        try {
            br = new BufferedReader(new InputStreamReader(System.in));
            String format = br.readLine();
            try {
            	ex = (Exporter) Class.forName("export." + format + "Write").newInstance();
            	} catch (InstantiationException e) {
            	e.printStackTrace();
            	} catch (IllegalAccessException e) {
            	e.printStackTrace();
            	} catch (ClassNotFoundException e) {
            	e.printStackTrace();
            	}
            
            if(ex != null) {
            ex.export(generateExportMap(aliens), "/home/pravo/Alientemp/");
            } else {
                System.out.println("Unknown file format");
            }
        } catch (IOException e) {
            System.out.println("exeption occured while reading");
        } finally {
            if(br != null) {
                try{
                    br.close();
                }catch(IOException e){
                    System.out.println("IoException occured");
                }
            }
        }
    }
}
