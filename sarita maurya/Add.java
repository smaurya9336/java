/*wap add two number using instance variable with the help of DataInputStream.*/
import java.io.*;
 class Add
{
   int Num1,Num2;
   AddNo(int Num1,int Num2)
{
    this.Num1=Num1;
    this.Num2=Num2;
}
int Add()
{
    return(Num1+Num2);
}
    public static void main(String args[])throws IOException{
DataInputStream ds=new DataInputStream(System.in);
System.out.print("Enter First Number:--");
int a=Integer.parseInt(ds.readLine());
System.out.print("Enter Second Number:--");
int b=Integer.parseInt(ds.readLine());
Add obj=new Add(a,b);
System.out.println("Sum is:--"+obj.Add());

    }
}
