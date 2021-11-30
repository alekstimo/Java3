import java.util.*;
public class main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter iterations: ");
        int ITERATIONS= sc.nextInt();
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        System.out.println("========ADD========");
        System.out.println("Add elements " +ITERATIONS);
        System.out.println("----------------------------------------");
        System.out.println("test add in linkedList | " + Time.timeAddToCollection(linkedList, ITERATIONS) + " ns");
        System.out.println("----------------------------------------");
        System.out.println("test add in arrayList  | " + Time.timeAddToCollection(arrayList, ITERATIONS) + " ns");
        System.out.println("----------------------------------------");


        System.out.println("========GET========");
        System.out.println("Get elements " +ITERATIONS);
        System.out.println("----------------------------------------");
        System.out.println("test  get from linkedList | " + Time.timeGetFromCollection(linkedList, ITERATIONS) + " ns");
        System.out.println("----------------------------------------");
        System.out.println("test get from arrayList  | " + Time.timeGetFromCollection(arrayList, ITERATIONS) + " ns");
        System.out.println("----------------------------------------");


        System.out.println("========DELETE========");
        System.out.println("Delete elements " +ITERATIONS);
        System.out.println("----------------------------------------");
        System.out.println("test delete from linkedList | " + Time.timeDeleteFromCollection(linkedList, ITERATIONS) + " ns");
        System.out.println("----------------------------------------");
        System.out.println("test delete from arrayList  | " + Time.timeDeleteFromCollection(arrayList, ITERATIONS) + " ns");
        System.out.println("----------------------------------------");


    }
}
