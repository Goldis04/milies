public class Main {
    public static void main(String[] args) {
        int oneMilePrice = 20; // Объявляете переменные для входных данных и параметров программы: одну для хранения
        int price = 100000; // стоимости билета, другую для хранения количества

        System.out.println((price*1 + " стоимость рублей за 1 билет"));
        System.out.println("Получено:");
        System.out.println((price/ oneMilePrice) + " милей за 1 билет");
    }
}