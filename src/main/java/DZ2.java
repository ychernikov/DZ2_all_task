import java.util.Scanner;

/**
 * Created by admin on 2/8/2018.
 */

public class DZ2 {
    /**
    Тоже самое по поводу printf, не нужно использовать конкатенацию
    посмотри урок и почитай доку
    **/
    public static void main(String[] args) {
        System.out.printf("Vvedite индекс числа фибоначчи: %n");
        Scanner console = new Scanner(System.in);
        int p = console.nextInt();
        System.out.printf("Числo фибоначчи c индексom %d = %s", p, fibon(p));
    }

    /**
    Много повторяемого кода 
    Нужно декомпозировать задачу и винести повторяющийся код в статические методы
    **/
    public static void task1() {
        int max_str;
        System.out.println("Vvedite Im9 %n");
        Scanner console = new Scanner(System.in);
        String im9 = console.nextLine();
        System.out.printf("%nVvedite Familiu %n");
        String fam = console.nextLine();
        System.out.printf("%nVvedite Otchestvo %n");
        String otch = console.nextLine();
        String all_str = im9 + fam + otch;//Concatenacia stroki FIO
        int dlina_FIO = all_str.length(); //Dlinna FIO
        if (dlina_FIO + 2 > 15) {
            max_str = dlina_FIO + 4;
            for (int i = 0; i < max_str + 2; i++) {
                System.out.printf("*");
            }
            int str2 = dlina_FIO + 2 - 15;
            System.out.printf("%n* Курс: Java core");
            for (int i = 0; str2 > i; i++) {
                System.out.printf(" ");
            }
            System.out.printf(" *");
            int str3 = dlina_FIO + 2 - 7;
            System.out.printf("%n* Студент");
            for (int i = 0; str3 > i; i++) {
                System.out.printf(" ");
            }
            System.out.printf(" *");
            System.out.printf("%n* %s %s %s *%n", im9, fam, otch);
            for (int i = 0; i < max_str + 2; i++) {
                System.out.printf("*");
            }
        } else {
            max_str = 19;
            for (int i = 0; i < max_str; i++) {
                System.out.printf("*");
            }
            System.out.printf("%n* Курс: Java core *%n");
            System.out.printf("* Студент         *");
            System.out.printf("%n* %s %s %s", im9, fam, otch);
            int str3 = 15 - dlina_FIO - 2;
            for (int i = 0; str3 > i; i++) {
                System.out.printf(" ");
            }
            System.out.printf(" *%n");
            for (int i = 0; i < max_str; i++) {
                System.out.printf("*");
            }
        }
    }

    public static void task2() {
        System.out.printf("Vvedite Chislo %n");
        Scanner console = new Scanner(System.in);
        long chislo = console.nextLong();
        long c = chislo;
        long max = 0;
        long min = 9;
        long ost=chislo % 10;
        while (chislo > 0) {
            //не нужно 4 раза считать остаток от числа
            //посчитай его раз и присвой значение переменной
            //потом ее уже проверяй!!

            if (ost % 10 > max) {
                max = ost;
            }
            if (ost % 10 < min) {
                min = ost;
            }
            chislo /= 10;
        }
        System.out.printf("%nУ числа %d :%nНаименьшее число: %d%nНаибольшее число: %d", c, min, max);
    }

    static int fibon(int n) {
        int result;

        if (n == 0) {
            return 0;
        }
        if (n == 1 || n == 2) {
            return 1;
        }

        result = fibon(n - 1) + fibon(n - 2);
        //System.out.printf(result + "%n");
        return result;

    }
}
