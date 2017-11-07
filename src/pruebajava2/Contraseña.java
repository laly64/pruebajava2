/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebajava2;
import javax.swing.JOptionPane;

/**
 ** *Lavinia Avalos Oyarzo
 * Fecha 06 de Noviembre 2017
 * @author LAB02
 * Clase pruebajava2
 * Responsabilidad Clase principal
 */

public class Contraseña
{ 
    public static void main(String[] args) 
            
    { 
        
       int contraseña =0;
      int numero = 3;
        int index =0;
       
       int clave; 
        clave = 2222;
       
       while (index<=3)
                      
          index++;
         
         if (clave==2222)
           
          { 
 clave = Integer.parseInt(JOptionPane.showInputDialog("Ingrese contraseña"));
 
       if (index ==2222)  
        
   
          System.out.println("contraseña incorrecta");
         numero++;
 
         
          JOptionPane.showMessageDialog(null, "Ingrese nuevamente la contraseña");
         System.out.println("contraseña incorrecta");
         numero++;
           JOptionPane.showMessageDialog(null, "Ingrese nuevamente la contraseña");
         System.out.println("contraseña incorrecta");
         numero++;
                   
          }
      JOptionPane.showMessageDialog(null, "");
      {
      } 
    }
          
      



        
    

 
    

