package com.personal.messenger.dao.v1;

import com.personal.messenger.dao.ChatMessageDao;
import com.personal.messenger.dao.v1.entity.ChatMessageEntity;
import com.personal.messenger.dao.v1.repo.H2BasedChatMessageRepository;
import com.personal.messenger.pojo.ChatMessage;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class InMemoryH2BasedChatMessageDao implements ChatMessageDao {
    private final H2BasedChatMessageRepository chatMessageRepository;

    public InMemoryH2BasedChatMessageDao(H2BasedChatMessageRepository chatMessageRepository) {
        this.chatMessageRepository = chatMessageRepository;
    }

    @Override
    public Long save(ChatMessage chatMessage) {
        ChatMessageEntity convertedChatMessageEntity = new ChatMessageEntity(chatMessage);
        ChatMessageEntity chatMessageEntity = chatMessageRepository.save(convertedChatMessageEntity);
        return chatMessageEntity.getId();
    }

    @Override
    public List<ChatMessage> getAllMessages(String roomId) {
        List<ChatMessageEntity> chatMessageEntities = chatMessageRepository.findByRoomId(roomId);
        return chatMessageEntities.stream().map(ChatMessageEntity::toChatMessage).collect(Collectors.toList());
    }
}
