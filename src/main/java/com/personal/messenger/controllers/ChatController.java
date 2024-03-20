package com.personal.messenger.controllers;

import com.personal.messenger.pojo.ChatMessage;
import com.personal.messenger.service.ChatService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ChatController {

    private final ChatService chatMessageService;

    public ChatController(ChatService chatMessageService) {
        this.chatMessageService = chatMessageService;
    }

    @GetMapping(path = "/api/v1/chats")
    List<ChatMessage> getAllMessages(@RequestParam String roomId){
        return chatMessageService.getAllChatMessageByRoomId(roomId);
    }

    @PostMapping(path = "/api/v1/chats")
    Long saveMessage(@RequestBody ChatMessage chatMessage){
        return chatMessageService.saveChatMessage(chatMessage);
    }
}
