import java.io.*;

public class ApplicationToReadNumbersIntoWords {
    public static void main(String[] args) {
        CheckNumber(inputNumber());
    }

    private static int inputNumber() {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String sAge = null;
        try {
            sAge = bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        int nAge = Integer.parseInt(sAge);
        return nAge;
    }

    private static void CheckNumber(int number) {
        String s;
        switch (number) {
            case 1:
                s = "one";
                break;
            case 2:
                s = "two";
                break;
            case 3:
                s = "three";
                break;
            case 4:
                s = "four";
                break;
            case 5:
                s = "five";
                break;
            case 6:
                s = "six";
                break;
            case 7:
                s = "seven";
                break;
            case 8:
                s = "eight";
                break;
            case 9:
                s = "nine";
                break;
            default:
                s = "out of ability";
        }
        System.out.println(s);
    }
}