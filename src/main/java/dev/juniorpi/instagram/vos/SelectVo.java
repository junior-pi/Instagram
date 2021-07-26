package dev.juniorpi.instagram.vos;

import org.springframework.web.multipart.MultipartFile;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SelectVo {
    private final String fid;
    private final String name;
    private final String type;
    private final MultipartFile file;

    public SelectVo(MultipartFile file) throws NoSuchAlgorithmException {
        this.name = file.getOriginalFilename();
        this.type = file.getContentType();
        this.file = file;

        String rawFid = String.format("%s;%f;%s", this.name, Math.random(),
                new SimpleDateFormat("yyyyMMddHHmmssSSS").format(new Date()));
        MessageDigest hash = MessageDigest.getInstance("SHA-512");
        hash.reset();
        hash.update(rawFid.getBytes(StandardCharsets.UTF_8));
        this.fid = String.format("%0128x", new BigInteger(1, hash.digest()));
    }

    public String getFid() {
        return this.fid;
    }

    public String getName() {
        return this.name;
    }

    public String getType() {
        return this.type;
    }

    public MultipartFile getFile() {
        return this.file;
    }
}
