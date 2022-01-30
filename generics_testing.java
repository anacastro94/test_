public class GenericClassTesting<T> {
    T obj;

    GenericClassTesting (T o) {
        obj = o;
    }

    void printType () {
        System.out.println("obj has type: " + obj.getClass().getName());
    }

    public void main (String args) {
        GenericClassTesting<String> a = new GenericClassTesting<String>("Joe");
        GenericClassTesting<Integer> b = new GenericClassTesting<Integer>(33);
    }
}