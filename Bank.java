// write a program for user define Exception
class MinBal extends Exception{
    MinBal(String str){
        super(str);
    }
}
class Bank {
    public static void main(String[] args) {
        int MyBal=5000;
        
        int WithdrawalAmt=Integer.parseInt(args[0]);
        try{
            if(MyBal-WithdrawalAmt<1000){
                throw new MinBal ("Please maintain minimum balance Rs.1000 in your account");
            }
            else{
                System.out.println("Withdrawal Successfully Rs."+ WithdrawalAmt);
                System.out.println("My Balance is  Rs."+ (MyBal-WithdrawalAmt));
            }
        }
        catch(MinBal ex){
            System.out.println(ex);
            System.out.println("You can't Withdrawal");
        }
        catch(Exception ex){
            System.out.println(ex);
        }
    }
}
