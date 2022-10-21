package de.bolben.utils;

import java.net.URL;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *@Author Benjamin Bolgrin
 *
 *This class resolves the host name of a URL and returns a Path representation.
 *For Example:
 *URL: http://www.bolben.de -> Path: de/bolben/www
 */

public class URL2Path {

    private final URL url;

    public URL2Path(URL url){
        this.url = url;
    }

    public Path getPath(){
        String hostName = url.getHost();
        List<String> hostNameParts = new ArrayList<>(Arrays.asList(hostName.split("\\.")));
        Collections.reverse(hostNameParts);
        String pathName = "";

        for(String s : hostNameParts){
            pathName = pathName + "/" + s;

        }

        return Path.of(pathName);

    }

}
