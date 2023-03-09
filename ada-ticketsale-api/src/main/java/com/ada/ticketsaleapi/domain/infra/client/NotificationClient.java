package com.ada.ticketsaleapi.domain.infra.client;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import reactor.core.publisher.Mono;

public interface NotificationClient {

	@GetMapping("/notifications/{id}")
	Mono<Boolean> sendNotification(@PathVariable Long id);
	
}
