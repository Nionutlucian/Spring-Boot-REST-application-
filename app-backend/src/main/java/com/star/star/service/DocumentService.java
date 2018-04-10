package com.star.star.service;

import com.star.star.model.Document;
import com.star.star.model.Dosar;
import com.star.star.model.TipDocument;
import com.star.star.repository.DocumentRepository;
import com.star.star.repository.TipDocumentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DocumentService {

    @Autowired
    DocumentRepository documentRepository;

    @Autowired
    TipDocumentRepository documentTipRepository;

    public Document creareDocument(Document d){
       return documentRepository.save(d);
    }

    public List<TipDocument> afisareTipDocument(){return documentTipRepository.findAll();}

   public List<Document> afisareDocumente(int id_user){return documentRepository.afisareDocumente(id_user);}
}
