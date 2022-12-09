
package proyectofinalpitufos;

import domain.BonoDeSueldo;
import pantallas.Presentacion;


public class TestBonoSueldo {

   
    public static void main(String[] args) {
        
        Presentacion.mostrarPresentacion();
        
        BonoDeSueldo bono=new BonoDeSueldo();
        
        bono.menu();  
    }
    
}
