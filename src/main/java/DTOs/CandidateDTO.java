package DTOs;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class CandidateDTO {
    private String id;
    private String full_name;
    private String phone;
    private String email;
    private String address;
    private LocalDateTime Dob;

    public CandidateDTO(String id) {
        this.id = id;
    }

    public String getAddress(String address) {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail(String email) {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
