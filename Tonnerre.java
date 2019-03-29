public class Tonnerre extends Pokemon{
    private int attackEclairFou;
    private int attackEtincelle;

	public int getAttackEclairFou(){
		return this.attackEclairFou;	
    }
    
    public int getAttackEtincelle(){
		return this.attackEtincelle;	
	}

	public Tonnerre(String name,int pv, int attack) {
		super(name, pv, attack);
        this.attackEclairFou = 400; 
        this.attackEtincelle = 400;

	}

// attaque eclair fou 

	public void eclairFou(Vent v) {
		v.setPv(v.getPv() - this.getAttackEclairFou()/4);
		System.out.println (this.name + " a " + this.pv + " PV et " + v.getName() + " a " + v.getPv() + " PV");
		System.out.print (this.isKo() ? this.name + " est KO": "");
	}

	public void eclairFou(Feu f) {
		f.setPv(f.getPv() - (this.getAttackEclairFou()/2));
		System.out.println (this.name + " a " + this.pv + " PV et " + f.getName() + " a " + f.getPv() + " PV");
		System.out.print (this.isKo() ? this.name + " est KO ": "");
	}

	public void eclairFou(Eau e) {
		e.setPv(e.getPv() - this.getAttackEclairFou());
		System.out.println (this.name + " a " + this.pv + " PV et " + e.getName() + " a " + e.getPv() + " PV");
		System.out.print (this.isKo() ? this.name + " est KO ": "");
	}

    public void eclairFou(Tonnerre t) {
		t.setPv(t.getPv() - this.getAttackEclairFou()/2);
		System.out.println (this.name + " a " + this.pv + " PV et " + t.getName() + " a " + t.getPv() + " PV");
		System.out.print (this.isKo() ? this.name + " est KO ": "");
	}

// attaque étincelle
	public void etincelle(Vent v) {
		v.setPv(v.getPv() - this.getAttackEtincelle()/4);
		System.out.println (this.name + " a " + this.pv + " PV et " + v.getName() + " a " + v.getPv() + " PV");
		System.out.print (this.isKo() ? this.name + " est KO": "");
	}

	public void etincelle(Feu f) {
		f.setPv(f.getPv() - (this.getAttackEtincelle()/2));
		System.out.println (this.name + " a " + this.pv + " PV et " + f.getName() + " a " + f.getPv() + " PV");
		System.out.print (this.isKo() ? this.name + " est KO ": "");
	}

	public void etincelle(Eau e) {
		e.setPv(e.getPv() - this.getAttackEtincelle());
		System.out.println (this.name + " a " + this.pv + " PV et " + e.getName() + " a " + e.getPv() + " PV");
		System.out.print (this.isKo() ? this.name + " est KO ": "");
	}

    public void etincelle(Tonnerre t) {
		t.setPv(t.getPv() - this.getAttackEclairFou()/2);
		System.out.println (this.name + " a " + this.pv + " PV et " + t.getName() + " a " + t.getPv() + " PV");
		System.out.print (this.isKo() ? this.name + " est KO ": "");
	}

}
