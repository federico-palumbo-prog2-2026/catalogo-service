package ar.edu.um.prog2.catalogo.catalog.domain.port.out;

import ar.edu.um.prog2.catalogo.catalog.domain.model.CatalogSnapshot;

/**
 * Fuente externa del catálogo completo (la cátedra).
 */
public interface CatalogSnapshotProvider {

    CatalogSnapshot fetchSnapshot();
}