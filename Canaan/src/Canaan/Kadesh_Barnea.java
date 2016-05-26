package Canaan;

public class Kadesh_Barnea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BaseTeacher bt = new BaseTeacher("冯佳",18) ;
		bt.teacher();
	}

}

abstract class Teacher {
	private String name ;
	private int age ;
	
	public Teacher () {}
	
	public Teacher ( String name , int age ) {
		this.name = name ;
		this.age = age ;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public abstract void teacher () ;
	
}

class BaseTeacher extends Teacher {
	
	public BaseTeacher () {}
	
	public BaseTeacher ( String name , int age ) {
		super(name,age);
	}
	
	public void teacher () {
		System.out.println("我的姓名是：" + this.getName() + " 我的年龄是：" + this.getAge() + ",讲的内容是Java基础。");
	}
}