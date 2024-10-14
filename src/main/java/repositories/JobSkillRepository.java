package repositories;

import DTOs.JobSkillDTO;
import models.Job;
import models.JobSkills;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface JobSkillRepository {
    public boolean add(JobSkillDTO jobSkills);
    public  boolean update(JobSkillDTO jobSkills);
    public boolean delete(String id);
    public JobSkillDTO findById(String id);
    public List<JobSkillDTO> findAll();
}
