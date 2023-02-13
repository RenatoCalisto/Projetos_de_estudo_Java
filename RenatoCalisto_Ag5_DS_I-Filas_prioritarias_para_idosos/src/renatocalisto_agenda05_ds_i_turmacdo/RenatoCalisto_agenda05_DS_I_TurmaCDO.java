package renatocalisto_agenda05_ds_i_turmacdo;

import javax.swing.JOptionPane; 

//@author Renato Calisto
 
public class RenatoCalisto_agenda05_DS_I_TurmaCDO {
    

    public static void main(String[] args) {

        int idade;
        
        idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade: "));
        
        if (idade < 60) {
            JOptionPane.showMessageDialog(null, "Vá para fila comum.");
        }
        else if (idade <80) {
            JOptionPane.showMessageDialog(null, "Vá para a fila prioritária");
        }
        else {
            JOptionPane.showMessageDialog(null, "Vá para a fila 80+");
        }
        

}
}  