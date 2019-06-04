import java.util.Scanner;

public class ApplicationToReadNumbersIntoWords {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Number to read is ");
        int number = scanner.nextInt();

        String s;
        if (number > 0 && number < 10) {
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

        if (number > 10 && number < 20) {
            int ones = number - 10;
            switch (ones) {
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
            System.out.println(s + "teen");
        }
    }
}