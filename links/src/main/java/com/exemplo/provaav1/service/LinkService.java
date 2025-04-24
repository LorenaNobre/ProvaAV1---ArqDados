package com.exemplo.provaav1.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.exemplo.provaav1.model.Link;
import com.exemplo.provaav1.repository.LinkRepository;

@Service
public class LinkService {
    @Autowired
    private LinkRepository linkRepository;

    public List<Link> listarLinks() {
        return linkRepository.findAll();
    }

    public Link listarLink(Long id) {
        return linkRepository.findById(id).orElse(null);
    }

    public Link criarLink(@RequestBody Link link) {
        return linkRepository.save(link);
    }

    public void deletarPorId(Long id) {
        linkRepository.deleteById(id);
    }

}