package services;

import DTOs.CandidateDTO;
import models.Candidate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repositories.impl.CandidateRepositoryImpl;

import java.util.List;

@Service
public class CandidateService {

    private CandidateRepositoryImpl candidateRepository;
    @Autowired
    public CandidateService(CandidateRepositoryImpl candidateRepository) {
        this.candidateRepository = candidateRepository;
    }
    public boolean addCandidate(CandidateDTO candidate) {
        return candidateRepository.save(candidate);
    }
    public List<CandidateDTO> getAllCandidates() {
        return candidateRepository.findAll();
    }
    public CandidateDTO getCandidateById(String id) {
        return  candidateRepository.findById(id);
    }
    public boolean updateCandidate(CandidateDTO candidate) {
        return candidateRepository.update(candidate);
    }
    public boolean deleteCandidate(String id) {
        return candidateRepository.delete(id);
    }
}
