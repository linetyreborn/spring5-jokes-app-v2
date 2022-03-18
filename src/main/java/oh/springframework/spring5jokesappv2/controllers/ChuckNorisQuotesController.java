package oh.springframework.spring5jokesappv2.controllers;

import oh.springframework.spring5jokesappv2.services.RandomQuoteService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ChuckNorisQuotesController {
    private RandomQuoteService RandomQuoteService;

    public ChuckNorisQuotesController(RandomQuoteService randomQuoteService) {
        RandomQuoteService = randomQuoteService;
    }
    @RequestMapping("/")
    public String getRandomQuote(Model model) {
        model.addAttribute("randomQuote", RandomQuoteService.getRandomQuote());
        return "quotes/randomQuote";
    }
}
