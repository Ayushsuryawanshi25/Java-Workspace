import java.util.*;

class fruit{ 
    public String color;
    public String taste;
	public int type;
	
	void color(String color){
	this.color = color;
	System.out.print("The color of the fruit is" + color);
    }
    void taste(String taste){
	this.taste= taste;
	System.out.print("The taste of the fruit is" + taste);
    } 
    void type(int type){
	this.type = type;
	System.out.print("The type of the fruit is" + type);
	}
	
}

public class Access{
public static void main(String [] args){
    fruit ft = new fruit();
	ft.color("orange");
	ft.taste("sweet");
	ft.type(3);
	}
}
	
	
