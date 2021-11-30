import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestTime {
    @Test
    public void TestTimeAddToCollection(){
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
        long timeArray = Time.timeAddToCollection(arrayList,2000);
        long timeLinked = Time.timeAddToCollection(linkedList,2000);
        if(timeArray<timeLinked)
            timeLinked=timeArray;
        assertEquals(timeArray, timeLinked);
    }

    @Test
    public void TestTimeGetFromCollection(){
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
        Time.timeAddToCollection(arrayList,2000);
        Time.timeAddToCollection(linkedList,2000);
        long timeArray = Time.timeGetFromCollection(arrayList,2000);
        long timeLinked = Time.timeGetFromCollection(linkedList,2000);
        if(timeArray<timeLinked)
            timeLinked=timeArray;
        assertEquals(timeArray, timeLinked);
    }

    @Test
    public void TestTimeDeleteFromCollection(){
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
        Time.timeAddToCollection(arrayList,2000);
        Time.timeAddToCollection(linkedList,2000);
        long timeArray = Time.timeDeleteFromCollection(arrayList,2000);
        long timeLinked = Time.timeDeleteFromCollection(linkedList,2000);
        if(timeArray<timeLinked)
            timeLinked=timeArray;
        assertEquals(timeArray, timeLinked);
    }
}
