public class javaTest{
	
    void addMethod(int a, int b){
       int c = a + b;
       System.out.println("Result of A and B is ::: "+c);
     }

    void subMethod(int a, int b){
	    int d = a-b;
    }

	public static void main(String args[]){
		javaTest test = new javaTest();
		test.addMethod(10,20);
		test.subMethod(20-5);
	}
}
