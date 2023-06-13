package SemDZ_3h.program.workClasses;

import SemDZ_3h.program.abstractClasses.StringToWriteAC;

public class StringToWrite extends StringToWriteAC {
    
    @Override
    public String stringToWrite(Human human) {
        StringBuilder sb = new StringBuilder();
        sb.append("<").append(human.getSurname()).append(">");
        sb.append("<").append(human.getName()).append(">");
        sb.append("<").append(human.getLastname()).append(">");
        sb.append("<").append(human.getBirthDay()).append(">");
        sb.append("<").append(human.getNumberPhone()).append(">");
        sb.append("<").append(human.getGender()).append(">");

        return sb.toString();
    }
}
