package certification2;
import certification.A;

public class TestJava extends A {
	public static void main(String[] args)
	 {
		Short s1=200;
		 Integer s2=400;
		 Long  s3=(long)s1+s2;  //Line-1
		 //String s4=(String)(s3*s2);// Line-2
		 System.out.println(s3);
	 }
}
