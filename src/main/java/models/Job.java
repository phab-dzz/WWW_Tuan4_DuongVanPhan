package models;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "jobs")
public class Job {

    @Id
    @Column(name = "job_id", nullable = false, unique = true, updatable = false)
    private String id;

    @Column(name = "description", nullable = false)
    private String description;

    @OneToMany(mappedBy = "job")
    private List<JobSkills> jobSkills;



    public Job() {
    }

    public Job(String id, String description) {
        this.id = id;
        this.description = description;
    }


}
