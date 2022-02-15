
class Person{
	//Classes can contain
	//1-Data
	//2-Subroutines(methods)
	// Instance variables(data/"state")
	String name;
	int age;
	
}
public class Application {
	public static void main(String[] args) {
		Person person1=new Person();
		person1.name="Mohamed Lamin";
		person1.age=3;
		
		Person person2=new Person();
		person2.name="Binta Jalloh";
		person2.age=1;
		
		System.out.println(person2.name);

	}
}
