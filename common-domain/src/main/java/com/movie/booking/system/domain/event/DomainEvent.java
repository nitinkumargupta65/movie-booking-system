package com.movie.booking.system.domain.event;

public interface DomainEvent<T> {
    public void fire();
}
