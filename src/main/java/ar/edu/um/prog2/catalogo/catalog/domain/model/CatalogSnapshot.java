package ar.edu.um.prog2.catalogo.catalog.domain.model;

import java.time.Instant;
import java.util.List;

/**
 * Copia completa del catálogo entregada por la cátedra en una versión dada.
 */
public record CatalogSnapshot(
        long version,
        Instant generatedAt,
        List<ProfessionalCategory> categories,
        List<Professional> professionals,
        List<WeeklySchedule> weeklySchedules) {
}