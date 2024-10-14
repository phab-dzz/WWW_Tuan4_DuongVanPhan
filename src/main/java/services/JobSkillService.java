package services;

import DTOs.JobSkillDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repositories.impl.JobSkillRepositoryImpl;

import java.util.List;

@Service
public class JobSkillService {
    private JobSkillRepositoryImpl jobSkillService;
    @Autowired
    public JobSkillService(JobSkillRepositoryImpl jobSkillRepository) {
        this.jobSkillService = jobSkillRepository;
    }
    public boolean add(JobSkillDTO jobskill){
        return  jobSkillService.add(jobskill);
    }
    public boolean update(JobSkillDTO jobskill){
        return  jobSkillService.update(jobskill);
    }
    public boolean delete(String id){
        return  jobSkillService.delete(id);
    }
    public List<JobSkillDTO> findAll(){
        return jobSkillService.findAll();
    }
    public JobSkillDTO findOne(String id){
        return  jobSkillService.findById(id);
    }
}
