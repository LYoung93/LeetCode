/**
 * @author liuyang
 * @date 2020/3/15 - 20:57
 */
// 70.爬楼梯
//    dp[n]=dp[n-1]+dp[n-2]
public class Code06 {
    public int climbStairs(int n) {
        if(n<2){
            return 1;
        }
        int[] sum=new int[n+1];
        sum[1]=1;
        sum[2]=2;
        for(int i=3;i<=n;i++){
            sum[i]=sum[i-1]+sum[i-2];
        }
        return sum[n];
    }
}
