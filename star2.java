class pattern2{
    public static void main(String args[]){
        int maxnum=5;
        for(int i=1;i<maxnum-1;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }
        for(int i=maxnum-1;i>0;i--){
            for(int j=0;j<i;j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}