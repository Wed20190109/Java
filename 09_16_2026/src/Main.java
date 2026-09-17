import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        System.out.println("10");
        int a=114514;
        long a1=100L;

        System.out.println(a);
        a1=a;
        //a=a1;
        //int大小为4位而long为8位，大位赋值给小位会有精度损失甚至出现错误结果

        //key word:final

        /*
        整形长整型最值
         */
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);;
        System.out.println(Long.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);


        double b=1.0;
        double c=2.0;
        float e=12.6F;//不加f会视为double赋值类型会出错
        System.out.println(b/c);
        System.out.println("e="+e);//字符串拼接

        boolean d=true;
        //没有明确说明Boolean是多少字节
        //Boolean类型只有两个值：true和false ，
        System.out.println(d);

    }

    public static void main1(String[] args) {
        String str1="NM";
        String str2="$L";

        System.out.println(str1+str2);//字符串拼接

    }
}