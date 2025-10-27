package ru.ushakova.list.list;

import java.util.List;

public class GeneralizedImmutableList<T> {
    public static <T> void fillList(List<T> list, T sampleValue) {
        list.clear();

        // Определяем тип по sampleValue и заполняем соответственно
        if (sampleValue instanceof Integer) {
            for (int i = 1; i <= 100; i++) {
                ((List<Integer>) list).add(i);
            }
        } else if (sampleValue instanceof Double) {
            for (int i = 1; i <= 100; i++) {
                ((List<Double>) list).add((double) i);
            }
        }
    }
}
