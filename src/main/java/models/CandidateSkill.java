package models;

import constants.DifferentLevel;
import jakarta.persistence.*;

@Entity
@Table(name = "candidate_skills")
public class CandidateSkill {

    @Id
    @ManyToOne
    @JoinColumn(name = "candidate_id", referencedColumnName = "candidate_id", nullable = false)
    private Candidate candidate;


    @Id
    @ManyToOne
    @JoinColumn(name = "skill_id", referencedColumnName = "skill_id", nullable = false)
    private Skill skill;

    @Column(name = "level", nullable = false, columnDefinition = "VARCHAR(255)")
    private DifferentLevel level;

    public CandidateSkill() {
    }

    public CandidateSkill(Candidate candidate, Skill skill, DifferentLevel level) {
        this.candidate = candidate;
        this.skill = skill;
        this.level = level;
    }

    public Candidate getCandidate() {
        return candidate;
    }

    public void setCandidate(Candidate candidate) {
        this.candidate = candidate;
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
        return "CandidateSkill{" +
                "candidate=" + candidate +
                ", skill=" + skill +
                ", level=" + level +
                '}';
    }


}
