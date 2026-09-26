import java.util.Scanner;
import java.util.Random;



/*
2.1 什么是方法(method)
方法就是一个代码片段. 类似于 C 语言中的 "函数"。方法存在的意义(不要背, 重在体会):
1. 是能够模块化的组织代码(当代码规模比较复杂的时候).
2. 做到代码被重复使用, 一份代码可以在多个位置使用.
3. 让代码更好理解更简单.
4. 直接调用现有方法开发, 不必重复造轮子.
 */

//方法语法格式
/*
方法定义
修饰符 返回值类型 方法名称([参数类型 形参 ...]){
方法体代码;
[return 返回值];
}
 */

//TIP 要<b>运行</b>代码，请按 <shortcut actionId="Run"/> 或
// 点击装订区域中的 <icon src="AllIcons.Actions.Execute"/> 图标。
public class Main {
    public static void main(String[] args) {
        Random random=new Random();
        Scanner input=new Scanner(System.in);
        int target= random.nextInt(100)+1;
        System.out.println("我已经设好了一个1到100的数字");
        while(true){
            System.out.println("Please input the number you guess");
            if (!input.hasNextInt()) {
                System.out.println("请输入一个整数！");
                input.next(); // 清空错误输入
                continue;
            }
            int num= input.nextInt();
            if(num<target) {
                System.out.println("itssmller");
            } else if (num>target) {
                System.out.println("its bigger");
            }
            else {
                System.out.println("right");
                break;
            }


        }
        input.close();
    }
    public static void main2(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNextInt()){
        int n=scanner.nextInt();
        System.out.println();
        }
    }

    public static void main1(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("请输入字符串");
        String str=scan.next();
        System.out.println(str);
        scan.nextLine();//不加这行的话，下面那句会把回车键读进去导致出现空行
        System.out.println("请输入字符串");
        String str2=scan.nextLine();
        System.out.println(str2);
        System.out.println("请输入整数");
        int a=scan.nextInt();
        System.out.println(a);
    }
}