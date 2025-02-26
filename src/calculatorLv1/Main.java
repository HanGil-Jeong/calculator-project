package calculatorLv1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        System.out.print("숫자를 입력하세요: ");
        int number1 = scanner.nextInt();
        System.out.println(number1);

        System.out.print("+, -, X, % 중 선택하세요: ");
        String inputStr = scanner.next();

        System.out.println(number1 + inputStr);

        System.out.print("숫자를 입력하세요: ");
        int number2 = scanner.nextInt();

        if (inputStr.equals("+")) {
            int sum = number1 + number2;
            System.out.println(number1 + inputStr + number2 + "=" + sum);
        } else if (inputStr.equals("-")) {
            int sub = number1 - number2;
            System.out.println(number1 + inputStr + number2 + "=" + sub);
        } else if (inputStr.equals("X")) {
            int mul = number1 * number2;
            System.out.println(number1 + inputStr + number2 + "=" + mul);
        } else if (inputStr.equals("%")) {
            int div = number1 / number2;
            System.out.println(number1 + inputStr + number2 + "=" + div);
        } else {
            System.out.println("잘못 누르셨습니다.");
        }


    }
}
