import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import TimeCalculation.*;

import java.util.LinkedList;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;


public class CollectionTest {
    Collection<Integer> collection = new Collection<>();
    ArrayList<Integer> arrayList = new ArrayList<>();
    LinkedList<Integer> linkedList = new LinkedList<>();
    @BeforeEach
    void startPozition(){
        for (int i = 0; i < 5; i++) {
            collection.myAdd(arrayList, i);
            collection.myAdd(linkedList, i);
        }
    }

    @Test
    void testMyAddForArrayList(){
        collection.myAdd(arrayList, 11);
        assertEquals(6, arrayList.size(), "Размерность должна быть 5");
        assertEquals(0,arrayList.get(0), "Первый элемент должен быть 0");
        assertEquals(11, arrayList.get(5), "Последний элемент должен быть 4");
    }

    @Test
    void testMyAddForLinkedList(){

        collection.myAdd(linkedList, 11);

        assertEquals(6, linkedList.size(), "Размерность должна быть 5");
        assertEquals(0,linkedList.get(0), "Первый элемент должен быть 0");
        assertEquals(11, linkedList.get(5), "Последний элемент должен быть 4");
    }

    @Test
    void testMyDeleteArrayList() {
        final int value = collection.mytGet(arrayList, 3);
        collection.myDelete(arrayList, 2);
        assertEquals(value, arrayList.get(2));
    }

    @Test
    void testMyDeleteLinkedList() {
        final int value = collection.mytGet(linkedList, 3);
        collection.myDelete(linkedList, 2);
        assertEquals(value, linkedList.get(2));
    }
}
