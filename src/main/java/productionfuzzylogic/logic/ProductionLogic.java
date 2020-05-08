package productionfuzzylogic.logic;

import productionfuzzylogic.model.*;

public class ProductionLogic {
    private static double[] predicate = new double[4];
    private static double[] rules = new double[4];
    private static double[] points = {2000, 7000};

    public ProductionLogic(double request, double stock) {
        Request.setRequest(request);
        Stock.setStock(stock);
        calculatePredicate();
    }
    
    public static double tsukamotoMethod() {
        for(int i = 0; i < rules.length; i++) {
            if (i == 0 || i == 1)
                rules[i] = points[1] - (predicate[i] * (points[1] - points[0]));
            else
                rules[i] = points[0] + (predicate[i] * (points[1] - points[0]));
        }
        
        return calculateResult();
    }
    
    public static double sugenoMethod() {
        double request = Request.getRequest();
        double stock = Stock.getStock();
        
        for (int i = 0; i < rules.length; i++) {
            if (i == 0)
                rules[i] = request - stock;
            else if (i == 1 || i == 2)
                rules[i] = request;
            else
                rules[i] = 1.25 * request - stock;
        }
        
        return calculateResult();
    }
    
    public static double calculateResult() {
        double cardinal = 0;
        double ordinal = 0;
        
        for (int i = 0; i < rules.length; i++) {
            cardinal += predicate[i] * rules[i];
            ordinal += predicate[i];
        }
        
        return cardinal / ordinal;
    }
    
    public static void calculatePredicate(){
        predicate[0] = Math.min(Request.downCount(), Stock.manyCount());
        predicate[1] = Math.min(Request.downCount(), Stock.fewCount());
        predicate[2] = Math.min(Request.upCount(), Stock.manyCount());
        predicate[3] = Math.min(Request.upCount(), Stock.fewCount());
    }
}
