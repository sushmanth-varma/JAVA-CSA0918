class reverse1{
public static void main(String args[]){
String n="sushmanth";
int len=n.length();
String empty="";
for(int i=len-1;i>=0;i--){
empty=empty+n.charAt(i);
}
System.out.print(empty);
}
}