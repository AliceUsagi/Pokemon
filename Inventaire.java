
public class Inventaire  {

   
    private int superPotion;
    //private int hyperPotion;
    //private int rappel;
    private int nbrePotion;

    public Inventaire (String potion, int nbrepotion) {
        this.superPotion = 400;
        this.nbrePotion = nbrepotion;
    }
    
    public int getSuperPotion() {
		  return this.superPotion;	
    }

    public int getNbrePotion() {
		  return this.nbrePotion;	
    }

    public void setNbrePotion (int nbrePotion) {
		  this.nbrePotion = nbrePotion;	
    }
    public void superPotion(Feu f) {
        if (nbrePotion==0){
          System.out.println ("Vous n'avez plus de super potions , débrouillez-vous !");
        } else {
		      f.setPv(f.getPv() + this.getSuperPotion());
		      System.out.println ( f.getName() + " a " + f.getPv() + " PV");
        } 
    }

    public void superPotion(Eau e) {
      if (nbrePotion==0){
        System.out.println ("Vous n'avez plus de super potions , débrouillez-vous !");
      } else {
		    e.setPv(e.getPv() + this.getSuperPotion());
		    System.out.println ( e.getName() + " a " + e.getPv() + " PV");
      } 
	  }

    public void utilisationS () {
      if (nbrePotion>0){
        setNbrePotion (getNbrePotion() - 1 );
        System.out.println ("Vous avez encore " + getNbrePotion() + " potions");
      }
	  }
 
  }