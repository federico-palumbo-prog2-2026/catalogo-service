package ar.edu.um.prog2.catalogo.catalog.domain.model;

import java.time.Instant;

public record Professional(
        Long id,
        Long categoryId,
        String firstName,
        String lastName,
        boolean enabled,
        Instant createdAt,
        Instant updatedAt) {
}