public class RandomDataGenerator {
    private static final String ALPHA_NUMERIC_STRING = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    private static final String ALPHA_STRING = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String NUMERIC_STRING = "0123456789";

    public static String generateRandomString(int length) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < length; i++) {
            int index = (int) (Math.random() * ALPHA_NUMERIC_STRING.length());
            builder.append(ALPHA_NUMERIC_STRING.charAt(index));
        }
        return builder.toString();
    }

    public static String generateRandomAlphaString(int length) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < length; i++) {
            int index = (int) (Math.random() * ALPHA_STRING.length());
            builder.append(ALPHA_STRING.charAt(index));
        }
        return builder.toString();
    }

    public static String generateRandomNumericString(int length) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < length; i++) {
            int index = (int) (Math.random() * NUMERIC_STRING.length());
            builder.append(NUMERIC_STRING.charAt(index));
        }
        return builder.toString();
    }
    public static String generateRandomEmail() {
        String localPart = generateRandomString(10);
        String domain = generateRandomString(5) + ".com";
        return localPart + "@" + domain;
    }
    public static String generateRandomPhoneNumber() {
        StringBuilder builder = new StringBuilder();
        builder.append("+1");
        for (int i = 0; i < 10; i++) {
            int index = (int) (Math.random() * NUMERIC_STRING.length());
            builder.append(NUMERIC_STRING.charAt(index));
        }
        return builder.toString();
    }
    public static String generateRandomAddress() {
        StringBuilder builder = new StringBuilder();
        builder.append(generateRandomString(5)).append(" ");
        builder.append(generateRandomString(10)).append(" St, ");
        builder.append(generateRandomString(5)).append(", ");
        builder.append(generateRandomString(5)).append(" ");
        builder.append(generateRandomNumericString(5));
        return builder.toString();
    }
    public static String generateRandomDate() {
        int year = (int) (Math.random() * 100) + 1920; // Random year between 1920 and 2020
        int month = (int) (Math.random() * 12) + 1; // Random month between 1 and 12
        int day = (int) (Math.random() * 28) + 1; // Random day between 1 and 28
        return String.format("%02d/%02d/%04d", month, day, year);
    }
    public static String generateRandomCreditCardNumber() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 16; i++) {
            int index = (int) (Math.random() * NUMERIC_STRING.length());
            builder.append(NUMERIC_STRING.charAt(index));
        }
        return builder.toString();
    }
    public static String generateRandomPassword(int length) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < length; i++) {
            int index = (int) (Math.random() * ALPHA_NUMERIC_STRING.length());
            builder.append(ALPHA_NUMERIC_STRING.charAt(index));
        }
        return builder.toString();
    }
    public static String generateRandomUsername(int length) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < length; i++) {
            int index = (int) (Math.random() * ALPHA_STRING.length());
            builder.append(ALPHA_STRING.charAt(index));
        }
        return builder.toString();
    }
    public static String generateRandomCity() {
        String[] cities = {"New York", "Los Angeles", "Chicago", "Houston", "Phoenix", "Philadelphia", "San Antonio", "San Diego", "Dallas", "San Jose"};
        int index = (int) (Math.random() * cities.length);
        return cities[index];
    }
    public static String generateRandomCountry() {
        String[] countries = {"USA", "Canada", "UK", "Australia", "Germany", "France", "Italy", "Spain", "India", "China"};
        int index = (int) (Math.random() * countries.length);
        return countries[index];
    }
    public static String generateRandomZipCode() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 5; i++) {
            int index = (int) (Math.random() * NUMERIC_STRING.length());
            builder.append(NUMERIC_STRING.charAt(index));
        }
        return builder.toString();
    }
    public static String generateRandomCompanyName() {
        String[] adjectives = {"Innovative", "Dynamic", "Global", "Synergy", "Visionary", "NextGen", "Pioneering", "Leading", "Premier", "Elite"};
        String[] nouns = {"Solutions", "Technologies", "Systems", "Services", "Concepts", "Designs", "Strategies", "Enterprises", "Ventures", "Corporation"};
        int adjIndex = (int) (Math.random() * adjectives.length);
        int nounIndex = (int) (Math.random() * nouns.length);
        return adjectives[adjIndex] + " " + nouns[nounIndex];
    }
    public static String generateRandomJobTitle() {
        String[] titles = {"Software Engineer", "Data Scientist", "Product Manager", "UX Designer", "DevOps Engineer", "Business Analyst", "Project Manager", "Marketing Specialist", "Sales Executive", "HR Manager"};
        int index = (int) (Math.random() * titles.length);
        return titles[index];
    }
    public static String generateRandomWebsite() {
        String domain = generateRandomString(5) + ".com";
        return "www." + domain;
    }
    public static String generateRandomIP() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 4; i++) {
            int octet = (int) (Math.random() * 256);
            builder.append(octet);
            if (i < 3) {
                builder.append(".");
            }
        }
        return builder.toString();
    }
    public static String generateRandomUUID() {
        return java.util.UUID.randomUUID().toString();
    }
    public static String generateRandomHexColor() {
        StringBuilder builder = new StringBuilder("#");
        for (int i = 0; i < 6; i++) {
            int index = (int) (Math.random() * 16);
            builder.append(Integer.toHexString(index));
        }
        return builder.toString();
    }
    public static String generateRandomLatitude() {
        double latitude = (Math.random() * 180) - 90; // Random latitude between -90 and 90
        return String.format("%.6f", latitude);
    }
    public static String generateRandomLongitude() {
        double longitude = (Math.random() * 360) - 180; // Random longitude between -180 and 180
        return String.format("%.6f", longitude);
    }
    public static String generateRandomTimestamp() {
        long timestamp = System.currentTimeMillis() / 1000L; // Current timestamp in seconds
        return String.valueOf(timestamp);
    }
    public static String generateRandomCurrency() {
        String[] currencies = {"USD", "EUR", "GBP", "JPY", "AUD", "CAD", "CHF", "CNY", "SEK", "NZD"};
        int index = (int) (Math.random() * currencies.length);
        return currencies[index];
    }
    public static String generateRandomCreditCardType() {
        String[] types = {"Visa", "MasterCard", "American Express", "Discover", "JCB", "Diners Club", "UnionPay"};
        int index = (int) (Math.random() * types.length);
        return types[index];
    }
    public static String generateRandomCreditCardExpiryDate() {
        int month = (int) (Math.random() * 12) + 1; // Random month between 1 and 12
        int year = (int) (Math.random() * 10) + 2023; // Random year between 2023 and 2032
        return String.format("%02d/%04d", month, year);
    }
    public static String generateRandomCreditCardCVV() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            int index = (int) (Math.random() * NUMERIC_STRING.length());
            builder.append(NUMERIC_STRING.charAt(index));
        }
        return builder.toString();
    }
    public static String generateRandomSocialSecurityNumber() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            int index = (int) (Math.random() * NUMERIC_STRING.length());
            builder.append(NUMERIC_STRING.charAt(index));
        }
        builder.append("-");
        for (int i = 0; i < 2; i++) {
            int index = (int) (Math.random() * NUMERIC_STRING.length());
            builder.append(NUMERIC_STRING.charAt(index));
        }
        builder.append("-");
        for (int i = 0; i < 4; i++) {
            int index = (int) (Math.random() * NUMERIC_STRING.length());
            builder.append(NUMERIC_STRING.charAt(index));
        }
        return builder.toString();
    }
    public static String generateRandomMacAddress() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            int octet = (int) (Math.random() * 256);
            builder.append(String.format("%02X", octet));
            if (i < 5) {
                builder.append(":");
            }
        }
        return builder.toString();
    }
    public static String generateRandomISBN() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 13; i++) {
            int index = (int) (Math.random() * NUMERIC_STRING.length());
            builder.append(NUMERIC_STRING.charAt(index));
        }
        return builder.toString();
    }
    public static String generateRandomBarcode() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 12; i++) {
            int index = (int) (Math.random() * NUMERIC_STRING.length());
            builder.append(NUMERIC_STRING.charAt(index));
        }
        return builder.toString();
    }
    public static String generateRandomLicensePlate() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            int index = (int) (Math.random() * ALPHA_STRING.length());
            builder.append(ALPHA_STRING.charAt(index));
        }
        builder.append("-");
        for (int i = 0; i < 4; i++) {
            int index = (int) (Math.random() * NUMERIC_STRING.length());
            builder.append(NUMERIC_STRING.charAt(index));
        }
        return builder.toString();
    }
    public static String generateRandomVehicleIdentificationNumber() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 17; i++) {
            int index = (int) (Math.random() * ALPHA_NUMERIC_STRING.length());
            builder.append(ALPHA_NUMERIC_STRING.charAt(index));
        }
        return builder.toString();
    }
    public static String generateRandomPasswordWithSpecialChars(int length) {
        String specialChars = "!@#$%^&*()_+[]{}|;:,.<>?";
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < length; i++) {
            int index = (int) (Math.random() * ALPHA_NUMERIC_STRING.length());
            builder.append(ALPHA_NUMERIC_STRING.charAt(index));
        }
        // Add at least one special character
        int specialCharIndex = (int) (Math.random() * specialChars.length());
        builder.setCharAt((int) (Math.random() * length), specialChars.charAt(specialCharIndex));
        return builder.toString();
    }
    public static String generateRandomHexadecimal() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            int index = (int) (Math.random() * 16);
            builder.append(Integer.toHexString(index));
        }
        return builder.toString();
    }
    public static String generateRandomBase64() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 16; i++) {
            int index = (int) (Math.random() * ALPHA_NUMERIC_STRING.length());
            builder.append(ALPHA_NUMERIC_STRING.charAt(index));
        }
        return java.util.Base64.getEncoder().encodeToString(builder.toString().getBytes());
    }
    public static String generateRandomUUIDWithDashes() {
        return java.util.UUID.randomUUID().toString();
    }
}
