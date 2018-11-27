package certification2;

class Base
{
 public void test()
 {
 System.out.println("Base");
 }
}

class DerivedA extends Base
{
 public void test()
 {
 System.out.println("DerivedA");
 }
}

class DerivedC extends DerivedA
{
	public void test()
	 {
		System.out.println("DerivedC");
	 }
}
class DerivedB extends DerivedA
{
 public void test()
 {
 System.out.println("DerivedB");
 }
 public static void main(String[] args)
 {
 Base b1= new DerivedB();
 Base b2= new DerivedA();
 Base b3= new DerivedB();
 Base b5 = new Base();
 b1=(Base)b3;
 Base b4=(DerivedA)b3;
 Base b6 = (DerivedB) b5;
 System.out.print(b4.toString());
 ((DerivedA)b1).test();
 b2.test();
 b5.test();
 b4.test();
 b6.test();
 }
}