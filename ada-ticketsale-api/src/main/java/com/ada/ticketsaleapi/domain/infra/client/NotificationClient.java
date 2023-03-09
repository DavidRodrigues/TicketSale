package com.ada.ticketsaleapi.domain.infra.client;

//import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import reactor.core.publisher.Mono;

//@FeignClient("notifications")
//@Component 
//public interface NotificationClient {
//	
//    @GetMapping("/notifications/bilhetes/{id}")
//    void sendNotification(@PathVariable Long long1);
//
//}


public interface NotificationClient {

	@GetMapping("/notifications/{id}")
	Mono<Boolean> sendNotification(@PathVariable Long id);
	
}
