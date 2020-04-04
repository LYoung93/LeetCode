import java.util.Stack;

/**
 * @author liuyang
 * @date 2020/3/4 - 22:22
 */
public class Code01 {
    public static int calculate(String s) {

        s.replaceAll(" ","");
        int res = Integer.valueOf(s.substring(0,1));
//        int temp=0;
//        for (int i = 1; i < s.length(); i++) {
//            int a=0;
//            char c = s.charAt(i);
//            switch (c) {
//                case '*':
//                    Integer number1= Integer.valueOf(s.substring(i-1,i));
//                    Integer number2= Integer.valueOf(s.substring(i,i+1));
//                    a=number1*number2;
//                    break;
//                case '/':
//                    Integer number3= Integer.valueOf(s.substring(i-1,i));
//                    Integer number4= Integer.valueOf(s.substring(i,i+1));
//                    a=number3/number4;
//                    break;
//                default:
//                    break;
//            }
//        }
        return 0;
    }

    public static void main(String[] args) {
        calculate(" 1 + 2 ");
    }
}
