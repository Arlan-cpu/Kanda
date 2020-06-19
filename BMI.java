import java.util.Scanner;

public class BMI {

    public static void main(String[] args) {

        Scanner scanner = new Scanner( System.in );

        double userWeight;
        double userHeight;
        double BMI;

        System.out.println("Введите свой вес: ");
        userWeight = scanner.nextDouble();

        System.out.println("Введите свой рост: ");
        userHeight = scanner.nextDouble();

        BMI = (userWeight * 703) / (userHeight *userHeight);

        if(BMI < 18.5) {
            System.out.println("У вас нехватка веса");
        } else if (BMI < 26) {
            System.out.println("Ваш вес в норме");
        } else {
            System.out.println("У вас перевес");
        }
    }
}
