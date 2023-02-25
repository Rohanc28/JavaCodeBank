package Java_Program;

public class CloneObject {

    public static class CloneObjectClass implements Cloneable {
        private int x;
        private String s;

        public CloneObjectClass(int x, String s) {
            this.x = x;
            this.s = s;
        }

        @Override
        public Object clone() throws CloneNotSupportedException {
            return super.clone();
        }
    }

    public static void main(String[] args) {
        CloneObjectClass obj1 = new CloneObjectClass(10, "Hello");
        try {
            CloneObjectClass obj2 = (CloneObjectClass) obj1.clone();
            System.out.println("All good");
        } catch (CloneNotSupportedException e) {
        	System.out.println("Couldn't clone");
            e.printStackTrace();
        }
    }

}
