/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vimsa.ydd.java8newfeatures.random;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

/**
 *
 * @author adrian.popa
 */
public class NewRandomGenerator {

    public static byte[] getSecureRandomBytes() throws NoSuchAlgorithmException {
        SecureRandom rand = SecureRandom.getInstanceStrong();
        byte bytes[] = new byte[20];
        rand.nextBytes(bytes);
        return bytes;
    }
}
