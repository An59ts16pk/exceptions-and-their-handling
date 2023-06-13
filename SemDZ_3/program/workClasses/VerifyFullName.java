package SemDZ_3.program.workClasses;

import SemDZ_3.program.abstractClasses.VerifyFullNameAC;
import SemDZ_3.program.exceptions.FullNameEmptyException;
import SemDZ_3.program.exceptions.FullNameDigitException;

public class VerifyFullName extends VerifyFullNameAC{

    @Override
    public boolean verifyFullName(String[] arr) {
        for (int i = 0; i < 3; i++) {
            if (arr[i].length() == 0)
                throw new FullNameEmptyException();
            for (int j = 0; j < arr[i].length(); j++) {
                if (Character.isDigit(arr[i].charAt(j)))
                    throw new FullNameDigitException();    
            }
        }
        return true;
    }
}
