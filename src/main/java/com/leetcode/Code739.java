package com.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

/**
 * @author liuyang
 * @date 2020/4/6 - 14:55
 */
public class Code739 {
    public static int[] dailyTemperatures(int[] T) {
        if(T.length==1){
            return new int[]{0};
        }
        Stack<Integer> TStack=new Stack<>();
        int[] result=new int[T.length];
        for(int i=T.length-1;i>=0;i--){
            while(!TStack.isEmpty()&&T[i]>=T[TStack.peek()]){
                TStack.pop();
            }
            result[i]=TStack.isEmpty()?0:TStack.peek()-i;
            TStack.push(i);
        }
        return result;
/*        List<Integer> TList=new ArrayList<>();
        for(int i=0;i<T.length;i++){
            TList.add(T[i]);
        }
        List<Integer> resultList=new ArrayList<>();
        for(int i=0;i<TList.size();i++){
            Integer t=TList.get(i);
            int j=i+1;
            for(;j<TList.size();j++){
                if(TList.get(j)>t){
                    resultList.add(j-i);
                    break;
                }
            }
            if(j==TList.size()){
                resultList.add(0);
            }
        }
        int[] result=new int[resultList.size()];
        for(int i=0;i<resultList.size();i++){
            result[i]=resultList.get(i);
        }
        return result;*/
    }

    public static void main(String[] args) {
        int[] T=new int[]{73, 74, 75, 71, 69, 72, 76, 73};
        dailyTemperatures(T);
    }
}
