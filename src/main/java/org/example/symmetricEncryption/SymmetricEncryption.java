package org.example.symmetricEncryption;

public interface SymmetricEncryption {
    byte[] encrypt(byte[] textToEncrypt, byte[] encryptionKey);
    byte[] decrypt(byte[] encryptedText, byte[] decryptionKey);
}
