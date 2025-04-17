public class RetryAnalyzer {
    private int retryCount = 0;
    private static final int maxRetryCount = 3;

    public boolean retry() {
        if (retryCount < maxRetryCount) {
            retryCount++;
            return true; // Retry the test
        }
        return false; // No more retries left
    }

    public int getRetryCount() {
        return retryCount;
    }

    public void resetRetryCount() {
        retryCount = 0;
    }
    public static void main(String[] args) {
        RetryAnalyzer retryAnalyzer = new RetryAnalyzer();
        for (int i = 0; i < 5; i++) {
            if (retryAnalyzer.retry()) {
                System.out.println("Retrying test, attempt " + retryAnalyzer.getRetryCount());
            } else {
                System.out.println("No more retries left.");
            }
        }
    }
    public void setRetryCount(int retryCount) {
        this.retryCount = retryCount;
    }
    public int getMaxRetryCount() {
        return maxRetryCount;
    }
    public void setMaxRetryCount(int maxRetryCount) {
        this.maxRetryCount = maxRetryCount;
    }
    public void reset() {
        retryCount = 0;
    }
    public void setRetry(boolean retry) {
        if (retry) {
            retryCount++;
        } else {
            retryCount = 0;
        }
    }
    public boolean shouldRetry() {
        return retryCount < maxRetryCount;
    }
    public void incrementRetryCount() {
        retryCount++;
    }
    public void decrementRetryCount() {
        if (retryCount > 0) {
            retryCount--;
        }
    }
    public void setMaxRetryCount(int maxRetryCount) {
        this.maxRetryCount = maxRetryCount;
    }
    public int getMaxRetryCount() {
        return maxRetryCount;
    }
}
