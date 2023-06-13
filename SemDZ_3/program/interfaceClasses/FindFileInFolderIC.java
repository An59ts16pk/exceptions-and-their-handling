package SemDZ_3.program.interfaceClasses;

import SemDZ_3.program.exceptions.PatchCatalogException;

public interface FindFileInFolderIC {
    public boolean findFileInFolder(String surname, String patchFolder) throws PatchCatalogException;
}
