package git.test;

import java.util.Scanner;

/**
 * User: $何郑彬
 * Date: 2021/7/22 16:11
 * Description:$杨辉三角
 */
public class PascalsTriangle {
    public static void main(String[] args) {
        System.out.print("请输入杨辉三角的行数：");
        Scanner input=new Scanner(System.in);
        int lineNumber = input.nextInt();
//        System.out.println(lineNumber);
        System.out.println(1);
        int[] oldarr = {1};
        for (int n = 1; n <lineNumber; n++){
            int[] newarr = new int[n+1];
            for (int i = 1; i <= n+1; i++){
                if (i==1 || i==n+1){
                    newarr[i-1] = 1;
                }
                else {
                    newarr[i-1] = oldarr[i-1-1]+oldarr[i-1];
                }
                System.out.print(newarr[i-1]+"\t");

            }
            oldarr = newarr;
            System.out.println();
        }
    }

}
