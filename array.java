import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        //creating an Array
        //datatype[] array_name;
        //int [] array;
        int array[];
        Scanner sc=new Scanner(System.in);

        //initialise
        array=new int [5];
        for(int i=0;i<array.length;i++){
            array[i]=sc.nextInt();
        }
        for (int i=0;i<array.length; i++){
            System.out.println(array[i]);
        }
        for(int a:array){
            System.out.println(a);
        }
    }
}
