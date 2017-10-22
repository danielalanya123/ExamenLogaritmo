/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenparcialalgoritmos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 *
 * @author Alanya
 */
public class ArchivoProductos {

    public static ArrayList<Productos> leerProductos(){
        
        ArrayList<Productos> listProductos = new ArrayList<>();
        String ruta = "D://ReporteProductos.txt";
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;
        
        try {
            archivo = new File(ruta);
            
            if(archivo.exists()){
                
                fr = new FileReader(archivo);
                br = new BufferedReader(fr);
                
             String linea;
             String[] linPro;
             int numFil = 0;
             while((linea = br.readLine()) != null){
                 linPro = linea.split(",");
                 listProductos.add( new Productos(linPro[0], linPro[1], linPro[2], linPro[3]));
             }
            
            }else{
                
            archivo.createNewFile();
            
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            try {
                if( null != fr){
                fr.close();
                }
                
            } catch (Exception e2) {
            
                e2.printStackTrace();
           
            }
        }
        
        
        return listProductos;
    }
    
    public static void escribirProductos(ArrayList<Productos> listProductos){
        String ruta = "D://ReporteProductos.txt";
        FileWriter fichero = null;
        PrintWriter pw = null;
        
        try {
            fichero = new FileWriter(ruta);
            pw = new PrintWriter(fichero);
            for (int i = 0; i < listProductos.size(); i++) {
                
                pw.println(listProductos.get(i).toString());     
            }
            
        } catch (Exception e) {

            e.printStackTrace();
        }finally{
            
            try {
                
                if( null != fichero){
                fichero.close();
                }
                
            } catch (Exception e2) {
            e2.printStackTrace();
            }
        }
    }
    
    public static void main(String[] args) {
    }

}

