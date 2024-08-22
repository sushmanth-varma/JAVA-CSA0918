class fact{
    public static void main(String args[]){
        int year=2024;
       if((year%4==0&&year%100!=0)||(year%400==0))
       System.out.print("leaf year");
       else
       System.out.print("not leaf year");
        
    }
}