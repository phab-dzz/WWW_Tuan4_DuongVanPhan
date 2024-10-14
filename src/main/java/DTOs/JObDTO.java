package DTOs;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class JObDTO {
    private String id;
    private String description;

    public JObDTO(String id) {
        this.id = id;
    }
}
