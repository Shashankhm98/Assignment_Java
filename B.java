package assignment_1;

public class B {

     private String str ="Hello";
     public String publicstr ="hello";
     
     private void print() {
    	
    	 int a = 54;
    	 int b = 47;
    	 int sum = a+b;
    	 System.out.println(sum);
     }
     public void add() {
    	 print();
    	 System.out.println("Addition");
    	 
     }
	public String getStr() {
		return str;
	}
	public void setStr(String str) {
		this.str = str;
	}
       }

