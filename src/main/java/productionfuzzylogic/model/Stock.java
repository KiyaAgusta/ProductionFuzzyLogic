package productionfuzzylogic.model;

public class Stock {
    private static double stock;
    private static double[] points = {0, 100, 600};
    
    public static  double fewCount() {
        if (points[0] <= stock && stock < points[1])
            return 1;
        else if (points[1] <= stock && stock <= points[2])
            return (points[2] - stock) / (points[2] - points[1]);
        else
            return 0;
    }
    
    public static double manyCount() {
        if (points[0] <= stock && stock < points[1])
            return 1;
        else if (points[1] <= stock && stock <= points[2])
            return (stock - points[1]) / (points[2] - points[1]);
        else
            return 0;
    }

    public static double getStock() {
        return stock;
    }

    public static void setStock(double stock) {
        Stock.stock = stock;
    }
}
