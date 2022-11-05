package newjava;

public class Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		person sc=new person();
		sc.care();
		sc.attend();
		sc.dresscode();
		sc.function();
		fam st=new person();
		st.care();
		st.function();
	
		com sv=new person();
		sv.dresscode();
		sv.attend();
		
	}

}

interface fam {
	
	void care();
	void function();
}
interface com {
	void attend();
	void dresscode();
}


class person implements fam,com{
	person(){
		
	}

	@Override
	public void function() {
		System.out.println("GO FUNCTION");
		
	}
	public void care() {
		System.out.println("TAKE CARE");
		
	}
	public void attend() {
		System.out.println("ATTEND WORK");
		
	}

	@Override
	public void dresscode() {
		System.out.println("DRESS NEATLY");
		
	}
	
}