import java.util.ArrayList;

public class loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = {1,2,3,4,5,6,7,8,9,10};
		
		for(int i=0; i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				System.out.println(a[i]);
				
			}
			
			else
			{
				System.out.println(a[i]+" is odd no");
				break;
			}
		}

	ArrayList<String> b=new ArrayList<String>();
	b.add("I");
	b.add("am");
	b.add("star");
	System.out.println(b.get(2));
	
	
	}
	
	
	
}
