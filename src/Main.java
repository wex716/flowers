import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Программа определяет порядок цветов ночью по прошествии количества дней");

        Scanner scanner = new Scanner(System.in);
        int day = scanner.nextInt();

        if (day % 3 == 0)
            System.out.println("Порядок цветов на  " + day + " день : GCV");
        else if (day % 3 == 1)
            System.out.println("Порядок цветов на  " + day + " день : VGC");
        else
            System.out.println("Порядок цветов на  " + day + " день : CVG");


    }
}