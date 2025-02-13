import java.io.*;
class DeserializationExample{
    public static void main(String[] args){
        try{
            FileInputStream fileIn =new FileInputStream("xyz");
            ObjectInputStream in =new ObjectInputStream("fileIn");

            Employee emp =(Employee) in.readObject();
            in.close();
            fileIn.close();

            System.out.println("Deserialized Object:");
            System.out.println("Name:"+emp.name);
            System.out.println("Age:"+emp.age);
        } catch(IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
        }
    }
