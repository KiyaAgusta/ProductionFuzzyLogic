package productionfuzzylogic.model;

public class Request {
    private static double request;  
    private static double[] points = {0, 1000, 5000};
    
    public static double downCount() {
        if (points[0] <= request && request < points[1])
            return 1;
        else if (points[1] <= request && request <= points[2])
            return (points[2] - request) / (points[2] - points[1]);
        else
            return 0;
    }
    
    public static double upCount() {
        if (points[0] <= request && request < points[1])
            return 1;
        else if (points[1] <= request && request <= points[2])
            return (request - points[1]) / (points[2] - points[1]);
        else
            return 0;
    }

    public static double getRequest() {
        return request;
    }

    public static void setRequest(double request) {
        Request.request = request;
    }
}
