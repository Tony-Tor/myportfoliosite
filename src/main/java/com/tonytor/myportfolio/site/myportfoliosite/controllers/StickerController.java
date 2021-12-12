package com.tonytor.myportfolio.site.myportfoliosite.controllers;

import com.tonytor.myportfolio.site.myportfoliosite.model.Sticker;
import com.tonytor.myportfolio.site.myportfoliosite.repository.StickerRepository;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

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
        return (List<Sticker>) repository.findAll();
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public void createSticker(@RequestBody Sticker sticker){
        repository.save(sticker);
    }
}
