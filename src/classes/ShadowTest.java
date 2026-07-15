package classes;

public class ShadowTest {
// Soyalaw va this

    public int x = 0;

    class FirstLevel {

        public int x = 1;

        void methodInFirstLevel(int x) {
            IO.println("x = " + x);
            IO.println("this.x = " + this.x);
            IO.println("ShadowTest.this.x = " + ShadowTest.this.x);
        }
    }

    static void main(String... args) {
        ShadowTest st = new ShadowTest();
        ShadowTest.FirstLevel fl = st.new FirstLevel();
        fl.methodInFirstLevel(23);
    }
}
