import java.util.Scanner;

//TIP 要<b>运行</b>代码，请按 <shortcut actionId="Run"/> 或
// 点击装订区域中的 <icon src="AllIcons.Actions.Execute"/> 图标。
public class Main {
    public static void main2(String[] args) {
        Scanner scanner=new Scanner(System.in);
while (scanner.hasNextInt()){
    int n=scanner.nextInt();
    System.out.println();
}
    }

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("请输入字符串");
        String str=scan.next();
        System.out.println(str);
        scan.nextLine();//不加这行的话，下面那句会把回车键读进去导致出现空行
        String str2=scan.nextLine();
        System.out.println(str2);

        int a=scan.nextInt();
        System.out.println(a);



    }
}