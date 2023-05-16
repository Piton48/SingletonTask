package ru.netology;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Filter {
    private int minValue = 0;

    public Filter(int minValue) {
        this.minValue = minValue;
    }

    public List<Integer> filterOut(List<Integer> list) {
        Logger logger = Logger.get();
        logger.log("Запускаем фильтрацию.");
        List<Integer> reult = new ArrayList<>();
        for (int value : list) {
            if (value >= minValue) {
                reult.add(value);
                logger.log("Элемент " + value + " подходит.");
            } else logger.log("Элемент " + value + " не подходит.");
        }
        return reult;
    }
}
