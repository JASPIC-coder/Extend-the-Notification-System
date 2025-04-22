public class PushNotification implements NotificationService {
    private String deviceId;

    // Constructor to initialize the deviceId
    public PushNotification(String deviceId) {
        this.deviceId = deviceId;
    }

    @Override
    public void sendNotification(String message) {
        // Simulate sending a push notification to a specific device
        System.out.println("Push Notification to device " + deviceId + ": " + message);
    }

    @Override
    public void setDefaultPriority(String priority) {
        // Overriding the default method to set the priority for push notifications
        System.out.println("Setting default priority for Push Notification: " + priority);
    }
}

