public class Pokemon {
	public String name;
	public int pv;
	public int pm;
	public int attack;

	public Pokemon(String name, int pv, int attack) {
		this.name = name;
		this.pv = pv;
		//this.pm = pm;
		this.attack = attack;
	}

// Getters

	public String getName() {
		return this.name;
	}
	
	public int getPv() {
		return this.pv;	
	}

	public int getPm() {
		return this.pm;	
	}

	public int getAttack() {
		return this.attack;	
	}

	

//Setters

	public void setName(String name) {
		this.name = name;
	}
	
	public void setPv(int pv) {
		this.pv = pv;	
	}

	public void setPm(int pm) {
		this.pm = pm;	
	}
	public void setAttack(int attack) {
		this.attack = attack;	
	}


 	public boolean isKo() {
       		return this.pv <= 0;   
	}
}
