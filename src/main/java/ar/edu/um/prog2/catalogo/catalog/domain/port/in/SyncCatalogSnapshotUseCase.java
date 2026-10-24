package ar.edu.um.prog2.catalogo.catalog.domain.port.in;

/**
 * Caso de uso: reemplazar la copia local del catálogo por el snapshot vigente de la cátedra.
 */
public interface SyncCatalogSnapshotUseCase {

    /**
     * @return la versión del snapshot aplicado
     */
    long syncSnapshot();
}