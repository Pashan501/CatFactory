package pasha.anno2;

@Blohable(name = "not a blohable")
@Color(color = "not a Black")
public class Cat2 extends Animal{
	private String name;
	private boolean IsSick;
	public Cat2() {
		
	}
	public Cat2(String name, boolean sickness) {
		this.name = name;
		this.IsSick = sickness;
	}
	public boolean getIsSick() {
		return IsSick;
	}
	public void setIsSick(boolean isSick) {
		IsSick = isSick;
	}
	
}
