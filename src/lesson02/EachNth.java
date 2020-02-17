package lesson02;

public class EachNth {

    public static void main(String[] args) {

        EachNth each = new EachNth();
        System.out.println(each.eachNth("abcdefg", 3));
    }

    String eachNth(String str, int n) {
        char[] chars = str.toCharArray();
        char[] chats1 = chars.clone();
        for (int i = 0; i < chars.length; i++) {
            if (i % n != 0)
                continue;
            System.out.println(chars[i]);
            //????????
        }
            return String.valueOf(chars);

    }
}
