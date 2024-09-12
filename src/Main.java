import java.util.*;

public class Main {
    public static void main(String[] args) {
        final int partisipants = 16; //Количество учавствующих пар
        final int maxVotes = 1000; //Максимальное количество голосов

        Random random = new Random();
        int n = random.nextInt(1, maxVotes); // Количество голосующих
        HashMap<Integer, Integer> map = new HashMap<>();

        //Для каждого уникального ключа (номера участника) идёт подсчёт количества его выпадений в значении
        for (int i = 0; i < n; i++) {
            int singleVote = random.nextInt(1, partisipants + 1);
            map.put(singleVote, 1 + map.getOrDefault(singleVote, 0));
        }

        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());

        // Сортировка списка по значениям в порядке убывания
        list.sort((e1, e2) -> e2.getValue().compareTo(e1.getValue()));

        // Вывод отсортированных элементов
        for (Map.Entry<Integer, Integer> entry : list) {
            System.out.println(STR."Команда \{entry.getKey()} - \{entry.getValue()} голосов");
        }
    }

}