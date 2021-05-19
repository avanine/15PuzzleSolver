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
}
