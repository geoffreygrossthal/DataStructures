//Date: 5/2/2024
//Programmer: Geoffrey Grossthal
//Program: Represents a generic pair of elements 
//@param <K> The type of the first element in the pair.
//@param <V> The type of the second element in the pair.

public class Pair<K, V> {

    private K first;
    private V second;

    public Pair(K _first, V _second) {
        first = _first;
        second = _second;
    }

    public K getFirst() {
        return first;
    }

    public V getSecond() {
        return second;
    }

    public void setFirst(K first) {
        this.first = first;
    }

    public void setSecond(V second) {
        this.second = second;
    }

    @Override
    public String toString() {
        return "(" + first + ", " + second + ")";
    }
}