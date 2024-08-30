package BinarySearchTree;

//KeyableNumber
public class KeyableNumber implements Keyed {
    
    private int key;

    public KeyableNumber(int _key) {
        key = _key;
    }

    public int getKey() {
        return key;
    }

    public String toString() {
        return String.format("%d", key);
    }

    public int keyComp(Keyed other) {
    
        KeyableNumber object = null;
        if (other instanceof KeyableNumber)
            object = (KeyableNumber) other;

        if (object.getKey() < key)
            return 1;
        else if (object.getKey() > 0)
            return -1;
        else
            return 0;
    }

    public String toKey() {
        return toString();
    }
}