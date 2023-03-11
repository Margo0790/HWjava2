public class Main {
    public static void main(String[] args) {
        int ticketPrice = 10000;
        int RublesPermile = 20;

        int miles = (ticketPrice / RublesPermile);
        System.out.println ("Количество начисленных миль; " + miles);
    }
}