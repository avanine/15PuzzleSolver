
package solver.ui;

import solver.domain.SolverLogic;
import javafx.application.Application;
import javafx.stage.Stage;

/**
 * Luokka graafisen käyttöliittymän totetuttamiseen.
 * @author marike
 */
public class SolverUi extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        // testi
        SolverLogic solver = new SolverLogic();
        //solver.naytaRuudukko();
    }
    /**
     * Main-metodi luokan käynnistämiseen.
     * @param args args
     */
    public static void main(String args[]) {
        launch(args);
    }
    
}
