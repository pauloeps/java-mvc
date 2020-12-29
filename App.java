/*
This is a simple example of a Model View Controller (MVC)
Architecture, which has the goal of completely separating the
Calculations and Interface from each other.

    - Model: responsible for handling the data and calculations

    - View: responsible for the interface

    - Controller: responsible for coordinating interactions between
      the View and Model.

To exemplify this architecture, a simple compound interest calculator
application is created in this project.
 */

public class App {
    public static void main (String[] args) {

        View theView = new View();
        Model theModel = new Model();
        Controller theController = new Controller(theView, theModel);
        theView.setVisible(true);

    }
}
