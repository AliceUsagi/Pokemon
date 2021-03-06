public class Feu extends Pokemon{
	  private String nameAttack;
    private int attackCanicule;
    private int attackDanseFlamme;

	public int getAttackCanicule(){
		return this.attackCanicule;	
    }
    
    public int getAttackDanseFlamme(){
		return this.attackDanseFlamme;	
	}

	public Feu(String name,int pv, int attack) {
		super(name, pv, attack);
        this.attackCanicule = 400; 
        this.attackDanseFlamme = 400;

	}

// attaque canicule 

	public void canicule(Vent v) {
		v.setPv(v.getPv() - this.getAttackCanicule());
		System.out.println (this.name + " a " + this.pv + " PV et " + v.getName() + " a " + v.getPv() + " PV");
		System.out.print (this.isKo() ? this.name + " est KO": "");
	}

	public void canicule(Feu f) {
		f.setPv(f.getPv() - (this.getAttackCanicule()/2));
		System.out.println (this.name + " a " + this.pv + " PV et " + f.getName() + " a " + f.getPv() + " PV");
		System.out.print (this.isKo() ? this.name + " est KO ": "");
	}

	public void canicule(Eau e) {
		e.setPv(e.getPv() - (this.getAttackCanicule()/4));
		System.out.println (this.name + " a " + this.pv + " PV et " + e.getName() + " a " + e.getPv() + " PV");
		System.out.print (this.isKo() ? this.name + " est KO ": "");
	}

	public void canicule(Tonnerre t) {
		t.setPv(t.getPv() - (this.getAttackDanseFlamme()/2));
		System.out.println (this.name + " a " + this.pv + " PV et " + t.getName() + " a " + t.getPv() + " PV");
		System.out.print (this.isKo() ? this.name + " est KO ": "");
	}

// attaque danse flamme 
	public void danseFlamme(Vent v) {
		v.setPv(v.getPv() - this.getAttackDanseFlamme());
		System.out.println (this.name + " a " + this.pv + " PV et " + v.getName() + " a " + v.getPv() + " PV");
		System.out.print (this.isKo() ? this.name + " est KO": "");
	}

	public void danseFlamme(Feu f) {
		f.setPv(f.getPv() - (this.getAttackDanseFlamme()/2));
		System.out.println (this.name + " a " + this.pv + " PV et " + f.getName() + " a " + f.getPv() + " PV");
		System.out.print (this.isKo() ? this.name + " est KO ": "");
	}

	public void danseFlamme(Eau e) {
		e.setPv(e.getPv() - (this.getAttackDanseFlamme()/4));
		System.out.println (this.name + " a " + this.pv + " PV et " + e.getName() + " a " + e.getPv() + " PV");
		System.out.print (this.isKo() ? this.name + " est KO ": "");
	}

	public void danseFlamme(Tonnerre t) {
		t.setPv(t.getPv() - (this.getAttackDanseFlamme()/2));
		System.out.println (this.name + " a " + this.pv + " PV et " + t.getName() + " a " + t.getPv() + " PV");
		System.out.print (this.isKo() ? this.name + " est KO ": "");
	}

}

