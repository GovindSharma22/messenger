package com.personal.messenger.dao.v1.repo;


import com.personal.messenger.dao.v1.entity.ChatMessageEntity;
import com.personal.messenger.pojo.ChatMessage;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Transactional
public interface H2BasedChatMessageRepository extends JpaRepository<ChatMessageEntity, Long> {
    List<ChatMessageEntity> findByRoomId(String roomId);

}
