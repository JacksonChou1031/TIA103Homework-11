package hw1;

public class hw2ninenine {
	    
		 public static void main(String[] args) {
		        // 一: 使用 for 迴圈 + while 迴圈
		        System.out.println("使用 for 迴圈 + while 迴圈");
		        for (int i = 1; i <= 9; i++) {
		            int j = 1;
		            while (j <= 9) {
		                System.out.print(i + " * " + j + " = " + (i * j) + "\t");
		                j++;
		            }
		            System.out.println();
		        }
		        System.out.println();

		       
		        
		        
		        // 二: 使用 for 迴圈 + do while 迴圈
		        System.out.println("使用 for 迴圈 + do while 迴圈");
		        for (int i = 1; i <= 9; i++) {
		            int j = 1;
		            do {
		                System.out.print(i + " * " + j + " = " + (i * j) + "\t");
		                j++;
		            } while (j <= 9);
		            System.out.println();
		        }
		        System.out.println();

		        
		        
		        
		        // 三: 使用 while 迴圈 + do while 迴圈
		        System.out.println("使用 while 迴圈 + do while 迴圈");
		        int i = 1;
		        while (i <= 9) {
		            int j = 1;
		            do {
		                System.out.print(i + " * " + j + " = " + (i * j) + "\t");
		                j++;
		            } while (j <= 9);
		            System.out.println();
		            i++;
		        }
		    }
		}

