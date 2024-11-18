package test;

class Mobiles {
	int mobile_prise;
	int mobile_storage;
	String type;

	public void Brand()
	{
	System.out.println(mobile_prise);
	System.out.println(type);
	System.out.println(mobile_storage);
	}
}
 public class Mobile {

	public static void main(String[] args) {
		Mobiles M1=new Mobiles();
         M1.mobile_prise=20000;
         M1.mobile_storage=180;
         M1.type="Redmi";
         
         Mobiles M2=new Mobiles();
         M2.mobile_prise=40000;
         M2.mobile_storage=64;
         M2.type="Oneplus";

         M1.Brand();
         M2.Brand();
         
         System.out.println();


		// TODO Auto-generated method stub

	}
	}

