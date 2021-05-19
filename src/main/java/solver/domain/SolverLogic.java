
package solver.domain;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Luokka sovelluslogiikan toteuttamiseen.
 * @author marike
 */
public class SolverLogic {
    
    private int[][] ruudukko;
    
    /**
     * Konstruktori alustaa ruudukon satunnaisilla numeroilla.
     */
    public SolverLogic() {
        ruudukko = new int[4][4];
        ruudukko = taytaRuudukko(ruudukko);
    }
    /**
     * Täyttää ruudukon numeroilla 0-15 ja laittaa ne satunnaiseen järjestykseen.
     * @param ruudukko Alustettu ruudukko
     * @return täytetty ruudukko
     */
    public int[][] taytaRuudukko(int[][] ruudukko) {
        ArrayList<Integer> numerot = new ArrayList<>();
        
        for (int i = 0; i <= 15; i++) {
            numerot.add(i);
        }
        Collections.shuffle(numerot);
        
        int laskuri = 0;
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                ruudukko[i][j] = numerot.get(laskuri);
                laskuri++;
            }
        }
        return ruudukko;
    }

    public int[][] getRuudukko() {
        return ruudukko;
    }
}
