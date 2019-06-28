package fun.dqgs.easycode;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("fun.dqgs.easycode.dao")
public class EasycodeApplication {

    public static void main(String[] args) {
        SpringApplication.run(EasycodeApplication.class, args);
    }

}
