package BinarySearchTree;

//Keyable interface
interface Keyed {
    //Return -1 if less than other, 0 if equal, and +1 if greater
    public int keyComp (Keyed other);
    //Returns a short string that identifies and item
    public String toKey();
}