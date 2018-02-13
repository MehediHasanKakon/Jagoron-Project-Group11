# Jagoron-Project-Group11
Jagoron App:

App description : 
This app is designed for emergency help in dangerous situation to inform the most reliable contacts of user instantly by shaking the phone 3 times.


After Installing:
1. The user will see the option of setting contact name and numbers  as his helpline in any dangerous situation.
2. Then the user will have to put  his phone number.
3.There will be an option by which the user can edit their  phone number if they want.
4.Then his work is over, the app will do its work whenever he will need. 



Technical things to know:
Java codes :

 
1.	Display.java : It is for displaying.
2.	GPSTracker.java : It is for tracking location.
3.	Instructions.java : It is for executing instructions.
4.	MainActivity.java : It is for main program and instructions.
5.	RGeocoder.java : A class for handling geocoding and reverse geocoding.
6.	Register.java : It is for registering information.
7.	Verify.java : A program for verifying information.
8.	Splash.java : It is for maintainance and monitoring.


XML codes:
1.	activity_display.xml : It is for visual form of display program.
2.	activity_instructios.xml : It is for visual form of instructions program.
3.	activity_main.xml : It is for visual form of activitymain program.
4.	activity_register.xml : It is for visual form register program.
5.	activity_verify.xml : It is for visual form of verify program.

API for sending SMS : Twilio
Step 1: Send your first SMS

If you don’t have a Twilio phone number or haven’t sent a test message yet, then let’s start with that.You need a phone number capable of sending text messages to your destination. Different countries have different restrictions, be sure to check the country capabilities guide for your destination.
Not a developer? You might want to check out these Twilio-powered notifications providers.Learn more

Step2: Setup your Development Environment

Download and install the Twilio helper library for your language and project. If you don’t code then please contact us and we can help.

Step 3: Send an SMS via the Twilio REST API

Let’s get started with sending a SMS, for this example we’ll be sending a SMS survey to an imaginary customer and receiving the response.
To send a SMS with Twilio, you need to send a REST API call to Twilio with To, From and Body parameters. Let’s create those parameters.
In your software, create a new SMS message body with example: "Thanks for your order! On a scale of 1-10 would you recommend [company_name] to a friend? Reply with the number 1 to 10 to this message."
Send each SMS message using the helper library to POST to Twilio's API. Use the body you created above and To=[customer_phone_number] From=[your_twilio_number].
Here’s an example with sample code that you can try:
<?php
// this line loads the library
require('/path/to/twilio-php/Services/Twilio.php');
$account_sid = '[AccountSID]';
$auth_token = '[AuthToken]';
$client = new Services_Twilio($account_sid, $auth_token);
$client->account->messages->create(array(
   'To' => "[customer_phone_number]",
   'From' => "[your_twilio_number]",
   'Body' => "Thanks for your order! On a scale of 1-10 would you recommend [company_name] to a friend? Reply with the number 1 to 10 to this message.", 
));


Make sure you format your phone numbers correctly using the E.164 number format standard.
After you send a message or two, be sure to check the SMS dashboard to see details such as message delivery status, errors and warnings.
Step 4: Receive incoming messages

Let’s set up two-way messaging so you can receive the responses from your users in your software, in this example survey responses.
For two-way messaging, you’ll need your code to be deployed to a server that’s publicly accessible from the internet, so we can send calls to it, known as webhooks.
To handle a webhook you need a web application that can accept the HTTP requests. If you already have a web application set up, handling a webhook is usually as easy as adding a new URL to your application. If you don't already have a web application, almost all server-side programming languages offer frameworks to help you build one.
When a text message is received by your Twilio number, Twilio makes an HTTP request to the message URL configured for that number. In your response to that request, you can tell Twilio what to do in response to the SMS using Twilio’s XML like markup language, TwiML or just acknowledge receipt.
An alternative to deploying code to a server during development is to serve that code from your local development environment. You can do this by tunneling to your local machine using ngrok. ngrok is a really easy way to use your local dev environment and it provides a publicly accessible URL. Download the free package and use that address to respond to Twilio webhook requests.
Pro Tip #1: Maximize the deliverability of your messages

Carriers filter messages based in part on volume. This sometimes means legitimate messages get caught in their filters. You’ll see this in your logs as 30007 and/or 30004 errors.
Twilio queues outbound messages to the carriers on your behalf to optimize deliverability. Make sure you have enough numbers in your account to send the number of messages per second you require. For example within the US and Canada it’s one message per second per phone number and internationally it’s 10 messages per second per phone number.
US Carriers also don’t like to see too many outbound messages from a single long code phone number. To maximize deliverability of your messages, try to send no more than 200 recipients per day, per phone number and spread out the time when you send them. Best practice is one message approximately every five minutes.
Twilio has a tool named Copilot that manages this for you. Instead of you having to pick which phone number you use, send it to a messaging service and Copilot will pick the best phone number for you.
Simply add enough phone numbers to cover your volume and throughput needs (200 recipients per day and 1 message per second per phone number) and send that from a Messaging Service SID. If you decide you’re ready for a Short Code you can add that to your Copilot number pool seamlessly.
Other considerations

If you’re using a Twilio Trial account, you are limited to sending messages only to your phone number. Upgrade your account to lift these restrictions.
By default, Twilio handles certain basic elements of SMS compliance for you. Customers can text in HELP, STOP & START and we’ll handle the opt-out list for you. Check the laws that will apply to your campaign to be sure that you build in any additional compliance requirements. In the US you can use the Payfone TCPA compliance Add-On to check the customer's’ number.
When sending text messages globally, be aware of country specific restrictions for sending SMS. Check Twilio’s country capabilities guidelines for best practices for each country you’re sending traffic to.
Are you sending more than 200 messages per day? Would you like to send more than one message per second? To overcome these limitations, consider moving to a shortcode or pooling phone numbers using a Copilot Messaging Service.




