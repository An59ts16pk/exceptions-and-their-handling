package SemDZ_3.program.exceptions;

import java.nio.file.NotDirectoryException;

public class PatchCatalogException extends NotDirectoryException {
    public PatchCatalogException() {
        super("По указанному пути директория не найдена !!! Введите верный путь.");
    }
}
