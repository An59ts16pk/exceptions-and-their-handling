package SemDZ_3.program.workClasses;

import SemDZ_3.program.abstractClasses.StringToWriteAC;

public class StringToWrite extends StringToWriteAC {
    
    @Override
    public String stringToWrite(String[] arr) {
        StringBuilder sb = new StringBuilder();
        sb.append("<").append(arr[0]).append(">");
        sb.append("<").append(arr[1]).append(">");
        sb.append("<").append(arr[2]).append(">");
        sb.append("<").append(arr[3]).append(">");
        sb.append("<").append(arr[4]).append(">");
        sb.append("<").append(arr[5]).append(">");

        return sb.toString();
    }
}
