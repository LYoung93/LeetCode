package com.leetcode;

/**
 * @author liuyang
 * @date 2020/4/8 - 0:04
 */
public class Code0107 {
    public static void rotate(int[][] matrix) {
        int N = matrix.length;
        //左上角--右下角 为对称轴，进行翻转
        for (int i = 0; i < N; i++) {
            for (int j = i+1; j < N; j++) {
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        System.out.println(matrix);

        //中轴线进行翻转
        for(int i=0;i<N;i++){
            for(int j=0;j<N/2;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[i][N-j-1];
                matrix[i][N-j-1]=temp;
            }
        }
        System.out.println(matrix);
    }

    public static void main(String[] args) {
        int[][] matrix=new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        System.out.println(matrix);
        rotate(matrix);
    }
}
