package com.ada.ticketsaleapi.domain.infra.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;

@Component
public class DiscoveryClientUtils {

	@Autowired
	private EurekaClient discoveryClient;

	public String serviceUrl(String hostname) {
		
		InstanceInfo instance = discoveryClient.getNextServerFromEureka(hostname, false);
		
		return instance.getHomePageUrl();
		
	}

}