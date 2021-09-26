package com.keyin;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runners.Parameterized;

import java.nio.file.Path;
import java.nio.file.Paths;

public class SuggestionEngineTest {
    @Test
    public void testGenerateSuggestions() throws Exception {
        SuggestionEngine suggestionEngine = new SuggestionEngine();

        suggestionEngine.loadDictionaryData( Path.of("words.txt"));

        Assert.assertTrue(suggestionEngine.generateSuggestions("hellw").contains("hello"));
    }

    @Test
    public void testGenerateSuggestionsFail() throws Exception {
        SuggestionEngine suggestionEngine = new SuggestionEngine();

        suggestionEngine.loadDictionaryData( Path.of("words.txt"));

        Assert.assertFalse(suggestionEngine.generateSuggestions("hello").contains("hello"));
    }
}
