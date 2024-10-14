package models;

import jakarta.persistence.*;

import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "skills")
public class Skill {

    @Id
    @Column(name = "skill_id", nullable = false, unique = true, updatable = false)
    private String id;

    @Column(name = "skill_name", nullable = false)
    private String skill_name;

    @Column(name = "description", nullable = false)
    private String description;

    @Column(name = "field", nullable = false)
    private String field;

    @OneToMany(mappedBy = "skill")
    private List<CandidateSkill> candidateSkills;

    @OneToMany(mappedBy = "skill")
    private List<JobSkills> jobSkills;

    public Skill() {
    }

    public Skill(String id, String skill_name, String description, String field) {
        this.id = id;
        this.skill_name = skill_name;
        this.description = description;
        this.field = field;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSkill_name() {
        return skill_name;
    }

    public void setSkill_name(String skill_name) {
        this.skill_name = skill_name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getField() {
        return field;
    }

    public List<CandidateSkill> getCandidateSkills() {
        return candidateSkills;
    }

    public void setCandidateSkills(List<CandidateSkill> candidateSkills) {
        this.candidateSkills = candidateSkills;
    }

    public void setField(String field) {
        this.field = field;
    }

    @Override
    public String toString() {
        return "Skill{" +
                "id='" + id + '\'' +
                ", skill_name='" + skill_name + '\'' +
                ", description='" + description + '\'' +
                ", field='" + field + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Skill skill)) return false;
        return Objects.equals(id, skill.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}
