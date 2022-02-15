public class App {
    public static void main(String[] args) throws Exception {
        double wert1  = 2.36;
        double wert2 = 7.87;

        
        double result = multiplikation(wert1, wert2);
        System.out.println(result);

        double mittelwert = berechneMittelwert(wert1,wert2);
        System.out.println(mittelwert);
        
    }
    public static double multiplikation(double x, double y) {
        double result = x * y;
        return result;
    }
    public static double berechneMittelwert(double x, double y) {
        double mittelwert = (x + y) / 2.0;
        return mittelwert;
    }
}

