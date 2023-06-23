package test;

import org.junit.Before;
import org.junit.Test;
import main.BonusBinarySearch;
import org.junit.Assert;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class BonusBinarySearchTest {

    private int [] testSortedList1 = {1,2,3,4,5,6,7,8,9};

    @Test
    public void missingNumberReturnsNegativeOne() {
        int result = BonusBinarySearch.binarySearch(testSortedList1, 0);
        assertEquals(-1, result);
    }
    @Test
    public void missingNumberReturnsNegativeOne2() {
        int result = BonusBinarySearch.binarySearch(testSortedList1, 10);
        assertEquals(-1, result);
    }
    @Test
    public void foundNumberReturnsCorrectIndex() {
        int result = BonusBinarySearch.binarySearch(testSortedList1, 1);
        assertEquals(0, result);
    }
}
