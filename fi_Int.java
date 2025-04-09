// You are using Java
import java.io.FileReader;
import java.io.FileWriter;

 class fi_Int{
    public static void main(String[] args){
        String a="abccccc";
        String b="Xyzzzzz";
        
        try{
            FileWriter fw=new FileWriter("z2.txt");
            fw.write(a);
            fw.write(b);
            fw.close();
        }
        catch(Exception e)
        {
            System.out.println("Exception Caught");
        }
        try{
            FileReader fr=new FileReader("z2.txt");
            int d;
        }
        catch(Exception e){
            System.out.println("Exception Caught");
        }
    }
}