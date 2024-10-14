package repositories;

import DTOs.CandidateDTO;
import models.Candidate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface CandidateRepository {
    public List<CandidateDTO> findAll();
    public CandidateDTO findById(String id);

    public boolean save(CandidateDTO candidate);
    public boolean delete(String id);
    public boolean update(CandidateDTO candidate);

}
