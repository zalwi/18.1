import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Stream.of(8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20)//zgodnie z treścia pkt 1.
                .map(number -> number * number)         //dodatkowe: przemnożyłem liczby, żeby przekroczyć 100
                .filter(number -> number > 100)         //zgodnie z pkt 2.
                .filter(number -> number % 5 == 0)      //zgodnie z pkt 2.
                .map(number -> number * 3)              //zgodnie z pkt 3.
                .limit(1)                               //zmieniłem limit z 10 na 1 (są dwa wyniki) dot. pkt 4.
                .forEach(System.out::println);          //zgodnie z pkt 4.
    }
}
