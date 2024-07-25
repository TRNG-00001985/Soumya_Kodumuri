//single inheritance

public class single_inherit {
    public void classA() {
    	System.out.println("I belongs to class A method");
    }
}
class clsB extends single_inherit{
	public void classB() {
		System.out.println("I belongs to class B method");
	}
}
class demo2{
	public static void main(String[] args) {
		clsB b=new clsB();
		b.classA();
		b.classB();
		}
}

// Hierarichal Inheritance

class Father{
	void Height() {
		System.out.println("I am a Father class");
	}
}
 class son extends Father{
	void color() {
		System.out.println("I am a Son class");
	}
}
 class daughter extends Father{
	 void voice() {
		 System.out.println("I am a Daughter class");
	 }
 }

public class Hierarichal {
public static void main(String[] args) {
	daughter dd=new daughter();
	dd.voice();
	dd.Height();
	 son ss=new son();
	 ss.color();
	 ss.Height();
}
}


//Multiple Inheritance

interface classA{
	void show() ;
}
interface classB{
	void display();
}
class classC implements classA,classB{
	public void show() {
		System.out.println("I'm inherited from classA");
	}
	public	void display() {
		System.out.println("I'm inherited from classB");
	}
}

public class multiple_inheritance {
	public static void main(String[] args) {

	classC cc= new classC();
	cc.show();
	cc.display();
}

}
