package entities;

public class Champion {
	public String name;
	public int life;
	public int attack;
	public int armor;
	
	
    public Champion(String name, int life, int attack, int armor) {
		this.name = name;
		this.life = life;
		this.attack = attack;
		this.armor = armor;
	}
    
    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLife() {
		return life;
	}

	public void setLife(int life) {
		this.life = life;
	}

	public int getAttack() {
		return attack;
	}

	public void setAttack(int attack) {
		this.attack = attack;
	}

	public int getArmor() {
		return armor;
	}

	public void setArmor(int armor) {
		this.armor = armor;
	}

	public void takeDamage(Champion other) {
		int damage;
			if (other.attack <= armor) {
				damage = 1;
			} else {
				damage = other.attack - armor;
			}
			life -= damage;
	}
	
	public String status() {
		if (life <= 0) {
			return name
					+ ": "
					+ 0
					+ " de vida"
					+ " (morreu)";
		} else {
			return name
					+ ": "
					+ life
					+ " de vida";
		}
	}
		
	

	
}
