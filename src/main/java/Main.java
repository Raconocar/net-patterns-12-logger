import java.util.*;

public class Main {
    static Random random = new Random();

    private static ArrayList<Integer> makeList(int N, int M) {
        ArrayList list = new ArrayList<Integer>();
        for (int i = 0; i < N; i++) {
            list.add(random.nextInt(M));
        }
        return list;

    }

    public static void main(String[] args) {
        Random random = new Random();
        Logger logger = Logger.getInstance();
        Scanner scanner = new Scanner(System.in);

        logger.log("Запускаем программу");
        logger.log("Просим пользователя ввести входные данные для списка");
        System.out.println("Введите размер списка:");
        int N = Integer.parseInt(scanner.nextLine());
        System.out.println("Введите верхнюю границу для значений:");
        int M = Integer.parseInt(scanner.nextLine());
        logger.log("Создаём и наполняем список");

        List<Integer> listNumbers = makeList(N, M);
        listNumbers.forEach(x -> System.out.print(x));

        logger.log("Просим пользователя ввести входные данные для фильтрации");
        System.out.println("Введите порог для фильтра");
        int f = Integer.parseInt(scanner.nextLine());

        logger.log("Запускаем фильтрацию");
        Filter filter = new Filter(f);
        List<Integer> filteredNumber = filter.filterOut(listNumbers);

        logger.log("Выводим результат на экран");
        System.out.print("Отфильтрованный список:");
        filteredNumber.forEach(System.out::print);
        System.out.println();

        logger.log("Завершаем программу");



    }


}