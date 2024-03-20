package com.personal.messenger.service;

import com.personal.messenger.dao.ChatMessageDao;
import com.personal.messenger.pojo.ChatMessage;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChatService {
    private final ChatMessageDao chatMessageDao;

    public ChatService(ChatMessageDao chatMessageDao) {
        this.chatMessageDao = chatMessageDao;
    }

    public Long saveChatMessage(ChatMessage chatMessage){
        return chatMessageDao.save(chatMessage);
    }

    public List<ChatMessage> getAllChatMessageByRoomId(String roomId){
        return chatMessageDao.getAllMessages(roomId);
    }
}
