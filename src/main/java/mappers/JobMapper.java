package mappers;

import DTOs.JObDTO;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class JobMapper implements RowMapper<JObDTO> {

    @Override
    public JObDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
        JObDTO job = new JObDTO();
        job.setId(rs.getString("job_id"));
        job.setDescription(rs.getString("description"));
        return job;

    }
}
