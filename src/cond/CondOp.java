package cond;

public class CondOp {
    public static void main(String[] args) {
        int age=10;
        String status = (age >= 18) ? "성인":"미성년";
        System.out.println("age=" + age + status);
    }
}
