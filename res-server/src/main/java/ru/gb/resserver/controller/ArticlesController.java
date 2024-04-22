package ru.gb.resserver.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.gb.resserver.domain.Result;
import ru.gb.resserver.service.CatsService;

@RestController
@AllArgsConstructor
public class ArticlesController {

    private final CatsService catsService;

    @GetMapping("/articles")
//    public String[] getArticles() {
//        return new String[] { "Article 1", "Article 2", "Article 3" };
//    }

    public Result[] getArticles() {
        return catsService.get();
    }



}
