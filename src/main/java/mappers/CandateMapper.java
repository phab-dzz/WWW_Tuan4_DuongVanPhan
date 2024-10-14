package mappers;

import DTOs.CandidateDTO;
import models.Candidate;
import models.CandidateSkill;
import org.hibernate.annotations.Comment;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.UUID;


@Component
public class CandateMapper implements RowMapper<CandidateDTO> {


    @Override
    public CandidateDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
        CandidateDTO cand = new CandidateDTO();
        cand.setId((rs.getString("id")));
        cand.setDob(rs.getDate("dob").toLocalDate().atStartOfDay());
    cand.getAddress(rs.getString("address"));
    cand.getEmail(rs.getString("email"));
    cand.setPhone(rs.getString("phone"));
    String full_name=rs.getString("last_name")+rs.getString("first_name")+rs.getString("middle_name");

   cand.setFull_name(full_name);
    return cand;
    }

}
