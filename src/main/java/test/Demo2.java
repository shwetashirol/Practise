package test;

public class Demo2 {

		static int y=10; //Global variable so it can be used in any method
	    static int x=25;
		public static void localVar() {
			//int x=5; //X is a local variable so it can't be reused in other method
			int z=x-y;
			System.out.println("The value of z is "+z);
		}
		public static void unaryOperator() {
			int a=7;
			System.out.println("The unaryOperator value"+ a++);
		}
		public static void globalVar() {
			int x = 5;
			System.out.println("The value of X is" +x);
			System.out.println("The value of global var is "+y);
		}
		public static void main(String[] args) {
			localVar();
			unaryOperator();
			globalVar();

		}
	

	

}
