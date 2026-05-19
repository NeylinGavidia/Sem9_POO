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
        
        Taxi t = new Taxi("234-FE", "Audi", "Legion", c);
        t.agregarChofer(c);
        t.verDatos();
        t.verChofer();//xd
        
        
    }
    
}
