package repositories;

import DTOs.SkillDTO;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository
public interface SkillRepository {
    public boolean addSkill(SkillDTO skill);
    public boolean removeSkill(String id);
    public boolean updateSkill(SkillDTO skill);
    public SkillDTO getSkill(String id);
    public List<SkillDTO> getAllSkills();
}
