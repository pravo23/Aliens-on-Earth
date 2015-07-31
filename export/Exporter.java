package export;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author pravo
 */
import java.util.Map;


public abstract class Exporter{
    public abstract void export(Map<String,String> data, String fileName);
}
