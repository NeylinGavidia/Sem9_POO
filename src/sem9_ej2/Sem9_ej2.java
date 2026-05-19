/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sem9_ej2;

/**
 *
 * @author UCC20411
 */
public class Sem9_ej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Conductor c = new Conductor("Paredes", "Mejia", "DNI", "12345678", "Luis");
        //c.setNombre("Juan");
//        c.setApaterno("Gomez");
//        c.setAmaterno("Perez");
//        c.setTipodoc("CE");
//        c.setNdoc("90909090");
        Taxi t = new Taxi("234-FE", "Audi", "Legion", c);
//        t.setModelo("Turbo 3r");
//        t.setMarca("Porsche");
//        t.setNplaca("3243523523");
//        t.setChofer(c);
        t.agregarChofer(c);
        t.verDatos();
        t.verChofer();//xd
        
        //este es asociacion reflexiva
        Trabajador tr = new Trabajador("Perez", "Marin", "CE", "123456789", "Renato");
        Trabajador je = new Trabajador("Pilares", "Heredia", "DNI", "23456789", "Yulian");
        tr.verDatos();
        tr.agregarJefe(je);
        tr.verJefe();
        
    }
    
}
