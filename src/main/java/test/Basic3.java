package test;

public class Basic3 {
	public void Reverse()
	{ String Name ="SHWETA";
	   int length=Name.length();
	   System.out.println(length);
	   for(int i=(length-1);i>=0;i--)
		{
				char ch =Name.charAt(i);
				System.out.println(ch);
		}
	   

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Basic3 A = new Basic3();
           A.Reverse();
	}

}
