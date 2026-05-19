/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sem9_ej2;

/**
 *
 * @author UCC20411
 */
public class Conductor {
    private String apaterno;
    private String amaterno;
    private String tipodoc;
    private String ndoc;
    private String nombre;

    public String getApaterno() {
        return apaterno;
    }

    public void setApaterno(String apaterno) {
        this.apaterno = apaterno;
    }

    public String getAmaterno() {
        return amaterno;
    }

    public void setAmaterno(String amaterno) {
        this.amaterno = amaterno;
    }

    public String getTipodoc() {
        return tipodoc;
    }

    public void setTipodoc(String tipodoc) {
        this.tipodoc = tipodoc;
    }

    public String getNdoc() {
        return ndoc;
    }

    public void setNdoc(String ndoc) {
        this.ndoc = ndoc;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Conductor(String apaterno, String amaterno, String tipodoc, String ndoc, String nombre) {
        this.apaterno = apaterno;
        this.amaterno = amaterno;
        this.tipodoc = tipodoc;
        this.ndoc = ndoc;
        this.nombre = nombre;
    }
    
    public void verDatos(){
        System.out.println(this.nombre+" "+this.apaterno+
                " "+this.amaterno+", y su tipo de documento es "+this.tipodoc+
                " con numero "+this.ndoc);
    }

//    @Override
//    public String toString() {
//        return this.nombre + this.apaterno+ this.amaterno; 
//    }
    
}
