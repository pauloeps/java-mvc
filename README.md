# Simple Java MVC

This is a simple example of a Model View Controller (MVC) Architecture, which has the goal of completely separating the Calculations and Interface from each other.

<img src="resources/class-diagram.png" width="500">

* Model: responsible for handling the data and calculations

* View: responsible for the interface

* Controller: responsible for coordinating interactions between the View and Model.

To exemplify this architecture, a simple compound interest calculator application is created in this project:

<img src="resources/window-1.png" width="300">

<img src="resources/window-2.png" width="200">

## Deploying

Make sure to have Java JDK installed. The run the following commands:

`javac App.java`

`java App`