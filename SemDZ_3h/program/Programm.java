package SemDZ_3h.program;

import SemDZ_3h.program.abstractClasses.ProgrammAC;
import SemDZ_3h.program.workClasses.InputData;
import SemDZ_3h.program.workClasses.ArrayString;
import SemDZ_3h.program.workClasses.VerifyFullName;
import SemDZ_3h.program.workClasses.VerifyBirthDay;
import SemDZ_3h.program.workClasses.VerifyNumberPhone;
import SemDZ_3h.program.workClasses.VerifyGender;
import SemDZ_3h.program.workClasses.Human;
import SemDZ_3h.program.workClasses.WriteToFile;

import java.io.IOException;

public class Programm extends ProgrammAC {
    private final InputData inputData;
    private final ArrayString arrayString;
    private final VerifyFullName verifyFullName;
    private final VerifyBirthDay verifyBirthDay;
    private final VerifyNumberPhone verifyNumberPhone;
    private final VerifyGender verifyGender;
    private final Human human;
    private final WriteToFile writeToFile;

    public Programm(InputData inputData, ArrayString arrayString,
        VerifyFullName verifyFullName, VerifyBirthDay verifyBirthDay, 
        VerifyNumberPhone verifyNumberPhone, VerifyGender verifyGender,
        Human human, WriteToFile writeToFile) {
        this.inputData = inputData;
        this.arrayString = arrayString;
        this.verifyFullName = verifyFullName;
        this.verifyBirthDay = verifyBirthDay;
        this.verifyNumberPhone = verifyNumberPhone;
        this.verifyGender = verifyGender;
        this.human = human;
        this.writeToFile = writeToFile;
    }

    @Override
    public void run() throws IOException {
        String data = inputData.inputData();
        String[] dataArrayString = arrayString.arrayString(data);

        if (verifyFullName.verifyFullName(dataArrayString) && verifyBirthDay.verifyBirthDay(dataArrayString) && 
            verifyNumberPhone.verifyNumberPhone(dataArrayString) && verifyGender.verifyGender(dataArrayString))
            System.out.println("\nДанные введены корректно.\n");

        human.humanData(dataArrayString);
        //System.out.println(human);

        boolean resultWrite = writeToFile.writeToFile(human);
        if (resultWrite) System.out.println("\nЗапись файла прошла успешно.");
    }
}
