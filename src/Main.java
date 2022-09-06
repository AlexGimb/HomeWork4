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
        task9();



    }
    public static void task1() {
        System.out.println("Задание 1");
        for (int a = 0; a <= 10; a++) {
            System.out.println(a);
        }
    }
    public static void task2 (){
        System.out.println("Задание 2");
        for (int a = 10; a >= 0; a-- ){
            System.out.println(a);
        }
    }
    public static void task3 (){
        System.out.println("Задание 3");
        for (int a = 0; a <= 17; a = a + 2){
            System.out.println(a);
        }
    }
    public static void task4 (){
        System.out.println("Задание 4");
        for (int a = 10; a >= -10; a--){
            System.out.println(a);
        }
    }
    public static void task5 (){
        System.out.println("Задание 5");
        for (int a = 1904; a <= 2096; a = a + 4){
            System.out.printf("%d год является високосным \n",a);
        }
    }
    public static void task6 (){
        System.out.println("Задание 6");
        for (int a = 7; a <= 98; a = a + 7){
            System.out.println(a);
        }
    }
    public static void task7 (){
        System.out.println("Задание 7");
        for (int a = 1; a <= 512; a = a*2){
            System.out.println(a);
        }
    }
    public static void task8 (){
        System.out.println("Задание 8");
        int money = 29_000;
        int deposit = 0;
        for (int a = 1; a <= 12; a++ ){
            deposit = deposit + money;
            System.out.printf("Месяц %d, сумма накоплений равна %d рублей\n", a,deposit);
        }
    }
    public static void task9 (){
        System.out.println("Задание 9");
        int money = 29_000;
        int deposit = 0;
        for (int a = 1; a <= 12; a++){
            deposit = deposit + deposit/100;
            deposit = deposit + money;
            System.out.printf("Месяц %d, сумма накоплений равна %d рублей\n", a,deposit);
        }
    }
}
