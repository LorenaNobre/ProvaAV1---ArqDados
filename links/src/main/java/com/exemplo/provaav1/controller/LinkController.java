package com.exemplo.provaav1.controller;

import com.exemplo.provaav1.model.Link;
import com.exemplo.provaav1.service.LinkService;

import org.springframework.web.bind.annotation.*;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping("/links")
public class LinkController {
    @Autowired
    private LinkService linkService;

    @GetMapping
    public List<Link> listarLinks() {
        return linkService.listarLinks();
    }

    @GetMapping("/{id}")
    public Link listarLink(@PathVariable Long id) {
        return linkService.listarLink(id);
    }
    
    @PostMapping
    public Link criarLink(@RequestBody Link link) {
        return linkService.criarLink(link);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarPorId(@PathVariable Long id) {
        linkService.deletarPorId(id);
        return ResponseEntity.noContent().build();
    }

}
