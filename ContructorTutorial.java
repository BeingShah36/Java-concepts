
public class ContructorTutorial extends ParentInherOver {  
	
	String name = "Dabbang2";
	String movie = "ek tha tiger";
	public ContructorTutorial() {
		
		System.out.println("i am constrcutor"); 
	} 
	
 public ContructorTutorial(int a,int b) {
		
		System.out.println("i am shah");
	} 
	
	public void getData() {
		String movie = "tiger zinda hai";
		System.out.println(movie); 
		System.out.println(this.movie); 
		System.out.println(super.name); 
		System.out.println(name); 
		System.out.println("i am data");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	ContructorTutorial d = new ContructorTutorial();
		ContructorTutorial c = new ContructorTutorial(4,5);
		d.getData();
		
	}

}
