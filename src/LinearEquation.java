public class LinearEquation {
    public int x1;
    public int x2;
    public int y1;
    public int y2;

    public LinearEquation(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }

    public double distance() {
        double calc = Math.sqrt((y2 - y1) * (y2 - y1) + (x2 - x1) * (x2 - x1));
        double res = roundedToHundredth(calc);
        return res;
    }

    public double yIntercept() {
        double yint = y2 - (slope()*x2);
        if (slope()!= 0) {
            return yint;
        }
        else {
            return 0;
        }
    }



    public double slope() {
        double rise = y2-y1;
        double run = x2 - x1;
        double result = roundedToHundredth(rise/run);
        if (run == 0) {
            return 0;
        }
        else {
            return result;
        }
    }
    public String slopeFraction() {
        String Frac = (y2-y1) + "/" + (x2-x1);
        return Frac;
    }

    public String equation() {
        String slope = String.valueOf(slope());
        if (slope() == 0 && yIntercept() != 0 ) {
            return "The equation of the line between these points is: y = " + yIntercept();
        }
        else if (Integer.parseInt(slope.substring(slope.indexOf(".") + 1)) == 0 && yIntercept() < 0) {
            return " The equation of the line between these points is:y = " + (int) (slope()) + "x " + yIntercept();
        }
        else if (Integer.parseInt(slope.substring(slope.indexOf(".") + 1)) > 0 && yIntercept() != 0) {
            return "The equation of the line between these points is: y = " + slopeFraction() + "x " + "+ " + yIntercept();
        }
        else if (Integer.parseInt(slope.substring(slope.indexOf(".") + 1)) == 0 && yIntercept() != 0){
            return " The equation of the line between these points is:y = " + (int) (slope()) + "x " + "+ " + yIntercept();
        }
        else {//(Integer.parseInt(slope.substring(slope.indexOf(".") + 1)) == 0 && yIntercept() == 0){
            return " The equation of the line between these points is:y = " + (int) (slope()) + "x ";
        }

    }

    public String coordinateForX(double xValue) {
        double y = (slope() * xValue) + yIntercept();
        double result = roundedToHundredth(y);
        return "(" + xValue + ", " + result + ")";

    }

    public double roundedToHundredth(double toRound) {
        double roundOff = Math.round(toRound * 100.0) / 100.0;
        return roundOff;
    }

    public String lineInfo() {
        String end = "The two coordinates are: (" + x1 + ", " + y1 + ") and (" + x2 + ", " + y2 + ")\n" +
                equation() + "\nThe slope of this line is: " +
                slope() + "\nThe y-intercept of the line is: " + yIntercept() + "\nThe distance between the two points" +
                " is: " + distance();
        return end;
    }







}
