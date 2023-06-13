package SemDZ_3h.program.interfaceClasses;

import SemDZ_3h.program.exceptions.PatchCatalogException;

public interface FindFileInFolderIC {
    public boolean findFileInFolder(String surname, String patchFolder) throws PatchCatalogException;
}
