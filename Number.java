public class Number<T extends java.lang.Comparable<T>> implements Comparable<Number<T>> {
    private T value;

    public Number(T value) {
        this.value = value;
    }

    @Override
    public int compareTo(Number<T> other) {
        return this.value.compareTo(other.value);
    }

    @Override
    public String toString() {
        return value.toString();
    }
}
