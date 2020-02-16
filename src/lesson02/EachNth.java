package lesson02;

// завдання не зроблене до кінця, не можу зрозуміти, як заповнити масив після циклу for
public class EachNth {

    public static void main(String[] args) {
EachNth each = new EachNth();
        System.out.println(each.eachNth(3, "abcdefg"));
    }
    String eachNth(int n, String... str){
        for(int i = 0; i < str.length; i++) {  //перебираю всі символи строки по індексу
            // намагаюсь пропустити ті символи, де індекс не кратний n
            if (i % n != 0) {
                continue;
            }
                str[i] = str[i]; // розумію, що тут має бути щось інше, але не можу збагнути, як масив заповнити новими значеннями :(
            }
        return String.valueOf(str);
    }
}
