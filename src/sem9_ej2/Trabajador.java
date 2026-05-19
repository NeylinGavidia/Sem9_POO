/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sem9_ej2;

/**
 *
 * @author UCA40422
 */
public class Trabajador {
    private String apaterno;
    private String amaterno;
    private String tipodoc;
    private String ndoc;
    private String nombre;
    private Trabajador jefe;

    public Trabajador getJefe() {
        return jefe;
    }

    public void setJefe(Trabajador jefe) {
        this.jefe = jefe;
    }

    public Trabajador(String apaterno, String amaterno, String tipodoc, String ndoc, String nombre) {
        this.apaterno = apaterno;
        this.amaterno = amaterno;
        this.tipodoc = tipodoc;
        this.ndoc = ndoc;
        this.nombre = nombre;
    }

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
    public void verDatos(){
        System.out.println("El trabajador " + this.nombre+" "+this.apaterno+
                " "+this.amaterno+", y su tipo de documento es "+this.tipodoc+
                " con numero "+this.ndoc);
        if (jefe !=null){
         System.out.println("Y su jefe es");
            this.jefe.verDatos();} //este solo con set
         else{
         System.out.println("No tiene jefe");
          }
    }
    
    //otra forma para agregar jefe
    public void agregarJefe(Trabajador c){
        this.jefe = c;
    }
    public void verJefe(){
         System.out.println("Y el jefe es "+this.jefe.nombre+" "+this.jefe.apaterno+
                " "+this.jefe.amaterno+", y su tipo de documento es "+this.jefe.tipodoc+
                " con numero "+this.jefe.ndoc);
    }
}
