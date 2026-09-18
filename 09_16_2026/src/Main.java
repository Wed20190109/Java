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


        System.out.println("b+c="+b+c);
        System.out.println(b+c+"=b+c"+b+c);
        /*
        虽然都是字符串拼接，但是两者全然不如，拼接判断类型从左到右直到出现字符
         */

        int f=4;
        double g=6;
        f+=g;//这样写不会报错
    }

    public static void main1(String[] args) {
        String str1="NM";
        String str2="$L";

        System.out.println(str1+str2);//字符串拼接


        /*
        在Java中，当参与运算数据类型不一致时，就会进行类型转换。Java中类型转换主要分为两类：自动类型转换(隐
        式) 和 强制类型转换(显式)。
        自动类型转换即：代码不需要经过任何处理，在代码编译时，编译器会自动进行处理。特点：数据范围小的转为数
        据范围大的时会自动进行。
         */
        int a = 10;
        long b = 20;
        //int c = a + b;    // 编译出错: a + b==》int + long--> long + long 赋值给int时会丢失数据
        long d = a + b;   // 编译成功：a + b==>int + long--->long + long 赋值给long



    }

    public static void main2(String[] args) {
        byte a = 10;
        byte b = 20;
        //byte c = a + b;
        //System.out.println(c);

// 编译报错: 不兼容的类型: 从int转换到byte可能会有损失
        //yte c = a + b;
/*
结论: byte 和 byte 都是相同类型, 但是出现编译报错. 原因是, 虽然 a 和 b 都是 byte, 但是计算 a + b 会先将 a
和 b 都提升成 int, 再进行计算, 得到的结果也是 int, 这是赋给 c, 就会出现上述错误.
由于计算机的 CPU 通常是按照 4 个字节为单位从内存中读写数据. 为了硬件上实现方便, 诸如 byte 和 short
这种低于 4 个字节的类型, 会先提升成 int, 再参与计算
 */
    }

    public static void main3(String[] args) {
        String s1 = "hello";
        String s2 = " world";
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1+s2);   // s1+s2表示：将s1和s2进行拼接

        /*
        int转String
         */
        int num = 10;
        // 方法1
        String str1 = num + "";
        // 方法2
        String str2 = String.valueOf(num);

        /*
        String转int
         */
        String str = "100";
        int num1 = Integer.parseInt(str);
    }
}