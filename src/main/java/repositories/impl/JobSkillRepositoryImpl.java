package repositories.impl;

import DTOs.JobSkillDTO;
import models.JobSkills;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import repositories.JobSkillRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public class JobSkillRepositoryImpl implements JobSkillRepository {
    private JdbcTemplate jdbcTemplate;

    @Override
    public boolean add(JobSkillDTO jobSkills) {
        return false;
    }

    @Override
    public boolean update(JobSkillDTO jobSkills) {
        return false;
    }

    @Override
    public boolean delete(String id) {
        return false;
    }

    @Override
    public JobSkillDTO findById(String id) {
        return null;
    }

    @Override
    public List<JobSkillDTO> findAll() {
        return List.of();
    }
}
