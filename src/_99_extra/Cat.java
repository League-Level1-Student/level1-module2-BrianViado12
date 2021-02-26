package _99_extra;

public class Cat {
	private String name;
    private int napsPerDay;
    Cat(String name, int napsPerDay){
    	this.name=name;
    	this.napsPerDay=napsPerDay;
    }
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNapsPerDay() {
		return napsPerDay;
	}
	public void setNapsPerDay(int napsPerDay) {
		this.napsPerDay = napsPerDay;
	}
}
