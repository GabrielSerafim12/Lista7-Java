package Exercicios;

public class ConversaoTemperatura {
    public static void main(String[] args) {
        
        System.out.println("Celsius\tFahrenheit");

        
        for (int celsius = 10; celsius <= 100; celsius += 10) {
            
            double fahrenheit = (celsius * 9.0 / 5.0) + 32;

            System.out.println(celsius + "\t" + fahrenheit);
        }
    }
}

