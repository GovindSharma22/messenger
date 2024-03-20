package com.personal.messenger.dao;


import com.personal.messenger.pojo.ChatMessage;

import java.util.List;

public interface ChatMessageDao {
    Long save(final ChatMessage chatMessage);

    List<ChatMessage> getAllMessages(String roomId);
}
