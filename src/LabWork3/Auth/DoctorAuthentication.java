package LabWork3.Auth;

import LabWork3.UserTypes.Doctor;

import java.util.List;

public class DoctorAuthentication implements Authenticatable<Doctor>{

    @Override
    public Doctor Login(List<Doctor> registeredUsers, String login, String password) {
        return registeredUsers.stream()
                .filter((doctor) -> doctor.getLogin().equals(login) & doctor.getPassword().equals(password))
                .findFirst()
                .orElse(null);
    }

    @Override
    public Doctor Register(String login, String password, String confirmPassword) {
        if(Validation.isEmptyOrWhiteSpace(login)){
            throw new IllegalArgumentException("Invalid login");
        }

        if(Validation.isEmptyOrWhiteSpace(password)){
            throw new IllegalArgumentException("Invalid password");
        }

        if(!password.equals(confirmPassword)){
            throw new IllegalArgumentException("Passwords must match.");
        }

        return new Doctor(login,password);
    }
}
