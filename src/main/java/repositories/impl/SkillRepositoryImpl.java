package repositories.impl;

import DTOs.SkillDTO;
import org.springframework.jdbc.core.JdbcTemplate;
import repositories.SkillRepository;

import java.util.List;
import java.util.Optional;

public class SkillRepositoryImpl implements SkillRepository {
    private JdbcTemplate jdbcTemplate;


    @Override
    public boolean addSkill(SkillDTO skill) {
        return false;
    }

    @Override
    public boolean removeSkill(String id) {
        return false;
    }

    @Override
    public boolean updateSkill(SkillDTO skill) {
        return false;
    }

    @Override
    public SkillDTO getSkill(String id) {
        return null
                ;
    }

    @Override
    public List<SkillDTO> getAllSkills() {
        return List.of();
    }
}
