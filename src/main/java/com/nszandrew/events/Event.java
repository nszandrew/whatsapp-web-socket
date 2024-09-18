package com.nszandrew.events;

public record Event<T>(EventType type, T payload) {
}
