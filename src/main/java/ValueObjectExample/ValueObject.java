package ValueObjectExample;

/**
 * Created by knarf on 30/05/15.
 */
class ValueObject {
    int num;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public ValueObject(int num) {
        this.num = num;
    }

    public ValueObject(ValueObject o) {
        this.num = o.num;
    }
}
