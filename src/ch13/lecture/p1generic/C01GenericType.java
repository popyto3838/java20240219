package ch13.lecture.p1generic;

public class C01GenericType {
    public static void main(String[] args) {

        C01Box box = new C01Box();
        box.setItem("java");
        String item = box.getItem();

        C01Box box2 = new C01Box();
        //Integer item2 = box2.getItem();

    }
}

class C01Box {
    private String item;

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }
}