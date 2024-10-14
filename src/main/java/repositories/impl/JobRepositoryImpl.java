package repositories.impl;

import DTOs.JObDTO;
import mappers.JobMapper;
import models.Job;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import repositories.JobRepository;

import javax.sql.DataSource;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Component
public class JobRepositoryImpl implements JobRepository{
    private JdbcTemplate jdbcTemplate;
    private DataSource dataSource;
    private JobMapper jobMapper;
    @Autowired
    public JobRepositoryImpl(JdbcTemplate jdbcTemplate, DataSource dataSource, JobMapper jobMapper) {
        this.jdbcTemplate = jdbcTemplate;
        this.dataSource = dataSource;
        this.jobMapper = jobMapper;
    }

    @Override
    public boolean addJob(JObDTO job) {
        String sql="insert into jobs(job_id,description) values(?,?)";
        int result=jdbcTemplate.update(sql,job.getId(),job.getDescription());

        return result>0;
    }

    @Override
    public JObDTO getJob(String id) {
       String sql="select * from jobs where job_id=?";
       JObDTO result=jdbcTemplate.queryForObject(sql,jobMapper,id);
       return result;
    }

    @Override
    public boolean updateJob(JObDTO job) {
        String sql="update jobs set description=? where job_id=?";
        int result=jdbcTemplate.update(sql,job.getDescription(),job.getId());
        return result>0;
    }

    @Override
    public boolean deleteJob(String id) {
        String sql="delete from jobs where job_id=?";
        int result=jdbcTemplate.update(sql,id);
        return result>0;
    }

    @Override
    public List<JObDTO> getAllJobs() {
       String sql="select * from jobs";
       List<JObDTO> result=jdbcTemplate.query(sql,jobMapper);
       return result;
    }
}
