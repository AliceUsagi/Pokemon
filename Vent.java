import java.util.Scanner;
public class Vent extends Pokemon {
	private String nameAttack;
    private int attackRapace;
    private int attackCru;


	public int getAttackRapace() {
		return this.attackRapace;	
    }
    
    public int getAttackCru() {
		return this.attackCru;	
	}


	public Vent(String name,int pv, int attack){
		super(name, pv, attack);
        this.attackRapace = 400 ;
        this.attackCru = 400 ; 

		/*Scanner scc = new Scanner(System.in);
		System.out.println( "Choisissez l'attaque");
		String attack = scc.nextLine();
		
		if ( attack.equals("rapace")) {
			return rapace;*/
	
	}

	

	
	public void rapace(Feu f){
	
	
		f.setPv(f.getPv() - this.getAttackRapace()/2);
		System.out.println (this.name + " a " + this.pv + " PV et " + f.getName() + " a " + f.getPv());
		System.out.print (this.isKo() ? this.name + " est KO ": "");

	}
	public void cru(Feu f){
	
	
		f.setPv(f.getPv() - this.getAttackCru()/2);
		System.out.println (this.name + " a " + this.pv + " PV et " + f.getName() + " a " + f.getPv());
		System.out.print (this.isKo() ? this.name + " est KO\n ": "");

	}



}