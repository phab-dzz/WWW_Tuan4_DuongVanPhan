package mappers;

import DTOs.SkillDTO;
import models.Skill;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class SkillMapper implements RowMapper<SkillDTO> {

    @Override
    public SkillDTO mapRow(ResultSet rs, int rowNum) throws SQLException {

        SkillDTO skillDTO = new SkillDTO();
        skillDTO.setId(rs.getString("skill_id"));
        skillDTO.setName(rs.getString("skill_name"));
        skillDTO.setDescription(rs.getString("description"));
        skillDTO.setField(rs.getString("field"));
        return skillDTO;
    }
}
