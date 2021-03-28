package demo.practica4.sort;

import java.util.Comparator;

public interface Sorter<T> {
    public <T> void sort(T arr[], Comparator<T> c);
}
