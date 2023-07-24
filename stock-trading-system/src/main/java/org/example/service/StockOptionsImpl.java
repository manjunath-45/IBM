package org.example.service;

import java.util.List;

import org.example.model.Stock;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@NoArgsConstructor
@AllArgsConstructor

@Component
public class StockOptionsImpl implements StockOptions {
	
	@Autowired
	  private SessionFactory sessFactory;

	  @Override
	  public List<Stock> getAllStocks() {
	    Session session = sessFactory.openSession();
	    session.beginTransaction();
	    List<Stock> results = session.createQuery("FROM Stock S", Stock.class).getResultList();
	    session.getTransaction().commit();
	    return results;
	  }

	  @Override
	  public Stock getStockByName(String name) {
	    Session session = sessFactory.openSession();
	    session.beginTransaction();
	    Stock stock = session.get(Stock.class, name);
	    session.getTransaction().commit();
	    return stock;
	  }

	  @Override
	  public void createStock(String name, Integer price) 
	    {
	      createStock(name, (Double) (double) (int) price); 
	    }

	  @Override
	  public void createStock(String name, Double price) {
	    Stock s = new Stock(name, price);
	    Session session = sessFactory.openSession();
	    session.beginTransaction();
	    session.persist(s);
	    session.getTransaction().commit();
	  }

}
