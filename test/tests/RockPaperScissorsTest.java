package test.tests;

import static org.testng.Assert.*;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import src.fr.p10.miage.rps.model.RPSEnum;
import src.fr.p10.miage.rps.model.Result;
import src.fr.p10.miage.rps.model.RockPaperScissors;

import static org.testng.AssertJUnit.assertEquals;

/**
 * Created by nijeyaku on 27/09/2016.
 */
public class RockPaperScissorsTest {

    RockPaperScissors rps;

    @BeforeClass
    public void setUp() throws Exception {

       rps = new RockPaperScissors();
    }

    @AfterClass
    public void tearDown() throws Exception {

        rps = null;
    }


    @Parameters({"paper","rock"})
    @Test
    public void testWinPlay(String p1,String p2) throws Exception
    {
        assertEquals(rps.play(RPSEnum.valueOf(p1), RPSEnum.valueOf(p2)),Result.WIN);

        rps.play(RPSEnum.valueOf(p1), RPSEnum.valueOf(p2));
    }


   @Parameters({"paper","paper"})
   @Test
    public void testTiePlay(String p1, String p2) throws Exception
 {
     assertEquals(rps.play(RPSEnum.valueOf(p1), RPSEnum.valueOf(p2)),Result.TIE);

     rps.play(RPSEnum.valueOf(p1), RPSEnum.valueOf(p2));
  }


    @Parameters({"paper","scissors"})
    @Test
    public  void testLostPlay(String p1, String p2) throws Exception
    {
        assertEquals(rps.play(RPSEnum.valueOf(p1), RPSEnum.valueOf(p2)),Result.LOST);

        rps.play(RPSEnum.valueOf(p1), RPSEnum.valueOf(p2));

    }


}