package opdracht_02__05_06_07_08;

import opdracht_02__05_06_07_08.Person;

public class Main {

	public static void main(String[] args) {
		Person partner = new Person("Axel", "Colson", "Man");
		Person mom = new Person("Myriam", "Christiaens", "Vrouw");
		Person dad = new Person("Patrick", "Colson", "Man");
		
		
		mom.marry(dad);
		
		System.out.println(mom.getMarriedTo().getVoornaam());
		System.out.println(dad.getMarriedTo().getVoornaam());
	}
	
	

}
