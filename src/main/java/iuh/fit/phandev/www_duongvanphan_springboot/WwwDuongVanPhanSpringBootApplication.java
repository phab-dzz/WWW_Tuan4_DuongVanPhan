package iuh.fit.phandev.www_duongvanphan_springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan(basePackages = "models")
@SpringBootApplication
public class WwwDuongVanPhanSpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(WwwDuongVanPhanSpringBootApplication.class, args);
    }

}
