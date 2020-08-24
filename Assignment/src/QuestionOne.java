

import java.io.File;


import static  com.ankit.A.*;

import static a.b.AB.*;
import static c.b.CB.*;

public class QuestionOne {
	
	public static A a = new A();
	public static C c = new C();
	
	
	
	public static  void main(String[] args) {
		
		a.b.c= c.b.a;
		
		
		
				
			}
				 
			 
			 
		
	}


class A{
	
	 static  B b =new B();
	
	
	
}

class B{
	public static int c; 
	public static int a;
}
class C{
	B b = new B();
}
