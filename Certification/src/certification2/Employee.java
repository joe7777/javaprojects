package certification2;

public class Employee
{
 String name;
 boolean contract;
 double salary;
 Employee()
 {
 //this.name = new String("Durga");
 //this.contract = new Boolean("TRUE");
 //this.salary = new Double(100);
	 name = "Durga";
	 contract = true;
	 salary = 100.0f;
	 
 }
 public String toString()
 {
 return name+":"+contract+":"+salary;
 }
 public static void main(String[] args)
 {
 Employee e = new Employee();
 //Line-2
 
 System.out.println(e);
 }
}

class Vehicle
{
 String type="4w";
 int maxSpeed=120;
 
 Vehicle(String type)
 {
 this.type=type;
 }
}

class Car extends Vehicle
{
 String trans;
}