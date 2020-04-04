import java.util.ArrayList;
import java.util.List;

/**
 * @author liuyang
 * @date 2020/3/7 - 18:04
 */
public class Code05 {
    public int[] divingBoard(int shorter, int longer, int k) {
     int[] Out=new int[k+1];
        if (k == 0) {
            return new int[0];
        }
        if(shorter==longer){
            return new int[]{shorter*k};
        }
            for (int i = 0; i < (k + 1); i++) {
                int all = shorter * (k - i) + longer * i;
                Out[i] = all;
            }
        return Out;
    }
}
