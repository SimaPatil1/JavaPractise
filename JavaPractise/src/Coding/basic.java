package Coding;

public class basic {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String name = "Tork kratos";
        int n = calculateLengthWithoutSpaces(name);
        System.out.println(n);
    }

    private static int calculateLengthWithoutSpaces(String str) {
        int length = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                length++;
            }
        }
        return length;
    }
}
