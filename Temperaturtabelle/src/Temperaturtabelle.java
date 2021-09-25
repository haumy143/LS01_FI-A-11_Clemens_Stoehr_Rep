public class Temperaturtabelle {
    public static void main(String[] args) throws Exception {
        System.out.printf("%-12s|%10s%n", "Fahrenheit", "Celsius");
        System.out.printf("%s%n", "-----------------------");
        System.out.printf("%-12s| %9s%n", "-20", "-28.89");
        System.out.printf("%-12s| %9s%n", "-10", "-23.33");    
        System.out.printf("%-12s| %9s%n", "+0", "-17.78"); 
        System.out.printf("%-12s| %9s%n", "+20", "-6.67");
        System.out.printf("%-12s| %9s%n", "+30", "-1.11"); 
    }
}
