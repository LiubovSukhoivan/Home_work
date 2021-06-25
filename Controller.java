package sample;

import java.util.Scanner;

public class Controller {

    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model  = model;
        this.view = view;
    }

    public void processUser(){
        Scanner sc = new Scanner(System.in);
        String a = sc.next("Hello");
        String b = sc.next("world");


        model.setValue(inputIntValueWithScanner(sc));
        model.addIntOurValueA(a);
        model.addIntOurValueB(b);
        view.printMessageAndInt(View.OUR_INT, model.getValue());
    }

    public int inputIntValueWithScanner(Scanner sc) {
        view.printMessage(View.INPUT_INT_DATA);
        while( ! sc.hasNextInt()) {
            view.printMessage(View.WRONG_INPUT_INT_DATA + View.INPUT_INT_DATA);
            sc.next();
        }
        return sc.nextInt();
    }
}