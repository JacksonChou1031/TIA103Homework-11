package hw1;

public class hw1 {
	
    public static void main(String[] args) {
        // 計算12和6的和與積
        int num1 = 12;
        int num2 = 6;
        int sum = num1 + num2;
        int product = num1 * num2;
        System.out.println("12和6的和: " + sum);
        System.out.println("12和6的積: " + product);

        // 計算200顆蛋共是幾打幾顆
        int eggs = 200;
        int dozen = eggs / 12;
        int remainderEggs = eggs % 12;
        System.out.println("200顆蛋是" + dozen + "打" + remainderEggs + "顆");

        // 計算256559秒為多少天、多少小時、多少分與多少秒
        int totalSeconds = 256559;
        int days = totalSeconds / 86400;
        int hours = (totalSeconds % 86400) / 3600;
        int minutes = (totalSeconds % 3600) / 60;
        int seconds = totalSeconds % 60;
        System.out.println("256559秒為" + days + "天" + hours + "小時" + minutes + "分" + seconds + "秒");

        // 計算半徑為5的圓面積與圓周長
        final double PI = 3.1415;
        int radius = 5;
        double area = PI * radius * radius;
        double circumference = 2 * PI * radius;
        System.out.println("半徑為5的圓面積: " + area);
        System.out.println("半徑為5的圓周長: " + circumference);

        // 計算銀行存款的複利
        double principal = 1500000;
        double rate = 0.02;
        int years = 10;
        double amount = principal * Math.pow((1 + rate), years);
        System.out.println("10年後本金加利息共有: " + amount + "元");

        // 印出三個運算式結果
        System.out.println(5 + 5); // 結果為10，因為是數字相加
        System.out.println(5 + '5'); // 結果為58，因為字符'5'的ASCII碼為53，數字5加上53得到58
        System.out.println(5 + "5"); // 結果為"55"，因為數字5與字符串"5"進行字串連接
    }


}
