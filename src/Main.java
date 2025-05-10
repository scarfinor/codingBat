//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println(startHi("hi there"));
        System.out.println(icyHot(120, -1));
        System.out.println(in1020(21, 21));
        System.out.println(hasTeen(13, 20, 10));
        System.out.println(loneTeen(99, 99));
        System.out.println(delDel("abc"));
    }

    public static boolean startHi(String str) {
        return str.startsWith("hi");
    }

    public static boolean icyHot(int temp1, int temp2) {
        return temp1 < 0 && temp2 > 100 || temp2 < 0 && temp1 > 100;
    }

    public static boolean in1020(int a, int b) {
        return a >= 10 && a <= 20 || b >= 10 && b <= 20;
    }

    public static boolean hasTeen(int a, int b, int c) {
        return a >= 13 && a <= 19 || b >= 13 && b <= 19 || c >= 13 && c <= 19;
    }

    public static boolean loneTeen(int a, int b) {
        return (a < 13 || a > 19 || b < 13 || b > 19) && (a <= 22 || b <= 22);
    }

    public static String delDel(String str) {
        if (str.startsWith("del", 1)) {
            return str.charAt(0) + str.substring(4);
        }
        return str;
    }

}