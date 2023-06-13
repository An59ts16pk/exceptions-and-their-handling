package SemDZ_3h.program.abstractClasses;

import SemDZ_3h.program.interfaceClasses.WriteToFileIC;
import SemDZ_3h.program.workClasses.FindFileInFolder;
import SemDZ_3h.program.workClasses.StringToWrite;

import java.io.FileWriter;

public abstract class WriteToFileAC implements WriteToFileIC {
    protected FindFileInFolder findFileInFolder;
    protected StringToWrite stringToWrite;
    protected FileWriter fileWriter;
    
}
