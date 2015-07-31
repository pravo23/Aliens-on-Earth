package Alien;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author pravo
 */
public class AliensInfo {
    
    private String codeName;
    private String bloodColor;
    private Integer noOfAntennas;
    private Integer noOfLegs;
    private String homePlanet;
    
    // methods for set the information about aliens on its respective attributes
    
    public void setcodeName(String codeName){
        this.codeName = codeName;
    }
    
    public void setbloodColor(String bloodColor){
        this.bloodColor = bloodColor;
    }
    
    public void setnoOfAntenas(Integer noOfAntennas){
        this.noOfAntennas = noOfAntennas;
    }
    
   public void setnoOfLegs(Integer noOfLegs){
        this.noOfLegs = noOfLegs;
    }
   
   public void sethomePlanet(String homePlanet){
        this.homePlanet = homePlanet;
    }
   
   // methods for get Information about respective attribute
   
   public String getcodeName() {
       return codeName;
   }
   
   public String getbloodColor() {
       return bloodColor;
   }
   
   public Integer getnoOfAntennas(){
       return noOfAntennas;
   }
   
   public Integer getnoOfLegs(){
       return noOfLegs;
   }
   
   public String gethomePlanet(){
       return homePlanet;
   }
   
   
}
