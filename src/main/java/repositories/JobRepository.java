package repositories;

import DTOs.JObDTO;
import models.Job;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface JobRepository {
    public boolean addJob(JObDTO job);
    public JObDTO getJob(String id);
    public boolean updateJob(JObDTO job);
    public boolean deleteJob(String id);
    public List<JObDTO> getAllJobs();
}
