// You are using Java
class A{
    int a;
    int b;
    void display(){
        System.out.println(a);
            System.out.println(b);
    }
    public static void main(String[] args) {
       try{ Class cls=Class.forName("A");
        A a=(A)cls.newInstance();
        a.a=10;
        a.b=19;
        a.display();}
        catch(Exception e){
            e.printStackTrace();
        }
    }
}