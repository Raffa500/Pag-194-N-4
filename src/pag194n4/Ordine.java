
package pag194n4;


class Ordine {
  private String richiesta;
  private String ordinazione;
  
  public Ordine(String richiesta, String ordinazione)
  {
    this.richiesta = richiesta;
    this.ordinazione = ordinazione;
  }

  public void stampa()
  {
    System.out.println("Richiesta: "+richiesta);
    System.out.println("Ordine: "+ordinazione);
  }

    @Override
    public String toString() {
        return "Ordine{" + "richiesta=" + richiesta + ", ordinazione=" + ordinazione + '}';
    }
}
