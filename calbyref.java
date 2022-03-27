class calbyref{
    int a=10;
    public void change(calbyref obj){//object creation in the brackets
        obj.a+=20;
        System.out.println(obj.a +" in the method");
    }
    public static void main(String[] args){
        calbyref ob=new calbyref();
        System.out.println(ob.a);
        ob.change(ob);
        System.out.println(ob.a);
    }
}