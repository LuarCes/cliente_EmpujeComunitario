package com.empuje.grpc.ong;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.63.0)",
    comments = "Source: ong.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class DonationServiceGrpc {

  private DonationServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "ong.DonationService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.empuje.grpc.ong.CreateDonationRequest,
      com.empuje.grpc.ong.ApiResponse> getCreateDonationItemMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateDonationItem",
      requestType = com.empuje.grpc.ong.CreateDonationRequest.class,
      responseType = com.empuje.grpc.ong.ApiResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.empuje.grpc.ong.CreateDonationRequest,
      com.empuje.grpc.ong.ApiResponse> getCreateDonationItemMethod() {
    io.grpc.MethodDescriptor<com.empuje.grpc.ong.CreateDonationRequest, com.empuje.grpc.ong.ApiResponse> getCreateDonationItemMethod;
    if ((getCreateDonationItemMethod = DonationServiceGrpc.getCreateDonationItemMethod) == null) {
      synchronized (DonationServiceGrpc.class) {
        if ((getCreateDonationItemMethod = DonationServiceGrpc.getCreateDonationItemMethod) == null) {
          DonationServiceGrpc.getCreateDonationItemMethod = getCreateDonationItemMethod =
              io.grpc.MethodDescriptor.<com.empuje.grpc.ong.CreateDonationRequest, com.empuje.grpc.ong.ApiResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateDonationItem"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.empuje.grpc.ong.CreateDonationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.empuje.grpc.ong.ApiResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DonationServiceMethodDescriptorSupplier("CreateDonationItem"))
              .build();
        }
      }
    }
    return getCreateDonationItemMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.empuje.grpc.ong.UpdateDonationRequest,
      com.empuje.grpc.ong.ApiResponse> getUpdateDonationItemMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateDonationItem",
      requestType = com.empuje.grpc.ong.UpdateDonationRequest.class,
      responseType = com.empuje.grpc.ong.ApiResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.empuje.grpc.ong.UpdateDonationRequest,
      com.empuje.grpc.ong.ApiResponse> getUpdateDonationItemMethod() {
    io.grpc.MethodDescriptor<com.empuje.grpc.ong.UpdateDonationRequest, com.empuje.grpc.ong.ApiResponse> getUpdateDonationItemMethod;
    if ((getUpdateDonationItemMethod = DonationServiceGrpc.getUpdateDonationItemMethod) == null) {
      synchronized (DonationServiceGrpc.class) {
        if ((getUpdateDonationItemMethod = DonationServiceGrpc.getUpdateDonationItemMethod) == null) {
          DonationServiceGrpc.getUpdateDonationItemMethod = getUpdateDonationItemMethod =
              io.grpc.MethodDescriptor.<com.empuje.grpc.ong.UpdateDonationRequest, com.empuje.grpc.ong.ApiResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateDonationItem"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.empuje.grpc.ong.UpdateDonationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.empuje.grpc.ong.ApiResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DonationServiceMethodDescriptorSupplier("UpdateDonationItem"))
              .build();
        }
      }
    }
    return getUpdateDonationItemMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.empuje.grpc.ong.SoftDeleteDonationRequest,
      com.empuje.grpc.ong.ApiResponse> getSoftDeleteDonationItemMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SoftDeleteDonationItem",
      requestType = com.empuje.grpc.ong.SoftDeleteDonationRequest.class,
      responseType = com.empuje.grpc.ong.ApiResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.empuje.grpc.ong.SoftDeleteDonationRequest,
      com.empuje.grpc.ong.ApiResponse> getSoftDeleteDonationItemMethod() {
    io.grpc.MethodDescriptor<com.empuje.grpc.ong.SoftDeleteDonationRequest, com.empuje.grpc.ong.ApiResponse> getSoftDeleteDonationItemMethod;
    if ((getSoftDeleteDonationItemMethod = DonationServiceGrpc.getSoftDeleteDonationItemMethod) == null) {
      synchronized (DonationServiceGrpc.class) {
        if ((getSoftDeleteDonationItemMethod = DonationServiceGrpc.getSoftDeleteDonationItemMethod) == null) {
          DonationServiceGrpc.getSoftDeleteDonationItemMethod = getSoftDeleteDonationItemMethod =
              io.grpc.MethodDescriptor.<com.empuje.grpc.ong.SoftDeleteDonationRequest, com.empuje.grpc.ong.ApiResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SoftDeleteDonationItem"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.empuje.grpc.ong.SoftDeleteDonationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.empuje.grpc.ong.ApiResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DonationServiceMethodDescriptorSupplier("SoftDeleteDonationItem"))
              .build();
        }
      }
    }
    return getSoftDeleteDonationItemMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.empuje.grpc.ong.Empty,
      com.empuje.grpc.ong.ListDonationsResponse> getListDonationItemsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListDonationItems",
      requestType = com.empuje.grpc.ong.Empty.class,
      responseType = com.empuje.grpc.ong.ListDonationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.empuje.grpc.ong.Empty,
      com.empuje.grpc.ong.ListDonationsResponse> getListDonationItemsMethod() {
    io.grpc.MethodDescriptor<com.empuje.grpc.ong.Empty, com.empuje.grpc.ong.ListDonationsResponse> getListDonationItemsMethod;
    if ((getListDonationItemsMethod = DonationServiceGrpc.getListDonationItemsMethod) == null) {
      synchronized (DonationServiceGrpc.class) {
        if ((getListDonationItemsMethod = DonationServiceGrpc.getListDonationItemsMethod) == null) {
          DonationServiceGrpc.getListDonationItemsMethod = getListDonationItemsMethod =
              io.grpc.MethodDescriptor.<com.empuje.grpc.ong.Empty, com.empuje.grpc.ong.ListDonationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListDonationItems"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.empuje.grpc.ong.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.empuje.grpc.ong.ListDonationsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DonationServiceMethodDescriptorSupplier("ListDonationItems"))
              .build();
        }
      }
    }
    return getListDonationItemsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.empuje.grpc.ong.TransferDonationsRequest,
      com.empuje.grpc.ong.TransferDonationsResponse> getTransferDonationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TransferDonations",
      requestType = com.empuje.grpc.ong.TransferDonationsRequest.class,
      responseType = com.empuje.grpc.ong.TransferDonationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.empuje.grpc.ong.TransferDonationsRequest,
      com.empuje.grpc.ong.TransferDonationsResponse> getTransferDonationsMethod() {
    io.grpc.MethodDescriptor<com.empuje.grpc.ong.TransferDonationsRequest, com.empuje.grpc.ong.TransferDonationsResponse> getTransferDonationsMethod;
    if ((getTransferDonationsMethod = DonationServiceGrpc.getTransferDonationsMethod) == null) {
      synchronized (DonationServiceGrpc.class) {
        if ((getTransferDonationsMethod = DonationServiceGrpc.getTransferDonationsMethod) == null) {
          DonationServiceGrpc.getTransferDonationsMethod = getTransferDonationsMethod =
              io.grpc.MethodDescriptor.<com.empuje.grpc.ong.TransferDonationsRequest, com.empuje.grpc.ong.TransferDonationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TransferDonations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.empuje.grpc.ong.TransferDonationsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.empuje.grpc.ong.TransferDonationsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DonationServiceMethodDescriptorSupplier("TransferDonations"))
              .build();
        }
      }
    }
    return getTransferDonationsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DonationServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DonationServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DonationServiceStub>() {
        @java.lang.Override
        public DonationServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DonationServiceStub(channel, callOptions);
        }
      };
    return DonationServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DonationServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DonationServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DonationServiceBlockingStub>() {
        @java.lang.Override
        public DonationServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DonationServiceBlockingStub(channel, callOptions);
        }
      };
    return DonationServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DonationServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DonationServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DonationServiceFutureStub>() {
        @java.lang.Override
        public DonationServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DonationServiceFutureStub(channel, callOptions);
        }
      };
    return DonationServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void createDonationItem(com.empuje.grpc.ong.CreateDonationRequest request,
        io.grpc.stub.StreamObserver<com.empuje.grpc.ong.ApiResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateDonationItemMethod(), responseObserver);
    }

    /**
     */
    default void updateDonationItem(com.empuje.grpc.ong.UpdateDonationRequest request,
        io.grpc.stub.StreamObserver<com.empuje.grpc.ong.ApiResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateDonationItemMethod(), responseObserver);
    }

    /**
     */
    default void softDeleteDonationItem(com.empuje.grpc.ong.SoftDeleteDonationRequest request,
        io.grpc.stub.StreamObserver<com.empuje.grpc.ong.ApiResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSoftDeleteDonationItemMethod(), responseObserver);
    }

    /**
     */
    default void listDonationItems(com.empuje.grpc.ong.Empty request,
        io.grpc.stub.StreamObserver<com.empuje.grpc.ong.ListDonationsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListDonationItemsMethod(), responseObserver);
    }

    /**
     */
    default void transferDonations(com.empuje.grpc.ong.TransferDonationsRequest request,
        io.grpc.stub.StreamObserver<com.empuje.grpc.ong.TransferDonationsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTransferDonationsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service DonationService.
   */
  public static abstract class DonationServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return DonationServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service DonationService.
   */
  public static final class DonationServiceStub
      extends io.grpc.stub.AbstractAsyncStub<DonationServiceStub> {
    private DonationServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DonationServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DonationServiceStub(channel, callOptions);
    }

    /**
     */
    public void createDonationItem(com.empuje.grpc.ong.CreateDonationRequest request,
        io.grpc.stub.StreamObserver<com.empuje.grpc.ong.ApiResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateDonationItemMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateDonationItem(com.empuje.grpc.ong.UpdateDonationRequest request,
        io.grpc.stub.StreamObserver<com.empuje.grpc.ong.ApiResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateDonationItemMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void softDeleteDonationItem(com.empuje.grpc.ong.SoftDeleteDonationRequest request,
        io.grpc.stub.StreamObserver<com.empuje.grpc.ong.ApiResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSoftDeleteDonationItemMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listDonationItems(com.empuje.grpc.ong.Empty request,
        io.grpc.stub.StreamObserver<com.empuje.grpc.ong.ListDonationsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListDonationItemsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void transferDonations(com.empuje.grpc.ong.TransferDonationsRequest request,
        io.grpc.stub.StreamObserver<com.empuje.grpc.ong.TransferDonationsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTransferDonationsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service DonationService.
   */
  public static final class DonationServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<DonationServiceBlockingStub> {
    private DonationServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DonationServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DonationServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.empuje.grpc.ong.ApiResponse createDonationItem(com.empuje.grpc.ong.CreateDonationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateDonationItemMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.empuje.grpc.ong.ApiResponse updateDonationItem(com.empuje.grpc.ong.UpdateDonationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateDonationItemMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.empuje.grpc.ong.ApiResponse softDeleteDonationItem(com.empuje.grpc.ong.SoftDeleteDonationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSoftDeleteDonationItemMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.empuje.grpc.ong.ListDonationsResponse listDonationItems(com.empuje.grpc.ong.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListDonationItemsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.empuje.grpc.ong.TransferDonationsResponse transferDonations(com.empuje.grpc.ong.TransferDonationsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTransferDonationsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service DonationService.
   */
  public static final class DonationServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<DonationServiceFutureStub> {
    private DonationServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DonationServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DonationServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.empuje.grpc.ong.ApiResponse> createDonationItem(
        com.empuje.grpc.ong.CreateDonationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateDonationItemMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.empuje.grpc.ong.ApiResponse> updateDonationItem(
        com.empuje.grpc.ong.UpdateDonationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateDonationItemMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.empuje.grpc.ong.ApiResponse> softDeleteDonationItem(
        com.empuje.grpc.ong.SoftDeleteDonationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSoftDeleteDonationItemMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.empuje.grpc.ong.ListDonationsResponse> listDonationItems(
        com.empuje.grpc.ong.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListDonationItemsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.empuje.grpc.ong.TransferDonationsResponse> transferDonations(
        com.empuje.grpc.ong.TransferDonationsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTransferDonationsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_DONATION_ITEM = 0;
  private static final int METHODID_UPDATE_DONATION_ITEM = 1;
  private static final int METHODID_SOFT_DELETE_DONATION_ITEM = 2;
  private static final int METHODID_LIST_DONATION_ITEMS = 3;
  private static final int METHODID_TRANSFER_DONATIONS = 4;

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
        case METHODID_CREATE_DONATION_ITEM:
          serviceImpl.createDonationItem((com.empuje.grpc.ong.CreateDonationRequest) request,
              (io.grpc.stub.StreamObserver<com.empuje.grpc.ong.ApiResponse>) responseObserver);
          break;
        case METHODID_UPDATE_DONATION_ITEM:
          serviceImpl.updateDonationItem((com.empuje.grpc.ong.UpdateDonationRequest) request,
              (io.grpc.stub.StreamObserver<com.empuje.grpc.ong.ApiResponse>) responseObserver);
          break;
        case METHODID_SOFT_DELETE_DONATION_ITEM:
          serviceImpl.softDeleteDonationItem((com.empuje.grpc.ong.SoftDeleteDonationRequest) request,
              (io.grpc.stub.StreamObserver<com.empuje.grpc.ong.ApiResponse>) responseObserver);
          break;
        case METHODID_LIST_DONATION_ITEMS:
          serviceImpl.listDonationItems((com.empuje.grpc.ong.Empty) request,
              (io.grpc.stub.StreamObserver<com.empuje.grpc.ong.ListDonationsResponse>) responseObserver);
          break;
        case METHODID_TRANSFER_DONATIONS:
          serviceImpl.transferDonations((com.empuje.grpc.ong.TransferDonationsRequest) request,
              (io.grpc.stub.StreamObserver<com.empuje.grpc.ong.TransferDonationsResponse>) responseObserver);
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
          getCreateDonationItemMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.empuje.grpc.ong.CreateDonationRequest,
              com.empuje.grpc.ong.ApiResponse>(
                service, METHODID_CREATE_DONATION_ITEM)))
        .addMethod(
          getUpdateDonationItemMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.empuje.grpc.ong.UpdateDonationRequest,
              com.empuje.grpc.ong.ApiResponse>(
                service, METHODID_UPDATE_DONATION_ITEM)))
        .addMethod(
          getSoftDeleteDonationItemMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.empuje.grpc.ong.SoftDeleteDonationRequest,
              com.empuje.grpc.ong.ApiResponse>(
                service, METHODID_SOFT_DELETE_DONATION_ITEM)))
        .addMethod(
          getListDonationItemsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.empuje.grpc.ong.Empty,
              com.empuje.grpc.ong.ListDonationsResponse>(
                service, METHODID_LIST_DONATION_ITEMS)))
        .addMethod(
          getTransferDonationsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.empuje.grpc.ong.TransferDonationsRequest,
              com.empuje.grpc.ong.TransferDonationsResponse>(
                service, METHODID_TRANSFER_DONATIONS)))
        .build();
  }

  private static abstract class DonationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    DonationServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.empuje.grpc.ong.OngProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("DonationService");
    }
  }

  private static final class DonationServiceFileDescriptorSupplier
      extends DonationServiceBaseDescriptorSupplier {
    DonationServiceFileDescriptorSupplier() {}
  }

  private static final class DonationServiceMethodDescriptorSupplier
      extends DonationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    DonationServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (DonationServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DonationServiceFileDescriptorSupplier())
              .addMethod(getCreateDonationItemMethod())
              .addMethod(getUpdateDonationItemMethod())
              .addMethod(getSoftDeleteDonationItemMethod())
              .addMethod(getListDonationItemsMethod())
              .addMethod(getTransferDonationsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
