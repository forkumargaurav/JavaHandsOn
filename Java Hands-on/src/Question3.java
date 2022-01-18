//Question3
class Shape{
  public void print_shape(){
    System.out.println("This is shape");
  }
}

// Rectangle class inheriting the Shape class	
class Rectangle extends Shape{
  public void print_rectangle(){
    System.out.println("This is rectangular shape");
  }
}

// Circle class inheriting the Shape class
class Circle extends Shape{
  public void print_circle(){
    System.out.println("This is circular shape");
  }
}

// Square class is subclass of Rectangle class
class Square extends Rectangle{
  public void print_square(){
    System.out.println("Square is a rectangle");
  }
}

// main class
public class Question3 {

	public static void main(String[] args) {
		
	    Square obj = new Square();  // creating object of Square class
	    obj.print_shape();    // Object of Square class calling function of Shape class
	    obj.print_rectangle();    // Object of Square class calling function of Rectangle class
	  }
}
