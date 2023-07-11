package com.movie.booking.system.domain.error.handler;

public class CinemaDataAccessException extends RuntimeException{
    public CinemaDataAccessException(String message) {
        super(message);
    }

    public CinemaDataAccessException(String message, Throwable cause){
        super(message, cause);
    }
}
