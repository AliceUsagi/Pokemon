public class Inventaire  {
    private int superPotion;
    private int hyperPotion;
    private int rappel;
    
    public int getSuperPotion() {
		return this.superPotion;	
    }

    public Inventaire (String potion){

        this.superPotion = 400 ; 
    }
       
    public void superPotion(Feu f){
        
		f.setPv(f.getPv() + this.getSuperPotion());
		System.out.println ( f.getName() + " a " + f.getPv());
		//System.out.print (this.isKo() ? this.name + " est KO": "");

	}

}