package ValueObjectExample;

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

public class ValueObjectExample {
    public static void main(String[] args) {
        ValueObject obj1 = new ValueObject(10);
        ValueObject obj2 = new ValueObject(obj1);

        if(obj1 == obj2) {
            System.out.println("They are equal");
        } else {
            System.out.println("They are not equal");
        }
    }
}
