
package pag194n4;

import java.util.Scanner;


public class Pag194N4 {

    
    public static void main(String argv[]) {
        Coda codaOrdinazioni = new Coda();
        Ordine ord;
        
        Scanner tastiera = new Scanner(System.in);
        int scelta = -1;
        
        while(scelta!=0) {
           System.out.println("1 Aggiungi ordine");
           System.out.println("2 Guasti risolti");
           System.out.println("3 visualizza guasti");
           System.out.println("0 - fine");

           System.out.println();
           System.out.print("Cosa vuoi fare: ");
           scelta = tastiera.nextInt();
           
           switch(scelta) {
               case 1: {
                   
                    ord = new Ordine("01", "riparazione motore auto");
                    codaOrdinazioni.aggiungi(ord);
                    System.out.println("--Aggiunto ordine");
                   
                    ord = new Ordine("02", "riparazione motore moto");
                    codaOrdinazioni.aggiungi(ord);
                    System.out.println("--Aggiunto ordine");

                    ord = new Ordine("03", "sostituzione ruote auto");
                    codaOrdinazioni.aggiungi(ord);
                    System.out.println("--Aggiunto ordine");
                    
                    ord = new Ordine("04","sostituzione ruote moto");
                    codaOrdinazioni.aggiungi(ord);
                    System.out.println("--Aggiunto ordine");
                   
                   break;
               }
               case 2: {
                   
                    ord = (Ordine) codaOrdinazioni.togli();
                    System.out.println("Soddisfatto ordine:");
                    ord.stampa();
                    
                    ord = (Ordine) codaOrdinazioni.togli();
                    System.out.println("Soddisfatto ordine:");
                    ord.stampa();

                    ord = (Ordine) codaOrdinazioni.togli();
                    System.out.println("Soddisfatto ordine:");
                    ord.stampa();

                    ord = (Ordine) codaOrdinazioni.togli();
                    System.out.println("Soddisfatto ordine:");
                    ord.stampa();
                    
                   break;
               }
               case 3: {
                   System.out.println("Ecco i guasti:");
                   System.out.println(codaOrdinazioni);
                   
                   break;
               }
           }
      
           System.out.println();
        }   
    
    

    /*ord = new Ordine("01", "riparazione motore auto");
    codaOrdinazioni.aggiungi(ord);
    System.out.println("--Aggiunto ordine");

    ord = new Ordine("02", "riparazione motore moto");
    codaOrdinazioni.aggiungi(ord);
    System.out.println("--Aggiunto ordine");

    ord = new Ordine("03", "sostituzione ruote auto");
    codaOrdinazioni.aggiungi(ord);
    System.out.println("--Aggiunto ordine");

    ord = (Ordine) codaOrdinazioni.togli();
    System.out.println("Soddisfatto ordine:");
    ord.stampa();

    ord = new Ordine("04","sostituzione ruote moto");
    codaOrdinazioni.aggiungi(ord);
    System.out.println("--Aggiunto ordine");

    ord = (Ordine) codaOrdinazioni.togli();
    System.out.println("Soddisfatto ordine:");
    ord.stampa();

    ord = (Ordine) codaOrdinazioni.togli();
    System.out.println("Soddisfatto ordine:");
    ord.stampa();

    ord = (Ordine) codaOrdinazioni.togli();
    System.out.println("Soddisfatto ordine:");
    ord.stampa();*/
  }
}
