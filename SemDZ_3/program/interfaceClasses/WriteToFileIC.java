package SemDZ_3.program.interfaceClasses;

import SemDZ_3.program.exceptions.PatchCatalogException;

import java.io.IOException;

public interface WriteToFileIC {
    public boolean writeToFile(String[] arr) throws PatchCatalogException, IOException;
}
