package _02_smurf;

public class SmurfRunner {
	public static void main(String[] args) {
		Smurf Handy = new Smurf("Handy");
		System.out.println(Handy.getName());
		Handy.eat();
		Smurf papa = new Smurf("Papa Smurf");
		System.out.println(papa.getName());
		System.out.println(papa.getHatColor());
		System.out.println(papa.isGirlOrBoy());
		Smurf smurfette = new Smurf("Smurfette");
		System.out.println(smurfette.getName());
		System.out.println("Her hat is " + smurfette.getHatColor());
		System.out.println(smurfette.isGirlOrBoy());
	}
}
