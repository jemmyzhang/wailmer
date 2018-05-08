package pers.jz.wailmer.dto;

import java.io.Serializable;
import java.util.Map;

/**
 * @author Jemmy Zhang on 2018/5/8.
 */
public class InitialConfiguration implements Serializable {

    private long sliceSizeInBytes;

    private Map<String, FileItemDetail> pendingFiles;

    public long getSliceSizeInBytes() {
        return sliceSizeInBytes;
    }

    public void setSliceSizeInBytes(long sliceSizeInBytes) {
        this.sliceSizeInBytes = sliceSizeInBytes;
    }

    public Map<String, FileItemDetail> getPendingFiles() {
        return pendingFiles;
    }

    public void setPendingFiles(Map<String, FileItemDetail> pendingFiles) {
        this.pendingFiles = pendingFiles;
    }
}
