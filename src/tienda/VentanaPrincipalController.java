
package tienda;

import Vista.VentanaPrincipal;


public class VentanaPrincipalController {
    
    static VentanaPrincipal vp=new VentanaPrincipal();
    
    
    public static void mostrar(){ vp.setVisible(true);   }
    public static void ocultar(){ vp.setVisible(false);   }
    
    public static void btncomprar (){
        
    }
    public static void btnticket(){
    VentanaItemsController.carrito.mostrarproductos();
    
    
    }
    
    
    
}
