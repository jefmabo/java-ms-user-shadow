package br.com.user.resource;

import br.com.user.service.HealthCheckService;
import br.com.user.service.dto.HealthCheckDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/health-check")
public class HealthCheckController {

    private final HealthCheckService service;

    public HealthCheckController(HealthCheckService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<HealthCheckDto> check() {
        HealthCheckDto healthCheckDto = service.retrieveHealthCheckMessage();
        return  ResponseEntity.ok(healthCheckDto);
    }
}
