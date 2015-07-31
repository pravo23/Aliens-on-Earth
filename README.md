# Aliens-on-Earth


A treaty of friendship has been signed between Aliens and Humans. The aliens are now welcome on Earth and can stay as long as they wish with the Humans. You are the person responsible to register the aliens.

Part A: 
Create a console based application that accepts alien details like Code Name, Blood Color, No.of Antennas, No. of Legs and Home Planet and then export these details into one of the 2 formats, depending on user’s choice - “plain text” or “PDF”.

Part B: 
Make the application extensible so that it is easy to “plug in” a new format to export to, so that  the application automatically has the capability to export to the new format without making any changes to the application code.


        _____ _____ ______ _____
        
        language used : Java
        used Tools : netbeans.
        
        Part A
      ------------  
        1. For run the project, run 'AlienOnEarthApp.java'.
        2.for PdfWrite, I used jar file Of Itext and configured into classpath.
        3. Make and Used classes are "AlienOnEarthApp, AlienInfo, Exporter,PdfWrite, TextWrite".
        
        Part B
        ---------
        If It'd require to add new type of format say "TempWrite", then we just 
        need to add new class say TempWrite, and extend AliennOnEarthApp for new format.
