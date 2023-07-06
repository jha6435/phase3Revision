package com.krishna.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import com.krishna.entity.Learner;
import com.krishna.repo.LearnerRepository;

@SpringBootApplication
public class SpringBootDemo2Application {

	public static void main(String[] args) {
	ApplicationContext context = 
				SpringApplication.run(SpringBootDemo2Application.class, args);
		 LearnerRepository rep = context.getBean("LearnerRepository",LearnerRepository.class);
		 
		 Learner l=new Learner();
		 l.setName("sakshi jha");
		 l.setCity("faridabad");
		 
		 Learner la = rep.save(l);
		 System.out.println(la);
	}

}
