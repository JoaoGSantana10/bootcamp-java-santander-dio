package Modulo05.Exceptions.exception;

import Modulo05.Exceptions.Model.UserModel;

public class UserNotFoundException extends RuntimeException {

    public UserNotFoundException(String message) {
        super(message);
    }


}
