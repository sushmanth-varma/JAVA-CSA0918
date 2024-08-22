import java.util.Scanner;
import java.util.Arrays;
class sort{
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        System.out.print("enter the number:");
        int n=input.nextInt();
        String[] names=new String[n];
        System.out.print("enter the names:");
        for(int i=0;i<n;i++){
            names[i]=input.nextLine();
        }
        System.out.print("order(A/D):");
        char order=input.next().charAt(0);
        if(order=='A'|| order=='a'){
            Arrays.sort(names);
        }else if(order=='D'||order=='d'){
            Arrays.sort(names,(a,b)->b.compareTo(a));
        }
        System.out.print("sorted names:");
        for(String name:names){
            System.out.println(name);
        }
    }
}