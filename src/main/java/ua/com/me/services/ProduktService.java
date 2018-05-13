package ua.com.me.services;


import ua.com.me.entity.Produkt;

import java.util.List;

public interface ProduktService {
  void saveProdukt (Produkt produkt) ;

  List<Produkt> allProdukts();


  Produkt findOne(int id);





}
