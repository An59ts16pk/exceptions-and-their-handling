package SemDZ_3h.program.exceptions;

import java.io.IOException;

public class FileInFolderNotCreateException extends IOException {
    public FileInFolderNotCreateException() {
        super("Ошибка !!! Не удалось открыть файл в указанном каталоге.");
    }
}
