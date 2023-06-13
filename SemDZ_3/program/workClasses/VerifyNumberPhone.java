package SemDZ_3.program.workClasses;

import SemDZ_3.program.abstractClasses.VerifyNumberPhoneAC;
import SemDZ_3.program.exceptions.UncorrectNumberPhoneException;

public class VerifyNumberPhone extends VerifyNumberPhoneAC{
    @Override
    public boolean verifyNumberPhone(String[] arr) {
        for (int i = 0; i < arr[4].length(); i++) {
            if (!Character.isDigit(arr[4].charAt(i)))
                throw new UncorrectNumberPhoneException();
        }
        return true;
    }
}
