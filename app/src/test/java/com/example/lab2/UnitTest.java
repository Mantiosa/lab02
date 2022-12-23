package com.example.lab2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import utils.TextCounter;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class UtilsClassUnitTest {
    @Test
    public void addition_isCorrect()
    {
        assertEquals(4, 2 + 2);
    }
    @Test
    public void Given_One_Char_CharsCount_Is_Correct()
    {
        final String givenString = "A";

        final String expectedResult = "1";


        assertEquals(expectedResult, String.valueOf(TextCounter.getCharsCount(givenString)));
    }
    @Test
    public void Given_Ten_Chars_CharsCount_Is_Correct()
    {
        final String givenString = "0a2d7jf 9B";

        final String expectedResult = "10";


        assertEquals(expectedResult, String.valueOf(TextCounter.getCharsCount(givenString)));
    }
    @Test
    public void Given_A_Blank_Space_String_CharsCount_Is_Correct()
    {
        final String givenString = "0";

        final String expectedResult = "1";


        assertEquals(expectedResult, String.valueOf(TextCounter.getCharsCount(givenString)));
    }
    @Test
    public void Given_One_Word_WordsCount_Is_Correct()
    {
        final String givenString = "kebabas";

        final String expectedResult = "1";


        assertEquals(expectedResult, String.valueOf(TextCounter.getWordsCount(givenString)));
    }
    @Test
    public void Given_Words_Seperated_By_Space_String_Word_WordsCount_Is_Correct()
    {
        final String givenString = "vienas du trys keturi penki sesi septyni atuosni devyni desimt";

        final String expectedResult = "10";


        assertEquals(expectedResult, String.valueOf(TextCounter.getWordsCount(givenString)));
    }
    @Test
    public void Given_Words_Seperated_By_Comma_String_Word_WordsCount_Is_Correct()
    {
        final String givenString = "vienas,du,trys,keturi,penki,sesi,septyni,atuosni,devyni,desimt";

        final String expectedResult = "10";


        assertEquals(expectedResult, String.valueOf(TextCounter.getWordsCount(givenString)));
    }
    @Test
    public void Given_Words_Seperated_By_Dot_String_Word_WordsCount_Is_Correct()
    {
        final String givenString = "vienas.du.trys.keturi.penki.sesi.septyni.atuosni.devyni.desimt";

        final String expectedResult = "10";


        assertEquals(expectedResult, String.valueOf(TextCounter.getWordsCount(givenString)));
    }




}

