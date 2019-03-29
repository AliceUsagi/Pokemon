public class StockInventaire {
    private int nbreSuperPotion;
    private int potion;

    public int getNbreSuperPotion() {
		  return this.nbreSuperPotion;	
    }

    public void setNbreSuperPotion (int nbreSuperPotion) {
		  this.nbreSuperPotion = nbreSuperPotion;	
    }

    public StockInventaire (int potion) {
        this.potion = 1 ;
    }

    public void  utilisationSP(int n) {
        
    if(nbreSuperPotion>0){
        setNbreSuperPotion (this.getNbreSuperPotion() - 1);
        System.out.println ("Vous avez encore " + getNbreSuperPotion() + " de super potion");
      }
      
    }
  
}