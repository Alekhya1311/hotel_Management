package edu.sjsu.assasins.hotelbooking.util;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class SHA512Hasher {

    public String hash(String passwordToHash){
        System.out.println("in hash");
        String generatedPassword = null;
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-512");
            // md.update(salt);
            byte[] bytes = md.digest(passwordToHash.getBytes(StandardCharsets.UTF_8));
            StringBuilder sb = new StringBuilder();
            for(int i=0; i< bytes.length ;i++){
                sb.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));
            }
            generatedPassword = sb.toString();
        }
        catch (NoSuchAlgorithmException e){
            e.printStackTrace();
        }
        System.out.println("genereated password" + generatedPassword);
        return generatedPassword;
    }

    public boolean checkPassword(String hash, String attempt){
        String generatedHash = hash(attempt);
        return hash.equals(generatedHash);
    }
}
