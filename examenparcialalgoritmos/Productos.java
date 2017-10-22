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
public class Productos {
    private String codigoP;
    private String productosP;
    private String montoP;
    private String stockP;

    public Productos(String codigoP, String productosP, String montoP, String stockP) {
        this.codigoP = codigoP;
        this.productosP = productosP;
        this.montoP = montoP;
        this.stockP = stockP;
    }

    public String getCodigoP() {
        return codigoP;
    }

    public void setCodigoP(String codigoP) {
        this.codigoP = codigoP;
    }

    public String getProductosP() {
        return productosP;
    }

    public void setProductosP(String productosP) {
        this.productosP = productosP;
    }

    public String getMontoP() {
        return montoP;
    }

    public void setMontoP(String montoP) {
        this.montoP = montoP;
    }

    public String getStockP() {
        return stockP;
    }

    public void setStockP(String stockP) {
        this.stockP = stockP;
    }

    @Override
    public String toString() {
        return "Productos{" + "codigoP=" + codigoP + ", productosP=" + productosP + ", montoP=" + montoP + ", stockP=" + stockP + '}';
    }

public Object[] getDataProductos(){

    Object[] dataP = {this.codigoP,this.productosP,this.montoP,this.stockP};
    return dataP;
  }
    
}
