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
			
			case "saroj-nl" : 			
				userProfile = new UserProfile("Saroj", Long.valueOf("626662987"), 31, "nl");
				break;
				
			case "saroj-cn" : 			
				userProfile = new UserProfile("Saroj", Long.valueOf("626662987"), 31, "zh-CN");
				break;
				
			case "saroj-ar" : 			
				userProfile = new UserProfile("Saroj", Long.valueOf("626662987"), 31, "ar");
				break;
			
			case "jansen" : 			
				userProfile = new UserProfile("Jansen", Long.valueOf("626662987"), 31, "nl");
				break;
			
			case "han" : 			
				userProfile = new UserProfile("Han", Long.valueOf("626662987"), 31, "zh-CN");
				break;
			
			case "abrar" : 			
				userProfile = new UserProfile("Abrar", Long.valueOf("626662987"), 31, "ar");
				break;
			
			case "amit" : 			
				userProfile = new UserProfile("Amit", Long.valueOf("9588403341"), 31, "en-US");
				break;
			
			
			case "anup" : 			
				userProfile = new UserProfile("Anup", Long.valueOf("650235394"), 31, "en-US");
				break;
			
			case "anup-nl" : 			
				userProfile = new UserProfile("Anup", Long.valueOf("650235394"), 31, "nl");
				break;
				
			case "anup-ar" : 			
				userProfile = new UserProfile("Anup", Long.valueOf("650235394"), 31, "ar");
				break;
				
			case "anup-cn" : 			
				userProfile = new UserProfile("Anup", Long.valueOf("650235394"), 31, "zh-CN");
				break;
				
			case "santosh" : 			
				userProfile = new UserProfile("Santosh", Long.valueOf("9167202105"), 91, "en-US");
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
