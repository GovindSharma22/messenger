package com.personal.messenger.dao.v1.entity;

import com.personal.messenger.pojo.ChatMessage;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "chats")
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ChatMessageEntity {

    public ChatMessageEntity(final ChatMessage chatMessage){
        roomId = chatMessage.meetingRoomId();
        userId = chatMessage.userId();
        message = chatMessage.message();
    }

    @Id
    @Column(name = "id", unique = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String roomId;

    private String userId;

    private String message;

    public ChatMessage toChatMessage() {
        return ChatMessage.builder()
                .id(id)
                .meetingRoomId(roomId)
                .userId(userId)
                .message(message)
                .build();
    }
}
