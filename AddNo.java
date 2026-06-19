import java.io.*;
public class AddNo {
    int Num1,Num2;
AddNo(int Num1,int Num2){
    this.Num1=Num1;
    this.Num2=Num2;
}
    int AddNo(){
        return(Num1+Num2);   
    }
     public static void main(String[] args) throws IOException {
        DataInputStream ds= new DataInputStream(System.in);
        System.out.println("Enter First Number:--");
int a=Integer.parseInt(ds.readLine());
System.out.println("Enter Second Number:--");
int b=Integer.parseInt(ds.readLine());
AddNo Obj=new AddNo(a,b);
System.out.println("Sum is :--" +Obj.AddNo());
    }
}
