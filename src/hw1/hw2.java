package hw1;

public class hw2 {

   
 
 public static void main(String[] args) {
        // 計算1~1000的偶數和
        int evenSum = 0;
        for (int i = 2; i <= 1000; i += 2) {
            evenSum += i;
        }
        System.out.println("1~1000的偶數和: " + evenSum);

        
        
        
        
        // 計算1~10的連乘積 (用for迴圈)
        int productFor = 1;
        for (int i = 1; i <= 10; i++) {
            productFor *= i;
        }
        System.out.println("1~10的連乘積 (用for迴圈): " + productFor);

       
        
        
        
        
        // 計算1~10的連乘積 (用while迴圈)
        int productWhile = 1;
        int j = 1;
        while (j <= 10) {
            productWhile *= j;
            j++;
        }
        System.out.println("1~10的連乘積 (用while迴圈): " + productWhile);

        
        
        
        
        
        // 輸出結果為1, 4, 9, 16, 25, 36, 49, 64, 81, 100
        for (int k = 1; k <= 10; k++) {
            System.out.print(k * k);
            if (k < 10) {
                System.out.print(" ");
            }
        }
        System.out.println();

        // 阿文可以選擇的數字 (不包含4)
        int count = 0;
        System.out.print("阿文可以選擇的數字有: ");
        for (int i = 1; i <= 49; i++) {
            if (!containsDigitFour(i)) {
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.println();
        System.out.println("總共有: " + count + "個數字");

        // 輸出指定的數字序列
        for (int i = 10; i >= 1; i--) {
            for (int l = 1; l <= i; l++) {
                System.out.print(l + " ");
            }
            System.out.println();
        }

       
        
        
        
        
       
        
        
        
        // 輸出指定的字母序列
        for (char c = 'A'; c <= 'F'; c++) {
            for (int m = 0; m < (c - 'A' + 1); m++) {
                System.out.print(c);
            }
            System.out.println();
        }
    }

    // 判斷數字是否包含4
    public static boolean containsDigitFour(int number) {
        String strNumber = String.valueOf(number);
        return strNumber.contains("4");
    }
}


