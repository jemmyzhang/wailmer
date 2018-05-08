package pers.jz.wailmer.uploader;

/**
 * @author Jemmy Zhang on 2018/5/8.
 */
public enum UploadActionEnum {
    getInitConfig,
    prepareUpload,
    upload,
    getProgress,
    setRate,
    pauseUpload,
    resumeUpload,
    clearFile,
    clearAll,
    verifyCrcOfUncheckedPart;
}
