package SemDZ_3h.program.workClasses;

import SemDZ_3h.program.abstractClasses.HumanAC;

public class Human extends HumanAC{

    private String surname;
    private String name;
    private String lastname;
    private String birthday;
    private String numberphone;
    private String gender;

    @Override
    public String getSurname() {return this.surname;}
    @Override
    public String getName() {return this.name;}
    @Override
    public String getLastname() {return this.lastname;}
    @Override
    public String getBirthDay() {return this.birthday;}
    @Override
    public String getNumberPhone() {return this.numberphone;}
    @Override
    public String getGender() {return this.gender;}
    
    @Override
    public void humanData(String[] arr) {
        this.surname = arr[0];
        this.name = arr[1];
        this.lastname = arr[2];
        this.birthday = arr[3];
        this.numberphone = arr[4];
        this.gender = arr[5];
    }

    @Override
    public String toString() {
        return surname + " " + name + " " + lastname + " " + birthday + 
            " " + numberphone + " " + gender;
    }
}
