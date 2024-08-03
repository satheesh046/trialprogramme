package satheesh;

class school {
	static int uniform(int a, int b) {
		
		int total =a+b;
		
		System.out.println("good uniform");
		return total;
	}

}

class discpline extends school {
	public void shoe() {
		System.out.println("good shoe");

	}
}
class events extends discpline {
	void dance() {
		System.out.println("good dance");
	}
}

public class inheritancemul {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		events obj=new events();
		obj.shoe();
		
		
		
		
		
		
		obj.dance();
		

	}

	private void shoe() {
		// TODO Auto-generated method stub
		
	}

}
