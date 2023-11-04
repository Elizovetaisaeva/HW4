
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
        byte grape = 21;
        System.out.println("byte grape = " + grape);
        short apples = 231;
        System.out.println("short apples = "+ apples);
        int a = 30000;
        System.out.println("int a = "+a);
        long b = 976789654;
        System.out.println("long b = "+b);
        float c = 4.55f;
        System.out.println("float c = "+c);
        double d = 10.896F;
        System.out.println("double d = "+d);


    }
    public static void task2() {
        short a = -159;
        System.out.println("int a = "+a);
        short b = 569;
        System.out.println("short b = "+b);
        int c = 27897;
        System.out.println("int c = "+ c);
        long d = 987_678_965_549L;
        System.out.println("long d = "+d);
        float e = 2.786f;
        System.out.println("float e = "+e);
        double g = 27.12F;
        System.out.println("double g = "+g);

    }


    public static void task3() {
        byte students1 = 23;
        byte students2 = 27;
        byte students3 = 30;
        short paper = 480;
        int overStudents = students1 + students2 + students3;
        int expensed = paper / overStudents;
        System.out.println("На каждого ученика рассчитано  " + expensed + " листов бумаги");


    }

    public static void task4() {
        int min2 = 16;
        int min20 = min2 * 10;
        int day24 = min20 * 3 * 24;
        int days3 = day24 * 3;
        int month = day24 * 30;
        System.out.println("За 20 минут машина произвела бутылок - " + min20 + " штук ");
        System.out.println("За сутки машина произвела бутылок - " + day24 + " штук ");
        System.out.println("За 3 дня машина произвела бутылок - " + days3 + " штук ");
        System.out.println("За месяц машина произвела бутылок - " + month + " штук ");




    }

    public static void task5() {
        byte cansPaint = 120;
        System.out.println("cansPaint  = "+cansPaint);
        short whiteBrown = 2+4;
        System.out.println("На один класс уходит = " + whiteBrown);
        byte cans = 120/6;
        System.out.println("количество = " + cans);
        byte white = 20*2;
        System.out.println("банки белой краски = " + white);
        byte Brown = 20*4;
        System.out.println("банки коричневой краски = " + Brown);
    }

    public static void task6() {
       int bananas = 5*80;
        System.out.println("5 штук бананов = "+bananas+ " грамм ");
        int milk = 200*105;
        System.out.println("молоко = "+milk+ " грамм ");
        int Ice= 2*100;
        System.out.println("Мороженое-пломбир = "+Ice+ " грамм ");
        int eggs= 4*70;
        System.out.println("Яйца сырые = "+eggs+ " грамм");
        int gram= (400+21000)+(200+280);
        System.out.println("количество граммов = "+gram+ " грамм");
       double kg= (double) 21880/1000;
        System.out.println("такого спортзавтрака = "+kg+ " килограмм");


    }

    public static void task7() {
        byte weight = 1000/250;
        System.out.println(weight + " грамма ");
        byte days = 4*7;
        System.out.println(days + " дней ");
        byte weigh = 1000/500;
        System.out.println(weigh + " грамма ");
        byte day = 7*2;
        System.out.println(day + " дней ");
        byte d = 14+7;
        System.out.println( "в среднем потребоваться " + d + "  дней  ");



    }

    public static void task8() {
        int salary = 67760+6776;
        System.out.println(salary + " рублей в месяц ");
        int a = 74536*12;
        System.out.println(a + " рублей в год ");
        int b = 67760*12;
        System.out.println(b + " рублей в год ");
        long d = (894432 - 813120);
        System.out.println("Годовой доход вырос на " + d + " рублей ");







    }
}