/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sem9_ej2;

/**
 *
 * @author UCC20411
 */
public class Taxi {
    
    private String nplaca;
    private String marca; 
    private String modelo;
    private Conductor chofer;

//    public Conductor getChofer() {
//        return chofer;
//    }
//
//    public void setChofer(Conductor chofer) {
//        this.chofer = chofer;
//    }

    public Taxi(String nplaca, String marca, String modelo, Conductor chofer) {
        this.nplaca = nplaca;
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getNplaca() {
        return nplaca;
    }

    public void setNplaca(String nplaca) {
        this.nplaca = nplaca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    
    public void verDatos(){
        System.out.println("El taxi tiene la placa " + this.nplaca + ", es de marca "+
                this.marca + " y modelo "+this.modelo);/*+"Y su chofer es: ");
                 this.chofer.verDatos()*/
        
    }
    public void agregarChofer(Conductor c){
        this.chofer = c;
    }
    public void verChofer(){
        System.out.println("Y el conductor es ");
         chofer.verDatos();
    }
}
