import org.junit.Test;

import static org.junit.Assert.*;

public class TennisGameTest {

    static final String PLAYER_ONE = "player1";
    static final String PLAYER_TWO = "player2";

    static final String SCORE_LOVE_ALL = "Love-All";
    static final String SCORE_FIFTEEN_ALL = "Fifteen-All";
    static final String SCORE_THIRTY_ALL = "Thirty-All";
    static final String SCORE_DEUCE = "Deuce";
    static final String SCORE_ADVANTAGE_PLAYER_ONE = "Advantage player1";
    static final String SCORE_ADVANTAGE_PLAYER_TWO = "Advantage player2";
    static final String SCORE_WIN_PLAYER_ONE = "Win for player1";
    static final String SCORE_WIN_PLAYER_TWO = "Win for player2";

    static final String SCORE_LOVE = "Love";
    static final String SCORE_FIFTEEN = "Fifteen";
    static final String SCORE_THIRTY = "Thirty";
    static final String SCORE_FORTY = "Forty";

    @Test
    public void testScoreLoveAll() throws Exception {
        TennisGame game = new TennisGame(PLAYER_ONE, PLAYER_TWO);
        String score = game.getScore();
        assertEquals(SCORE_LOVE_ALL, score);
    }

    @Test
    public void testScoreFifteenAll() throws Exception {
        TennisGame game = new TennisGame(PLAYER_ONE, PLAYER_TWO);
        game.wonPoint(PLAYER_ONE);
        game.wonPoint(PLAYER_TWO);
        String score = game.getScore();
        assertEquals(SCORE_FIFTEEN_ALL, score);
    }

}