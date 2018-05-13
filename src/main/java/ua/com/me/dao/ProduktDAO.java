package ua.com.me.dao;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
import ua.com.me.entity.Produkt;
// JpaRepository : перший Дженерік - обєк сутності для якої створено репозиторій,другий Дженерік - обгортка такого ж  типу,
//як ІД нашої ентіті.
public interface ProduktDAO  extends JpaRepository<Produkt, Integer>{

}
