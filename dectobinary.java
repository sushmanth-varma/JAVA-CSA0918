class dectobinary{
    public static void main(String args[]){
        int decimalnumber=13;
        String binarystring=Integer.toBinaryString(decimalnumber);
        System.out.println("decimal numebr:"+binarystring);
        String reverse=new StringBuilder(binarystring).reverse().toString();
        System.out.print("reverse string"+reverse);
    }
}