package com.otmjpa.test;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.otmjpa.entities.Category;
import com.otmjpa.entities.Product;
import com.otmjpa.helper.EntityManagerFactoryRegistry;

public class OtmlASAnnontationTest {
	
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=null;
		EntityManager entityManager=null;
		EntityTransaction entityTransaction=null;
		Product product=null;
		Category category=null;
		boolean flag=false;
		Set<Product> products=null;
		
		{
			try {
				entityManagerFactory=EntityManagerFactoryRegistry.getEntityManagerFactory();
				entityManager=entityManagerFactory.createEntityManager();
				entityTransaction=entityManager.getTransaction();
				entityTransaction.begin();
				
				product=new Product();
				product.setProductName("washing machine");
				product.setDescription("bosch and dryer available");
				product.setManufacurer("bosch");
				product.setWarrantyYears("10 years");
				product.setPrice(25000.00);
				entityManager.persist(product);
				
				products=new HashSet<>();
				products.add(product);
				product=new Product();
				product.setProductName("TV");
				product.setDescription("55 inches with high resolution");
				product.setManufacurer("bosch");
				product.setWarrantyYears("15 years");
				product.setPrice(55000.00);
				entityManager.persist(product);
				
				products.add(product);
				
				
				
				category=new Category();
				category.setCategoryName("home applicance");
				category.setDescription("home usage purpose");
				category.setProducts(products);
				entityManager.persist(category);
				
				
				
				
				flag=true;
			} finally {
if(entityTransaction!=null)
{
	if(flag)
	{
		entityTransaction.commit();
	}
	else {
		entityTransaction.rollback();
	}
entityManager.close();
}
EntityManagerFactoryRegistry.closeEntityManagerFactory();

			}
		}
		
		
	}

}
