package com.personal.projects.footballstats_server.mappers;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public abstract class AbstractMapper<DTO,ENTITY> {

    public abstract ENTITY toEntity(DTO dto);
    public abstract DTO toDTO(ENTITY entity);

    public Set<ENTITY> toEntity(Set<DTO> dtoSet) {
        if (dtoSet == null) return new HashSet<>();
        return dtoSet.stream()
                .map(this::toEntity)
                .collect(Collectors.toSet());
    }

    public Set<DTO> toDTO(Set<ENTITY> entitySet) {
        if (entitySet == null) return new HashSet<>();
        return entitySet.stream()
                .map(this::toDTO)
                .collect(Collectors.toSet());
    }
}
