// class A {
//     public static void aa(int... n){
//         for (int i:n){
//         System.out.println(i);}
//     }
//     public static void main(String[] args){
//         A a=new A();
//         aa(1,2,3,4,5);
//     }

    
// }

class A{
    public static void aa(String s,int... n){
        System.out.println(s);
        for(int i:n){
            System.out.println(i);}

        }
        public static void main(String[] args) {
            A a=new A();
            aa("Hiiii",1,2,3,4,5);
            
        }
    }
    
