package com.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author liuyang
 * @date 2020/4/6 - 16:37
 */

public class Code373 {
    static public class SortResult implements Comparable{
        public List<Integer> res;

        public SortResult(List<Integer> res) {
            this.res = res;
        }

        @Override
        public int compareTo(Object o) {
            int sum=0;
            for(int i=0;i<res.size();i++){
                sum+=res.get(i);
            }
            SortResult s=(SortResult)o;
            int sum2=0;
            for(int i=0;i<s.res.size();i++){
                sum2+=s.res.get(i);
            }
            if(sum==sum2){
                return 0;
            }else if(sum<sum2){
                return -1;
            }else {
                return 1;
            }
        }
    }

    public static List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        List<List<Integer>> result = new ArrayList<>();
        List<SortResult> res=new ArrayList<>();
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                List<Integer> temp =new ArrayList<>();
                temp.add(nums1[i]);
                temp.add(nums2[j]);
                SortResult sortResult =new SortResult(temp);
                res.add(sortResult);
            }
        }
        List<SortResult> realRes=res.stream().sorted().collect(Collectors.toList());
        realRes.forEach(res2->{
            result.add(res2.res);
        });
        return result.size() < k ? result : result.subList(0, k);
    }

    public static void main(String[] args) {
        int[] nums1 = new int[]{1,1,2};
        int[] nums2 = new int[]{1,2,3};
        int k = 2;
        List<List<Integer>> result=kSmallestPairs(nums1,nums2,k);
        System.out.println(result);
    }
}
