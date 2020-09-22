package opdracht_02__05_06_07_08;

public class Person {
	private String voornaam;
	private String naam;
	private String gender;
	private Person marriedTo;
	
	public Person() {
		
	}
	
	public Person(String voornaam, String naam, String gender) {
		this.voornaam = voornaam;
		this.naam = naam;
		this.gender = gender;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	public String getVoornaam() {
		return voornaam;
	}

	public void setVoornaam(String voornaam) {
		this.voornaam = voornaam;
	}

	public String getNaam() {
		return naam;
	}

	public void setNaam(String naam) {
		this.naam = naam;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Person getMarriedTo() {
		return marriedTo;
	}

	public void setMarriedTo(Person marriedTo) {
		this.marriedTo = marriedTo;
	}
	
	
	public void marry(Person p) {
		this.setMarriedTo(p);
		p.setMarriedTo(this);
	}
	
	
	

}
