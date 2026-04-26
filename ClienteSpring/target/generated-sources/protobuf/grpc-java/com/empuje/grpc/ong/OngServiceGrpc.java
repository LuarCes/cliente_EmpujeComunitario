package com.empuje.grpc.ong;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * ... (tus RPCs existentes)
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.63.0)",
    comments = "Source: ong.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class OngServiceGrpc {

  private OngServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "ong.OngService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.empuje.grpc.ong.ListExternasRequest,
      com.empuje.grpc.ong.ListSolicitudesExternasResponse> getListSolicitudesExternasMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListSolicitudesExternas",
      requestType = com.empuje.grpc.ong.ListExternasRequest.class,
      responseType = com.empuje.grpc.ong.ListSolicitudesExternasResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.empuje.grpc.ong.ListExternasRequest,
      com.empuje.grpc.ong.ListSolicitudesExternasResponse> getListSolicitudesExternasMethod() {
    io.grpc.MethodDescriptor<com.empuje.grpc.ong.ListExternasRequest, com.empuje.grpc.ong.ListSolicitudesExternasResponse> getListSolicitudesExternasMethod;
    if ((getListSolicitudesExternasMethod = OngServiceGrpc.getListSolicitudesExternasMethod) == null) {
      synchronized (OngServiceGrpc.class) {
        if ((getListSolicitudesExternasMethod = OngServiceGrpc.getListSolicitudesExternasMethod) == null) {
          OngServiceGrpc.getListSolicitudesExternasMethod = getListSolicitudesExternasMethod =
              io.grpc.MethodDescriptor.<com.empuje.grpc.ong.ListExternasRequest, com.empuje.grpc.ong.ListSolicitudesExternasResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListSolicitudesExternas"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.empuje.grpc.ong.ListExternasRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.empuje.grpc.ong.ListSolicitudesExternasResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OngServiceMethodDescriptorSupplier("ListSolicitudesExternas"))
              .build();
        }
      }
    }
    return getListSolicitudesExternasMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.empuje.grpc.ong.ListExternasRequest,
      com.empuje.grpc.ong.ListEventosExternosResponse> getListEventosExternosMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListEventosExternos",
      requestType = com.empuje.grpc.ong.ListExternasRequest.class,
      responseType = com.empuje.grpc.ong.ListEventosExternosResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.empuje.grpc.ong.ListExternasRequest,
      com.empuje.grpc.ong.ListEventosExternosResponse> getListEventosExternosMethod() {
    io.grpc.MethodDescriptor<com.empuje.grpc.ong.ListExternasRequest, com.empuje.grpc.ong.ListEventosExternosResponse> getListEventosExternosMethod;
    if ((getListEventosExternosMethod = OngServiceGrpc.getListEventosExternosMethod) == null) {
      synchronized (OngServiceGrpc.class) {
        if ((getListEventosExternosMethod = OngServiceGrpc.getListEventosExternosMethod) == null) {
          OngServiceGrpc.getListEventosExternosMethod = getListEventosExternosMethod =
              io.grpc.MethodDescriptor.<com.empuje.grpc.ong.ListExternasRequest, com.empuje.grpc.ong.ListEventosExternosResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListEventosExternos"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.empuje.grpc.ong.ListExternasRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.empuje.grpc.ong.ListEventosExternosResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OngServiceMethodDescriptorSupplier("ListEventosExternos"))
              .build();
        }
      }
    }
    return getListEventosExternosMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static OngServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<OngServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<OngServiceStub>() {
        @java.lang.Override
        public OngServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new OngServiceStub(channel, callOptions);
        }
      };
    return OngServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static OngServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<OngServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<OngServiceBlockingStub>() {
        @java.lang.Override
        public OngServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new OngServiceBlockingStub(channel, callOptions);
        }
      };
    return OngServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static OngServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<OngServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<OngServiceFutureStub>() {
        @java.lang.Override
        public OngServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new OngServiceFutureStub(channel, callOptions);
        }
      };
    return OngServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * ... (tus RPCs existentes)
   * </pre>
   */
  public interface AsyncService {

    /**
     */
    default void listSolicitudesExternas(com.empuje.grpc.ong.ListExternasRequest request,
        io.grpc.stub.StreamObserver<com.empuje.grpc.ong.ListSolicitudesExternasResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListSolicitudesExternasMethod(), responseObserver);
    }

    /**
     */
    default void listEventosExternos(com.empuje.grpc.ong.ListExternasRequest request,
        io.grpc.stub.StreamObserver<com.empuje.grpc.ong.ListEventosExternosResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListEventosExternosMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service OngService.
   * <pre>
   * ... (tus RPCs existentes)
   * </pre>
   */
  public static abstract class OngServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return OngServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service OngService.
   * <pre>
   * ... (tus RPCs existentes)
   * </pre>
   */
  public static final class OngServiceStub
      extends io.grpc.stub.AbstractAsyncStub<OngServiceStub> {
    private OngServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OngServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new OngServiceStub(channel, callOptions);
    }

    /**
     */
    public void listSolicitudesExternas(com.empuje.grpc.ong.ListExternasRequest request,
        io.grpc.stub.StreamObserver<com.empuje.grpc.ong.ListSolicitudesExternasResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListSolicitudesExternasMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listEventosExternos(com.empuje.grpc.ong.ListExternasRequest request,
        io.grpc.stub.StreamObserver<com.empuje.grpc.ong.ListEventosExternosResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListEventosExternosMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service OngService.
   * <pre>
   * ... (tus RPCs existentes)
   * </pre>
   */
  public static final class OngServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<OngServiceBlockingStub> {
    private OngServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OngServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new OngServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.empuje.grpc.ong.ListSolicitudesExternasResponse listSolicitudesExternas(com.empuje.grpc.ong.ListExternasRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListSolicitudesExternasMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.empuje.grpc.ong.ListEventosExternosResponse listEventosExternos(com.empuje.grpc.ong.ListExternasRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListEventosExternosMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service OngService.
   * <pre>
   * ... (tus RPCs existentes)
   * </pre>
   */
  public static final class OngServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<OngServiceFutureStub> {
    private OngServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OngServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new OngServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.empuje.grpc.ong.ListSolicitudesExternasResponse> listSolicitudesExternas(
        com.empuje.grpc.ong.ListExternasRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListSolicitudesExternasMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.empuje.grpc.ong.ListEventosExternosResponse> listEventosExternos(
        com.empuje.grpc.ong.ListExternasRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListEventosExternosMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST_SOLICITUDES_EXTERNAS = 0;
  private static final int METHODID_LIST_EVENTOS_EXTERNOS = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST_SOLICITUDES_EXTERNAS:
          serviceImpl.listSolicitudesExternas((com.empuje.grpc.ong.ListExternasRequest) request,
              (io.grpc.stub.StreamObserver<com.empuje.grpc.ong.ListSolicitudesExternasResponse>) responseObserver);
          break;
        case METHODID_LIST_EVENTOS_EXTERNOS:
          serviceImpl.listEventosExternos((com.empuje.grpc.ong.ListExternasRequest) request,
              (io.grpc.stub.StreamObserver<com.empuje.grpc.ong.ListEventosExternosResponse>) responseObserver);
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
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getListSolicitudesExternasMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.empuje.grpc.ong.ListExternasRequest,
              com.empuje.grpc.ong.ListSolicitudesExternasResponse>(
                service, METHODID_LIST_SOLICITUDES_EXTERNAS)))
        .addMethod(
          getListEventosExternosMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.empuje.grpc.ong.ListExternasRequest,
              com.empuje.grpc.ong.ListEventosExternosResponse>(
                service, METHODID_LIST_EVENTOS_EXTERNOS)))
        .build();
  }

  private static abstract class OngServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    OngServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.empuje.grpc.ong.OngProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("OngService");
    }
  }

  private static final class OngServiceFileDescriptorSupplier
      extends OngServiceBaseDescriptorSupplier {
    OngServiceFileDescriptorSupplier() {}
  }

  private static final class OngServiceMethodDescriptorSupplier
      extends OngServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    OngServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (OngServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new OngServiceFileDescriptorSupplier())
              .addMethod(getListSolicitudesExternasMethod())
              .addMethod(getListEventosExternosMethod())
              .build();
        }
      }
    }
    return result;
  }
}
