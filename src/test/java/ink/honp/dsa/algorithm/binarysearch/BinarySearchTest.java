package ink.honp.dsa.algorithm.binarysearch;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author jeff chen
 * @since 2023-10-25 0:09
 */
class BinarySearchTest {

    @Test
    @DisplayName("基本二分查找")
    void testBasicSearch() {
        final int data[] = {1,3,5,10,34,44,56,77,88,89,91,100,101,104};

        Assertions.assertEquals(0, BinarySearch.basicSearch(data, 1));
        Assertions.assertEquals(2, BinarySearch.basicSearch(data, 5));
        Assertions.assertEquals(4, BinarySearch.basicSearch(data, 34));
        Assertions.assertEquals(7, BinarySearch.basicSearch(data, 77));
        Assertions.assertEquals(9, BinarySearch.basicSearch(data, 89));
        Assertions.assertEquals(11, BinarySearch.basicSearch(data, 100));
        Assertions.assertEquals(13, BinarySearch.basicSearch(data, 104));
        Assertions.assertEquals(-1, BinarySearch.basicSearch(data, 105));
    }

    @Test
    @DisplayName("改动版本基本二分查找测试")
    void testAlternativeSearch() {
        final int data[] = {1,3,5,10,34,44,56,77,88,89,91,100,101,104};

        Assertions.assertEquals(0, BinarySearch.alternativeSearch(data, 1));
        Assertions.assertEquals(2, BinarySearch.alternativeSearch(data, 5));
        Assertions.assertEquals(4, BinarySearch.alternativeSearch(data, 34));
        Assertions.assertEquals(7, BinarySearch.alternativeSearch(data, 77));
        Assertions.assertEquals(9, BinarySearch.alternativeSearch(data, 89));
        Assertions.assertEquals(11, BinarySearch.alternativeSearch(data, 100));
        Assertions.assertEquals(13, BinarySearch.alternativeSearch(data, 104));
        Assertions.assertEquals(-1, BinarySearch.alternativeSearch(data, 105));
    }
}
