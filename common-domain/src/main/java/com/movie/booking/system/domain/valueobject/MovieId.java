package com.movie.booking.system.domain.valueobject;

import java.util.UUID;

public class MovieId extends BaseId<UUID> {
    public MovieId(UUID value) {
        super(value);
    }
}
