public class Model {

    private double calculationValue;
    public void calculateCmpInt(double investment, double interestRate, String compoundFreq, int y){
        int n = 1;
        if (compoundFreq.equals("Monthly")) n = 12;
        calculationValue = investment*Math.pow(1+(interestRate/100)/n,n*y);
    }

    public double getCalculationValue(){
        return calculationValue;
    }
}
