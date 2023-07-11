package com.example.service;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.example.factory.MyHibernateFactory;
import com.example.model.Inventory;
import com.example.model.Product;

public class ProductServiceImpl implements ProductService{
	
    private SessionFactory sessionFactory;
	
	private Session session=null;
	{
		sessionFactory=MyHibernateFactory.getSessionFactory();
	}

	@Override
	public Product createProduct(Product product) {
		
		session=sessionFactory.openSession();
		session.getTransaction().begin();
		session.save(product);
		session.getTransaction().commit();
		return product;
		
	}

	@Override
	public List<Product> getAllProduct() {
		// TODO Auto-generated method stub
		session = sessionFactory.openSession();
		TypedQuery<Product> query = session.createQuery("FROM Product I" , Product.class);
		List<Product> list =query.getResultList();
		return list;
	}

	@Override
	public Product getAlProduct(int productId) {
		// TODO Auto-generated method stub
		session = sessionFactory.openSession();
		Product i = session.find(Product.class, productId);
		return i;
		
	}

	@Override
	public List<Product> getProductByName(String productName) {
		// TODO Auto-generated method stub
		session = sessionFactory.openSession();
		TypedQuery<Product> query = session.createQuery("FROM Inventory I where I product.Name=pName",Product.class);
		query.setParameter("pName", productName);
		
		return query.getResultList();
	
	}

}
