package git.test;

import java.util.Scanner;

/**
 * User: $何郑彬
 * Date: 2021/7/22 17:32
 * Description:$矩阵对角线之和
 */
public class Matrix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入矩阵的行数");
        int lineNumber = input.nextInt();
        int[][] array = new int[lineNumber][lineNumber];
        for (int n = 0;n<lineNumber;n++){
            for (int m=0 ;m<lineNumber;m++){
                array[n][m] = m+lineNumber*n;
            }
        }
        int sum = 0;
        for (int i = 0;i<lineNumber;i++){
            sum += array[i][i];
        }
        System.out.println(sum);
    }
}
