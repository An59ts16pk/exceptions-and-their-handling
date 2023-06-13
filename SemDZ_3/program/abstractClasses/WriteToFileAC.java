package SemDZ_3.program.abstractClasses;

import SemDZ_3.program.interfaceClasses.WriteToFileIC;
import SemDZ_3.program.workClasses.FindFileInFolder;
import SemDZ_3.program.workClasses.StringToWrite;

import java.io.FileWriter;

public abstract class WriteToFileAC implements WriteToFileIC {
    protected FindFileInFolder findFileInFolder;
    protected StringToWrite stringToWrite;
    protected FileWriter fileWriter;
    
}
