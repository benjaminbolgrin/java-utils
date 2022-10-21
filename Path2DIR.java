package de.bolben.utils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * @Author Benjamin Bolgrin
 *
 * This class takes 2 Path objects (rootDir and subDir) and creates the directories, if they don't exist on the hard disk.
 */

public class Path2DIR {

    private final Path rootDir;
    private final Path subDir;

    public Path2DIR(Path rootDir, Path subDir){

        this.rootDir = rootDir;
        this.subDir = subDir;
    }

    private Path combinedPath(){
        String baseDir = rootDir.toString();
        String subDir2 = subDir.toString();
        return Path.of(baseDir + subDir2);
    }

    public void mkdirs() throws IOException {
        Path combinedPath = this.combinedPath();
        Files.createDirectories(combinedPath);
    }

}
