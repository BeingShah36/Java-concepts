
public class ParentInherOver {

	String name = "Dabbang";
	
	public void CaptainAmerica() {
		System.out.println("I can do this all day");
	}

	public void Ironman() {
		System.out.println("Genius billionaire playboy phlianthropist");
	}
		public void Hulk() {
			System.out.println("We are time bomb");
		}
		
		public void Thor() {
			System.out.println("one more");
		}
		
		public void BlackWidows() {
			System.out.println("Let me go");
		}
		
		public void Hawkeye() {
			System.out.println("teer mar khan");
		}
		
		public void Integer(int a) {
			System.out.println(a);
		}
		
		public void Integer(int a, int b) {
			System.out.println(a+b);
		}
		public static void main(String[] args) {
			int a = 5;
			int b= 6;
			
			ParentInherOver obj = new ParentInherOver();
			obj.Integer(a);
			obj.Integer(a, b);
		}
}
