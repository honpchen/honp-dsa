package ink.honp.dsa.algorithm.binarysearch;

/**
 * 二分查找实现
 * @author jeff chen
 * @since 2023-10-24 23:59
 */
public class BinarySearch {


    /**
     * 二分查找基本版
     * @param data      待查找的升序数组
     * @param target    待查找目标值
     * @return 找到返回数组索引，否则返回 -1
     */
    public static int basicSearch(int[] data, int target) {
        int i = 0;                  // 设置指针和初始值
        int j = data.length - 1;
        while (i <= j) {
            int m = (i + j) / 2;
            if (target < data[m]) {         // 目标值在左边
                j = m -1;
            } else if (data[m] < target) {  // 目标值在右边
                i = m + 1;
            } else {
                return m;
            }
        }
        return -1;
    }
}
