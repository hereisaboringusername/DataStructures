

public class Dog implements Animal{
	protected String furColor;

	public void setFurColor(String furColor) {
		this.furColor = furColor;
	}

	public String getFurColor() {
		return furColor;
	}

	@Override
	public String toString() {
		return "Dog's fur Color: "+furColor;
	}

	@Override
	public void move() {
		System.out.println(getClass().getName()+" is moving!");
	}

	@Override
	public void makeSound() {
		System.out.println(getClass().getName()+" is making a sound!");
	}
}


