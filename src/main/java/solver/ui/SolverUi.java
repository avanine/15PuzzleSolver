package solver.ui;

import solver.domain.SolverLogic;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.TilePane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

/**
 * Luokka graafisen käyttöliittymän totetuttamiseen.
 *
 * @author marike
 */
public class SolverUi extends Application {

    SolverLogic ratkaisija;

    @Override
    public void init() throws Exception {
        ratkaisija = new SolverLogic();
    }

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("15-pelin ratkaisija");
        stage.setResizable(false);
        stage.setScene(pelinakyma());
        stage.show();

    }

    /**
     * Luo pelinäkymän jossa on yläreuna, alareuna sekä peliruudukko keskellä.
     *
     * @return scene
     */
    public Scene pelinakyma() {
        Pane ylareuna = ylareuna();
        BorderPane pohja = new BorderPane();
        pohja.setTop(ylareuna);
        pohja.setLeft(new HBox());
        pohja.setRight(new HBox());
        pohja.setBottom(alareuna());
        pohja.setCenter(keskialue());

        Scene scene = new Scene(pohja, 500, 650);

        return scene;
    }

    /**
     * Luo näkymän yläreunan, jossa näkyy siirtojen määrä sekä ratkaisuun
     * kulunut aika.
     *
     * @return näkymän yläreuna
     */
    private Pane ylareuna() {
        Pane reuna = new Pane();
        reuna.setBackground(new Background(new BackgroundFill(Color.ANTIQUEWHITE, CornerRadii.EMPTY, Insets.EMPTY)));
        Label laskuri = new Label("   Siirrot: 4"
                + "     Ratkaisuun kulunut aika: 12.345s");
        laskuri.setFont(Font.font("Courier New", FontWeight.BOLD, 16));
        HBox hbox = new HBox(laskuri);
        reuna.getChildren().add(hbox);

        return reuna;
    }

    /**
     * Luo näkymälle alareunan, jossa on reset-nappi.
     *
     * @return näkymän alareuna
     */
    private AnchorPane alareuna() {
        AnchorPane reuna = new AnchorPane();
        Button resetNappula = new Button("Uusi ruudukko");
        resetNappula.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
        resetNappula.setTextFill(Color.BLACK);
        resetNappula.setFont(Font.font("Courier New", 20));
        AnchorPane.setBottomAnchor(resetNappula, 20.0);
        AnchorPane.setRightAnchor(resetNappula, 30.0);
        reuna.getChildren().add(resetNappula);

        return reuna;
    }

    /**
     * Luo ruudun keskiosan, eli varsinaisen pelinäkymän.
     *
     * @return näkymän keskialue
     */
    private TilePane keskialue() {
        TilePane keskialue = new TilePane();

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                keskialue.getChildren().add(new Label("x"));
            }
        }

        return keskialue;
    }

    /**
     * Main-metodi luokan käynnistämiseen.
     *
     * @param args args
     */
    public static void main(String args[]) {
        launch(args);
    }

}
