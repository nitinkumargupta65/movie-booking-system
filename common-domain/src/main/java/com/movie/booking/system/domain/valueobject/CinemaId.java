package com.movie.booking.system.domain.valueobject;

import java.util.UUID;

public class CinemaId extends BaseId<UUID> {
    public CinemaId(UUID value) {
        super(value);
    }
}
