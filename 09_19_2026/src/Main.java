public class Main {
    public static void main(String[] args) {

    }
    public static void main6(String[] args) {
        /*
        移位运算；<< >> >>>
        */
    }
    public static void main5(String[] args) {
        /*
        位运算符:主要有四个(& | ~ ^)
        按位与 &: 如果两个二进制位都是 1, 则结果为 1, 否则结果为 0.
        按位或 |: 如果两个二进制位都是 0, 则结果为 0, 否则结果为 1
        按位取反 ~: 如果该位为 0 则转为 1, 如果该位为 1 则转为 0
        按位异或 ^: 如果两个数字的二进制位相同, 则结果为 0, 相异则结果为 1
         */
        //& 和 | 如果表达式结果为 boolean 时, 也表示逻辑运算. 但与 && || 相比, 它们不支持短路求值
        //拿main4的例子看，全然不通
        System.out.println(10 > 20 & 10 / 0 == 0);             // 打印 false
        System.out.println(10 < 20 | 10 / 0 == 0);
    }
    public static void main4(String[] args) {
    /*
    逻辑运算符:(&& || !)
    */
        //短路求值:&& 和 || 遵守短路求值
        System.out.println(10 > 20 && 10 / 0 == 0);             // 打印 false
        System.out.println(10 < 20 || 10 / 0 == 0);             // 打印 true
        //看起来没出错是因为这两个逻辑运算符只看第一个判断，后面全然不管即使语法有误，并没有求值
    }
    public static void main3(String[] args) {
        /*
        关系运算符:(== != < > <= >=)
         */
    }
    public static void main2(String[] args) {
        /*
        增量运算符:(+= -= *= %=)
         */

    }
    public static void main1(String[] args) {
       /*
      算数运算符：(+ - * / %)
        */
    }
}