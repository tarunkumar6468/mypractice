package puzz.course;

public class swichCheck {
    public static void main(String[] args) {
        int i = 0;
        for (foo('A'); foo('B') && (i < 2); foo('C')) {
            i++;
            foo('D');
        }
    }

    static boolean foo(char c) {
        System.out.print(c);
        return true;
    }
}

