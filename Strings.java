
public class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String s="I am rockstar";
//	String[] a=	s.split(" ");
//		System.out.println(a[0]);
//		System.out.println(a[1]);
//		System.out.println(a[2]);
		String[] a=	s.split("am");
		System.out.println(a[0]);
		System.out.println(a[1].trim());
		
		// to print each character of strings
		
		//for(int i=0 ; i<s.length() ; i++)
		//{
		//	System.out.println(s.charAt(i));
		//}
		// to print reverse string
		for(int i=s.length()-1; i>=0 ;i--)
		{
			System.out.println(s.charAt(i));
		}
	}

}
