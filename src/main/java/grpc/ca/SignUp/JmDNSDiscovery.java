package grpc.ca.SignUp;

import java.io.IOException;
import java.net.InetAddress;

import javax.jmdns.JmDNS;
import javax.jmdns.ServiceEvent;
import javax.jmdns.ServiceInfo;
import javax.jmdns.ServiceListener;

public class JmDNSDiscovery {
	
	public static ServiceInfo run(String serviceType) throws InterruptedException {
		
		ServiceInfo serviceInfo1 = null;
		try {
			MyServiceListener listener = new MyServiceListener();
			JmDNS jmdns = JmDNS.create(InetAddress.getLocalHost());
			jmdns.addServiceListener(serviceType, listener);
			
			Thread.sleep(10000);
			
			serviceInfo1 = listener.getServiceInfo1();
			
			//System.out.println(serviceInfo1);
			
			System.out.println("Client started");
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
		return serviceInfo1;
	}
	
	public static class MyServiceListener implements ServiceListener{

		
		int port;
		ServiceInfo serviceInfo1;
		
		public void serviceAdded(ServiceEvent event) {
			
			ServiceInfo serviceInfo1 = event.getInfo();
			this.port = serviceInfo1.getPort();
			this.serviceInfo1 = serviceInfo1;
			
			System.out.println("Running on port: " + serviceInfo1.getPort());
			System.out.println("Service added: " + event.getInfo());
		}

		public void serviceRemoved(ServiceEvent event) {
			
			System.out.println("Service removed: " + event.getInfo());
		}

		public void serviceResolved(ServiceEvent event) {
			
			ServiceInfo serviceInfo1 = event.getInfo();
			this.port = serviceInfo1.getPort();
			this.serviceInfo1 = serviceInfo1;
			
			System.out.println("Running on port: " + serviceInfo1.getPort());
			System.out.println("Service resolved: " + event.getInfo());
		}
		
		public int getPort() {
			return port;
		}
		
		public ServiceInfo getServiceInfo1() {
			return serviceInfo1;
		}
		
	}

}