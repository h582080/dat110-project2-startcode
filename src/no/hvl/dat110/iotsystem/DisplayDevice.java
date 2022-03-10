package no.hvl.dat110.iotsystem;

import no.hvl.dat110.client.Client;
import no.hvl.dat110.messages.Message;
import no.hvl.dat110.messages.PublishMsg;
import no.hvl.dat110.common.TODO;

public class DisplayDevice {
	
	private static final int COUNT = 10;
		
	public static void main (String[] args) {
		
		System.out.println("Display starting ...");
		
		// TODO - START
				
		// create a client object and use it to
		Client client = new Client("display", Common.BROKERHOST, Common.BROKERPORT);
		
		// - connect to the broker - use "display" as the username
		client.connect();
		
		// - create the temperature topic on the broker
		String topic = Common.TEMPTOPIC;
		client.createTopic(topic);
		
		// - subscribe to the topic
		client.subscribe(topic);
		
		// - receive messages on the topic
		client.receive();
		
		// - unsubscribe from the topic
		client.unsubscribe(topic);
		
		// - disconnect from the broker
		client.disconnect();
		
		// TODO - END
		
		System.out.println("Display stopping ... ");
		
	}
}
