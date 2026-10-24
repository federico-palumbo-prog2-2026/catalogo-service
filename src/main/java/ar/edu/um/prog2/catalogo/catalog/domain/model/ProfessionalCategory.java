package ar.edu.um.prog2.catalogo.catalog.domain.model;

import java.time.Instant;

public record ProfessionalCategory(
        Long id,
        String name,
        String description,
        boolean enabled,
        Instant createdAt,
        Instant updatedAt) {
}