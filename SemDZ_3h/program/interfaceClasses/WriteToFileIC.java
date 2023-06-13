package SemDZ_3h.program.interfaceClasses;

import SemDZ_3h.program.exceptions.PatchCatalogException;
import SemDZ_3h.program.workClasses.Human;

import java.io.IOException;

public interface WriteToFileIC {
    public boolean writeToFile(Human human) throws PatchCatalogException, IOException;
}
