interface Akash{
    void AddNo(int a,int b);//Madhu
    void SubNo(int a,int b);//Mamta
    void DivNo(int a,int b);//Pooja
    void MulNo(int a,int b);//Sarita
}
class Madhu implements Akash{
public void AddNo(int a,int b){
    System.out.println("The Sum is:--"+(a+b));
}
public void SubNo(int a,int b){}
public void DivNo(int a,int b){}
public void MulNo(int a,int b){}
}
class Mamta extends Madhu implements Akash{
    public void AddNo(int a,int b){}
    public void DivNo(int a,int b){}
public void MulNo(int a,int b){}
public void SubNo(int a,int b){
    System.out.println("The Sub is:--"+(a-b));
}
}
class Pooja extends Mamta implements Akash{
    public void AddNo(int a,int b){}
    public void SubNo(int a,int b){}
    public void DivNo(int a,int b){
        System.out.println("The Div is:--"+(a/b));
    }
    public void MulNo(int a,int b){}
}
public class Sarita extends Pooja implements Akash {
    public void AddNo(int a,int b){}
   public void SubNo(int a,int b){}
   public void DivNo(int a,int b){}
   public void MulNo(int a,int b){
       System.out.println("The Mul is:--"+(a*b));
   }
   public static void main(String[] args) {
       Akash obj=new Madhu();
       obj.AddNo(20,20);
       Akash obj1=new Mamta();
       obj1.SubNo(40,30);
       Akash obj2= new Pooja();
       obj2.DivNo(60,50);
       Akash obj3=new Sarita();
       obj3.MulNo(40,60);
   }
}
