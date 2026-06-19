class Stud{
    Stud(int rollno,string StudNm){
        System.out.println("Roll Number is:--" +rollno);
        System.out.println("Name is:--" +StudNm);
    }
    public static void main(String[] args) {
        
        Stud obj=new Stud(100, "Sarita");
        Stud obj1=new Stud(101, "Akash");
        Stud obj2=new Stud(102, "Mamta");

    }
}
