package com.ada.ticketsaleapi.domain.infra.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.ada.ticketsaleapi.domain.infra.utils.DiscoveryClientUtils;

import reactor.core.publisher.Mono;

@Service
public class NotificationClientImpl implements NotificationClient {

	private final WebClient webClient;
	
	private final static String NOTIFICATION_SERVICE_DISCOVERY = "notifications";
	
	@Autowired
	private DiscoveryClientUtils discoveryClientUtils;
	
	public NotificationClientImpl(WebClient.Builder webClientBuilder) {
		
		this.webClient = webClientBuilder
			.build();
		
	}

	@Override
	public Mono<Boolean> sendNotification(Long id) {

		System.out.println(discoveryClientUtils.serviceUrl(NOTIFICATION_SERVICE_DISCOVERY) + "notifications/bilhetes/" + id+"\r");
		
		WebClient.ResponseSpec responseSpec = this.webClient
			.get()
			.uri(discoveryClientUtils.serviceUrl(NOTIFICATION_SERVICE_DISCOVERY) + "notifications/bilhetes/{id}", id)
			.retrieve();
		
		return responseSpec.bodyToMono(Boolean.class);
		
	}
}
