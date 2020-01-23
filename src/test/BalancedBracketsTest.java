package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }
    @Test
    public void NotNull(){
        assertNotNull(BalancedBrackets.hasBalancedBrackets(""));
    }
    @Test
    public void onlyBracketsReturnsTrue(){
        assertEquals(true, BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void bracketsAndCharsReturnsTrue(){
        assertEquals(true, BalancedBrackets.hasBalancedBrackets("[uioio]"));
    }
    @Test
    public void stringOnTheOutsideOfBalancedBrackets(){
        assertEquals(true, BalancedBrackets.hasBalancedBrackets("asdf[]"));
    }
    @Test
    public void curlyBracketsReturnFalse(){
        assertFalse( BalancedBrackets.hasBalancedBrackets("{}"));
    }
    @Test
    public void onlyOpenBracketReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }
    @Test
    public void backwardBracketsReturnFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }
    @Test
    public void onlyClosingBracketReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }
    @Test
    public void arrowBracketsReturnFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("<>"));
    }
    @Test
    public void backFacingBracketsWithTextBetweenReturnFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Code["));
    }
    @Test
    public void hasBracketsBeforeString(){
        assertEquals(true, BalancedBrackets.hasBalancedBrackets("[]LaunchCode"));
    }
}
