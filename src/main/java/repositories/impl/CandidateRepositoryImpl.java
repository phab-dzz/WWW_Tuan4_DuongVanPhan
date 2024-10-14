package repositories.impl;

import DTOs.CandidateDTO;
import mappers.CandateMapper;
import models.Candidate;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import repositories.CandidateRepository;

import javax.sql.DataSource;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public class CandidateRepositoryImpl implements CandidateRepository {
    private JdbcTemplate jdbcTemplate;
    private DataSource dataSource;

    private CandateMapper candidateMapper;
    public CandidateRepositoryImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<CandidateDTO> findAll() {
        String sql="select * from candidate";

        return jdbcTemplate.query(sql,candidateMapper);
    }

    @Override
    public CandidateDTO findById(String id) {
        String sql="select * from candidate where id=?";
        CandidateDTO can=jdbcTemplate.queryForObject(sql,candidateMapper,id);

        return can!=null?can:new CandidateDTO();
    }

    @Override
    public boolean save(CandidateDTO candidate) {
        String sql="insert into candidate values(?,?,?,?)";

        return false;
    }

    @Override
    public boolean delete(String id) {
        String sql="delete from candidate where id=?";
        int result= jdbcTemplate.update(sql,id);

        return result > 0;
    }

    @Override
    public boolean update(CandidateDTO candidate) {
        return false;
    }


}
