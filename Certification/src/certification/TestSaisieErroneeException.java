package certification;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestSaisieErroneeException {
  public static void controle(String chaine) throws SaisieErroneeException {
    if (chaine.equals("") == true)
      throw new SaisieErroneeException("Saisie erronee : chaine vide");
  }
  
  public static void main(java.lang.String[] args) {
	  List<String> liste = new ArrayList();
	    String valeur = null;
	    for(int i = 0; i < 10; i++) {
	      valeur = ""+i;
	      liste.add(valeur);
	    }
	 
	    for (Iterator<String> iter = liste.iterator(); iter.hasNext(); ) {
	      valeur = iter.next();
	      System.out.println(valeur.toUpperCase());
	    }
  }
}