package com.personal.messenger.pojo;

import lombok.Builder;

@Builder
public record ChatMessage(String message, long id, String userId, String meetingRoomId) {
}
