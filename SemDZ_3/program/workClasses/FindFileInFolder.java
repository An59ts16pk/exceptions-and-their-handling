package SemDZ_3.program.workClasses;

import SemDZ_3.program.abstractClasses.FindFileInFolderAC;
import SemDZ_3.program.exceptions.PatchCatalogException;

import java.io.File;

public class FindFileInFolder extends FindFileInFolderAC {
    @Override
    public boolean findFileInFolder(String surname, String patchFolder) throws PatchCatalogException {
        File folder = new File(patchFolder);
        try {
            for(File file: folder.listFiles()) {
                String fileName = file.getName().split("\\.")[0];
                if (fileName.equals(surname.toLowerCase())) return true;
            }
            return false;
        } catch (NullPointerException e) {
            throw new PatchCatalogException ();
        }
    }
}
