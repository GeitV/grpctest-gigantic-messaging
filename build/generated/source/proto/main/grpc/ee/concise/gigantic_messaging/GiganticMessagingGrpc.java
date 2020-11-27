package ee.concise.gigantic_messaging;

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
    value = "by gRPC proto compiler (version 1.33.1)",
    comments = "Source: gigantic_messaging.proto")
public final class GiganticMessagingGrpc {

  private GiganticMessagingGrpc() {}

  public static final String SERVICE_NAME = "gigantic_messaging.GiganticMessaging";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ee.concise.gigantic_messaging.EmailRequest,
      ee.concise.gigantic_messaging.BaseResponse> getSendEmailMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SendEmail",
      requestType = ee.concise.gigantic_messaging.EmailRequest.class,
      responseType = ee.concise.gigantic_messaging.BaseResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ee.concise.gigantic_messaging.EmailRequest,
      ee.concise.gigantic_messaging.BaseResponse> getSendEmailMethod() {
    io.grpc.MethodDescriptor<ee.concise.gigantic_messaging.EmailRequest, ee.concise.gigantic_messaging.BaseResponse> getSendEmailMethod;
    if ((getSendEmailMethod = GiganticMessagingGrpc.getSendEmailMethod) == null) {
      synchronized (GiganticMessagingGrpc.class) {
        if ((getSendEmailMethod = GiganticMessagingGrpc.getSendEmailMethod) == null) {
          GiganticMessagingGrpc.getSendEmailMethod = getSendEmailMethod =
              io.grpc.MethodDescriptor.<ee.concise.gigantic_messaging.EmailRequest, ee.concise.gigantic_messaging.BaseResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SendEmail"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ee.concise.gigantic_messaging.EmailRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ee.concise.gigantic_messaging.BaseResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GiganticMessagingMethodDescriptorSupplier("SendEmail"))
              .build();
        }
      }
    }
    return getSendEmailMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ee.concise.gigantic_messaging.EmailRequest,
      ee.concise.gigantic_messaging.BaseResponse> getSendEmailStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SendEmailStream",
      requestType = ee.concise.gigantic_messaging.EmailRequest.class,
      responseType = ee.concise.gigantic_messaging.BaseResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<ee.concise.gigantic_messaging.EmailRequest,
      ee.concise.gigantic_messaging.BaseResponse> getSendEmailStreamMethod() {
    io.grpc.MethodDescriptor<ee.concise.gigantic_messaging.EmailRequest, ee.concise.gigantic_messaging.BaseResponse> getSendEmailStreamMethod;
    if ((getSendEmailStreamMethod = GiganticMessagingGrpc.getSendEmailStreamMethod) == null) {
      synchronized (GiganticMessagingGrpc.class) {
        if ((getSendEmailStreamMethod = GiganticMessagingGrpc.getSendEmailStreamMethod) == null) {
          GiganticMessagingGrpc.getSendEmailStreamMethod = getSendEmailStreamMethod =
              io.grpc.MethodDescriptor.<ee.concise.gigantic_messaging.EmailRequest, ee.concise.gigantic_messaging.BaseResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SendEmailStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ee.concise.gigantic_messaging.EmailRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ee.concise.gigantic_messaging.BaseResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GiganticMessagingMethodDescriptorSupplier("SendEmailStream"))
              .build();
        }
      }
    }
    return getSendEmailStreamMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static GiganticMessagingStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GiganticMessagingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GiganticMessagingStub>() {
        @java.lang.Override
        public GiganticMessagingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GiganticMessagingStub(channel, callOptions);
        }
      };
    return GiganticMessagingStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static GiganticMessagingBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GiganticMessagingBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GiganticMessagingBlockingStub>() {
        @java.lang.Override
        public GiganticMessagingBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GiganticMessagingBlockingStub(channel, callOptions);
        }
      };
    return GiganticMessagingBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static GiganticMessagingFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GiganticMessagingFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GiganticMessagingFutureStub>() {
        @java.lang.Override
        public GiganticMessagingFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GiganticMessagingFutureStub(channel, callOptions);
        }
      };
    return GiganticMessagingFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class GiganticMessagingImplBase implements io.grpc.BindableService {

    /**
     */
    public void sendEmail(ee.concise.gigantic_messaging.EmailRequest request,
        io.grpc.stub.StreamObserver<ee.concise.gigantic_messaging.BaseResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSendEmailMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<ee.concise.gigantic_messaging.EmailRequest> sendEmailStream(
        io.grpc.stub.StreamObserver<ee.concise.gigantic_messaging.BaseResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getSendEmailStreamMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSendEmailMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ee.concise.gigantic_messaging.EmailRequest,
                ee.concise.gigantic_messaging.BaseResponse>(
                  this, METHODID_SEND_EMAIL)))
          .addMethod(
            getSendEmailStreamMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                ee.concise.gigantic_messaging.EmailRequest,
                ee.concise.gigantic_messaging.BaseResponse>(
                  this, METHODID_SEND_EMAIL_STREAM)))
          .build();
    }
  }

  /**
   */
  public static final class GiganticMessagingStub extends io.grpc.stub.AbstractAsyncStub<GiganticMessagingStub> {
    private GiganticMessagingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GiganticMessagingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GiganticMessagingStub(channel, callOptions);
    }

    /**
     */
    public void sendEmail(ee.concise.gigantic_messaging.EmailRequest request,
        io.grpc.stub.StreamObserver<ee.concise.gigantic_messaging.BaseResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSendEmailMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<ee.concise.gigantic_messaging.EmailRequest> sendEmailStream(
        io.grpc.stub.StreamObserver<ee.concise.gigantic_messaging.BaseResponse> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getSendEmailStreamMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class GiganticMessagingBlockingStub extends io.grpc.stub.AbstractBlockingStub<GiganticMessagingBlockingStub> {
    private GiganticMessagingBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GiganticMessagingBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GiganticMessagingBlockingStub(channel, callOptions);
    }

    /**
     */
    public ee.concise.gigantic_messaging.BaseResponse sendEmail(ee.concise.gigantic_messaging.EmailRequest request) {
      return blockingUnaryCall(
          getChannel(), getSendEmailMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class GiganticMessagingFutureStub extends io.grpc.stub.AbstractFutureStub<GiganticMessagingFutureStub> {
    private GiganticMessagingFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GiganticMessagingFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GiganticMessagingFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ee.concise.gigantic_messaging.BaseResponse> sendEmail(
        ee.concise.gigantic_messaging.EmailRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSendEmailMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SEND_EMAIL = 0;
  private static final int METHODID_SEND_EMAIL_STREAM = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final GiganticMessagingImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(GiganticMessagingImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SEND_EMAIL:
          serviceImpl.sendEmail((ee.concise.gigantic_messaging.EmailRequest) request,
              (io.grpc.stub.StreamObserver<ee.concise.gigantic_messaging.BaseResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SEND_EMAIL_STREAM:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.sendEmailStream(
              (io.grpc.stub.StreamObserver<ee.concise.gigantic_messaging.BaseResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class GiganticMessagingBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    GiganticMessagingBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ee.concise.gigantic_messaging.GiganticMessagingProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("GiganticMessaging");
    }
  }

  private static final class GiganticMessagingFileDescriptorSupplier
      extends GiganticMessagingBaseDescriptorSupplier {
    GiganticMessagingFileDescriptorSupplier() {}
  }

  private static final class GiganticMessagingMethodDescriptorSupplier
      extends GiganticMessagingBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    GiganticMessagingMethodDescriptorSupplier(String methodName) {
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
      synchronized (GiganticMessagingGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new GiganticMessagingFileDescriptorSupplier())
              .addMethod(getSendEmailMethod())
              .addMethod(getSendEmailStreamMethod())
              .build();
        }
      }
    }
    return result;
  }
}
