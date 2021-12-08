package grpc.ca.SignUp;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: SignUp.proto")
public final class signUpGrpc {

  private signUpGrpc() {}

  public static final String SERVICE_NAME = "signUp";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<grpc.ca.SignUp.HelloRequest3,
      grpc.ca.SignUp.HelloReply3> getGetSignUpMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetSignUp",
      requestType = grpc.ca.SignUp.HelloRequest3.class,
      responseType = grpc.ca.SignUp.HelloReply3.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<grpc.ca.SignUp.HelloRequest3,
      grpc.ca.SignUp.HelloReply3> getGetSignUpMethod() {
    io.grpc.MethodDescriptor<grpc.ca.SignUp.HelloRequest3, grpc.ca.SignUp.HelloReply3> getGetSignUpMethod;
    if ((getGetSignUpMethod = signUpGrpc.getGetSignUpMethod) == null) {
      synchronized (signUpGrpc.class) {
        if ((getGetSignUpMethod = signUpGrpc.getGetSignUpMethod) == null) {
          signUpGrpc.getGetSignUpMethod = getGetSignUpMethod = 
              io.grpc.MethodDescriptor.<grpc.ca.SignUp.HelloRequest3, grpc.ca.SignUp.HelloReply3>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "signUp", "GetSignUp"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.ca.SignUp.HelloRequest3.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.ca.SignUp.HelloReply3.getDefaultInstance()))
                  .setSchemaDescriptor(new signUpMethodDescriptorSupplier("GetSignUp"))
                  .build();
          }
        }
     }
     return getGetSignUpMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static signUpStub newStub(io.grpc.Channel channel) {
    return new signUpStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static signUpBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new signUpBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static signUpFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new signUpFutureStub(channel);
  }

  /**
   */
  public static abstract class signUpImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * client streaming
     * </pre>
     */
    public io.grpc.stub.StreamObserver<grpc.ca.SignUp.HelloRequest3> getSignUp(
        io.grpc.stub.StreamObserver<grpc.ca.SignUp.HelloReply3> responseObserver) {
      return asyncUnimplementedStreamingCall(getGetSignUpMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetSignUpMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                grpc.ca.SignUp.HelloRequest3,
                grpc.ca.SignUp.HelloReply3>(
                  this, METHODID_GET_SIGN_UP)))
          .build();
    }
  }

  /**
   */
  public static final class signUpStub extends io.grpc.stub.AbstractStub<signUpStub> {
    private signUpStub(io.grpc.Channel channel) {
      super(channel);
    }

    private signUpStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected signUpStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new signUpStub(channel, callOptions);
    }

    /**
     * <pre>
     * client streaming
     * </pre>
     */
    public io.grpc.stub.StreamObserver<grpc.ca.SignUp.HelloRequest3> getSignUp(
        io.grpc.stub.StreamObserver<grpc.ca.SignUp.HelloReply3> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getGetSignUpMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class signUpBlockingStub extends io.grpc.stub.AbstractStub<signUpBlockingStub> {
    private signUpBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private signUpBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected signUpBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new signUpBlockingStub(channel, callOptions);
    }
  }

  /**
   */
  public static final class signUpFutureStub extends io.grpc.stub.AbstractStub<signUpFutureStub> {
    private signUpFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private signUpFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected signUpFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new signUpFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_GET_SIGN_UP = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final signUpImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(signUpImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_SIGN_UP:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.getSignUp(
              (io.grpc.stub.StreamObserver<grpc.ca.SignUp.HelloReply3>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class signUpBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    signUpBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return grpc.ca.SignUp.SignUpImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("signUp");
    }
  }

  private static final class signUpFileDescriptorSupplier
      extends signUpBaseDescriptorSupplier {
    signUpFileDescriptorSupplier() {}
  }

  private static final class signUpMethodDescriptorSupplier
      extends signUpBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    signUpMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (signUpGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new signUpFileDescriptorSupplier())
              .addMethod(getGetSignUpMethod())
              .build();
        }
      }
    }
    return result;
  }
}
