
public class A{
private int Num1,Num2;
A()
{
    Num1=20;
    Num2=30;
}
protected int AddNo()
{
    return(Num1+Num2);    
}
protected int MulNo()
{
    return(Num1*Num2);
}
}
class B extends A
 { 
    public static void main(String args[]){
A Obj=new A();
System.out.println("The Sum:--"+Obj.AddNo());
System.out.println("The Multiplication:--"+Obj.MulNo());

    }
}
