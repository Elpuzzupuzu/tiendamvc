
package tienda;

import Modelo.Carrito;
import Modelo.Producto;
import Vista.VistaItems;


public class VentanaItemsController {
    
    public static VistaItems vi= new VistaItems();
    public static Carrito carrito=new Carrito();
    public static float total=0;
    public static void mostrar(){vi.setVisible(true);}
    public static void ocultar(){vi.setVisible(false);}
    
    public static void btnhelado(){
        
    String nombreproducto="helado" ;  
    float precio=25;
    total=total+precio;
    Producto helado =new Producto(nombreproducto,precio);
    carrito.addproducto(helado);
    String preciotextto=String.valueOf(total);
    vi.getTxttotal().setText(preciotextto);
   
    
    System.out.println("comprado");
    }//fin boton helado
    
    public static void btnpastel(){
        
   String nombreproducto="pastel" ;  
    float precio=270;
    total=total+precio;
    Producto pastel =new Producto(nombreproducto,precio);
    carrito.addproducto(pastel);
    String preciotextto=String.valueOf(total);
    vi.getTxttotal().setText(preciotextto);   
    
    
    
    }
    
    
    
    
}
