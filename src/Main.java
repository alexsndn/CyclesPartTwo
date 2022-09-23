public class Main {
    public static void main(String[] args) {
        //Задание 1.1
        System.out.println("Задание 1.1");
        int total = 0;
        int salary = 15000;
        int i = 0;
        while (total < 2_459_000) {
            i++;
            total = total + salary;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total);
        }
        //Задание 2.1
        System.out.println("Задание 2.1");
        int a = 0;
        while (a < 10) {
            a++;
            System.out.print(a+" ");
        }
        System.out.println();
        for (int b = 10; b > 0; b--) {
            System.out.print(b+" ");
        }
        //Задание 3.1
        System.out.println("Задание 3.1");
        int y = 12_000_000;
        int birth = 9000;
        for (int r = 0; r < 11; r++) {
            y = y + birth;
            System.out.println("Год " + r + ", численность населения составляет " + y);
        }
        //Задание 1.2
        System.out.println("Задание 1.2");
        int monthVasily = 0;
        int totalVasily = 15000;
        while (totalVasily < 12000000) {
            totalVasily = totalVasily + totalVasily/100*7;
            monthVasily++;
            System.out.println("Месяц "+ monthVasily+" Итого накоплений: "+ totalVasily);
        }
        //Задание 2.2
        System.out.println("Задание 1.3");
        int monthVasilyTwo = 0;
        int totalVasilyTwo = 15000;
        while (totalVasilyTwo < 12000000) {
            totalVasilyTwo = totalVasilyTwo + totalVasilyTwo/100*7;
            monthVasilyTwo++;
            if (monthVasilyTwo % 6 == 0) {
                System.out.println("Месяц "+ monthVasilyTwo+" Итого накоплений: "+ totalVasilyTwo);
            }
        }
        //Задание 3.2
        System.out.println("Задание 3.2");
        int firstDeposit = 15000;
        for (int f = 1; f < 109; f++) {
            firstDeposit = firstDeposit + firstDeposit/100*7;
            if (f % 6 == 0) {
                System.out.println("Месяц "+f+" Сумма: "+firstDeposit);
            }
        }
        //Задание 4.2
        System.out.println("Задание 4.2");
        int friDay = 5;
        for (int c = 1; c < 31; c++) {
            friDay++;
            if (friDay % 5 == 0) {
                System.out.println("Сегодня пятница " + c + " число.");
            }
        }
        //Задание 1.3
        System.out.println("Задание 1.3");
        for (int comet = 0; comet < 2122; comet = comet + 79) {
            if (comet > 1822) {
                System.out.println(comet);
            }
        }
        //Задание 2.3
        System.out.println("Задание 2.3");
        for (int t = 1; t < 10; t++) {
            int u = 2;
            u = u*t;
            System.out.println("2*"+t+"="+u);
        }
    }
}