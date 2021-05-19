package domain;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import solver.domain.SolverLogic;

/**
 *
 * @author marike
 */
public class SolverLogicTest {
    
    SolverLogic solver;
    int[][] ruudukko;

    @Before
    public void setUp() {
        solver = new SolverLogic();
        ruudukko = solver.getRuudukko();
    }

    @Test
    public void ruudukkoTayttyy() {
        int tyhjat = 0;
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (ruudukko[i][j] == 0) {
                    tyhjat++;
                }
            }
        }
        assertTrue(tyhjat == 1);
    }
    
    @Test
    public void tyhjanRuudunSijaintiOikein() {
        
        int[][] testi = new int[4][4];
        
        int laskuri = 0;
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                testi[i][j] = laskuri;
                laskuri++;
            }
        }
        
        assertTrue(solver.tyhjanRuudunSijainti(testi) == 4);
        
        testi[0][0] = 9;
        testi[2][1] = 0;
        
        assertTrue(solver.tyhjanRuudunSijainti(testi) == 2);
    }
    
    @Test
    public void inversiotOikein() {
        int[][] testi = { {1, 2, 3, 4} , {5, 6, 8, 7} , {9, 10, 11, 12} , {15, 14, 0, 13} };
        
        assertTrue(solver.inversiot(testi) == 4);
    }
}
