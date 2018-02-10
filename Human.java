import java.io.Console;

public class Human{
	public static void main(String[] args) {

		  String name = "Roy";
		  //int FIRE_BOW = 0x01;
		  //int ICE_BOW = 0x02;
		  	  
		  Hunter hunterOriginal = new Hunter();
		  
		  Hunter hunter = new Hunter(name, "Default Blade");
		
		  System.out.printf("Original Hunter name: %s %nPresnet Hunter name: %s %nWeapons: %s%n", hunterOriginal.getOriginalName(),
				  			hunter.getCharaterName(),hunter.getCharaterWeapons());
		  hunter.attack();
		  
		  Warrior warriorOriginal = new Warrior();
		  
		  Warrior warrior = new Warrior(name, "Fire Bow");
			
		  System.out.printf("Original Warrior name: %s %nPresnet Warrior name: %s %nWeapons: %s%n", warriorOriginal.getOriginalName(),
				  			warrior.getCharaterName(),warrior.getCharaterWeapons());
		  warrior.attack();
		  
		  Mage mageOriginal = new Mage();
		  
		  Mage mage = new Mage(name, "Ice Staff");
			
		  System.out.printf("Original Mage name: %s %nPresnet Mage name: %s %nWeapons: %s%n", mageOriginal.getOriginalName(),
				  			mage.getCharaterName(),mage.getCharaterWeapons());
		  mage.attack();
	
	}
		
	
		public void  attack() {
		System.out.println("Fist Attack!");
		}
}
		
class Hunter extends Human{
			
			private String originalName;
			private String name;
			private String Weapons;
			private String Skills;
			
			public Hunter() {
				originalName = "Leo";
			}
			
			public Hunter(String name, String Weapons){
				this.name = name;
				this.Weapons = Weapons;
			}
			
			public String getOriginalName() {
				return originalName;
			}
			
			public String getCharaterName(){
				    return name;
			}
			
			public String getCharaterWeapons(){
				    return Weapons;
		    }
			
			public void attack() {
		    	 if(Weapons.equalsIgnoreCase("Default Blade"))
		    		 Skills = "Slash" ;
		    	 else if(Weapons.equalsIgnoreCase("Fire Blade"))
		    		 Skills = "Fire Slash";
		    	 else
		    		 Skills = "Ice Slash";
				System.out.println("Attack: " + Skills);
			}
}
			
class Warrior extends Human{
	
	private String originalName;
	private String name;
	private String Weapons;
	private String Skills;
	
	public Warrior() {
		originalName = "John";
	}
	
	public Warrior(String name, String Weapons){
		this.name = name;
		this.Weapons = Weapons;
	}
	
	public String getOriginalName() {
		return originalName;
	}
	
	public String getCharaterName(){
		return name;
	}
	
	public String getCharaterWeapons(){
		return Weapons;
    }
	
	public void attack() {
    	 if(Weapons.equalsIgnoreCase("Default Bow"))
    		 Skills = "Arrow" ;
    	 else if(Weapons.equalsIgnoreCase("Fire Bow"))
    		 Skills = "Fire Arrow";
    	 else
    		 Skills = "Ice Arrow";
		System.out.println("Attack: " + Skills);
	}
}			

class Mage extends Human{
	
	private String originalName;
	private String name;
	private String Weapons;
	private String Skills;
	
	public Mage() {
		originalName = "Mary";
	}
	
	public Mage(String name, String Weapons){
		this.name = name;
		this.Weapons = Weapons;
	}
	
	public String getOriginalName() {
		return originalName;
	}
	
	public String getCharaterName(){
		return name;
	}
	
	public String getCharaterWeapons(){
		return Weapons;
    }
	
	public void attack() {
    	 if(Weapons.equalsIgnoreCase("Staff"))
    		 Skills = "Missiles" ;
    	 else if(Weapons.equalsIgnoreCase("Fire Staff"))
    		 Skills = "Fireball";
    	 else
    		 Skills = "Frostbolt";
		System.out.println("Attack: " + Skills);
	}
}	
