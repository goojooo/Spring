package net.engineeringdigest.journalApp.contoller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheck {

	@GetMapping("/ok")
	public String healthCheck()
	{
		return "Okay";
	}
}
