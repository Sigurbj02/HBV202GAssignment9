package is.hi.hbv202g.ass9.compositeLeafObservedByComposite;

public class NumberLeaf extends Observable implements MathExpression {
    private int number;

    public void setValue(int number) {
        this.number = number;
        notifyObservers();
    }

    public NumberLeaf(int number) {
        this.number = number;
    }

    public int getResult() {
        return number;
    }
}
