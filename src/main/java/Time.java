import java.util.Collection;
import java.util.List;

public class Time {
    /**
     * this function adds items to the collection
     * @param collection denotes the selected collection from the List
     * @param ITERATIONS denotes the number of performed operations
     * @return the time spent on the operation
     */
    public static long timeAddToCollection(Collection<Integer> collection, int ITERATIONS){
        long startTime = System.nanoTime();

        for ( int i=0; i<ITERATIONS; i++){
            collection.add(i);
        }
        long endTime = System.nanoTime();
        return endTime - startTime;

    }
    /**
     * this function takes items into the collection
     * @param collection denotes the selected collection from the List
     * @param ITERATIONS denotes the number of performed operations
     * @return the time spent on the operation
     */
    public static long timeGetFromCollection(List<Integer> collection, int ITERATIONS){
        long startTime = System.nanoTime();

        for ( int i=0; i<ITERATIONS; i++){
            collection.get(i);
        }
        long endTime = System.nanoTime();
        return endTime - startTime;

    }
    /**
     * this function removes items from the collection
     * @param collection denotes the selected collection from the List
     * @param ITERATIONS denotes the number of performed operations
     * @return the time spent on the operation
     */
    public static long timeDeleteFromCollection(List<Integer> collection, int ITERATIONS){


        long startTime = System.nanoTime();

        for ( int i=ITERATIONS-1; i>0; i--){
            collection.remove(i);
        }
        long endTime = System.nanoTime();
        return endTime - startTime;

    }
}
