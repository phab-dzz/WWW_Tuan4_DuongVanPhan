package iuh.fit.phandev.www_duongvanphan_springboot.Repositories;

import DTOs.JObDTO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import repositories.JobRepository;
import repositories.impl.JobRepositoryImpl;

import java.util.List;
import  static  org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class JobTest {
    @Autowired
    @Qualifier(value = "repositories.impl.JobRepositoryImpl")
    private JobRepositoryImpl jobRepo;
    @Test
     void testFindAll() {
        List<JObDTO> jobs=jobRepo.getAllJobs();
        assertNotNull(jobs);
    }
}
