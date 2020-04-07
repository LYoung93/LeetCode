package com.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author liuyang
 * @date 2020/4/6 - 22:57
 */
public class Code721 {
    public static List<List<String>> accountsMerge(List<List<String>> accounts) {
        List<List<String>> result = new ArrayList<>();
        result.add(accounts.get(0));
        for (int i = 1; i < accounts.size(); i++) {
            List<String> tempAccount = accounts.get(i);

            List<List<String>> filteredList=new ArrayList<>();
            filteredList= result.stream().filter(res -> {
                if (res.get(0).equals(tempAccount.get(0))) {
                    return true;
                } else {
                    return false;
                }
            }).collect(Collectors.toList());

            boolean contion=false;


/*            List<List<String>> finalResult = result;
            result= result.stream().filter(res -> {
                if (res.get(0).equals(tempAccount.get(0))) {
                    return true;
                } else {
                    return false;
                }
            }).peek(res -> {
                boolean contion=false;
                for(int n=1;n<tempAccount.size();n++){
                    if(res.contains(tempAccount.get(n))){
                        contion=true;
                        break;
                    }
                }
                if(contion){
                    tempAccount.forEach(t->{
                        if(!res.contains(t)){
                            res.add(t);
                        }
                    });
                }else{
                    finalResult.add(tempAccount);
                }
            }).collect(Collectors.toList());*/
        }
        return result;
    }

    public static void main(String[] args) {
        List<List<String>> accounts =new ArrayList<>();
        List<String> a=new ArrayList<>();
        a.add("John");
        a.add("johnsmith@mail.com");
        a.add("john00@mail.com");

        List<String> b=new ArrayList<>();
        b.add("John");
        b.add("johnnybravo@mail.com");

        List<String> c=new ArrayList<>();
        c.add("John");
        c.add("johnsmith@mail.com");
        c.add("john_newyork@mail.com");

        List<String> d=new ArrayList<>();
        d.add("Mary");
        d.add("mary@mail.com");

        accounts.add(a);
        accounts.add(b);
        accounts.add(c);
        accounts.add(d);

        accountsMerge(accounts);
    }
}
