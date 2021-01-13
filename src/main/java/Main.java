public class Main {
    public static void main (String[] args) {
        BonusService service = new BonusService();

        //Подготавливаем данные:
        long amount = 1000_60;
        boolean registered = true;
        long expected = 30;

        //Вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        //Производим проверку (сравиваем О и Ф результаты);
        //если true - то PASS;
        //если false - то FAIL;
        boolean passed = expected == actual;

        //Выводим результат
        System.out.println(passed);
    }
}