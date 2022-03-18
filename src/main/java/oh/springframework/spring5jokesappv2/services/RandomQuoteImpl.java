package oh.springframework.spring5jokesappv2.services;

import oh.springframework.spring5jokesappv2.models.ChuckNorisQuotesGenerator;
import org.springframework.stereotype.Service;

@Service
public class RandomQuoteImpl implements RandomQuoteService{

    private ChuckNorisQuotesGenerator chuckNorisQuotesGenerator;

    public RandomQuoteImpl(ChuckNorisQuotesGenerator chuckNorisQuotesGenerator) {
        this.chuckNorisQuotesGenerator = chuckNorisQuotesGenerator;
    }

    @Override
    public String getRandomQuote() {
        return chuckNorisQuotesGenerator.getRandomQuote();
    }

}
