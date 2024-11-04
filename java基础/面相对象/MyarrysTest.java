package com.three;

/**
 * ClassName:MyarrysTest
 * Package:com.three
 * Description:
 *
 * @Author mzy
 * @Create 2024/11/4 21:33
 * @Version 1.0
 */
public class MyarrysTest {
    public static void main(String[] args) {
        int[] arry = new int[]{10,30,90,78,68,54};
        Myarrys myarrys = new Myarrys();
        System.out.println("最大值为："+myarrys.getMax(arry));
        System.out.println("最小值为："+myarrys.getMin(arry));
        System.out.println("总和为："+myarrys.getSum(arry));
        System.out.println("平均值为："+myarrys.getAverage(arry));
        myarrys.print(arry);
        myarrys.reserve(arry);
        myarrys.print(arry);
        myarrys.sort(arry);
        myarrys.print(arry);
        myarrys.sortReverse(arry);
        myarrys.print(arry);
        System.out.println(myarrys.lineSearch(arry,54));
        int[] arr = myarrys.copy(arry);
        myarrys.print(arr);
        myarrys.print(arry);
    }
}
