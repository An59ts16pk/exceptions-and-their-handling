package SemDZ_3h.program.workClasses;

import SemDZ_3h.program.abstractClasses.VerifyFullNameAC;
import SemDZ_3h.program.exceptions.FullNameDigitException;
import SemDZ_3h.program.exceptions.FullNameEmptyException;

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
