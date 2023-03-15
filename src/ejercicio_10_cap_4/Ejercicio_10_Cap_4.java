
package ejercicio_10_cap_4;

import javax.swing.JOptionPane;


public class Ejercicio_10_Cap_4 {

   
    public static void main(String[] args) {
        // TODO code application logic here
        // Declaracion de variables:
        String NI;
        int EST;
        String NOM;
        double PAT;
        double PAGMAT = 50000;
        
        //Ingreso de datos:
        
        
        NI = JOptionPane.showInputDialog("Ingrese su numero de inscripcion");
        NOM = JOptionPane.showInputDialog("Ingrese su nombre completo");
        PAT = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su patrimonio"));
        EST = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su estrato"));
        
        //Condicionales y salidas
        
        if (PAT >2000000 && EST>3){
            PAGMAT = PAGMAT + 0.03 * PAT;
            JOptionPane.showMessageDialog(null,"EL ESTUDIANTE CON NUMERO DE INSCRIPCION "+NI+" Y NOMBRE "+NOM+" DEBE PAGAR: $ "+PAGMAT);
        }
        else {
            JOptionPane.showMessageDialog(null,"EL ESTUDIANTE CON NUMERO DE INSCRIPCION "+NI+" Y NOMBRE "+NOM+" DEBE PAGAR: $ "+PAGMAT);
        }
            
        
    }

    
}        
    
