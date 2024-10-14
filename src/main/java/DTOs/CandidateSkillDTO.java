package DTOs;

import constants.DifferentLevel;
import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class CandidateSkillDTO {
    private CandidateDTO candidate;
    private SkillDTO skill;
    private DifferentLevel level;

}
