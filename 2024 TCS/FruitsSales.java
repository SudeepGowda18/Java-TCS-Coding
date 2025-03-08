public class FruitsSales {
    public static void main(String[] args) {
        String[][] fruits = { { "apple", "10", "2" }, { "orange", "20", "4" } };
        int totalSales = 0;
        for (String[] fruit : fruits) {
            totalSales += Integer.parseInt(fruit[1]) * Integer.parseInt(fruit[2]);
        }
        System.out.println(totalSales);
        System.out.println(totalSales / fruits.length);
    }
}