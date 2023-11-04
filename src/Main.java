
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
        int white = 2;
        int brown = 4;
        int quantity = 120;
        int quantityClasses = quantity / (white + brown);
        int quantityWhite = white * quantityClasses;
        int totalBrown = brown * quantityClasses;
        System.out.println("В школе, где " + quantityClasses + " классов, нужно " + quantityWhite + " банок белой краски и " + totalBrown + " банок коричневой краски");
    }



    public static void task6() {
       int bananas = 5*80;
        int milk = 200/100*105;
        int Ice= 2*100;
        int eggs= 4*70;
        int gWeight= bananas+milk+Ice+eggs;
        double kgWeight = (double) gWeight /1000;
        System.out.println("такого спортзавтрака = "+kgWeight+ " килограмм");

    }

    public static void task7() {
        int targetKg = 7;
        int minDay = 250;
        int maxDay = 500;
        int targetGr = targetKg * 1000;
        int min = targetGr / minDay;
        int max = targetGr / maxDay;
        int days = (min + max) / 2;
        System.out.println("если спортсмен будет терять каждый день по 250 грамм - " + min);
        System.out.println("если спортсмен будет терять каждый день по 500 грамм - " + max);
        System.out.println("если в среднем - " + days);



    }

    public static void task8() {
        int Masha = 67760;
        int Denis = 83690;
        int Kristina = 76230;
        int MashaGi = Masha / 100 * 10;
        int DenisGi = Denis / 100 * 10;
        int KristinaGi = Kristina / 100 * 10;
        int MashaP = Masha + MashaGi;
        int DenisP = Denis + DenisGi;
        int KristinaP = Kristina + KristinaGi;
        int MashaYgi = MashaGi * 12;
        int DenisYgi = DenisGi * 12;
        int KristinaYgi = KristinaGi * 12;
        System.out.println("Маша теперь получает " + MashaP + " рублей. Годовой доход вырос на " + MashaYgi + " рублей");
        System.out.println("Маша теперь получает " + DenisP + " рублей. Годовой доход вырос на " + DenisYgi + " рублей");
        System.out.println("Маша теперь получает " + KristinaP + " рублей. Годовой доход вырос на " + KristinaYgi + " рублей");







    }
}