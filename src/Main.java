import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        System.out.println(" task 1");

        int accumulation = 15000;
        int total = 0;
        int month = 0;
        while (total < 2459000) {
            month++;
            total = total + accumulation;
            System.out.println(" Месяц " + month + " сумма накоплений равна " + total + " рублей");

        }
        System.out.println(" task 2");

        int a = 0;
        while (a < 10) {
            a++;
            System.out.print(a + "");
        }
        System.out.println();
        for (a = 1; a <= 10; a++) {
            System.out.print(a + "");
        }
        System.out.println();

        System.out.println(" Task 3");

        int population = 12_000_000;
        int fertility = 17;
        int mortality = 8;
        for (int year = 1; year < 10; year++) {
            population += population / 1000 * fertility - population / 1000 * mortality;
            System.out.println(" Год " + year + " численность населения составляет " + population);
        }

        System.out.println(" Task 4");

        int solary = 15000;
        int totalMoney = 12_000_000;
        double percent = 0.07;
        int months = 0;
        while (solary <= totalMoney) {
            solary += solary * percent;
            months++;

            System.out.println("месяц " + months + ", сумма накоплений равна " + solary);
        }

        System.out.println(" Task 5");

        int solary1 = 15000;
        double percent1 = 0.07;
        int totalMoney1 = 12_000_000;
        int months1 = 0;
        while (solary1 <= totalMoney1) {
            solary1 += solary1 * percent1;
            months1++;
            if (months1 % 6 == 0) {
                System.out.println("месяц " + months1 + ", сумма накоплений равна " + solary1);

            }
        }

        System.out.println(" Task 6");

        int years = 9;
        int monthsPerYear = 12;
        int savings = 15000;
        double percent2 = 0.07;
        years = years * monthsPerYear;
        for (int year = 1; year <= years; year++) {
            savings += savings * percent2;
            if (year % 6 == 0) {
                System.out.println("за месяц " + year + " сумма накоплений равна " + savings);
            }

            System.out.println(" Task 7");

            int firstFriday = 7;
            for (int day = firstFriday; day <= 31; day += 7) {
                System.out.println("Сегодня пятница, " + day + " -е число ");
            }

            System.out.println(" Task 8");
            int startFlight = 0;
            int startYear = 2024 - 200;
            int endYear = 2024 + 100;
            int period = 79;
            for (int year1 = startFlight; year1 < endYear; year1 += period)
                if (year1 > startYear) {
                    System.out.println(year1);
                }


        }


    }


}
