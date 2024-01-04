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
            //int m = (i + j) / 2;    // 数组过大会发生溢出，可以使用右移计算
            int m = (i + j) >>> 1;
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

    /**
     * 二分查找改动版本
     * @param data      待查找的升序数组
     * @param target    待查找目标值
     * @return 找到返回数组索引，否则返回 -1
     */
    public static int alternativeSearch(int[] data, int target) {
        int i = 0;                  // 设置指针和初始值
        int j = data.length;        // j 指向的是非查找目标
        while (i < j) {
            int m = (i + j) >>> 1;
            if (target < data[m]) {         // 目标值在左边
                j = m;
            } else if (data[m] < target) {  // 目标值在右边
                i = m + 1;
            } else {
                return m;
            }
        }
        return -1;
    }

    /**
     * 查询最左则的元素
     * @return 若有重复目标元素返回最左侧元素索引
     */
    public static int searchLeftmost(int[] data, int target) {
        int i = 0;                  // 设置指针和初始值
        int j = data.length - 1;
        int candidate = -1;
        while (i <= j) {
            //int m = (i + j) / 2;    // 数组过大会发生溢出，可以使用右移计算
            int m = (i + j) >>> 1;
            if (target < data[m]) {         // 目标值在左边
                j = m -1;
            } else if (data[m] < target) {  // 目标值在右边
                i = m + 1;
            } else {
                candidate = m;
                j = m - 1;
            }
        }
        return candidate;
    }


    /**
     * 改进版本：查询最左则的元素
     * @return 返回 ≥ target最靠左索引
     */
    public static int searchLeftmost2(int[] data, int target) {
        int i = 0;                  // 设置指针和初始值
        int j = data.length - 1;
        while (i <= j) {
            //int m = (i + j) / 2;    // 数组过大会发生溢出，可以使用右移计算
            int m = (i + j) >>> 1;
            if (target <= data[m]) {         // 目标值在左边
                j = m -1;
            } else {  // 目标值在右边
                i = m + 1;
            }
        }
        return i;
    }


    /**
     * 改进版本：查询最左则的元素
     * @return 返回 ≤ target最靠右索引
     */
    public static int searchRightmost2(int[] data, int target) {
        int i = 0;                  // 设置指针和初始值
        int j = data.length - 1;
        while (i <= j) {
            //int m = (i + j) / 2;    // 数组过大会发生溢出，可以使用右移计算
            int m = (i + j) >>> 1;
            if (target < data[m]) {         // 目标值在左边
                j = m - 1;
            } else {  // 目标值在右边
                i = m + 1;
            }
        }
        return i - 1;
    }
}
