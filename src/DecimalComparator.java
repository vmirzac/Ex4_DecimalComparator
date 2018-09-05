public class DecimalComparator {
    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(1.5267, 1.5238));
    }
    public static boolean areEqualByThreeDecimalPlaces(double number1, double number2){
        return ((int)(number1 * 1000) == (int)(number2 * 1000));
    }
}
