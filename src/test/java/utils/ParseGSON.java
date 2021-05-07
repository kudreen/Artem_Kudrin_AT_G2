package utils;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import day19.L4JLogging;
import objects.jsonObjects.RealnameObject;
import objects.jsonObjects.UserObject;
import org.apache.log4j.Logger;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ParseGSON {
    private final static String JJSON = "src/test/java/objects/jsonObjects/REObjects.json";
    private static final Logger LOGGER = Logger.getLogger(L4JLogging.class.getName());

    public static String user() throws FileNotFoundException {
        Gson gson = new Gson();
        UserObject reo = gson.fromJson(new JsonReader(new FileReader(JJSON)), UserObject.class);
        String user = reo.user;
        LOGGER.debug("do" + user + "GSON parsing");
        return user;
    }

    public static String realname() throws FileNotFoundException {
        Gson gson = new Gson();
        RealnameObject reo = gson.fromJson(new JsonReader(new FileReader(JJSON)), RealnameObject.class);
        String realname = reo.realname;
        LOGGER.debug("do" + realname + "GSON parsing");
        return realname;

    }
}

