package renatocalisto_ag8_ds_i.turmacdo;
//@author Renato Calisto
import javax.swing.JOptionPane;

public class RenatoCalisto_Ag8_DS_ITurmaCDO {

    public static void main(String[] args) {
    int idade,nota, potimo, pbom, pregular, pruim, ppessimo; 
    int mediaidadeotimo, mediaidadebom, mediaidaderegular, mediaidaderuim, mediaidadepessimo;
    int idadeotimo = 0, idadebom = 0, idaderegular = 0, idaderuim = 0, idadepessimo = 0;
    int contador = 1, otimo = 0, bom = 0, regular = 0, ruim = 0, pessimo = 0;
        
    //começou no UM, USAR <=40
    //contador é o número da cadeira da pessoa
    //ppessimo é a porcentagem de respostas pessimo
    //mediaidaderuim é a media de idade de pessoas que votaram que o serviço de cinema é ruim
    //idaderuim é a soma de todas as idades de quem votou em ruim
    
    while (contador <=40) {
            
        {idade = Integer.parseInt(JOptionPane.showInputDialog("Cadeira " + contador + "\nDigite sua idade "));}
                
        {nota = Integer.parseInt(JOptionPane.showInputDialog("Cadeira " + contador + "\nEscolha sua nota \n1 = Ótimo \n2 = Bom \n3 = Regular \n4 = Ruim  \n5 = Péssimo"));
                
                switch (nota)  {
                    case 1 -> {otimo ++;
                                idadeotimo = idadeotimo+idade;}
                    case 2 -> {bom ++;
                                idadebom = idadebom+idade;}
                    case 3 -> {regular ++;
                                idaderegular = idaderegular+idade;}
                    case 4 -> { ruim ++;
                                idaderuim = idaderuim+idade;}
                    case 5 -> {pessimo ++;   
                                idadepessimo = idadepessimo+idade;}
                                }                     
        }       
                contador ++;}

            //Contas
            {mediaidadeotimo = (idadeotimo/otimo);}
            {mediaidadebom = (idadebom/bom);}
            {mediaidaderegular = (idaderegular/regular);} 
            {mediaidaderuim = (idaderuim/ruim);}
            {mediaidadepessimo = (idadepessimo/pessimo);}
            
            {potimo = ((100*otimo)/40);}
            {pbom = ((100*bom)/40);}
            {pregular = ((100*regular/40));}
            {pruim = ((100*ruim/40));}
            {ppessimo = ((100*pessimo)/40);}
            
            //Mensagem de informações
JOptionPane.showMessageDialog(null, "Respostas ótimo: " +otimo+ "\nMédia de idade das pessoas que responderam ruim: " +mediaidaderuim+"\nPorcentagem de respostas péssimo: " +ppessimo+"%");
    

    }
}

