
public class SolutionSingletonPattern {

	
	public String str ="";
	
	private SolutionSingletonPattern() {
		
	}
	
	public static  SolutionSingletonPattern  getSingleInstance() {
		
		return new SolutionSingletonPattern();
	}
}
