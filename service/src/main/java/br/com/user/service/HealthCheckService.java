package br.com.user.service;

import br.com.user.service.dto.HealthCheckDto;
import org.springframework.stereotype.Service;

@Service
public class HealthCheckService {

    public HealthCheckDto retrieveHealthCheckMessage() {
        var healthCheckDto = new HealthCheckDto();
        var message = "Server is running ...";
        healthCheckDto.setMessage(message);
        return healthCheckDto;
    }
}
