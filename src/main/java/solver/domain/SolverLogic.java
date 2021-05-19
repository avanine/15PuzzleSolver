
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
    /**
     * Tarkistaa, onko peli mahdollista ratkaista.
     * @return true tai false
     */
    public boolean onRatkeava() {
        return true;
    }
    /**
     * Laskee inversioiden lukumäärän, eli sen kuinka monta kertaa suurempi numero esiintyy ruudukossa ennen pienempää.
     * @param ruudukko peliruudukko
     * @return inversioiden lukumäärä
     */
    public int inversiot(int[][] ruudukko) {
        int[] ruudukonNumerot = new int[16];
        int indeksi = 0;
        // muutetaan ruudukko arrayksi vertailua varten
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                ruudukonNumerot[indeksi] = ruudukko[i][j];
                indeksi++;
            }
        }
        
        int laskuri = 0;
        
        for (int i = 0; i < 15; i++) {
            for (int j = i + 1; j < 16; j++) {
                if ((ruudukonNumerot[i] > ruudukonNumerot[j]) && (ruudukonNumerot[i] != 0) && (ruudukonNumerot[j] != 0)) {
                    laskuri++;
                }
            }
        }
        return laskuri;
    }
    /**
     * Palauttaa alhaalta laskettuna rivin, jolla tyhjä ruutu sijaitsee.
     * @param ruudukko peliruudukko
     * @return rivinumero
     */
    public int tyhjanRuudunSijainti(int[][] ruudukko) {
        for (int i = 3; i >= 0; i--) {
            for (int j = 3; j >= 0; j--) {
                if (ruudukko[i][j] == 0) {
                    return 4 - i;
                }
            }
        }
        return 0;
    }
}
