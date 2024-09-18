package com.nszandrew.dtos;

import com.nszandrew.data.User;

public record ChatMessage(User from, User to, String text) {
}
