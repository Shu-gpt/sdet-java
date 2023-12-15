package switchCase;

public class SwitchCase {
    public static void main(String[] args){
        int choice=1000000;
        switch (choice){
            case 100:
                System.out.println("one hundred");
                break;

            case 1000:
                System.out.println("one thousand");
                break;
            case 1000000:
                System.out.println("one million");
                break;
            case 100000000:
                System.out.println("one billion");
                break;
            default:
                System.out.println("not valid");
        }
    }
}
