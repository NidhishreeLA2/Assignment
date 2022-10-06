package com;

public class joker implements jkr{
	String name;
	String type;

	joker(){
		
	}
	joker(String n, String t){
		this.name = n;
		this.type = t;
		System.out.println(n+" is dancing " +t );
		
	}
	/*public String dance9() {
		return "garbha";
	}
	public String dance10() {
		return "Bhangra";
	}
	public String dance11() {
		return "hojagiri";
	}
	public String dance12() {
		return "yakshagana";
	}
	public String dance13() {
		return "Jhumar";
	}
	public String dance14() {
		return "Garadi";
	}
	public String dance15() {
		return "kummi";
	}
	public String dance16() {
		return "Dandiya";
	}*/
	
	
	public static void main(String args[]) {
		joker j1 = new joker("joker1","Bharatanatyam");
		joker j2 = new joker("joker2","kuchipudi");
		joker j3 = new joker("joker3","kathakali");
		joker j4 = new joker("joker4","odissi");
		joker j5 = new joker("joker5","kathak");
		joker j6 = new joker("joker6","mohiniyattam");
		joker j7 = new joker("joker7","sattriya");
		joker j8 = new joker("joker8","chau dance");
		joker j9 = new joker();
		joker j10 = new joker();
		joker j11 = new joker();
		joker j12 = new joker();
		joker j13 = new joker();
		joker j14 = new joker();
		joker j15 = new joker();
		joker j16 = new joker();
		/*System.out.println("joker9 is dancing " + j9.dance9());
		System.out.println("joker10 is dancing " + j10.dance10());
		System.out.println("joker11 is dancing " + j11.dance11());
		System.out.println("joker12 is dancing " + j12.dance12());
		System.out.println("joker13 is dancing " + j13.dance12());
		System.out.println("joker14 is dancing " + j14.dance14());
		System.out.println("joker15 is dancing " + j15.dance15());
		System.out.println("joker16 is dancing " + j16.dance16());*/
		
		j9.dance("joker9", "garbha");
		j10.dance("joker10", "Bhangra");
		j11.dance("joker11", "hojagiri");
		j12.dance("joker12", "yakshagana");
		j13.dance("joker13", "Jhumar");
		j14.dance("joker14", "Garadi");
		j15.dance("joker15", "kummi");
		j16.dance("joker16", "Dandiya");
	}
	@Override
	public String dance(String s, String d) {
		// TODO Auto-generated method stub
		return s+" is dancing " +d;
	}
}
