class skipping{
    public static void main(String args[]){
        int n=50;
        int m=100;
        int k=7;
        for(int i=n;i<=m;i+=(k+1)){
            System.out.print(i+" ");
            if(i+k+1<=n)
            System.out.print(",");
        }
    }
}