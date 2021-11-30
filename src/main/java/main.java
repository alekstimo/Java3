import java.util.*;
import java.io.*;
public class main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter iterations: ");
        int ITERATIONS= sc.nextInt();
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        System.out.println("********ADD********");
        System.out.println("Add " +ITERATIONS + " elements");
        System.out.println("----------------------------------------");
        System.out.println("time to add in linkedList | " + Time.timeAddToCollection(linkedList, ITERATIONS) + " ns");
        System.out.println("----------------------------------------");
        System.out.println("time to add in arrayList  | " + Time.timeAddToCollection(arrayList, ITERATIONS) + " ns");
        System.out.println("----------------------------------------");


        System.out.println("********GET********");
        System.out.println("Get " +ITERATIONS + " elements");
        System.out.println("----------------------------------------");
        System.out.println("time to  get from linkedList | " + Time.timeGetFromCollection(linkedList, ITERATIONS) + " ns");
        System.out.println("----------------------------------------");
        System.out.println("time to get from arrayList  | " + Time.timeGetFromCollection(arrayList, ITERATIONS) + " ns");
        System.out.println("----------------------------------------");


        System.out.println("********DELETE********");
        System.out.println("Delete " +ITERATIONS + " elements");
        System.out.println("----------------------------------------");
        System.out.println("time to delete from linkedList | " + Time.timeDeleteFromCollection(linkedList, ITERATIONS) + " ns");
        System.out.println("----------------------------------------");
        System.out.println("time to delete from arrayList  | " + Time.timeDeleteFromCollection(arrayList, ITERATIONS) + " ns");
        System.out.println("----------------------------------------");
        try(FileWriter writer = new FileWriter("data.txt", true))
        {
            writer.write("Method   |   Iterations   |   Time   ");
            writer.append('\n');
            writer.write("Add      |" + ITERATIONS +"           |"+  Time.timeAddToCollection(linkedList, ITERATIONS)+'\n');
            writer.write("Add      |" + ITERATIONS +"           |"+  Time.timeAddToCollection(arrayList, ITERATIONS)+'\n');
            writer.write("Get      |" + ITERATIONS +"           |" + Time.timeGetFromCollection(linkedList, ITERATIONS)+'\n');
            writer.write("Get      |" + ITERATIONS +"           |" + Time.timeGetFromCollection(arrayList, ITERATIONS)+'\n');
            writer.write("Delete   |" + ITERATIONS +"           |" + Time.timeDeleteFromCollection(linkedList, ITERATIONS)+'\n');
            writer.write("Delete   |" + ITERATIONS +"           |"+  Time.timeDeleteFromCollection(arrayList, ITERATIONS)+'\n');
            writer.flush();
            writer.close();
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }

    }
}
