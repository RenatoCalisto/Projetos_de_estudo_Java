package renatocalisto_ag6_ds_i;

import javax.swing.JOptionPane;

// @author Renato Calisto

public class RenatoCalisto_Ag6_DS_I {

    public static void main(String[] args) {
       int placa;
       String m;
               
       placa = Integer.parseInt(JOptionPane.showInputDialog("Informe o número final da placa"));
       
       switch (placa){
           case 1:
               m = "Pagamento até 30/04";
               break;
           case 2:
               m = "Pagamento até 31/05";
               break;
           case 3:
               m = "Pagamento até 30/06";
               break;
           case 4:
               m = "Pagamento até 31/07";
               break;
           case 5:
               m = "Pagamento até 31/08";
               break;
           case 6:
               m = "Pagamento até 30/09";
               break;
           case 7:
               m = "Pagamento até 31/10";
               break;
           case 8:
               m = "Pagamento até 30/11";
               break;
           case 9:
               m = "Pagamento até 31/12";
               break;
           case 0:
               m = "Pagamento até 31/12";
               break;
               
               default:
               m = "Inválido, Digite de 0 à 9";
               break;
       }
       
       JOptionPane.showMessageDialog(null, m);
       
    }
    
}
