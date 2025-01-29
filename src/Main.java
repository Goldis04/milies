public class Main {
    public static void main(String[] args) {
        int bilets = 2;
        int milies = 20; // Объявляете переменные для входных данных и параметров программы: одну для хранения
        int price = 100000; // стоимости билета, другую для хранения количества

        System.out.println((price*1 + " стоимость рублей за 1 билет"));
        System.out.println("Получено:");
        System.out.println((bilets*(price/ milies) + " милей за 2 билета "));
        System.out.println((price/ milies) + " милей за 1 билет");
    }
}