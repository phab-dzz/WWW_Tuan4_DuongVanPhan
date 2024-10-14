package services;

import DTOs.SkillDTO;
import models.Skill;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repositories.SkillRepository;

import java.util.List;

@Service
public class SkillService {
    private SkillRepository skillRepository;
@Autowired
    public SkillService(SkillRepository skillRepository) {
        this.skillRepository = skillRepository;
    }
    public boolean addSkill(SkillDTO skill) {
    return skillRepository.addSkill(skill);

    }
    public List<SkillDTO> getAllSkills() {
    return skillRepository.getAllSkills();
    }
    public SkillDTO getSkillById(String id) {
    return skillRepository.getSkill(id);
    }
    public boolean updateSkill(SkillDTO skill) {
    return skillRepository.updateSkill(skill);
    }
    public boolean deleteSkill(String id) {
    return  skillRepository.removeSkill(id);
    }

}
