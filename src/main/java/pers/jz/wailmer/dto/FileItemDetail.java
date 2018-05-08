package pers.jz.wailmer.dto;

/**
 * @author Jemmy Zhang on 2018/5/8.
 */
public class FileItemDetail extends FileItemBase {

    private boolean uploadComplete;

    private Long completionBytes;

    public boolean isUploadComplete() {
        return uploadComplete;
    }

    public void setUploadComplete(boolean uploadComplete) {
        this.uploadComplete = uploadComplete;
    }

    public Long getCompletionBytes() {
        return completionBytes;
    }

    public void setCompletionBytes(Long completionBytes) {
        this.completionBytes = completionBytes;
    }
}
