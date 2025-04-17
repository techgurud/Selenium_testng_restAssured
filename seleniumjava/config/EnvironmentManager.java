public class EnvironmentManager {
     
    private static String environment;
    private static String browser;
    private static String baseUrl;
    private static String testDataFilePath;

    public static void setEnvironment(String env) {
        environment = env;
    }

    public static String getEnvironment() {
        return environment;
    }

    public static void setBrowser(String br) {
        browser = br;
    }

    public static String getBrowser() {
        return browser;
    }

    public static void setBaseUrl(String url) {
        baseUrl = url;
    }

    public static String getBaseUrl() {
        return baseUrl;
    }

    public static void setTestDataFilePath(String path) {
        testDataFilePath = path;
    }

    public static String getTestDataFilePath() {
        return testDataFilePath;
    }
}
