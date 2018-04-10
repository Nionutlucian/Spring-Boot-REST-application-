package com.star.star.rest;

import com.star.star.model.*;
import com.star.star.service.DocumentService;
import com.star.star.service.DosarService;
import com.sun.org.apache.regexp.internal.RE;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:9999", maxAge = 3600)
public class DosarController {

    @Autowired
    DosarService dosarService;

    @Autowired
    DocumentService documentService;

    @RequestMapping(value = "/dosar",method = RequestMethod.POST)
    public Dosar creareDosar(@RequestBody Dosar d){
        return dosarService.creareDosar(d);
    }


    @RequestMapping(value = "/tip",method = RequestMethod.GET)
    public List<TipContract> afisareTipContract(){
        return dosarService.afisareTipContract();
    }

    @RequestMapping(value = "/entitate",method = RequestMethod.GET)
    public List<DenumireEntitate> afisareEntitate(){
        return dosarService.afisareEntitati();
    }

    @RequestMapping(value = "/c_document",method = RequestMethod.POST)
    public Document creareDocument(@RequestBody Document d){
        return documentService.creareDocument(d);
    }

    @RequestMapping(value = "/afisaredosare",method = RequestMethod.GET)
    public List<Dosar> afisareDosare(@RequestParam("id_user") int id_user){
        return dosarService.afisareDosare(id_user);
    }

    @RequestMapping(value = "/afisaretipdocument",method = RequestMethod.GET)
    public List<TipDocument> afisareTipDocument(){
        return documentService.afisareTipDocument();
    }

    @RequestMapping(value = "/afisaredocumente",method = RequestMethod.GET)
    public List<Document> afisareDocumente(@RequestParam("id_user") int id_user){
        return documentService.afisareDocumente(id_user);
    }

}
