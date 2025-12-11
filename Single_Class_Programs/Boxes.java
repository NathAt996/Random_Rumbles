package Single_Class_Programs;

public class Boxes {

    public static class GenericBoxes<T> {
        private T item;

        public GenericBoxes(T item) {
            this.item = item;
        }

        public T getItem() {
            return item;
        }

    }

    public static void main(String[] args) {

        GenericBoxes<Integer> integerBox = new GenericBoxes<>(51);
        System.out.println("Value : " + integerBox.getItem());

        GenericBoxes<String> StringBox = new GenericBoxes<>("Fifty one");
        System.out.println("Value : " + StringBox.getItem());
    }
}
