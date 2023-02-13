package renatocalisto_ag7_ds_i;

    //@author Renato Calisto
    import java.util.Scanner;

public class RenatoCalisto_Ag7_DS_I {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int i; //variável que será utilizada para o laço de repetição for.
        double Produto, ProdutoD;
        Scanner ler = new Scanner(System.in);
        

        for (i=1; i<11; i++){
            System.out.println("Digite o valor do produto: " + i);
Produto = ler.nextDouble();
ProdutoD = (Produto/2);

        System.out.println("O produto com desconto de 50% ficou por R$" + ProdutoD); 
        System.out.println("______________________________________________________"); 
        

    }
    
}
    
}