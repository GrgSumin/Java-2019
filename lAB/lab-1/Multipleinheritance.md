MULTIPLE INHERITANCE
```
package Inheritance;

interface Child1 {

    default void show()
    {
        System.out.println("Hello from Child 1");
    }
}
 
interface ChildB {

    default void show()
    {
        System.out.println("Hello form Child 2");
    }
}
 
class MultipleInheritance implements Child1, Child2 {
 
    public void show()
    {
        Child1.super.show();
        Child2.super.show();
    }
 
    public static void main(String args[])
    {
        MultipleInheritance childern = new MultipleInheritance();
        childern.show();
    }
}
```
