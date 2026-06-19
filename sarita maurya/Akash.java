// O/P:The Division is:--7
interface Sarita
{
    void AddNo(int Num1,int Num2);
    void SubNo(int Num1,int Num2);
    void DivNo(int Num1,int Num2);
    void MulNo(int Num1,int Num2);
}
class Chhavi implements Sarita
{
    public void AddNo(int a,int b){
        System.out.println("The Sum is:--"+(a+b));
    }
    public void SubNo(int a,int b){}
    public void DivNo(int a,int b){}
    public void MulNo(int a,int b){}
    }
class Nandani extends Chhavi implements Sarita{
    public void AddNo(int a, int b){}
    public void DivNo(int a, int b){}
    public void MulNo(int a, int b){}
    public void SubNo(int a, int b){
        System.out.println("The Sub is:--"+(a-b));
    }
}
class Yati extends Nandani implements Sarita{
    public void AddNo(int a, int b){}
    public void SubNo(int a, int b){}
    public void MulNo(int a, int b){}
    public void DivNo(int a, int b){
        System.out.println("The Division is:--"+(a/b));
    }
}
 class Akash extends Yati implements Sarita{
public void AddNo(int a,int b){}
public void SubNo(int a,int b){}
public void DivNo(int a,int b){}
public void MulNo(int a,int b){
    System.out.println("The Mul is:--"+(a*b));
}
    public static void main(String args[]){
//Chhavi Obj=new Chhavi();
Yati Obj=new Yati();
Obj.DivNo(450,57);

    }
}
