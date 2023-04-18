public class Main {
    public static void main(String[] args) {

        int check = 100;
        int client = 1100;
        int summ = check + client;
        int bonus; // client / 100
        if ( client >= 1000) {
            bonus = summ + (client + check) / 100;
            System.out.println(" Всего c бонусами= " + bonus);
        } else {
            bonus = 0;
        }
        System.out.println(" Всего на счету= " + summ);


    }
}