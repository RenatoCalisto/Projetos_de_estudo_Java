/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package renatocalisto_ag4_dsi.turmacdo.projeto.completo;

/**
 *
 * @author Renato Calisto
 */
public class RenatoCalisto_Ag4_DSITurmaCDOProjetoCompleto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        
        //Data dos dados 29/08/2022
        
        //Dados
   int CentroOeste=3910789;
   int Sul=7296184;
   int Norte=2741825;
   int Nordeste=6838934;
   int Sudeste=13581177;
   
         //Soma = Brasil
        int Soma = CentroOeste + Sul + Norte + Nordeste + Sudeste;
        //Porcentagem
        double porcentagemCentroOeste = ((CentroOeste * 100) / Soma);
        double porcentagemSul = ((Sul * 100) / Soma);
        double porcentagemNorte = ((Norte * 100) / Soma);        
        double porcentagemNordeste = ((Nordeste * 100) / Soma);
        double porcentagemSudeste = ((Sudeste * 100) / Soma);  
         
         //Determinados numeros de casos
    String CentroOestetem = ("Centro Oeste tem este numero de casos: " );
    String Sultem = ("Sul tem este numero de casos: ");
    String Nortetem = ("Norte tem este numero de casos: ");
    String Nordestetem = ("Nordeste tem este numero de casos: ");
    String Sudestetem = ("Sudeste tem este numero de casos: ");
        String Somatem = ("O Brasil todo tem este numero de casos: " );
        
          //Porcentagens das regiões
    String CentroOesteP = ("Casos na região Centro Oeste corresponde à porcentagem de " + porcentagemCentroOeste);
    String SulP = ("Casos na região Sul corresponde à porcentagem de ") + porcentagemSul;
    String NorteP = ("Casos na região Centro Oeste corresponde à porcentagem de ") + porcentagemNorte;
    String NordesteP = ("Casos na região Centro Oeste corresponde à porcentagem de ") + porcentagemNordeste;
    String SudesteP = ("Casos na região Centro Oeste corresponde à porcentagem de ") + porcentagemSudeste;
           
         
    
        
            System.out.println(CentroOestetem + CentroOeste);
            System.out.println(Sultem + Sul);        
            System.out.println(Nortetem + Norte);
            System.out.println(Nordestetem + Nordeste);
            System.out.println(Sudestetem + Sudeste);
            
            System.out.println(Somatem + Soma);
            
            System.out.println(CentroOesteP);
            System.out.println(SulP);
            System.out.println(NorteP);
            System.out.println(NordesteP);
            System.out.println(SudesteP);
          
        
        
    }
    
}
