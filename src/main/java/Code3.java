/**
 * @author liuyang
 * @date 2020/3/7 - 17:32
 */
public class Code3 {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int length=nums1.length;
        int[] result=new int[length];
        for(int i=0;i<length;i++){
            int num=nums1[i];
            boolean postion=false;
            int j=0;
            for(;j<nums2.length;j++){
                if(num==nums2[j]){
                    postion=true;
                }
                if(postion&(num<nums2[j])){
                    result[i]=nums2[j];
                    break;
                }
            }
            if(j==nums2.length){
                if(!postion){
                    result[i]=-1;
                }else if(num>=nums2[nums2.length-1]){
                    result[i]=-1;
                }
            }
        }
        return result;
    }
}
