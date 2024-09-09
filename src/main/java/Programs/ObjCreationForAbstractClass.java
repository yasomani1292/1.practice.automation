package Programs;

public class ObjCreationForAbstractClass {

	AbstractClass abstractClass = new AbstractClass() {

		@Override
		public void method3() {
			System.out.println("Override method3");
		}

		@Override
		public void method4() {
			System.out.println("Override method4");
		}

	};

	public void method5() {
		System.out.println("Override method4");
	}
	
	void sum(int x, int y){
		System.out.println("sum int int");
	}
	void sum(long y, int x){
		System.out.println("sum long int");
	}

	public static void main(String[] args) {

		ObjCreationForAbstractClass objCreationForAbstractClass = new ObjCreationForAbstractClass();
		objCreationForAbstractClass.method5();

//		abstractClass.method1();
		
		long x = 10;
		objCreationForAbstractClass.sum(10l, 20);
		
		
	}

}
