package com.star.star.service;

import com.star.star.model.DenumireEntitate;
import com.star.star.model.Dosar;
import com.star.star.model.TipContract;
import com.star.star.model.User;
import com.star.star.repository.DenumireEntitateRepository;
import com.star.star.repository.DosarRepository;
import com.star.star.repository.TipContractRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DosarService {

    @Autowired
    DosarRepository dosarRepository;

    @Autowired
    DenumireEntitateRepository denumireEntitateRepository;

    @Autowired
    TipContractRepository tipContractRepository;

    public Dosar creareDosar(Dosar d){
        dosarRepository.save(d);
        return d;
    }

    public List<DenumireEntitate> afisareEntitati(){
        return denumireEntitateRepository.findAll();
    }

    public List<TipContract> afisareTipContract(){
        return tipContractRepository.findAll();
    }

    public List<Dosar> afisareDosare(int id){
        return dosarRepository.findDosare(id);
    }

}
