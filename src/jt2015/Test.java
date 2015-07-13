package jt2015;

public class Test {
	
	public static void main(String[] args) {
		long t1 = System.currentTimeMillis()；
		System.out.println("START");
		System.out.println(System.currentTimeMillis());
		System.out.println("END!");
		long t2 = System.currentTimeMillis();
		
		System.out.println("take time:"+(t2-t1)+"ms!");
		
	}

}
