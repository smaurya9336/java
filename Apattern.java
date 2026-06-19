public class Apattern {
    public static void main(String[] args) {
        int row,col;
        for(row=0;row<=4;row++){
            for(col=0;col<=3;col++){
                if(row==0 && (col==1 || col==2)){
                    System.out.print("*");
                }
                else if((col==0 || col==3) && row!=0){
                    System.out.print("*");
                }
                else if(row==2 && (col==1 || col==2)){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
