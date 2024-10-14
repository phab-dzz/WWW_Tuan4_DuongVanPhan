package repositories.impl;

import DTOs.CandidateSkillDTO;
import models.CandidateSkill;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import repositories.CandidateSkillRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public class CandidateSkillRepositoryImpl implements CandidateSkillRepository{
    private JdbcTemplate jdbcTemplate;

    @Override
    public boolean add(CandidateSkillDTO candidateSkill) {
        return false;
    }

    @Override
    public boolean remove(String id) {
        return false;
    }

    @Override
    public boolean update(CandidateSkillDTO candidateSkill) {
        return false;
    }

    @Override
    public Optional<CandidateSkillDTO> findById(String id) {
        return Optional.empty();
    }

    @Override
    public List<CandidateSkillDTO> findAll() {
        return List.of();
    }


}
