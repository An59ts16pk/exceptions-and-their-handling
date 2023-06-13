package SemDZ_3.program;

import SemDZ_3.program.abstractClasses.ProgrammAC;
import SemDZ_3.program.workClasses.InputData;
import SemDZ_3.program.workClasses.ArrayString;
import SemDZ_3.program.workClasses.VerifyFullName;
import SemDZ_3.program.workClasses.VerifyBirthDay;
import SemDZ_3.program.workClasses.VerifyNumberPhone;
import SemDZ_3.program.workClasses.VerifyGender;
import SemDZ_3.program.workClasses.WriteToFile;

import java.io.IOException;

public class Programm extends ProgrammAC {
    private final InputData inputData;
    private final ArrayString arrayString;
    private final VerifyFullName verifyFullName;
    private final VerifyBirthDay verifyBirthDay;
    private final VerifyNumberPhone verifyNumberPhone;
    private final VerifyGender verifyGender;
    private final WriteToFile writeToFile;

    public Programm(InputData inputData, ArrayString arrayString,
        VerifyFullName verifyFullName, VerifyBirthDay verifyBirthDay, 
        VerifyNumberPhone verifyNumberPhone, VerifyGender verifyGender,
        WriteToFile writeToFile) {
        this.inputData = inputData;
        this.arrayString = arrayString;
        this.verifyFullName = verifyFullName;
        this.verifyBirthDay = verifyBirthDay;
        this.verifyNumberPhone = verifyNumberPhone;
        this.verifyGender = verifyGender;
        this.writeToFile = writeToFile;
    }

    @Override
    public void run() throws IOException {
        String data = inputData.inputData();
        String[] dataArrayString = arrayString.arrayString(data);

        if (verifyFullName.verifyFullName(dataArrayString) && verifyBirthDay.verifyBirthDay(dataArrayString) && 
            verifyNumberPhone.verifyNumberPhone(dataArrayString) && verifyGender.verifyGender(dataArrayString))
            System.out.println("\nДанные введены корректно.\n");

        boolean resultWrite = writeToFile.writeToFile(dataArrayString);
        if (resultWrite) System.out.println("\nЗапись файла прошла успешно.");
    }
}
