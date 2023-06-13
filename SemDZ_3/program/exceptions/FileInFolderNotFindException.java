package SemDZ_3.program.exceptions;

import java.io.FileNotFoundException;

public class FileInFolderNotFindException extends FileNotFoundException {
    public FileInFolderNotFindException() {
        super("Ошибка !!! Не удалось найти файл в указанном каталоге.");
    }
    
}
