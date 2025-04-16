class A<T>{
    public T a;
    A(T a){this.a=a;}

}
class genric_class{
    public static void main(String[] args){
        Integer[] ab={1,2,3,4};
        A<Integer[]> a1=new A<>(ab);
        System.out.println(ab);
        // A<Integer> a1=new A<>(12);
        // System.out.println(a1.a);

}
}