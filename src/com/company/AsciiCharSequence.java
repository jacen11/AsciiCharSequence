package com.company;

import java.util.Arrays;

class AsciiCharSequence implements CharSequence {

    private byte[] bytes;

    public AsciiCharSequence(byte[] bytes) {
        this.bytes = bytes;
    }

    @Override
    public String toString() {
        return new String(bytes);
    }

    @Override
    public int length() {
        return bytes.length;
    }

    @Override
    public char charAt(int index) {
        return (char) bytes[index];
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return new AsciiCharSequence(Arrays.copyOfRange(bytes, start, end));
    }
}