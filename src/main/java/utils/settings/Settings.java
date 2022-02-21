package utils.settings;

import org.apache.commons.io.IOUtils;
import org.json.JSONObject;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Paths;
import java.util.Properties;

public class Settings {
    private static Settings tafSettings;
    private final String browser;
    private final String envURL;

    public Settings() {
        Properties property = getSettingReader();
        JSONObject settingsJSON = parseSettingsJSON();

        this.browser = property.getProperty("browser", "");
        this.envURL = (String) settingsJSON.get("dev_env");
    }

    public static Settings getTAFSettings() {
        if (tafSettings == null) {
            tafSettings = new Settings();
        }
        return tafSettings;
    }

    private Properties getSettingReader() {
        FileInputStream propertyFile;
        Properties property = new Properties();
        try {
            String filePath = getFilePropertyPath();
            propertyFile = new FileInputStream(filePath);
            property.load(propertyFile);
        } catch (IOException ignored) {
        }

        return property;
    }

    public JSONObject parseSettingsJSON() {

        try {
            String jsonFile = "src/main/java/utils/settings/settings.json";
            InputStream is = new FileInputStream(jsonFile);
            String jsonTxt = IOUtils.toString(is, StandardCharsets.UTF_8);
            return new JSONObject(jsonTxt);
        } catch (IOException ignored) {
        }
        return null;
    }

    public String getCurrentWorkDirectory() {
        String currentPath = Paths.get("").toAbsolutePath().toString();
        String[] tokens = null;
        if (currentPath.contains("/")) {
            tokens = currentPath.split("/");
        } else {
            tokens = currentPath.split("\\\\");
        }
        StringBuilder currentDir = new StringBuilder();
        for (String token : tokens) {
            currentDir.append(token).append("/");
            if (token.equals("JavaSeleniumComponentStyleHerokuApp")) {
                break;
            }
        }
        return currentDir.toString();
    }

    private String getFilePropertyPath() {
        String localPropertyFile = "src/main/resources/env_local.properties";
        File localFile = new File(localPropertyFile);

        String propertyFile = "src/main/resources/env.properties";
        return localFile.exists() ? localPropertyFile : propertyFile;
    }

    public String getEnvURL() {
        return this.envURL;
    }

    public String getBrowser() {
        return this.browser;
    }
}
