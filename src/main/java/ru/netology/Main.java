package ru.netology;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Logger logger = Logger.get();
        logger.log("Запускаем программу.");
        Scanner scanner = new Scanner(System.in);

        logger.log("Просим пользователя ввести входные данные для списка.");
        System.out.println("Введите размер списка:");
        int maxLenght = scanner.nextInt();
        System.out.println("Введите верхнюю границу для значений:");
        int maxValue = scanner.nextInt();

        logger.log("Создаём и наполняем список.");
        List<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < maxLenght; i++){
            list.add(random.nextInt(maxValue));
        }
        System.out.println(list);

        logger.log("Просим пользователя ввести входные данные для фильтрации.");
        int minValue = scanner.nextInt();

        logger.log("Запускаем фильтрацию.");
        Filter filter = new Filter(minValue);
        List<Integer> result = filter.filterOut(list);

        logger.log(("Прошло фильтр " + result.size() + " элемента из " + list.size()) + ".");

        logger.log("Выводим результат на экран.");
        System.out.println("Отфильтрованный список: " + result);

        logger.log("Завершаем программу.");
    }
}
