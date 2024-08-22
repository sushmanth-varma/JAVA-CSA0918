class special
{
    public static void main(String args[]){
        String input="Hello, world! @2024";
        StringBuilder special=new StringBuilder();
        int count=0;
        for(int i=0;i<input.length();i++){
                    char ch=input.charAt(i);
                    if(!Character.isLetterOrDigit(ch)&& !Character.isWhitespace(ch)){
                        special.append(ch);
                        count++;
                    }
        }
        System.out.println(special);
        System.out.println(count);
    }
}