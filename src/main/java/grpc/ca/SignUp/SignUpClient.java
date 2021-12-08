/*
 * Luke T
 * SignUpClient.java
 * 07/12/21 
 */

package grpc.ca.SignUp;


import java.util.concurrent.TimeUnit;

import javax.jmdns.ServiceInfo;
import javax.swing.JOptionPane;

import grpc.ca.SignUp.signUpGrpc.signUpStub;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;
import io.grpc.stub.StreamObserver;

public class SignUpClient {

	private static signUpStub asyncStub;

	public static void main(String[] args) throws InterruptedException {

		String host = "localhost";

		ServiceInfo serviceInfo1 = JmDNSDiscovery.run("_signUp._tcp.local.");

		ManagedChannel channel1 = ManagedChannelBuilder.forAddress(host, serviceInfo1.getPort()).usePlaintext().build();

		asyncStub = signUpGrpc.newStub(channel1);

		try {

			// client streaming
			System.out.println("--Client streaming--");
			getSignUp();

		} catch (StatusRuntimeException e) {
			e.printStackTrace();
		} finally {
			channel1.shutdown().awaitTermination(60, TimeUnit.SECONDS);
		}
	}

	// client streaming
	public static void getSignUp() {

		StreamObserver<HelloReply3> responseObserver = new StreamObserver<HelloReply3>() {

			@Override
			public void onNext(HelloReply3 value) {

				System.out.println("Confirmation: " + value.getMessage3());

			}

			@Override
			public void onError(Throwable t) {
				t.printStackTrace();

			}

			@Override
			public void onCompleted() {
				System.out.println("Stream is completed, inside client");
			}

		};

		StreamObserver<HelloRequest3> requestObserver = asyncStub.getSignUp(responseObserver);

		try {

			Thread.sleep(2000);
			String name = JOptionPane.showInputDialog(null, "What is your name?");
			JOptionPane.showMessageDialog(null, "Your name is " + name);
			requestObserver.onNext(HelloRequest3.newBuilder().setName3(name).build());
			Thread.sleep(500);

			String dateOfBirth = JOptionPane.showInputDialog(null, "What is your date of birth?");
			requestObserver.onNext(HelloRequest3.newBuilder().setName3(dateOfBirth).build());
			JOptionPane.showMessageDialog(null, "Your date of birth is " + dateOfBirth);
			Thread.sleep(500);

			String email = JOptionPane.showInputDialog(null, "What is your email?");
			requestObserver.onNext(HelloRequest3.newBuilder().setName3(email).build());
			JOptionPane.showMessageDialog(null, "Your email is " + email);
			Thread.sleep(500);

			requestObserver.onCompleted();
			Thread.sleep(10000);

		} catch (RuntimeException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
