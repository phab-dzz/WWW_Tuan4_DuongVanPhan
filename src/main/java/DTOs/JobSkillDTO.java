package DTOs;

import constants.DifferentLevel;
import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class JobSkillDTO {
    private JObDTO job;
    private SkillDTO skill;
    private DifferentLevel level;
}
