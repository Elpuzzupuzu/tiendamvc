
package Modelo;

import Vista.VentanaTicket;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class Carrito {
    
private final ArrayList<Producto> compras = new ArrayList();

    
    
    
    
   public  void addproducto(Producto product) {
   compras.add(product);
   
   System.out.println(product.getNombre()+" has been add/n");
   
   }
   
   public void mostrarproductos(){
      String listap="";
      if(compras.isEmpty()){
      JOptionPane.showMessageDialog(null, "El carrito esta vacio");
      
      
      }
       for(int i=0; i<compras.size();i++){
       
       listap+="producto"+compras.get(i).getNombre()+"\n";
       listap+="precio"+compras.get(i).getPrecio()+"\n";
       
       }//fin ciclo for de la lista
      
      JOptionPane.showMessageDialog(null, listap);
      
    
   }// fin mostrarproductos
   
   
   public String mostrarproductosmk2(){
   String listap="";
      if(compras.isEmpty()){
      JOptionPane.showMessageDialog(null, "El carrito esta vacio");
       }
    for(int i=0; i<compras.size();i++){
       
       listap+="producto "+compras.get(i).getNombre()+"\n";
       listap+="precio "+compras.get(i).getPrecio()+"\n";
       
       }//fin ciclo for de la lista
      return listap;
    
    
    
    
   
   }//fin mostrarproductosmk2
   
   
   
   
   
   
   
    
}
