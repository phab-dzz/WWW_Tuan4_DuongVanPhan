package services;

import DTOs.JObDTO;
import models.Job;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repositories.impl.JobRepositoryImpl;

import java.util.List;
@Service
public class JobService {
    private JobRepositoryImpl jobRepository ;

    @Autowired
    public JobService(JobRepositoryImpl jobRepository) {
        this.jobRepository = jobRepository;
    }
    public boolean addJob(JObDTO job) {
        return
                jobRepository.addJob(job);
    }
    public List<JObDTO> getAllJobs() {
        return jobRepository.getAllJobs();
    }
    public boolean updateJob(JObDTO job) {
        return jobRepository.updateJob(job);
    }
    public boolean deleteJob(String id) {
        return jobRepository.deleteJob(id);
    }
    public JObDTO findJob(String id) {
        return  jobRepository.getJob(id);
    }
}
