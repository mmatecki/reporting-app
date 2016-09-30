package me.matecki.reporting.rest.dto;

public interface ToDto<T,F> {

    T toDto(F from);

}
