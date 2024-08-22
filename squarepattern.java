class squarepattern{
    public static void main(String args[]){
        int n=4;
        int square=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(square*square + " ");
                square++;
            }
            System.out.println();
        }
    }
}