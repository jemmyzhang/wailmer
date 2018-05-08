package pers.jz.wailmer.dto;

import java.io.Serializable;

/**
 * @author Jemmy Zhang on 2018/5/8.
 */
public class CRCResult implements Serializable {

    private String value;
    private int read;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public int getRead() {
        return read;
    }

    public void setRead(int read) {
        this.read = read;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CRCResult crcResult = (CRCResult) o;

        if (read != crcResult.read) return false;
        return value != null ? value.equals(crcResult.value) : crcResult.value == null;
    }

    @Override
    public int hashCode() {
        int result = value != null ? value.hashCode() : 0;
        result = 31 * result + read;
        return result;
    }
}
