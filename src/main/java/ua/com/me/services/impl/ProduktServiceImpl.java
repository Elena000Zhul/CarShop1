package ua.com.me.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ua.com.me.dao.ProduktDAO;
import ua.com.me.entity.Produkt;
import ua.com.me.services.ProduktService;

import java.util.List;
@Service
@Transactional
public class ProduktServiceImpl implements ProduktService{

    @Autowired
    private ProduktDAO produktDAO;


    @Override
    public void saveProdukt (Produkt produkt) {
        produktDAO.save(produkt);
    }

    @Override
    public List<Produkt> allProdukts() {
        return produktDAO.findAll();
    }

    @Override
    public Produkt findOne(int id) {
        return produktDAO.findOne(id);
    }


}
