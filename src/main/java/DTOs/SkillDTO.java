package DTOs;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class SkillDTO {
    private String id;
    private String name;
    private String description;
    private String field;

    public SkillDTO(String id) {
        this.id = id;
    }
}
