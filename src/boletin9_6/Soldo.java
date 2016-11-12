
package boletin9_6;

import javax.swing.JOptionPane;


public class Soldo {
    public void calcSoldo(){
    
    float soldo=0;
    int porcentaxe;
    float menos1000=0;
    float mais1000=0;
    float totalEmpleados=0;
   
    do{
     soldo=Float.parseFloat(JOptionPane.showInputDialog("Introduzca un soldo"));   
     if(soldo<0)
            System.out.println("Ten que ser positivo");
     else if(soldo<1000)
     {
         menos1000=menos1000+1;
         totalEmpleados=totalEmpleados+1;
         
     }
     else if (soldo<=1750)
     {
         mais1000=mais1000+1;
         totalEmpleados=totalEmpleados+1;
         
     }
     else 
     { 
         totalEmpleados=totalEmpleados+1;
        
     }
     if(menos1000!=0)   
        System.out.println("Porcentaxe de empleados que cobran menos de 1000€ : " + (menos1000/totalEmpleados*100));     
        System.out.println("Nº de empleados que combran entre 1000€ e 1750€ : " + mais1000);
      }while(soldo!=0);
            System.out.println("bye");
    }
}

