package loop;

public class While1 {
    public static void main(String[] args) {
        int count=0;

        count++;
        System.out.println(count);
        count++;
        System.out.println(count);
        count++;
        System.out.println(count);
        while (count<6){
            count++;
            System.out.println("현재숫자"+count);
        }
    }
}
