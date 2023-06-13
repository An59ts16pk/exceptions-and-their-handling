package SemDZ_3.program.workClasses;

import SemDZ_3.program.abstractClasses.WriteToFileAC;
import SemDZ_3.program.exceptions.FileInFolderNotCreateException;
import SemDZ_3.program.exceptions.FileInFolderNotFindException;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileWriter;

public class WriteToFile extends WriteToFileAC {
    private final String folderPatch;

    public WriteToFile(FindFileInFolder findFileInFolder, StringToWrite stringToWrite, String folderPatch) {
        super.findFileInFolder = findFileInFolder;
        super.stringToWrite = stringToWrite;
        this.folderPatch = folderPatch;
    } 

    @Override
    public boolean writeToFile(String[] arr) throws IOException, FileNotFoundException {
        try {
            String path = folderPatch + arr[0].toLowerCase() + ".txt";

            String strWrite = stringToWrite.stringToWrite(arr);
            boolean flag = findFileInFolder.findFileInFolder(arr[0], folderPatch);

            if (!flag) {
                System.out.println("Такого файла нет, создаём новый.");
            } else {
                System.out.println("Файл с таким именем есть - дописываем этот файл.");
            }

            super.fileWriter = new FileWriter(path, true);
            super.fileWriter.write(strWrite + "\n");
            super.fileWriter.close();

            return true;

        } catch (FileNotFoundException e) {
            throw new FileInFolderNotFindException();
        } catch (IOException e) {
            throw new FileInFolderNotCreateException();
        } 
    }
}
