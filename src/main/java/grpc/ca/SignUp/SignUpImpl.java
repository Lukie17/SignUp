// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SignUp.proto

package grpc.ca.SignUp;

public final class SignUpImpl {
  private SignUpImpl() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_HelloRequest3_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_HelloRequest3_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_HelloReply3_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_HelloReply3_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\014SignUp.proto\"\036\n\rHelloRequest3\022\r\n\005name3" +
      "\030\001 \001(\t\"\037\n\013HelloReply3\022\020\n\010message3\030\001 \001(\t2" +
      "7\n\006signUp\022-\n\tGetSignUp\022\016.HelloRequest3\032\014" +
      ".HelloReply3\"\000(\001B\036\n\016grpc.ca.SignUpB\nSign" +
      "UpImplP\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_HelloRequest3_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_HelloRequest3_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_HelloRequest3_descriptor,
        new java.lang.String[] { "Name3", });
    internal_static_HelloReply3_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_HelloReply3_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_HelloReply3_descriptor,
        new java.lang.String[] { "Message3", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}