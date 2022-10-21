package de.bolben.utils;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * @Author Benjamin Bolgrin
 *
 * The class Json2Files will take the nodes of a JsonNode object and save them to separate json files on the file system.
 *
 */

public class Json2Files {

    private static final ObjectMapper objectMapper = new ObjectMapper().enable(SerializationFeature.INDENT_OUTPUT);
    private final JsonNode jsonNode;
    private final String fileNameKey;
    private final Path rootDir;

    public Json2Files(Path path /* Directory name */, JsonNode jsonNode, String fileNameKey /* Json key to use as file name */){
        this.jsonNode = jsonNode;
        this.fileNameKey = fileNameKey;
        rootDir = path;
    }

    public void writeFiles()
            throws IOException {

        for(JsonNode id : jsonNode){
            Path filePath = rootDir.resolve(objectMapper.writeValueAsString(id.get(fileNameKey)).replaceAll("[\"']", "") + ".json");
            Files.writeString(filePath, objectMapper.writeValueAsString(id), StandardCharsets.UTF_8);

        }

    }
}
