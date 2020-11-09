package amz.gdpr.test.HerokuJPA.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import amz.gdpr.test.HerokuJPA.model.Application;



@Repository
	public interface HerokuJpaRepository extends CrudRepository<Application, Integer> {


//void findbyupdate(int id);

}
