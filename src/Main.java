public class Main {
    public static void main(String[] args) {
        // Create instances of EmailNotification, SMSNotification, and PushNotification
        NotificationService emailNotification = new EmailNotification();
        NotificationService smsNotification = new SMSNotification();
         PushNotification push = new PushNotification("Pixel763");

        // Test each notification type by calling sendNotification
        emailNotification.sendNotification("Your exam results are available.");
        smsNotification.sendNotification("You have a new message from your friend.");
        push.sendNotification("Battery low: Please charge your phone.");

        // Set default priority for PushNotification
        push.setDefaultPriority("High");
    }
}
