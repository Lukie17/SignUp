package grpc.ca.SignUp;

import java.io.IOException;
import java.net.InetAddress;

import javax.jmdns.JmDNS;
import javax.jmdns.ServiceInfo;

public class JmDNSRegistration {

	public void run(String serviceType, String serviceName, int port, String description) throws InterruptedException {
		try {
			JmDNS jmdns = JmDNS.create(InetAddress.getLocalHost());
			ServiceInfo serviceInfo = ServiceInfo.create(serviceType, serviceName, port, description);
			jmdns.registerService(serviceInfo);
			Thread.sleep(10000);

			System.out.println("JmDNS has registered service on: " + port + ", the service name is " + serviceName
					+ ", with service type " + serviceType + ", and it is " + description);

		} catch (IOException e) {

			e.printStackTrace();
		}

	}

}
