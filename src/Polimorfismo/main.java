package Polimorfismo;



public class main {

	public static void main(String[] args) {
		
		B[] bs=new B[2];
		
		bs[0]=new B();
		bs[1]=new A();
		bs[2]=new C();
		
		naivePrinter(bs);

	}

	private static void naivePrinter(B[] bs) {
	
		for (int i = 0; i < bs.length; i++) {
			
			bs[i].print();
			
		}
		
	}

}
