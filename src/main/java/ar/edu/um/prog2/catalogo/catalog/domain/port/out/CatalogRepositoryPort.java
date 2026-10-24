package ar.edu.um.prog2.catalogo.catalog.domain.port.out;

import ar.edu.um.prog2.catalogo.catalog.domain.model.CatalogSnapshot;

/**
 * Persistencia de la copia local del catálogo.
 */
public interface CatalogRepositoryPort {

    /**
     * Reemplaza categorías, profesionales y horarios, y registra la versión del snapshot.
     * Debe ser atómico: o se aplica todo, o no se aplica nada.
     */
    void replaceWith(CatalogSnapshot snapshot);

    long getLocalVersion();
}