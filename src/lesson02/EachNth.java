package lesson02;

public class EachNth {


    public static void main(String[] args) {
        EachNth each = new EachNth();
        System.out.println(each.eachNth("abcdefg", 3));
    }

    String eachNth(String str, int n) {
        char[] chars = str.toCharArray();
        char[] chars1 = new char[chars.length];

        if (n < 1)  // to avoid deviding to 0
            System.out.println("Please use positive numbers");
        else {

            for (int i = 0; i < chars.length; i++) {
                if (i % n != 0)
                    continue;
                chars1[i] = chars[i];
            }
        }
            return String.valueOf(chars1);
        }
}