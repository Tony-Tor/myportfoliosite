package com.tonytor.myportfolio.site.myportfoliosite.controllers;

import com.tonytor.myportfolio.site.myportfoliosite.model.Sticker;
import com.tonytor.myportfolio.site.myportfoliosite.repository.StickerRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class StickerController {

    private final StickerRepository repository;

    public StickerController(StickerRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/sticker")
    List<Sticker> getStickers(){
        return (List<Sticker>) repository.findAll();
    }
}
