public class Warmup1 {
    public static void executeWamup1Problems() {
        System.out.println("Warmup-1\n");
        System.out.println("name: startHi\n" + "problem: Given a string, return true if the string starts with \"hi\" and false otherwise.\n" + "parameters: 'hi there'\n" + "answer: " +  startHi("hi there") + "\n");
        System.out.println("name: icyHot\n" + "problem: Given two temperatures, return true if one is less than 0 and the other is greater than 100.\n" + "parameters: 120, -1\n" + "answer: " + icyHot(120, -1) + "\n");
        System.out.println("name: in1020\n" + "problem: Given 2 int values, return true if either of them is in the range 10..20 inclusive.\n" + "parameters: 21, 21\n" +  "answer: " + in1020(21, 21) + "\n");
        System.out.println("name: hasTeen\n" + "problem: We'll say that a number is \"teen\" if it is in the range 13..19 inclusive. Given 3 int values, return true if 1 or more of them are teen.\n" + "parameters: 13, 20, 10\n" + "answer: " + hasTeen(13, 20, 10) + "\n");
        System.out.println("name: loneTeen\n" + "problem: We'll say that a number is \"teen\" if it is in the range 13..19 inclusive. Given 2 int values, return true if one or the other is teen, but not both.\n" + "parameters: 99, 99\n" + "answer: " + loneTeen(99, 99) + "\n");
        System.out.println("name: delDel\n" + "problem: Given a string, if the string \"del\" appears starting at index 1, return a string where that \"del\" has been deleted. Otherwise, return the string unchanged.\n" + "parameters: 'abc'\n" + "answer: " + delDel("abc") + "\n");
        System.out.println("name: mixStart\n" + "problem: Return true if the given string begins with \"mix\", except the 'm' can be anything, so \"pix\", \"9ix\" .. all count.\n" + "parameters: 'mix snacks'\n" + "answer: " + mixStart("mix snacks") + "\n");
        System.out.println("name: startOz\n" + "problem: Given a string, return a string made of the first 2 chars (if present), however include first char only if it is 'o' and include the second only if it is 'z', so \"ozymandias\" yields \"oz\".\n" + "parameters: 'bzoo'\n" + "answer: " + startOz("bzoo") + "\n");
        System.out.println("name: intMax\n" + "problem: Given three int values, a b c, return the largest.\n" + "parameters: 1, 2, 3\n" + "answer: " + intMax(1, 2, 3) + "\n");
        System.out.println("name: close10\n" + "problem: Given 2 int values, return whichever value is nearest to the value 10, or return 0 in the event of a tie. Note that Math.abs(n) returns the absolute value of a number.\n" + "parameters: 13, 7\n" + "answer: " + close10(13, 7) + "\n");
        System.out.println("name: in3050\n" + "problem: Given 2 int values, return true if they are both in the range 30..40 inclusive, or they are both in the range 40..50 inclusive.\n" + "parameters: 30, 41\n" + "answer: " + in3050(30, 41) + "\n");
        System.out.println("name: max1020\n" + "problem: Given 2 positive int values, return the larger value that is in the range 10..20 inclusive, or return 0 if neither is in that range.\n" + "parameters: 9, 11\n" + "answer: " + max1020(9, 11) + "\n");
        System.out.println("name: stringE\n" + "problem: Return true if the given string contains between 1 and 3 'e' chars.\n" + "parameters: 'Hello'\n" + "answer: " + stringE("Hello") + "\n");
        System.out.println("name: lastDigit\n" +  "problem: Given two non-negative int values, return true if they have the same last digit, such as with 27 and 57. Note that the % \"mod\" operator computes remainders, so 17 % 10 is 7.\n" + "parameters: 7, 17\n" + "answer: " + lastDigit(7, 17) + "\n");
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

    public static boolean stringE(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'e') count ++;
        }
        return (count >= 1 && count <= 3);
    }

    //temp still  working on this.
    public static boolean lastDigit(int a, int b) {
        return true;
    }

}
