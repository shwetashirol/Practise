package test;

public class Basic2 {
	 
		public void program() {
			String name = "Super";
			int length = name.length();	
			
			System.out.println(length);
			String newname ="";
			
			for(int i =0; i<length; i++)
			{
				char NewValue = name.charAt(i);
				 newname= NewValue+newname;
				
			}
			
			System.out.println(newname);
			
			if (name.equalsIgnoreCase(newname))
			{
				System.out.println("given name is palliandrome");
			}
			else
			{
				System.out.println("given name is not palliandrome");
				System.out.println("New line");
			
			}
		public static void main(String[] args) {
			
			Basic2 ab = new Basic2();
			ab.program();
	 
		}
	 
	}

