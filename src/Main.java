public class Main {
    public static void main(String[] args) {
        //задание №1
        int a = 25000;
        byte b = 100;
        short c = 15000;
        long d = 1800000;
        float e = 9.85f;
        double f = 3.14159265;
        System.out.printf("int a=" + a + "%n");
        System.out.printf("byte b=" + b + "%n");
        System.out.printf("short c=" + c + "%n");
        System.out.printf("long d=" + d + "%n");
        System.out.printf("float e =" + e + "%n");
        System.out.printf("double f =" + f + "%n");

        //задание №2
        long aa = 987_678_965_549L;
        ;
        int ab = 27897;
        double ac = 27.12;
        float ae = 2.786f;
        int af = 569;
        byte ag = 67;
        short ah = -159;


//задание 3//
        byte LP, AS, EA;
        int bumAga;
        LP = 23;
        AS = 27;
        EA = 30;
        bumAga = 480;
        System.out.println("У Людмилы Павловны  " + LP + " ученика");
        System.out.println("У Анны Сергеевны  " + AS + " ученика");
        System.out.println("У Екатерины Андреевны  " + EA + " ученика");
        System.out.println("Всего купили бумаги  " + bumAga + " листов");
        //расчитываем общее количество учеников//
        byte summStudy = (byte) (LP + AS + EA);
        System.out.println("Всего " + summStudy + " учеников");
        int listOv = (int) bumAga / (byte) summStudy;
        System.out.println("На каждого ученика расчитано  " + listOv + "  листов бумаги");

        //задание №4
        int x, y, q, v, w, z;
        x = 16;
        z = 2;
        int oneMinut = (x / z);
        y = 20;
        q = 60 * 24;
        v = q * 3;
        w = q * 30;

        int thwenTy, day, threeDay, mount;
        thwenTy = (y * oneMinut);
        day = (q * oneMinut);
        threeDay = (v * oneMinut);
        mount = (w * oneMinut);

        q = 1;
        v = 3;
        w = 1;

        System.out.println("за " + y + " минут машина произвела " + thwenTy + " штук бутылок");
        System.out.println("за " + q + " день машина произвела " + day + " штук бутылок");
        System.out.println("за " + v + " дня машина произвела " + threeDay + " штук бутылок");
        System.out.println("за " + w + " месяц машина произвела " + mount + " штук бутылок");

        // задача№5
        byte allScool = 120;
        byte wite = 2;
        byte brown = 4;
        byte oneClass = (byte) (wite + brown);
        byte allClass = (byte) (allScool / oneClass);
        byte resultWite = (byte) (allClass * wite);
        byte resultBrown = (byte) (allClass * brown);
        System.out.println("в школе,где " + allClass + " классов,нужно " + resultWite + " банок белой краски");
        System.out.println("и " + resultBrown + " банок коричневой краски");

        //задача №6
        int banan, milk, iceCream, egge;
        banan = 80;
        milk = 105;
        iceCream = 100;
        egge = 70;
        int i, o, p, j;
        i = 5;
        o = 2;
        p = 2;
        j = 4;
        double breakFast = ((banan * i) + (milk * o) + (iceCream * p) + (egge * j));
        double breakKg = (breakFast / 1000);
        System.out.println("вес завтрака " + breakFast + " граммов");
        System.out.println("вес завтрака " + breakKg + " килограммов");


        //задача №7
        int l, t, s;
        l = 7;
        t = 250;
        s = 500;
        int weightGr = (l * 1000);
        int dayMin = (weightGr / t);
        int dayMax = (weightGr / s);
        int dayMed = (dayMin + dayMax) / 2;
        System.out.println("если спортсмен будет терять в день 250 граммов ,ему понадобиться " + dayMin + " дней");
        System.out.println("если спортсмен будет терять в день 500 граммов ,ему понадобиться " + dayMax + " дней");
        System.out.println("среднее время похудения составит " + dayMed + " дней");

        //задача №8
        int masha, denis, kris, m;
        masha = 67760;
        denis = 83690;
        kris = 76230;
        m = 10;
        int persMasha = (masha * m) / 100;
        int persDenis = (denis * m) / 100;
        int persKris = (kris * m) / 100;
        int finMasha = (masha + persMasha);
        int finDenis = (persDenis + denis);
        int finKris = (persKris + kris);
        int diffMasha = (persMasha * 12);
        int diffDenis = (persDenis * 12);
        int diffKris = (persKris * 12);
        System.out.println("Маша теперь получает " + finMasha + " руб.в месяц");
        System.out.println("годовой доход вырос на " + diffMasha + " рублей");
        System.out.println("Денис теперь получает " + finDenis + " руб.в месяц");
        System.out.println("годовой доход вырос на " + diffDenis + " рублей");
        System.out.println("Кристина теперь получает " + finKris + " руб.в месяц");
        System.out.println("годовой доход вырос на " + diffKris + " рублей");


    }
}