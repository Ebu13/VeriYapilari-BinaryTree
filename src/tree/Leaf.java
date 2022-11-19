package tree;

public class Leaf {

    public Leaf parent;
    public Leaf left;
    public Leaf right;
    public int element;

    public Leaf(int element) {
        this.element = element;
    }
}
