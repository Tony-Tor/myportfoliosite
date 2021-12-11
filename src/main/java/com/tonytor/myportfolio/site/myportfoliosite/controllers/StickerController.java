package com.tonytor.myportfolio.site.myportfoliosite.controllers;

import com.tonytor.myportfolio.site.myportfoliosite.model.Sticker;
import com.tonytor.myportfolio.site.myportfoliosite.repository.StickerRepository;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/sticker", produces = MediaType.APPLICATION_JSON_VALUE)
public class StickerController {

    private final StickerRepository repository;

    public StickerController(StickerRepository repository) {
        this.repository = repository;
    }

    @GetMapping()
    public List<Sticker> getAll(){
        Sticker sticker = new Sticker();
        sticker.setId(1);
        sticker.setText("text");
        List<Sticker> all = new ArrayList<>();
        all.add(sticker);

        return all;
    }
}
