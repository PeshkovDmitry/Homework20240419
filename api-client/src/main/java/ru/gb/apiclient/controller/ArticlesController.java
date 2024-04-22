package ru.gb.apiclient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.client.OAuth2AuthorizedClient;
import org.springframework.security.oauth2.client.annotation.RegisteredOAuth2AuthorizedClient;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.reactive.function.client.WebClient;
import ru.gb.apiclient.domain.Result;

import static org.springframework.security.oauth2.client.web.reactive.function.client.ServerOAuth2AuthorizedClientExchangeFilterFunction.oauth2AuthorizedClient;

@Controller
public class ArticlesController {

    @Autowired
    private WebClient webClient;

    @GetMapping(value = "/")
    public String getArticles(
            @RegisteredOAuth2AuthorizedClient("articles-client-authorization-code") OAuth2AuthorizedClient authorizedClient,
            Model model
    ) {
        Result[] results = this.webClient
                .get()
                .uri("http://127.0.0.1:8090/articles")
                .attributes(oauth2AuthorizedClient(authorizedClient))
                .retrieve()
                .bodyToMono(Result[].class)
                .block();
        model.addAttribute("cat", results[0]);
        return "cat";
    }
}
