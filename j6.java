// You are using Java
class A{
    int a;
    int b;
    
    void display(){
        System.out.println(a);
            System.out.println(b);
            
    }
    public static void main(String[] args){
        A a=new A();
        a.a=10;
        a.b=20;
        a.display();
        // A b= new A(1,2);
        // b.display();
        //     A c=new A(1);
        //     c.display();
    }
}