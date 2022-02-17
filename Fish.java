
public class Fish implements Animal {
	
	   public String color;

	    public String getColor() {
	        return color;
	    }

	    public void setColor(String color) {
	        this.color = color;
	    }


	    @Override
	    public String toString() {
	        return "The fish's color is : " + color;
	    }

	    @Override
	    public void move() {
	        System.out.println(getClass().getName()+" is moving.");
	    }

	    @Override
	    public void makeSound() {
	        System.out.println(getClass().getName()+" is making sound.");
	    }
	}

