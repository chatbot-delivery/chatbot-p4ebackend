package com.chatbot.notification.service.gateway;

import org.springframework.stereotype.Component;

import com.chatbot.notification.service.model.UserProfile;

@Component
public class UserPreferenceGateway {

	public UserProfile getUserProfile(String userId) {
		
		UserProfile userProfile;
		
		switch(userId) {
			case "saroj" : 			
				userProfile = new UserProfile("Saroj", Long.valueOf("626662987"), 31, "en-US");
				break;
			
			case "jansen" : 			
				userProfile = new UserProfile("Jansen", Long.valueOf("626662987"), 31, "nl-NL");
				break;
			
			case "han" : 			
				userProfile = new UserProfile("Han", Long.valueOf("626662987"), 31, "zh-CN");
				break;
			
			case "amit" : 			
				userProfile = new UserProfile("Amit", Long.valueOf("9588403341"), 31, "en-US");
				break;
			
			
			case "anup" : 			
				userProfile = new UserProfile("Anup", Long.valueOf("650235394"), 31, "nl-NL");
				break;
			
			case "santosh" : 			
				userProfile = new UserProfile("Santosh", Long.valueOf("626662987"), 31, "en-US");
				break;
			
			
			case "kanchan" : 			
				userProfile = new UserProfile("Santosh", Long.valueOf("626662987"), 31, "en-US");
				break;
			
			
			default : 			
				userProfile = new UserProfile("Saroj", Long.valueOf("626662987"), 31, "en-US");
				break;
			

		}
		return userProfile;

	}

}
