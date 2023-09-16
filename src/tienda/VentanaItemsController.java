
package tienda;

import Modelo.Carrito;
import Modelo.Producto;
import Vista.VistaItems;


public class VentanaItemsController {
    
    public static VistaItems vi= new VistaItems();
    public Carrito carrito=new Carrito();
    
    public static void mostrar(){vi.setVisible(true);}
    
    public static void btnhelado(){
        
    String nombreproducto="helado" ;  
    float precio=25;
    Producto helado =new Producto(nombreproducto,precio);
    String preciotextto=String.valueOf(precio);
    vi.getTxttotal().setText(preciotextto);
    
    
    System.out.println("comprado");
    
    
    
    
    
    
    }
    
    
    
    
}
