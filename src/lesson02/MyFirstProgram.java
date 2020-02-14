package lesson02;

public class MyFirstProgram {

    public static void main(String[] args) {
        MyFirstProgram mfc = new MyFirstProgram();
        String str = mfc.makeUpperCase("Have a great Weekend!");

        for (String retval : str.split(" ")) {
            System.out.println(retval);
        }
    }
        String makeUpperCase (String string){
            string = string.toUpperCase();
            return string;
        }
    }

