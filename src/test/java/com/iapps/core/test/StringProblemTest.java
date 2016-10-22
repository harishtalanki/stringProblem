package com.iapps.core.test;

import com.iapps.core.StringProblem;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Created by HARISHA.TALANKI on 10/22/2016.
 */
public class StringProblemTest {
    @BeforeClass
    public void beforeClassSetup(){
        //Can perform any specific operations before running the class
    }

    @Test
    public void testReplaceCharacterWithEmptyString(){
        StringProblem s1 = this.createObject("", 'a');

        Assert.assertEquals("",s1.replaceCharacter(), "Empty test failed for own method");
    }

    @Test
    public void testReplaceCharacterStringClassWithEmptyString(){
        StringProblem s1 = this.createObject("", 'a');

        Assert.assertEquals("",s1.replaceCharacterStringClass(), "Empty test failed for string class method");
    }

    @Test
    public void testReplaceCharacterWithNullString(){
        StringProblem s1 = this.createObject(null, 'a');

        Assert.assertEquals("",s1.replaceCharacter(), "Null test failed for own method");
    }

    @Test
    public void testReplaceCharacterStringClassWithNullString(){
        StringProblem s1 = this.createObject(null, 'a');

        Assert.assertEquals("",s1.replaceCharacterStringClass(), "Null test failed for string class method");
    }

    @Test
    public void testReplaceCharacterWithValidTest(){
        StringProblem s1 = this.createObject("zzziazzzpzpzzzzszzzz", 'z');

        Assert.assertEquals("iapps", s1.replaceCharacter(), "Valid scenario failed for own method");
    }

    @Test
    public void testReplaceCharacterStringClassWithValidTest(){
        StringProblem s1 = this.createObject("zzziazzzpzpzzzzszzzz", 'z');

        Assert.assertEquals("iapps",s1.replaceCharacterStringClass(), "Valid Scenario failed for string class method");
    }

    @Test
    public void testReplaceCharactersNegativeScenario(){
        StringProblem s1 = this.createObject("rrrqqqtir", 'r');

        Assert.assertNotEquals("qqqtir", s1.replaceCharacter(), "Negative scenario failed for own method");
    }

    @Test
    public void testReplaceCharacterStringClassNegativeScenario(){
        StringProblem s1 = this.createObject("rrrqqqtir", 'r');

        Assert.assertNotEquals("rrrqqqtir",s1.replaceCharacterStringClass(), "Negative Scenario failed for string class method");
    }

    @Test
    public void testReplaceCharactersWithNoOccurance(){
        StringProblem s1 = this.createObject("abcdefghij", 'z');

        Assert.assertEquals("abcdefghij", s1.replaceCharacter(), "No occurance test failed for own method");
    }

    @Test
    public void testReplaceCharactersStringClassWithNoOccurance(){
        StringProblem s1 = this.createObject("abcdefghij", 'z');

        Assert.assertEquals("abcdefghij", s1.replaceCharacterStringClass(), "No occurance test failed for String class method");
    }

    @Test
    public void testReplaceCharactersWithSpacesInString(){
        StringProblem s1 = this.createObject("abb bbd", 'b');

        Assert.assertEquals("a d", s1.replaceCharacter(), "Spaces in string test failed for own method");
    }

    @Test
    public void testReplaceCharactersStringClassWithSpacesInString(){
        StringProblem s1 = this.createObject("abb bbd", 'b');

        Assert.assertEquals("a d", s1.replaceCharacterStringClass(), "Spaces in string test failed for String class method");
    }

    @Test
    public void testReplaceCharactersRemoveSpacesInString(){
        StringProblem s1 = this.createObject("a  bb    bbd", ' ');

        Assert.assertEquals("abbbbd", s1.replaceCharacter(), "Removing  spaces in string test failed for own method");
    }

    @Test
    public void testReplaceCharactersStringClassRemoveSpacesInString(){
        StringProblem s1 = this.createObject("a  bb    bb  d", ' ');

        Assert.assertEquals("abbbbd", s1.replaceCharacterStringClass(), "Removing Spaces in string test failed for String class method");
    }

    @Test
    public void testReplaceCharactersRemoveAllChars(){
        StringProblem s1 = this.createObject("aaaaaaa", 'a');

        Assert.assertEquals("", s1.replaceCharacter(), "Removing  all chars in string test failed for own method");
    }

    @Test
    public void testReplaceCharactersStringClassRemoveAllChars(){
        StringProblem s1 = this.createObject("zzzzzzzzz", 'z');

        Assert.assertEquals("", s1.replaceCharacterStringClass(), "Removing all chars in string test failed for String class method");
    }

    @Test
    public void testReplaceCharactersRemoveSpecialChars(){
        StringProblem s1 = this.createObject("aa^^^aaa", '^');

        Assert.assertEquals("aaaaa", s1.replaceCharacter(), "Removing  special chars in string test failed for own method");
    }

    @Test
    public void testReplaceCharactersStringClassRemoveSpecialChars(){
        StringProblem s1 = this.createObject("z-----zzz", '-');

        Assert.assertEquals("zzzz", s1.replaceCharacterStringClass(), "Removing special chars in string test failed for String class method");
    }

    @Test
    public void testReplaceCharactersRemoveSingleCharacterString(){
        StringProblem s1 = this.createObject("a", 'a');

        Assert.assertEquals("", s1.replaceCharacter(), "Removing  single char in string test failed for own method");
    }

    @Test
    public void testReplaceCharactersStringClassRemoveSingleCharacterString(){
        StringProblem s1 = this.createObject("z", 'z');

        Assert.assertEquals("", s1.replaceCharacterStringClass(), "Removing  single char  in string test failed for String class method");
    }

    @AfterClass
    public void afterClassSetup(){
        //Can perform any specific operations after running the class
    }

    public StringProblem createObject(String a, Character c){
        return new StringProblem(a, c);
    }
}
