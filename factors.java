class factors{
    public static void main(String args[]){
        int n=100;
        int count=0;
        for(int i=1;i<=Math.sqrt(n);i++){
            if(n%i==0){
                if(i==n/i){
                    count++;
                }else{
                    count+=2;
                }
            }
        }
        System.out.print("factors of "+ n+" is:"+count);
    }
}