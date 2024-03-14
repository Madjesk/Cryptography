package org.example.encryption;

public interface Encryption {
    byte[] encrypt(byte[] inputBlock, byte[] roundKey);
}
