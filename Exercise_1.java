import java.util.Scanner;
class Exercise_1 {
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        int i = 0;
        switch(i) {
            case 0:i++;
            case 1:i++;
            case 2:++i;
            System.out.println(i++);
        }
    }
}