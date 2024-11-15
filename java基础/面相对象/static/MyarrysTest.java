package com.eleven;

public class MyarrysTest {
    public static void main(String[] args) {
        int[] arry = new int[]{10,30,90,78,68,54};
        System.out.println("最大值为："+Myarrys.getMax(arry));
        System.out.println("最小值为："+Myarrys.getMin(arry));
        System.out.println("总和为："+Myarrys.getSum(arry));
        System.out.println("平均值为："+Myarrys.getAverage(arry));
        Myarrys.print(arry);
        Myarrys.reserve(arry);
        Myarrys.print(arry);

        Myarrys.sortReverse(arry);
        Myarrys.print(arry);
        System.out.println(Myarrys.lineSearch(arry,54));
        int[] arr = Myarrys.copy(arry);
        Myarrys.print(arr);
        Myarrys.print(arry);
        Myarrys.sort(arry,"asc");
        Myarrys.print(arry);
    }
}
