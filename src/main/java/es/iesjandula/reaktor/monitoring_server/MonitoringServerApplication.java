package es.iesjandula.reaktor.monitoring_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@EntityScan(basePackages = "es.iesjandula.reaktor.models")
public class MonitoringServerApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(MonitoringServerApplication.class, args);
    }
}
