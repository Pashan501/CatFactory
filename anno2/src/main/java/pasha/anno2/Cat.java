package pasha.anno2;



@Blohable(name = "blohable")
@Color(color = "Black")
public class Cat extends Animal{
	private String name;
	private boolean IsSick;
	public Cat() {
		
	}
	public Cat(String name, boolean sickness) {
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
