/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectobd2;

import org.bson.Document;

public class Pedido {

    String idF;
    String nombreFarmacia;
    String idfarmaceutico;
    String idproducto;
    String nombreproducto;
    String precio;
    String id;
    public Pedido(String id) {
        this.id = id;    
    }

    public Pedido(String idF, String nombreFarmacia, String idfarmaceutico, String idproducto, String nombreproducto, String precio, String id) {
        this.idF = idF;
        this.nombreFarmacia = nombreFarmacia;
        this.idfarmaceutico = idfarmaceutico;
        this.idproducto = idproducto;
        this.nombreproducto = nombreproducto;
        this.precio = precio;
        this.id = id;
    }

    public String getIdF() {
        return idF;
    }

    public void setIdF(String idF) {
        this.idF = idF;
    }

    public String getNombreFarmacia() {
        return nombreFarmacia;
    }

    public void setNombreFarmacia(String nombreFarmacia) {
        this.nombreFarmacia = nombreFarmacia;
    }

    public String getIdfarmaceutico() {
        return idfarmaceutico;
    }

    public void setIdfarmaceutico(String idfarmaceutico) {
        this.idfarmaceutico = idfarmaceutico;
    }

    public String getIdproducto() {
        return idproducto;
    }

    public void setIdproducto(String idproducto) {
        this.idproducto = idproducto;
    }

    public String getNombreproducto() {
        return nombreproducto;
    }

    public void setNombreproducto(String nombreproducto) {
        this.nombreproducto = nombreproducto;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    

  

    public Document toDocument() {
        Document d = new Document();
        d.append("IdF", this.idF)
                .append("NombreFarmacia", this.nombreFarmacia)
                .append("IdFarmaceutico",this.idfarmaceutico)
                .append("IdPoducto",this.idproducto)
                .append("Producto",this.nombreproducto)
                .append("Precio",this.precio)
                .append("IdPedido",this.id);

        return d;
    }

    public Document toDocumentName() {
        Document d = new Document();
        d.append("IdPedido", this.id);
        return d;
    }
}