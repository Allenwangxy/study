public class test4 {
    public static void main(String[] args) {
        int month=(int)(Math.random()*11);
        int a=month+1;
        System.out.println(a);
        switch (month){
            case 0:
            case 1:
            case 2:
                System.out.println("spring");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("summer");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("autumn");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("winter");
                break;
        }

    }
}
