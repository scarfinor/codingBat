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
        System.out.println(mixStart("mix snacks"));
        System.out.println(startOz("bzoo"));
        System.out.println(intMax(1, 2, 3));
        System.out.println(close10(13, 7));
        System.out.println(in3050(30, 41));
        System.out.println(max1020(9, 11));
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

    public static boolean mixStart(String str) {
        if (str.length() < 3){
            return false;
        }

        String two = str.substring(1, 3);

        return two.equals("ix");
    }

    public static String startOz(String str) {
        String result = "";

        if (!str.isEmpty() && str.charAt(0)=='o') {
            result = result + str.charAt(0);
        }

        if (str.length() >= 2 && str.charAt(1)=='z') {
            result = result + str.charAt(1);
        }

        return result;
    }

    public static int intMax(int a, int b, int c) {
        if (a > b && a > c ) {
            return a;
        } else if (b > a && b > c) {
            return b;
        } else
            return c;
    }

    public static int close10(int a, int b) {
        int aDiff = Math.abs(a - 10);
        int bDiff = Math.abs(b - 10);

        if (aDiff < bDiff) {
            return a;
        }
        if (bDiff < aDiff) {
            return b;
        }
        return 0;
    }

    public static boolean in3050(int a, int b) {
        return a >= 30 && a <= 40 && b >= 30 && b <= 40 || a >= 40 && a <= 50 && b >= 40 && b <= 50;
    }

    public static int max1020(int a, int b) {
        if (a >= 10 && a <= 20 && a > b) {
            return a;
        }
        if (b >= 10 && b <= 20 && b > a) {
            return b;
        }
        if (a >= 10 && a <= 20 && a < b) {
            return a;
        }
        if (b >= 10 && b <= 20 && b < a) {
            return b;
        } else
            return 0;
    }

}