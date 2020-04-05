package com.leetcode;

/**
 * @author liuyang
 * @date 2020/4/4 - 23:00
 */

import java.util.*;

/*****
 * 给你一个整数 n 。请你先求出从 1 到 n 的每个整数 10 进制表示下的数位和（每一位上的数字相加），然后把数位和相等的数字放到同一个组中。
 *请你统计每个组中的数字数目，并返回数字数目并列最多的组有多少个
 *
 * 输入：n = 13
 * 输出：4
 * 解释：总共有 9 个组，将 1 到 13 按数位求和后这些组分别是：
 * [1,10]，[2,11]，[3,12]，[4,13]，[5]，[6]，[7]，[8]，[9]。总共有 4 个组拥有的数字并列最多。
 */
public class Code5360 {
    public static int countLargestGroup(int n) {
        Map<Integer, List<Integer>> result=new HashMap<Integer, List<Integer>>();
        for(int i =1;i<=n;i++){
            Integer a=0;
            Integer temp=i;
            while(temp>0){
                a+=temp%10;
                temp=temp/10;
            }
            a+=temp%10;
            List<Integer> list=result.get(a);
            if(list==null||list.isEmpty()){
                list=new ArrayList<>();
                list.add(i);
            }else {
                list.add(i);
            }
            result.put(a,list);
        }

        List<Integer> countList=new ArrayList<Integer>();
        result.forEach((k,v)-> countList.add(v.size()));
        Optional<Integer> count=countList.stream().max(Integer::compareTo);
        long res=countList.stream().filter(c-> {Integer cc=count.get();
        return cc.equals(c);
        }).count();
        return (int)res;
    }

    public static void main(String[] args) {
        int n=countLargestGroup(174);
        System.out.println(n);
    }
}
