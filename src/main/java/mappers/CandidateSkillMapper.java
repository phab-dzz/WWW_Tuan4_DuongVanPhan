package mappers;

import DTOs.CandidateDTO;
import DTOs.CandidateSkillDTO;
import constants.DifferentLevel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import repositories.impl.CandidateRepositoryImpl;
import repositories.impl.SkillRepositoryImpl;

import java.sql.ResultSet;
import java.sql.SQLException;


@Component
public class CandidateSkillMapper implements RowMapper<CandidateSkillDTO> {
    private CandidateRepositoryImpl candidateRepository;
    private SkillRepositoryImpl skillRepository;
    @Autowired
    public CandidateSkillMapper(CandidateRepositoryImpl candidateRepository, SkillRepositoryImpl skillRepository) {
        this.candidateRepository = candidateRepository;
        this.skillRepository = skillRepository;
    }


    @Override
    public CandidateSkillDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
        CandidateSkillDTO result = new CandidateSkillDTO();
        result.setCandidate(candidateRepository.findById(rs.getString("candidate_id")));
        result.setSkill(skillRepository.getSkill(rs.getString("skill_id")));
        result.setLevel(DifferentLevel.getSkillLevel(rs.getString("level")));

        return result;
    }
}
