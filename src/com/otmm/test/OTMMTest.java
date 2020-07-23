package com.otmm.test;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import com.otmm.helper.EntityManagerFactoryRegistry;
import com.otmmjpa.entities.ContractWork;
import com.otmmjpa.entities.Material;

public class OTMMTest {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory=null;
		EntityManager entityManager=null;
		EntityTransaction transaction=null;
		Material material=null;
		ContractWork contractWork=null;
		Map<String,Material> materials=null;
		boolean flag=false;
		try
		{
			entityManagerFactory=EntityManagerFactoryRegistry.getEntityManagerFactory();
			entityManager=entityManagerFactory.createEntityManager();
			transaction=entityManager.getTransaction();
			transaction.begin();
			
			/*material=new Material();
			material.setMaterialName("iron");
			material.setCost(25000.00);
			material.setQuantity(2500.00);
			entityManager.persist(material);
			materials=new HashMap<String, Material>();
			materials.put("Mtoo1",material);
			
			material=new Material();
			material.setMaterialName("steel");
			material.setCost(35000.00);
			material.setQuantity(1500.00);
			entityManager.persist(material);
			materials.put("Mtoo2",material);
			
			material=new Material();
			material.setMaterialName("copper");
			material.setCost(45000.00);
			material.setQuantity(1500.00);
			entityManager.persist(material);
			materials.put("Mtoo3",material);
			
			contractWork=new ContractWork();
			contractWork.setContractName("surya");
			contractWork.setDuration("3 years");
			contractWork.setContractDate(new Date());
			contractWork.setMaterials(materials);
			
			entityManager.persist(contractWork);
			*/
			System.out.println("material details"+entityManager.find(Material.class, 2));
System.out.println("contactworker details:"+entityManager.find(ContractWork.class, 1));
			flag=true;
						
		}
		finally
		{
			if(transaction!=null)
			{
				if(flag)
				{
					transaction.commit();
				}else
				{
					transaction.rollback();
				}
				entityManager.close();
			}EntityManagerFactoryRegistry.closeEntityManagerFactory();
		}
	}
}
