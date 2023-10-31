import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        Muchina [] muchina = new Muchina[3];
        Nout [] nout = new Nout[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("Введи имя ");
            muchina[i] = new Muchina(scanner.nextLine());
            System.out.println("веди имена для телефон и модел");
            nout[i] = new Nout(scanner.nextLine(),random.nextInt(1,20));
        }
        for (Muchina a:muchina ) {
            System.out.println(a);
        }
        for (Nout a:nout) {
            System.out.println(a);
        }
    }
    }
