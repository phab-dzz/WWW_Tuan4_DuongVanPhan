package mappers;

import DTOs.JobSkillDTO;
import constants.DifferentLevel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import repositories.JobRepository;
import repositories.SkillRepository;
import repositories.impl.JobRepositoryImpl;
import repositories.impl.SkillRepositoryImpl;

import java.sql.ResultSet;
import java.sql.SQLException;
@Component
public class JobSkillMapper implements RowMapper<JobSkillDTO>
{
   private JobRepositoryImpl jobRepository;
   private SkillRepositoryImpl skillRepository;

   @Autowired
    public JobSkillMapper(JobRepositoryImpl jobRepository, SkillRepositoryImpl skillRepository) {
        this.jobRepository = jobRepository;
        this.skillRepository = skillRepository;
    }

    @Override
    public JobSkillDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
        JobSkillDTO jobSkillDTO = new JobSkillDTO();
        jobSkillDTO.setJob(jobRepository.getJob(rs.getString("job_id")));
        jobSkillDTO.setSkill(skillRepository.getSkill(rs.getString("skill_id")) );
        jobSkillDTO.setLevel(DifferentLevel.getSkillLevel(rs.getString("level")));
        return jobSkillDTO;
    }
}
