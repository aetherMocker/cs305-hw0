/*
 * Class: Participant
 * author: Aether Mocker
 * date: 31 Aug 23
 */
package hw0Package;


public class Participant {
	
	//instance vars
	private int bibNumber;
	private String name;
	private int age;
	
	/*
	 * ctor: Participant
	 * initializes and sets values to instance vars
	 */
	public Participant(int _bibNumber, String _name, int _age) {
		this.bibNumber = _bibNumber;
		this.name = _name;
		this.age = _age;
	}
	
	//print: prints all 
	public void print() {
		System.out.println(bibNumber + "\t" + name + "\t" + age + "\t");
	}
	
	//getAge: returns int of variable age
	public int getAge() {
		return this.age;
	}

}
