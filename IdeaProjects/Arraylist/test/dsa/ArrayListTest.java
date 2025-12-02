package dsa;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;



public class ArrayListTest {
    ArrayList arrayList;
    @BeforeEach
    void setUp() {
        arrayList = new ArrayList();
    }
    @Test
    public void testIsEmptyIsTrue() {
        assertTrue(arrayList.isEmpty());
    }


    @Test
    public void testAddToArrayList_isEmptyIsFalse() {
        arrayList.add("Emmax");
        assertFalse(arrayList.isEmpty());
    }
    @Test
    public void testAddXYToArrayList_isEmptyIsFalse() {
        arrayList.add("Emmax");
        arrayList.add("Emmax");
        assertFalse(arrayList.isEmpty());

    }

    @Test
    public void testAddToASpecifiedIndexInAnArrayList_isEmptyIsFalse() {
        arrayList.add(0,"Emmax");
        assertFalse(arrayList.isEmpty());
    }

    @Test
    public void testAddACollectionToArrayList_isEmptyIsFalse() {
        String[] array = {"Emmax","OreOfe"};
        arrayList.addAll(array);
        assertFalse(arrayList.isEmpty());
    }

   @Test
    public void testAddAcollectionToASpecifiedIndexInAnArrayList



}
