package models;

import constants.DifferentLevel;
import jakarta.persistence.*;

@Entity
@Table(name = "job_skills")
public class JobSkills {

    @Id
    @ManyToOne
    @JoinColumn(name = "job_id", referencedColumnName = "job_id", nullable = false)
    private Job job;

    @Id
    @ManyToOne
    @JoinColumn(name = "skill_id", referencedColumnName = "skill_id", nullable = false)
    private Skill skill;

    @Column(name = "level", nullable = false, columnDefinition = "VARCHAR(255)")
    private DifferentLevel level;

    public JobSkills() {
    }

    public JobSkills(Job job, Skill skill, DifferentLevel level) {
        this.job = job;
        this.skill = skill;
        this.level = level;
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    public Skill getSkill() {
        return skill;
    }

    public void setSkill(Skill skill) {
        this.skill = skill;
    }

    public DifferentLevel getLevel() {
        return level;
    }

    public void setLevel(DifferentLevel level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "JobSkills{" +
                "job=" + job +
                ", skill=" + skill +
                ", level=" + level +
                '}';
    }
}
