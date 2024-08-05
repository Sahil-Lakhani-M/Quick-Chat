package com.quickchat.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;

import com.quickchat.entities.Message;

@Controller
public class ChatController {
	@Autowired
	private SimpMessagingTemplate template;
	
	@MessageMapping("/message") // user send msg to this url --> /app/message
	@SendTo("/chatroom/public")
	public Message recievePublicMessage(@Payload Message message) {
		return message;
	}
	
	@MessageMapping("/private-message")
	public Message recievePrivateMessage(@Payload Message message) {
		// for eg to listen it we use url --> /user/David/private
		template.convertAndSendToUser(message.getRecieverName(), "/private", message);
		
		return message;
	}
}
