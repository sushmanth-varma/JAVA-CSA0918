class ispower{
    public static void main(String args[]){
        int n=27;
        boolean power=false;
        if(n>=1){
            while(n%3==0){
                n=n/3;
            }
            if(n==1){
                power=true;
            }
        }
        System.out.println("Input"+n);
        System.out.println("output:"+power);
    }
}