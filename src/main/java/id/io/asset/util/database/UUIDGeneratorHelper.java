/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.io.asset.util.database;


import id.io.asset.helper.UUIDGenerator;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author permadi
 */
public class UUIDGeneratorHelper {

    private static final String APP_KEY = "asset";

    public UUID generateUUID(String key) {
        String source = APP_KEY + key;
        byte[] bytes;
        UUID uuid = null;
        try {
            bytes = source.getBytes("UTF-8");
            uuid = UUIDFromBytes(bytes);
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(UUIDGenerator.class.getName()).log(Level.SEVERE, null, ex);
        }

        return uuid;
    }

    private UUID UUIDFromBytes(byte[] name) {
        MessageDigest md;
        try {
            md = MessageDigest.getInstance("SHA-1");
        } catch (NoSuchAlgorithmException nsae) {
            throw new InternalError("SHA-1 not supported", nsae);
        }
        byte[] bytes = Arrays.copyOfRange(md.digest(name), 0, 16);
        bytes[6] &= 0x0f;
        bytes[6] |= 0x50;
        bytes[8] &= 0x3f;
        bytes[8] |= 0x80;
        return constructUUID(bytes);
    }

    private UUID constructUUID(byte[] data) {
        long msb = 0;
        long lsb = 0;
        assert data.length == 16 : "data must be 16 bytes in length";

        for (int i = 0; i < 8; i++) {
            msb = (msb << 8) | (data[i] & 0xff);
        }

        for (int i = 8; i < 16; i++) {
            lsb = (lsb << 8) | (data[i] & 0xff);
        }
        return new UUID(msb, lsb);
    }

}
