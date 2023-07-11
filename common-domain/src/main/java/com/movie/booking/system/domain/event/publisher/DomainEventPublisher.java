package com.movie.booking.system.domain.event.publisher;

import com.movie.booking.system.domain.event.DomainEvent;

public interface DomainEventPublisher<T extends DomainEvent> {

    void publish(T domainEvent);
}
