package oh.springframework.spring5jokesappv2.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class RandomQuoteImpl implements RandomQuoteService{

    private final ChuckNorrisQuotes chuckNorisQuotes;

    public RandomQuoteImpl(ChuckNorrisQuotes chuckNorisQuotes) {
        this.chuckNorisQuotes = chuckNorisQuotes;
    }

    @Override
    public String getRandomQuote() {
        return chuckNorisQuotes.getRandomQuote();
    }

}
