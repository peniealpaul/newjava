package newjava;

public class Encapsulation {      
public String name ="paul";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		employee sc=new employee();
		sc.print();
		//System.out.println(sc.id);
		//System.out.println(sc.name);
		//System.out.println(sc.number);
		//System.out.println(sc.password);
		}
	}
class employee{
	int id=100;
	public String name ="paul";
	protected int number=84287896;
	private int password=1234;
    void print() {
	System.out.println(id);
	System.out.println(name);
	System.out.println(number);
	System.out.println(password);
	}
}