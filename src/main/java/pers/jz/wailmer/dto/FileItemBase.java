package pers.jz.wailmer.dto;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Jemmy Zhang on 2018/5/8.
 */
public class FileItemBase implements Serializable {

    private String fileName;

    private Long sizeInBytes;

    private Date creationDate;

    private Long rateInKiloBytes;

    private Long crcedBytes;

    private String firstChunkCrcCode;

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public Long getSizeInBytes() {
        return sizeInBytes;
    }

    public void setSizeInBytes(Long sizeInBytes) {
        this.sizeInBytes = sizeInBytes;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Long getRateInKiloBytes() {
        return rateInKiloBytes;
    }

    public void setRateInKiloBytes(Long rateInKiloBytes) {
        this.rateInKiloBytes = rateInKiloBytes;
    }

    public Long getCrcedBytes() {
        return crcedBytes;
    }

    public void setCrcedBytes(Long crcedBytes) {
        this.crcedBytes = crcedBytes;
    }

    public String getFirstChunkCrcCode() {
        return firstChunkCrcCode;
    }

    public void setFirstChunkCrcCode(String firstChunkCrcCode) {
        this.firstChunkCrcCode = firstChunkCrcCode;
    }
}
