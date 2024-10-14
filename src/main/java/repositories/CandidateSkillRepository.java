package repositories;

import DTOs.CandidateSkillDTO;
import models.CandidateSkill;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
@Repository
public interface CandidateSkillRepository {
    public boolean add(CandidateSkillDTO candidateSkill) ;
    public boolean remove(String id) ;
    public boolean update(CandidateSkillDTO candidateSkill) ;
    public Optional<CandidateSkillDTO> findById(String id) ;
    public List<CandidateSkillDTO> findAll() ;
}
