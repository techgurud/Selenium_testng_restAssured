public class ValidationUtils {
    public static void validateElementIsDisplayed(WebDriver driver, By locator) {
        try {
            WebElement element = driver.findElement(locator);
            if (!element.isDisplayed()) {
                throw new AssertionError("Element is not displayed: " + locator);
            }
        } catch (NoSuchElementException e) {
            throw new AssertionError("Element not found: " + locator, e);
        }
    }

    public static void validateElementIsEnabled(WebDriver driver, By locator) {
        try {
            WebElement element = driver.findElement(locator);
            if (!element.isEnabled()) {
                throw new AssertionError("Element is not enabled: " + locator);
            }
        } catch (NoSuchElementException e) {
            throw new AssertionError("Element not found: " + locator, e);
        }
    }

    public static void validateTextEquals(WebDriver driver, By locator, String expectedText) {
        try {
            WebElement element = driver.findElement(locator);
            String actualText = element.getText();
            if (!actualText.equals(expectedText)) {
                throw new AssertionError("Text does not match. Expected: " + expectedText + ", Actual: " + actualText);
            }
        } catch (NoSuchElementException e) {
            throw new AssertionError("Element not found: " + locator, e);
        }
    }

    public static void validateAttributeEquals(WebDriver driver, By locator, String attributeName, String expectedValue) {
        try {
            WebElement element = driver.findElement(locator);
            String actualValue = element.getAttribute(attributeName);
            if (!actualValue.equals(expectedValue)) {
                throw new AssertionError("Attribute value does not match. Expected: " + expectedValue + ", Actual: " + actualValue);
            }
        } catch (NoSuchElementException e) {
            throw new AssertionError("Element not found: " + locator, e);
        }
    }
    public static void validateElementIsSelected(WebDriver driver, By locator) {
        try {
            WebElement element = driver.findElement(locator);
            if (!element.isSelected()) {
                throw new AssertionError("Element is not selected: " + locator);
            }
        } catch (NoSuchElementException e) {
            throw new AssertionError("Element not found: " + locator, e);
        }
    }
    public static void validateElementIsNotDisplayed(WebDriver driver, By locator) {
        try {
            WebElement element = driver.findElement(locator);
            if (element.isDisplayed()) {
                throw new AssertionError("Element is displayed when it should not be: " + locator);
            }
        } catch (NoSuchElementException e) {
            // Element is not found, which is expected
        }
    }
    public static void validateElementIsNotEnabled(WebDriver driver, By locator) {
        try {
            WebElement element = driver.findElement(locator);
            if (element.isEnabled()) {
                throw new AssertionError("Element is enabled when it should not be: " + locator);
            }
        } catch (NoSuchElementException e) {
            throw new AssertionError("Element not found: " + locator, e);
        }
    }
    public static void validateTextContains(WebDriver driver, By locator, String expectedText) {
        try {
            WebElement element = driver.findElement(locator);
            String actualText = element.getText();
            if (!actualText.contains(expectedText)) {
                throw new AssertionError("Text does not contain expected value. Expected: " + expectedText + ", Actual: " + actualText);
            }
        } catch (NoSuchElementException e) {
            throw new AssertionError("Element not found: " + locator, e);
        }
    }
    public static void validateAttributeContains(WebDriver driver, By locator, String attributeName, String expectedValue) {
        try {
            WebElement element = driver.findElement(locator);
            String actualValue = element.getAttribute(attributeName);
            if (!actualValue.contains(expectedValue)) {
                throw new AssertionError("Attribute value does not contain expected value. Expected: " + expectedValue + ", Actual: " + actualValue);
            }
        } catch (NoSuchElementException e) {
            throw new AssertionError("Element not found: " + locator, e);
        }
    }
    public static void validateElementIsNotSelected(WebDriver driver, By locator) {
        try {
            WebElement element = driver.findElement(locator);
            if (element.isSelected()) {
                throw new AssertionError("Element is selected when it should not be: " + locator);
            }
        } catch (NoSuchElementException e) {
            throw new AssertionError("Element not found: " + locator, e);
        }
    }
    public static void validateElementIsPresent(WebDriver driver, By locator) {
        try {
            WebElement element = driver.findElement(locator);
            if (element == null) {
                throw new AssertionError("Element is not present: " + locator);
            }
        } catch (NoSuchElementException e) {
            throw new AssertionError("Element not found: " + locator, e);
        }
    }
    public static void validateElementIsNotPresent(WebDriver driver, By locator) {
        try {
            WebElement element = driver.findElement(locator);
            if (element != null) {
                throw new AssertionError("Element is present when it should not be: " + locator);
            }
        } catch (NoSuchElementException e) {
            // Element is not found, which is expected
        }
    }
    public static void validateElementIsEnabled(WebDriver driver, By locator) {
        try {
            WebElement element = driver.findElement(locator);
            if (!element.isEnabled()) {
                throw new AssertionError("Element is not enabled: " + locator);
            }
        } catch (NoSuchElementException e) {
            throw new AssertionError("Element not found: " + locator, e);
        }
    }
    public static void validateElementIsDisabled(WebDriver driver, By locator) {
        try {
            WebElement element = driver.findElement(locator);
            if (element.isEnabled()) {
                throw new AssertionError("Element is enabled when it should not be: " + locator);
            }
        } catch (NoSuchElementException e) {
            throw new AssertionError("Element not found: " + locator, e);
        }
    }
    public static void validateElementIsClickable(WebDriver driver, By locator) {
        try {
            WebElement element = driver.findElement(locator);
            if (!element.isDisplayed() || !element.isEnabled()) {
                throw new AssertionError("Element is not clickable: " + locator);
            }
        } catch (NoSuchElementException e) {
            throw new AssertionError("Element not found: " + locator, e);
        }
    }
    public static void validateElementIsNotClickable(WebDriver driver, By locator) {
        try {
            WebElement element = driver.findElement(locator);
            if (element.isDisplayed() && element.isEnabled()) {
                throw new AssertionError("Element is clickable when it should not be: " + locator);
            }
        } catch (NoSuchElementException e) {
            throw new AssertionError("Element not found: " + locator, e);
        }
    }
    public static void validateElementIsVisible(WebDriver driver, By locator) {
        try {
            WebElement element = driver.findElement(locator);
            if (!element.isDisplayed()) {
                throw new AssertionError("Element is not visible: " + locator);
            }
        } catch (NoSuchElementException e) {
            throw new AssertionError("Element not found: " + locator, e);
        }
    }
    public static void validateElementIsNotVisible(WebDriver driver, By locator) {
        try {
            WebElement element = driver.findElement(locator);
            if (element.isDisplayed()) {
                throw new AssertionError("Element is visible when it should not be: " + locator);
            }
        } catch (NoSuchElementException e) {
            // Element is not found, which is expected
        }
    }
    public static void validateElementIsStale(WebDriver driver, By locator) {
        try {
            WebElement element = driver.findElement(locator);
            if (element.isDisplayed()) {
                throw new AssertionError("Element is not stale: " + locator);
            }
        } catch (StaleElementReferenceException e) {
            // Element is stale, which is expected
        } catch (NoSuchElementException e) {
            throw new AssertionError("Element not found: " + locator, e);
        }
    }
    public static void validateElementIsNotStale(WebDriver driver, By locator) {
        try {
            WebElement element = driver.findElement(locator);
            if (element == null) {
                throw new AssertionError("Element is stale: " + locator);
            }
        } catch (StaleElementReferenceException e) {
            throw new AssertionError("Element not found: " + locator, e);
        }
    }
    public static void validateElementIsSelected(WebDriver driver, By locator) {
        try {
            WebElement element = driver.findElement(locator);
            if (!element.isSelected()) {
                throw new AssertionError("Element is not selected: " + locator);
            }
        } catch (NoSuchElementException e) {
            throw new AssertionError("Element not found: " + locator, e);
        }
    }
    public static void validateElementIsNotSelected(WebDriver driver, By locator) {
        try {
            WebElement element = driver.findElement(locator);
            if (element.isSelected()) {
                throw new AssertionError("Element is selected when it should not be: " + locator);
            }
        } catch (NoSuchElementException e) {
            throw new AssertionError("Element not found: " + locator, e);
        }
    }
    public static void validateElementIsPresent(WebDriver driver, By locator) {
        try {
            WebElement element = driver.findElement(locator);
            if (element == null) {
                throw new AssertionError("Element is not present: " + locator);
            }
        } catch (NoSuchElementException e) {
            throw new AssertionError("Element not found: " + locator, e);
        }
    }
    public static void validateElementIsNotPresent(WebDriver driver, By locator) {
        try {
            WebElement element = driver.findElement(locator);
            if (element != null) {
                throw new AssertionError("Element is present when it should not be: " + locator);
            }
        } catch (NoSuchElementException e) {
            // Element is not found, which is expected
        }
    }
    public static void validateElementIsEnabled(WebDriver driver, By locator) {
        try {
            WebElement element = driver.findElement(locator);
            if (!element.isEnabled()) {
                throw new AssertionError("Element is not enabled: " + locator);
            }
        } catch (NoSuchElementException e) {
            throw new AssertionError("Element not found: " + locator, e);
        }
    }
    public static void validateElementIsDisabled(WebDriver driver, By locator) {
        try {
            WebElement element = driver.findElement(locator);
            if (element.isEnabled()) {
                throw new AssertionError("Element is enabled when it should not be: " + locator);
            }
        } catch (NoSuchElementException e) {
            throw new AssertionError("Element not found: " + locator, e);
        }
    }
    public static void validateElementIsClickable(WebDriver driver, By locator) {
        try {
            WebElement element = driver.findElement(locator);
            if (!element.isDisplayed() || !element.isEnabled()) {
                throw new AssertionError("Element is not clickable: " + locator);
            }
        } catch (NoSuchElementException e) {
            throw new AssertionError("Element not found: " + locator, e);
        }
    }
    public static void validateElementIsNotClickable(WebDriver driver, By locator) {
        try {
            WebElement element = driver.findElement(locator);
            if (element.isDisplayed() && element.isEnabled()) {
                throw new AssertionError("Element is clickable when it should not be: " + locator);
            }
        } catch (NoSuchElementException e) {
            throw new AssertionError("Element not found: " + locator, e);
        }
    }
    public static void validateElementIsVisible(WebDriver driver, By locator) {
        try {
            WebElement element = driver.findElement(locator);
            if (!element.isDisplayed()) {
                throw new AssertionError("Element is not visible: " + locator);
            }
        } catch (NoSuchElementException e) {
            throw new AssertionError("Element not found: " + locator, e);
        }
    }
    public static void validateElementIsNotVisible(WebDriver driver, By locator) {
        try {
            WebElement element = driver.findElement(locator);
            if (element.isDisplayed()) {
                throw new AssertionError("Element is visible when it should not be: " + locator);
            }
        } catch (NoSuchElementException e) {
            // Element is not found, which is expected
        }
    }
}
