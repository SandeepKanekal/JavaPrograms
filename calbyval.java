class calbyval{
    final int a=10;
    public void change(int x){
        x+=50;
        System.out.println(x+" in the method");
    }
    public static void main(String[] args){
        calbyval ob=new calbyval();
        System.out.println(ob.a);
        ob.change(ob.a);
        System.out.println(ob.a);
    }
}