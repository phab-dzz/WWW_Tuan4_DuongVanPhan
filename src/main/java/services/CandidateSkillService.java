package services;

import DTOs.CandidateSkillDTO;
import models.CandidateSkill;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CandidateSkillService {
    private CandidateSkillService candidateSkillService;
    @Autowired
    public CandidateSkillService(CandidateSkillService candidateSkillService) {
        this.candidateSkillService = candidateSkillService;
    }
    public  boolean addCandidateskill(CandidateSkillDTO candidateSkill) {
        return candidateSkillService.addCandidateskill(candidateSkill);

    }
    public boolean deleteCandidateskill(CandidateSkillDTO candidateSkill) {
        return candidateSkillService.deleteCandidateskill(candidateSkill);
    }
    public List<CandidateSkillDTO> getAllCandidateskill() {
        return candidateSkillService.getAllCandidateskill();
    }

  public  CandidateSkillDTO getbyId(String id) {
        return candidateSkillService.getbyId(id);
  }
  public boolean updateCandidateskill(CandidateSkillDTO candidateSkill) {
        return candidateSkillService.updateCandidateskill(candidateSkill);
  }
}
