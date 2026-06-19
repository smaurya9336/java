//method overloading
class B{
    public void f1(int x){
        System.out.println("Class B");
    }
}
class C extends B{
    public void f1(int x,int y){
System.out.println("Class C");
    }
}
public class A {
    public static void main(String[] args) {
        C obj=new C();
        obj.f1(5);
        obj.f1(10,60);
    }
}