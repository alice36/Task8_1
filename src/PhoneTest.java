import java.util.Scanner;

public class PhoneTest {
    public static void main(String[] args) {
        boolean check = false;
        Scanner input = new Scanner(System.in);
        Phone[] phones = new Phone[3];

        for (int i=0;i<phones.length;i++) {
            while (!check){
                System.out.println("Podaj nazwę telefonu oraz cenę." );
                phones[i] = new Phone(input.nextLine(),input.nextInt());
                input.nextLine();
                if (i>0 && phones[i].equals(phones[i-1])) System.out.println("Wprowadzasz duplikat, spróbuj jeszcze raz!");
                else if (i==0) check = true;
                else if (i>0 && !(phones[i].equals(phones[i-1]))) check = true;
            }
            check=false;
        }

        for (int i = 0; i < phones.length; i++) {
            System.out.println(phones[i].toString());
        }
    }
}
