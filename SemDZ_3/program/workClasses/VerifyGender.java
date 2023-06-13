package SemDZ_3.program.workClasses;

import SemDZ_3.program.abstractClasses.VerifyGenderAC;
import SemDZ_3.program.exceptions.GenderException;
import SemDZ_3.program.exceptions.UncorrectGender;

public class VerifyGender extends VerifyGenderAC{
    @Override
    public boolean verifyGender(String[] arr) {
        if (arr[5].equals(""))
            throw new GenderException();
        if (!(arr[5].contains("m") || arr[5].contains("f")))
            throw new UncorrectGender();
        return true;
    }
}
