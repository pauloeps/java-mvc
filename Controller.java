import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller {

    private View theView;
    private Model theModel;

    public Controller(View theView, Model theModel) {
        this.theView = theView;
        this.theModel = theModel;
        this.theView.addCalculationListener(new CalculateListener());
    }

    class CalculateListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {

            try {

                double investment = theView.getInvestment();
                double interestRate = theView.getInterest();
                String compoundFreq = theView.getCompFreq();
                int years = theView.getYears();

                theModel.calculateCmpInt(investment, interestRate, compoundFreq, years);
                theView.showResult(theModel.getCalculationValue(), years);

            } catch (NumberFormatException ex) {
                theView.displayErrorMessage();
            }
        }
    }
}
