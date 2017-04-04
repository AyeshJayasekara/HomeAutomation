/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myapp;

import com.pubnub.api.PNConfiguration;
import com.pubnub.api.PubNub;
import com.pubnub.api.callbacks.PNCallback;
import com.pubnub.api.callbacks.SubscribeCallback;
import com.pubnub.api.models.consumer.PNPublishResult;
import com.pubnub.api.models.consumer.PNStatus;
import com.pubnub.api.models.consumer.pubsub.PNMessageResult;
import com.pubnub.api.models.consumer.pubsub.PNPresenceEventResult;
import java.util.Arrays;

/**
 *
 * @author ayeshjayasekara1
 */
public class Myapp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    PNConfiguration pnConfiguration = new PNConfiguration();
    pnConfiguration.setSubscribeKey("sub-c-764a7b9e-16a3-11e7-bb8a-0619f8945a4f"); 
    pnConfiguration.setPublishKey("pub-c-784c01b6-34fa-46e2-aba7-5eebb8efac0e");
     
    PubNub pubnub = new PubNub(pnConfiguration);
    
    pubnub.addListener(new SubscribeCallback() {
    @Override
    public void status(PubNub pubnub, PNStatus status) {
//        if (status.getCategory() == PNStatusCategory.PNConnectedCategory){
//            //complexData data = new complexData();
//            //data.fieldA = "Awesome";
//            //data.fieldB = 10;
//            pubnub.publish().channel("kozi").message("Hey").async(new PNCallback<PNPublishResult>() {
//                @Override
//                public void onResponse(PNPublishResult result, PNStatus status) {
//                    // handle publish response
//                }
//            });
//        }
    }
 
    @Override
    public void message(PubNub pubnub, PNMessageResult message) {
        System.out.println(""+message.getMessage().toString());
    }
 
    @Override
    public void presence(PubNub pubnub, PNPresenceEventResult presence) {
 
    }
    });
 
    pubnub.publish()
    .message("1Hello Machan!!!!!")
    .channel("NodeMCU")
    .async(new PNCallback<PNPublishResult>() {
        @Override
        public void onResponse(PNPublishResult result, PNStatus status) {
            // handle publish result, status always present, result if successful
            // status.isError to see if error happened
        }
    });
    
    pubnub.subscribe()
    .channels(Arrays.asList("kozi")) // subscribe to channels
    .execute();
    
    //pubnub.addListener(listener);
    
    
}
}
