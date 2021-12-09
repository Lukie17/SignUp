/*
 * Luke T
 * SignUpServer.java
 * 07/12/21 
 */

package grpc.ca.SignUp;

import java.io.IOException;

import javax.swing.JOptionPane;

import grpc.ca.SignUp.signUpGrpc.signUpImplBase;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

public class SignUpServer extends signUpImplBase {

	public static void main(String[] args) throws InterruptedException {

		int port = 50052;
		SignUpServer server1 = new SignUpServer();

		JmDNSRegistration reg = new JmDNSRegistration();

		System.out.println("Starting gRPC Sign Up Server");
		reg.run("_signUp._tcp.local.", "Sign Up", 50052, "running Sign Up");

		try {
			Server server;
			server = ServerBuilder.forPort(port).addService(server1).build().start();
			System.out.println("Server running on port: " + port);

			server.awaitTermination();

		} catch (IOException e) {

			e.printStackTrace();
		}

	}

	@Override
	public StreamObserver<HelloRequest3> getSignUp(StreamObserver<HelloReply3> responseObserver) {

		System.out.println("Inside streaming implementation");

		return new StreamObserver<HelloRequest3>() {

			@Override
			public void onNext(HelloRequest3 request3) {
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {

					e.printStackTrace();
				}
				System.out.println("Message received from client: " + request3.getName3());

			}

			@Override
			public void onError(Throwable t) {

			}

			// Client has indicated to server that it has finished streaming
			@Override
			public void onCompleted() {

				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {

					e.printStackTrace();
				}

				JOptionPane.showMessageDialog(null, "You are now signed up!");

				HelloReply3 reply1 = HelloReply3.newBuilder().setMessage3("You are now signed up!").build();

				responseObserver.onNext(reply1);

				responseObserver.onCompleted();

				System.out.println("Stream is completed, inside server");

			}

		};

	}

}