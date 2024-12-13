package firstSample;

public class Character {
	
	private String 	name;
	private	int		age;
	private	int		health;
	private int		currentHealth;
	private int		power;
	private int		endurence;
	
	
	
	public int getEndurence() {
		return endurence;
	}

	public void setEndurence(int endurence) {
		this.endurence = endurence;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public int getCurrentHealth() {
		return currentHealth;
	}

	public void setCurrentHealth(int currentHealth) {
		this.currentHealth = currentHealth;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Character [name=" + name + ", age=" + age + ", health=" + health + ", currentHealth=" + currentHealth
				+ ", power=" + power + ", endurence=" + endurence + "]";
	}

	public Character(String name, int age, int health) {
		super();
		this.name = name;
		this.age = age;
		this.health = health;
	}
	
	public Character(String name) {
		super();
		this.name = name;
	}
	
	public Character() {
		super();
		name = "test";
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getHealth() {
		return health;
	}
	
	public void setHealth(int health) {
		this.health = health;
		currentHealth = health;
	}
	
	public void updateHealth(int point) {
		currentHealth += point;
		if (currentHealth < 0)
			currentHealth = 0;
		
		if (currentHealth > health)
			currentHealth = health;
	}
	
}