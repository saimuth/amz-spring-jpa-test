package amz.gdpr.test.HerokuJPA.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import amz.gdpr.test.HerokuJPA.model.Application;
import amz.gdpr.test.HerokuJPA.repository.HerokuJpaRepository;
@Service
public class HerokujpaTestService {

	@Autowired
	private HerokuJpaRepository herokuJpaRepository;
	
	public void updaateBulkData() {
		//int id=1;
		try {
			for(int i = 1;i<=3710;i++) {
			boolean obj=herokuJpaRepository.findById(i).isPresent();
			System.out.println("RecordExits:"+obj+":"+i);
			if(obj) {
			Application application = herokuJpaRepository.findById(i).get(); 
				
				//application.setId(id);
				application.setCandidate("XCQWE7"+i);
				
				application.setCandidate_withdraws_detail_c("CWD");
				application.setFelony_conviction_question("FLCN");
				application.setNational_id_country_ps_c("***");
				application.setRequisition_hiring_function("RHF$$");
				
				herokuJpaRepository.save(application);
			}	
			}	
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
