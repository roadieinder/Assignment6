interface Animal
{
void speak();
void eat();
}
class Dog implements Animal
{
public void speak()
{System.out.println("Bark");}
public void eat()
{System.out.println("Biscuits");}
}
class Cat implements Animal
{
public void speak()
{System.out.println("Meow");}
public void eat()
{System.out.println("Mouse");}
}
class Animals
{
public static void main(String[] args)
{
Animal a=new Dog();
Animal a1=new Cat();
a.speak();
a.eat();
a1.speak();
a1.eat();
}
}