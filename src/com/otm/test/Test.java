package com.otm.test;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.otm.entities.Member;
import com.otm.entities.Project;
import com.otm.helper.SessionFactoryRegistry;

public class Test {
/**
 * @param args
 */
public static void main(String[] args) 
{
	
    
	SessionFactory sessionFactory =null;
	Session session=null;
	Transaction transaction=null;
	Project project1=null;
	Member members1 =null;
	
	Member members2 =null;
	Member members3 =null;
	Member members4 =null;
	
	boolean flag=false;
	
	
	try {
		
		sessionFactory =SessionFactoryRegistry.getSessionFactory();
		session=sessionFactory.openSession();
		transaction=session.beginTransaction();
		members1=new Member();
		 members1.setMemberName("jana");
		 members1.setExperience("3years");
		 members1.setDesignation("sofwareEngineer");
		 members1.setRole("java developer");
		 int memberNo=(int)session.save(members1);
		 System.out.println("member no:"+memberNo);
		 
		 members1=session.get(Member.class, 1);
		 System.out.println("member1 details:"+members1);
		 
		 
		members2=new Member();
		members2.setMemberName("mani");
		members2.setExperience("4years");
		members2.setDesignation("associate Consultant");
		members2.setRole("java developer");
		int memberNo1=(int)session.save(members2);

		System.out.println("member no:"+memberNo1);
		members2=session.get(Member.class, 2);
		 System.out.println("member1 details:"+members2);
		 
		members3=new Member();
		members3.setMemberName("ramana");
		members3.setExperience("5years");
		members3.setDesignation("Consultant");
		members3.setRole("UI developer");
		int memberNo2=(int)session.save(members3);
		System.out.println("member no:"+memberNo2);

		
		members4=new Member();
		members4.setMemberName("chenna");
		members4.setExperience("6years");
		members4.setDesignation("senior Consultant");
		members4.setRole("team lead & java full stack developer");
		int memberNo3=(int)session.save(members4);
		System.out.println("member no:"+memberNo3);
		Set memberset=new HashSet<>();
		memberset.add(members1);
		memberset.add(members2);
		memberset.add(members3);
		memberset.add(members4);
		
		
		
		project1=new Project();
		project1.setProjectName("Health science");
		project1.setDescription("Health and Medical analytics");
		project1.setDuration("1years");
		project1.setClient("PJR solution");
		project1.setMembers(memberset);
		

int projectno=(int) session.save(project1);
		 
 project1 =session.get(Project.class,1);
 System.out.println("project details:"+project1);
			

flag=true;
	}
finally {
	

	if(transaction!=null)
	{
		if(flag)
		{
			transaction.commit();
		}else
		{
		transaction.rollback();
	}
	}
	
}
	
	SessionFactoryRegistry.closeSessionFactory();
}	

	}
	
	
	
	
