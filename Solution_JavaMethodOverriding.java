
public class Solution_JavaMethodOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			MotorCycle m = new MotorCycle();
	}
	


}

class A {
	
public	String define_me(){
	
	return "I am a cycle with an engine";
	}
}

class MotorCycle extends A{
	
	MotorCycle(){
		String temp = super.define_me();
		System.out.println("My ancestor is a cycle who is "+ temp );
	}


	
	
	
}
