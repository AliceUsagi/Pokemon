public class Eau extends Pokemon{
    private int attackEcume;
    private int attackHydrocanon;

	public int getAttackEcume(){
		return this.attackEcume;	
    }
    
    public int getAttackHydrocanon(){
		return this.attackHydrocanon;	
	}

	public Eau(String name,int pv, int attack) {
		super(name, pv, attack);
        this.attackEcume = 400; 
        this.attackHydrocanon = 400;
				
	}

// attaque écume

	public void ecume(Vent v) {
		v.setPv(v.getPv() - this.getAttackEcume()/2);
		System.out.println (this.name + " a " + this.pv + " PV et " + v.getName() + " a " + v.getPv());
		System.out.print (this.isKo() ? this.name + " est KO": "");
	}

	public void ecume(Feu f) {
		f.setPv(f.getPv() - this.getAttackEcume());
		System.out.println (this.name + " a " + this.pv + " PV et " + f.getName() + " a " + f.getPv());
		System.out.print (this.isKo() ? this.name + " est KO ": "");
	}

    public void ecume(Eau e) {
		e.setPv(e.getPv() - this.getAttackEcume()/2);
		System.out.println (this.name + " a " + this.pv + " PV et " + e.getName() + " a " + e.getPv() + " PV");
		System.out.print (this.isKo() ? this.name + " est KO": "");
	}

    public void ecume(Tonnerre t) {
		t.setPv(t.getPv() - this.getAttackEcume()/4);
		System.out.println (this.name + " a " + this.pv + " PV et " + t.getName() + " a " + t.getPv() + " PV");
		System.out.print (this.isKo() ? this.name + " est KO ": "");
	}

// attaque Hydrocanon
	public void hydrocanon(Vent v) {
		v.setPv(v.getPv() - this.getAttackHydrocanon()/2);
		System.out.println (this.name + " a " + this.pv + " PV et " + v.getName() + " a " + v.getPv() + " PV");
		System.out.print (this.isKo() ? this.name + " est KO": "");
	}

	public void hydrocanon(Feu f) {
		f.setPv(f.getPv() - (this.getAttackHydrocanon()));
		System.out.println (this.name + " a " + this.pv + " PV et " + f.getName() + " a " + f.getPv() + " PV");
		System.out.print (this.isKo() ? this.name + " est KO ": "");
	}

    public void hydrocanon(Eau e) {
		e.setPv(e.getPv() - (this.getAttackHydrocanon()/2));
		System.out.println (this.name + " a " + this.pv + " PV et " + e.getName() + " a " + e.getPv() + " PV");
		System.out.print (this.isKo() ? this.name + " est KO ": "");
	}

    public void hydrocanon(Tonnerre t) {
		t.setPv(t.getPv() - this.getAttackHydrocanon()/4);
		System.out.println (this.name + " a " + this.pv + " PV et " + t.getName() + " a " + t.getPv() + " PV");
		System.out.print (this.isKo() ? this.name + " est KO ": "");
	}

}

