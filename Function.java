package ru.ushakova.list.Function;

@FunctionalInterface
public interface Function<T,R> {
    R apply(T t);
}
