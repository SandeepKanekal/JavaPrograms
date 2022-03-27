class fiboprime{
    public static void main(String[] args){
        int a=0;
        int b=1;
        int c=0;
        for(int i=3;i<=10;i++){
            c=a+b;
            int counter=0;
            for(int m=1;m<=c;m++){
                if(c%m==0)
                counter++;
            }
            if(counter==2)
            System.out.println(c);
            a=b;
            b=c;
        }
    }
}