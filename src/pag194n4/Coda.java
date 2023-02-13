
package pag194n4;

import java.util.Vector;


class Coda{
  private Vector elementi;

  public Coda() {
    elementi = new Vector();
  }

  public void aggiungi(Object obj) {
    elementi.addElement(obj);
  }

  public Object togli() {
    Object obj = null;
    int size = elementi.size();

    if (size > 0) {
      obj = elementi.elementAt(0);
      elementi.removeElementAt(0);
    }
    return obj;
  }

  public boolean vuota() {
    if (elementi.size() > 0){
      return false;
    }
    else{
      return true;
    }
  }

  public int size() {
    return elementi.size();
  }
  
  public String toString() {
      String temp ="nulla";
      if(elementi.isEmpty()){
          return temp;
          }
      temp="";
      for(int i=0;i<elementi.size();i++){
          temp+=elementi.elementAt(i).toString()+"\n";
      }
      return temp;
  }
  
}
