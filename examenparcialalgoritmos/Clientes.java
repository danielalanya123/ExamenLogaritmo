/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenparcialalgoritmos;

/**
 *
 * @author Alanya
 */
public class Clientes {
 private String codigo;
 private String nombre;
 private String sexo;
 private String madre_padre;

    public Clientes(String codigo, String nombre, String sexo, String madre_padre) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.sexo = sexo;
        this.madre_padre = madre_padre;
    }
 
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getMadre_padre() {
        return madre_padre;
    }

    public void setMadre_padre(String madre_padre) {
        this.madre_padre = madre_padre;
    }

    @Override
    public String toString() {
        return "Clientes{" + "codigo=" + codigo + ", nombre=" + nombre + ", sexo=" + sexo + ", madre_padre=" + madre_padre + '}';
    }

    
 public Object[] getDataClientes(){
 
     Object[] data = {this.codigo,this.nombre,this.sexo,this.madre_padre};
     return data;
     
 }
 
}
