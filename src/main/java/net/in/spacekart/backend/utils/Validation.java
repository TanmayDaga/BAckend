package net.in.spacekart.backend.utils;

public class Validation {

    public static EMAILID_PHONENUMBER checkEmailIdOrPhoneNumber(String username) {
        return username.contains("@") ? EMAILID_PHONENUMBER.EMAIL_ID : EMAILID_PHONENUMBER.PHONE_NUMBER;
    }


    public enum EMAILID_PHONENUMBER {
        PHONE_NUMBER, EMAIL_ID
    }
}
