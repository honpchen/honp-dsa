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
        int min = 0;                  // 设置指针和初始值
        int max = data.length - 1;
        while (min <= max) {
            //int m = (min + max) / 2;    // 数组过大会发生溢出，可以使用右移计算
            int m = (min + max) >>> 1;
            if (target < data[m]) {         // 目标值在左边
                max = m -1;
            } else if (data[m] < target) {  // 目标值在右边
                min = m + 1;
            } else {
                return m;
            }
        }
        return -1;
    }

    /**
     * 二分查找改动版本
     * @param data      待查找的升序数组
     * @param target    待查找目标值
     * @return 找到返回数组索引，否则返回 -1
     */
    public static int alternativeSearch(int[] data, int target) {
        int min = 0;                  // 设置指针和初始值
        int max = data.length;        // max 指向的是非查找目标
        while (min < max) {
            int m = (min + max) >>> 1;
            if (target < data[m]) {         // 目标值在左边
                max = m;
            } else if (data[m] < target) {  // 目标值在右边
                min = m + 1;
            } else {
                return m;
            }
        }
        return -1;
    }
}
