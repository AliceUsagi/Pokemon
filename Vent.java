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
	
	}
//attaque rapace
	public void rapace(Feu f){

		f.setPv(f.getPv() - this.getAttackRapace()/2);
		System.out.println (this.name + " a " + this.pv + " PV et " + f.getName() + " a " + f.getPv() + " PV");
		System.out.print (this.isKo() ? this.name + " est KO ": "");

	}
	public void rapace(Vent v){

		v.setPv(v.getPv() - this.getAttackRapace()/2);
		System.out.println (this.name + " a " + this.pv + " PV et " + v.getName() + " a " + v.getPv() + " PV");
		System.out.print (this.isKo() ? this.name + " est KO ": "");
	} 

	public void rapace(Tonnerre t) {
		t.setPv(t.getPv() - this.getAttackRapace());
		System.out.println (this.name + " a " + this.pv + " PV et " + t.getName() + " a " + t.getPv() + " PV");
		System.out.print (this.isKo() ? this.name + " est KO ": "");
	}

	 public void rapace(Eau e) {
		e.setPv(e.getPv() - this.getAttackRapace()/2);
		System.out.println (this.name + " a " + this.pv + " PV et " + e.getName() + " a " + e.getPv() + " PV");
		System.out.print (this.isKo() ? this.name + " est KO": "");
	}

// attaque cru
	public void cru(Feu f){

		f.setPv(f.getPv() - this.getAttackCru()/2);
		System.out.println (this.name + " a " + this.pv + " PV et " + f.getName() + " a " + f.getPv() + " PV");
		System.out.print (this.isKo() ? this.name + " est KO\n ": "");

	}

	public void cru(Vent v){

		v.setPv(v.getPv() - this.getAttackCru()/2);
		System.out.println (this.name + " a " + this.pv + " PV et " + v.getName() + " a " + v.getPv() + " PV");
		System.out.print (this.isKo() ? this.name + " est KO\n ": "");

	}

	public void cru(Tonnerre t) {
		t.setPv(t.getPv() - this.getAttackCru());
		System.out.println (this.name + " a " + this.pv + " PV et " + t.getName() + " a " + t.getPv());
		System.out.print (this.isKo() ? this.name + " est KO ": "");
	}

	public void cru(Eau e) {
		e.setPv(e.getPv() - this.getAttackCru()/2);
		System.out.println (this.name + " a " + this.pv + " PV et " + e.getName() + " a " + e.getPv());
		System.out.print (this.isKo() ? this.name + " est KO": "");
	}

}