public class MyGenericClass<T> {
    private T genericField;

    public MyGenericClass(T genericField) {
        this.genericField = genericField;
    }

    public void printGenericField() {
        System.out.println("Generic Field: " + genericField);
    }
}
