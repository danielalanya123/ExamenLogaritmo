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
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 *
 * @author Alanya
 */
public class ArchivoClientes {
    
    public static ArrayList<Clientes> leerClientes() {
        
        ArrayList<Clientes> listClientes = new ArrayList<>();
        
        String ruta = "D://ReporteClientes.txt";
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;
        try {
         archivo = new File(ruta);
         
         if(archivo.exists()){
         
             fr = new FileReader(archivo);
             br = new BufferedReader(fr);
             
             String linea;
             String[] linCli;
             int numFil = 0;
             
              while((linea = br.readLine()) != null){
                  
                  linCli = linea.split(",");
                  listClientes.add(new Clientes(linCli[0], linCli[1], linCli[2], linCli[3]));
                  
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
        
        return listClientes;
        
    }
    
    public static void escribirClientes(ArrayList<Clientes> listClientes){
            
           String ruta = "D://ReporteClientes.txt";
           FileWriter fichero = null;
           PrintWriter pw = null;
           
           try {
            fichero = new FileWriter(ruta);
            pw = new PrintWriter(fichero);
               for (int i = 0; i < listClientes.size(); i++) {
                   pw.println(listClientes.get(i).toString());
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
