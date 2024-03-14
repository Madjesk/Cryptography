package org.example.symmetricEncryption;


import java.io.File;
import java.io.IOException;

public class SymmetricEncryptionContext implements SymmetricEncryption  {
    enum EncryptionMode {
        ECB,
        CBC,
        PCBC,
        CFB,
        OFB,
        CTR,
        RANDOM_DELTA
    }

    enum PaddingMode {
        ZEROS,
        ANSI_X923,
        PKCS7,
        ISO_10126
    }

    private byte[] encryptionKey;
    private EncryptionMode encryptionMode;
    private PaddingMode paddingMode;
    private byte[] initializationVector;
    private Object[] additionalParams;

    public SymmetricEncryptionContext(byte[] encryptionKey, EncryptionMode encryptionMode, PaddingMode paddingMode, byte[] initializationVector,Object... additionalParams) {
        this.encryptionKey = encryptionKey;
        this.encryptionMode = encryptionMode;
        this.paddingMode = paddingMode;
        this.initializationVector = initializationVector;
        this.additionalParams = additionalParams;
    }

    @Override
    public byte[] encrypt(byte[] textToEncrypt, byte[] encryptionKey) {
        return new byte[0];
    }

    @Override
    public byte[] decrypt(byte[] encryptedText, byte[] decryptionKey) {
        return new byte[0];
    }

    public void encrypt(File inputFile, File outputFile, byte[] encryptionKey) throws IOException {

    }

    public void decrypt(File inputFile, File outputFile, byte[] decryptionKey) throws IOException {

    }
}
