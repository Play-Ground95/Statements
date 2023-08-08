public class Demo5 {
    public static void main(String[] args) {
        int x=4;
        System.out.println("hello");
        assert 5==x++ : "WTF";
        assert 10>5 : "my message";
        System.out.println(x);

    }
}
