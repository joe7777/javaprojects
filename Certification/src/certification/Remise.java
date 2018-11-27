package certification;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public enum Remise {
	COURANTE(new BigDecimal("0.05"), "Remise de 5%"), 
	  FIDELITE(new BigDecimal("0.07"), "Remise de 7%"),
	  EXCEPTIONNELLE(new BigDecimal("0.10"), "Remise de 10%");

	  private final BigDecimal taux;
	  private final String libelle;

	  private Remise(BigDecimal taux, String libelle) {
	    this.taux = taux;
	    this.libelle = libelle;
	  }

	  public BigDecimal getTaux() {
	    return this.taux;
	  }

	  public String getLibelle() {
	    return this.libelle;
	  }

	  public BigDecimal calculer(BigDecimal valeur) {
	    return valeur.multiply(taux).setScale(2, BigDecimal.ROUND_FLOOR);
	  }

	  public static void main(String[] args) {
	    BigDecimal montant = new BigDecimal("153.99");

	    for (Remise remise : Remise.values()) {
	      System.out.println(remise.getLibelle() + " \t" 
	        + remise.calculer(montant));
	    }
	    
	    List list = new ArrayList<>();
	    
	  }
	

}
