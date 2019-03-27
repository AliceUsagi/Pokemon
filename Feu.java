import java.util.Scanner;

public class Feu extends Pokemon {
	private String nameAttack;
    private int attackCanicule;
    private int attackDanseFlamme;


	public int getAttackCanicule() {
		return this.attackCanicule;	
    }
    
    public int getAttackDanseFlamme() {
		return this.attackDanseFlamme;	
	}


	public Feu(String name,int pv, int attack){
		super(name, pv, attack);
        this.attackCanicule = 400 ; 
        this.attackDanseFlamme = 400;

		/*Scanner scc = new Scanner(System.in);
		System.out.println( "Choisissez l'attaque");
		String attackj = scc.nextLine();
		
		if ( attackj.equals("canicule")) {
		 	return canicule; 

        }*/
	}

	

	public void canicule(Vent v){
	
	
		v.setPv(v.getPv() - this.getAttackCanicule());
		System.out.println (this.name + " a " + this.pv + " PV et " + v.getName() + " a " + v.getPv());
		System.out.print (this.isKo() ? this.name + " est KO": "");

	}

	public void canicule(Feu v){
	
	
		v.setPv(v.getPv() - (this.getAttackCanicule()/2));
		System.out.println (this.name + " a " + this.pv + " PV et " + v.getName() + " a " + v.getPv());
		System.out.print (this.isKo() ? this.name + " est KO ": "");
	}	
		
	public void danseFlamme(Vent v){
	
	
		v.setPv(v.getPv() - this.getAttackDanseFlamme());
		System.out.println (this.name + " a " + this.pv + " PV et " + v.getName() + " a " + v.getPv());
		System.out.print (this.isKo() ? this.name + " est KO/n ": "");
	}

}

