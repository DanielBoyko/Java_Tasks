package LabWork3.Auth;

import LabWork3.UserTypes.Doctor;

import java.util.List;

public class DoctorAuthentication implements Authenticatable<Doctor>{

    @Override
    public Doctor Login(List<Doctor> registeredUsers, String login, String password) {
        return registeredUsers.stream()
                .filter((doctor) -> doctor.getLogin() == login & doctor.getPassword() == password)
                .findFirst()
                .orElse(null);
    }

    @Override
    public Doctor Register(String login, String password, String confirmPassword) {
        return new Doctor(login,password);
    }
}
