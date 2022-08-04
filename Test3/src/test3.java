public class test3 {
    public static void main(String[] args) {
        int age=(int)(Math.random()*100);
        System.out.println(age);
        if(age<12){
            System.out.println("child");
        }
        else if (age<18) {
            System.out.println("youth");
        }
        else if (age<25) {
            System.out.println("prime");
        }
        else if (age<50) {
            System.out.println("midlife");
        }
        else if (age<80) {
            System.out.println("old age");
        }
        else if (age<100) {
            System.out.println("longevity");
        }
    }
}
