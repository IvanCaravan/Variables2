public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int apples = 1;
        byte bananas = 2;
        short chips = 300;
        long dragons = 4000;
        float e = 5.5f;
        double f = 6.66;
        System.out.println("Значение переменной apples с типом int равно " + apples);
        System.out.println("Значение переменной bananas с типом byte равно " + bananas);
        System.out.println("Значение переменной chips с типом short равно " + chips);
        System.out.println("Значение переменной dragons с типом long равно " + dragons);
        System.out.println("Значение переменной е с типом float равно " + e);
        System.out.println("Значение переменной f с типом double равно " + f);
    }
    public static void task2() {
        float one = 27.12f;
        long two = 987678965549L;
        double c = 2.786;
        short d = 569;
        short e = -159;
        short f = 27897;
        byte g = 67;
    }
    public static void task3() {
        System.out.println("Задача 3");
        int papers = 480;
        byte lyuda = 23;
        byte anna = 27;
        byte ekaterina = 30;
        int paperPerUnit = papers / (lyuda + anna + ekaterina);
        System.out.println("На каждого ученика рассчитано " + paperPerUnit + " листов бумаги");
    }
    public static void task4() {
        System.out.println("Задача 4");
        int bottles2Min = 16;
        int time = 2;
        int performance = bottles2Min / time;
        int min20 = performance * 20;
        System.out.println("За 20 минут машина произвела " + min20 + " штук бутылок");
        int hour = performance * 60;
        int day = hour * 24;
        System.out.println("За сутки машина произвела " + day + " штук бутылок");
        int days3 = day * 3;
        System.out.println("За 3 дня машина произвела " + days3 + " штук бутылок");
        int month = day * 31;
        System.out.println("За месяц машина произвела " + month + " штук бутылок");
    }
    public static void task5() {
        System.out.println("Задача 5");
        byte totalJars = 120;
        byte whiteJars = 2;
        byte brownJars = 4;
        int room = whiteJars + brownJars;
        int totalRooms = totalJars / room;
        int totalWhiteJars = totalRooms * whiteJars;
        int totalBrownJars = totalRooms * brownJars;
        System.out.println("В школе, где " + totalRooms + " классов, нужно " + totalWhiteJars + " банок белой краски и " + totalBrownJars + " банок коричневой краски");
    }
    public static void task6() {
        System.out.println("Задача 6");
        byte banana = 80;
        int bananaTotal = banana * 5;
        int milk = 105;
        int milkTotal = milk * 2;
        int iceCream = 100;
        int iceCreamTotal = iceCream * 2;
        int egg = 70;
        int eggTotal = egg * 4;
        int breakfastGr = bananaTotal + milkTotal + iceCreamTotal + eggTotal;
        double breakfastKg = breakfastGr * 0.001;
        System.out.println("Завтрак весит " + breakfastGr + " грамм, или " + breakfastKg + " кг");
    }
    public static void task7() {
        System.out.println("Задача 7");
        int grPerKg = 1000;
        int totalKg = 7;
        int target = grPerKg * totalKg;
        int slowWeightLossPerDay = 250;
        int fastWeightLossPerDay = 500;
        int maxDays = target / slowWeightLossPerDay;
        int minDays = target / fastWeightLossPerDay;
        int medDays = (maxDays + minDays) / 2;
        System.out.println("Спортсмен при похудении на 250 грамм в день похудеет за " + maxDays + " дней, при 500 грамм в день - за " + minDays + " дней, и в среднем за " + medDays + " дней.");
    }
    public static void task8() {
        System.out.println("Задача 8");
        int mashaMonth1 = 67760;
        int denisMonth1 = 83690;
        int kristinaMonth1 = 76230;
        int mashaNew = (mashaMonth1 / 10) + mashaMonth1;
        int denisNew = (denisMonth1 / 10) + denisMonth1;
        int kristinaNew = (kristinaMonth1 / 10) + kristinaMonth1;
        int mYearSalaryOld = mashaMonth1 * 12;
        int mYearSalaryNew = mashaNew * 12;
        int mashaDiff = mYearSalaryNew - mYearSalaryOld;
        System.out.println("Маша теперь получает " + mashaNew + " рублей. Годовой доход вырос на " + mashaDiff + " рублей");
        int dYearSalaryOld = denisMonth1 * 12;
        int dYearSalaryNew = denisNew * 12;
        int denisDiff = dYearSalaryNew - dYearSalaryOld;
        System.out.println("Денис теперь получает " + denisNew + " рублей. Годовой доход вырос на " + denisDiff + " рублей");
        int kYearSalaryOld = kristinaMonth1 * 12;
        int kYearSalaryNew = kristinaNew * 12;
        int kristinaDiff = kYearSalaryNew - kYearSalaryOld;
        System.out.println("Кристина теперь получает " + kristinaNew + " рублей. Годовой доход вырос на " + kristinaDiff + " рублей");
    }
}