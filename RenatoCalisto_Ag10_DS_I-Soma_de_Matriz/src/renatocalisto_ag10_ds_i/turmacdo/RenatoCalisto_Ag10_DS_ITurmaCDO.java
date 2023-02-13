package renatocalisto_ag10_ds_i.turmacdo;
//@author Renato Calisto
import javax.swing.JOptionPane;

public class RenatoCalisto_Ag10_DS_ITurmaCDO {

    public static void main(String[] args) {
       double valores[][] = new double[10][10];
       int linha, coluna;
       double soma = 0;
       
       //entrada de dados
       JOptionPane.showMessageDialog(null, "Insira os valores a serem somados");
            for (linha = 0; linha <10; linha++) {
                for (coluna = 0; coluna <10; coluna++){
                    valores[linha][coluna] = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor da " + (linha + 1) + "ª " + "linha"));
                }
            }    
            
        //soma dos valores
            for (linha = 0; linha<10; linha ++) {
                for (coluna = 0; coluna <10; coluna++){
                    soma = soma + valores[linha][coluna];
                }
                
            }
            JOptionPane.showMessageDialog(null, "Soma: " + soma);
            }
            
       }
    
    

