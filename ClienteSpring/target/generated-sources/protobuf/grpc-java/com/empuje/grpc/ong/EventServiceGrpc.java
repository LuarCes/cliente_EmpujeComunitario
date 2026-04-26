package com.empuje.grpc.ong;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.63.0)",
    comments = "Source: ong.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class EventServiceGrpc {

  private EventServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "ong.EventService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.empuje.grpc.ong.CreateEventRequest,
      com.empuje.grpc.ong.ApiResponse> getCreateEventMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateEvent",
      requestType = com.empuje.grpc.ong.CreateEventRequest.class,
      responseType = com.empuje.grpc.ong.ApiResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.empuje.grpc.ong.CreateEventRequest,
      com.empuje.grpc.ong.ApiResponse> getCreateEventMethod() {
    io.grpc.MethodDescriptor<com.empuje.grpc.ong.CreateEventRequest, com.empuje.grpc.ong.ApiResponse> getCreateEventMethod;
    if ((getCreateEventMethod = EventServiceGrpc.getCreateEventMethod) == null) {
      synchronized (EventServiceGrpc.class) {
        if ((getCreateEventMethod = EventServiceGrpc.getCreateEventMethod) == null) {
          EventServiceGrpc.getCreateEventMethod = getCreateEventMethod =
              io.grpc.MethodDescriptor.<com.empuje.grpc.ong.CreateEventRequest, com.empuje.grpc.ong.ApiResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateEvent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.empuje.grpc.ong.CreateEventRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.empuje.grpc.ong.ApiResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EventServiceMethodDescriptorSupplier("CreateEvent"))
              .build();
        }
      }
    }
    return getCreateEventMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.empuje.grpc.ong.UpdateEventRequest,
      com.empuje.grpc.ong.ApiResponse> getUpdateEventMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateEvent",
      requestType = com.empuje.grpc.ong.UpdateEventRequest.class,
      responseType = com.empuje.grpc.ong.ApiResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.empuje.grpc.ong.UpdateEventRequest,
      com.empuje.grpc.ong.ApiResponse> getUpdateEventMethod() {
    io.grpc.MethodDescriptor<com.empuje.grpc.ong.UpdateEventRequest, com.empuje.grpc.ong.ApiResponse> getUpdateEventMethod;
    if ((getUpdateEventMethod = EventServiceGrpc.getUpdateEventMethod) == null) {
      synchronized (EventServiceGrpc.class) {
        if ((getUpdateEventMethod = EventServiceGrpc.getUpdateEventMethod) == null) {
          EventServiceGrpc.getUpdateEventMethod = getUpdateEventMethod =
              io.grpc.MethodDescriptor.<com.empuje.grpc.ong.UpdateEventRequest, com.empuje.grpc.ong.ApiResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateEvent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.empuje.grpc.ong.UpdateEventRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.empuje.grpc.ong.ApiResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EventServiceMethodDescriptorSupplier("UpdateEvent"))
              .build();
        }
      }
    }
    return getUpdateEventMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.empuje.grpc.ong.DeleteEventRequest,
      com.empuje.grpc.ong.ApiResponse> getDeleteEventMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteEvent",
      requestType = com.empuje.grpc.ong.DeleteEventRequest.class,
      responseType = com.empuje.grpc.ong.ApiResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.empuje.grpc.ong.DeleteEventRequest,
      com.empuje.grpc.ong.ApiResponse> getDeleteEventMethod() {
    io.grpc.MethodDescriptor<com.empuje.grpc.ong.DeleteEventRequest, com.empuje.grpc.ong.ApiResponse> getDeleteEventMethod;
    if ((getDeleteEventMethod = EventServiceGrpc.getDeleteEventMethod) == null) {
      synchronized (EventServiceGrpc.class) {
        if ((getDeleteEventMethod = EventServiceGrpc.getDeleteEventMethod) == null) {
          EventServiceGrpc.getDeleteEventMethod = getDeleteEventMethod =
              io.grpc.MethodDescriptor.<com.empuje.grpc.ong.DeleteEventRequest, com.empuje.grpc.ong.ApiResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteEvent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.empuje.grpc.ong.DeleteEventRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.empuje.grpc.ong.ApiResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EventServiceMethodDescriptorSupplier("DeleteEvent"))
              .build();
        }
      }
    }
    return getDeleteEventMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.empuje.grpc.ong.AssignMemberRequest,
      com.empuje.grpc.ong.ApiResponse> getAssignMemberMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AssignMember",
      requestType = com.empuje.grpc.ong.AssignMemberRequest.class,
      responseType = com.empuje.grpc.ong.ApiResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.empuje.grpc.ong.AssignMemberRequest,
      com.empuje.grpc.ong.ApiResponse> getAssignMemberMethod() {
    io.grpc.MethodDescriptor<com.empuje.grpc.ong.AssignMemberRequest, com.empuje.grpc.ong.ApiResponse> getAssignMemberMethod;
    if ((getAssignMemberMethod = EventServiceGrpc.getAssignMemberMethod) == null) {
      synchronized (EventServiceGrpc.class) {
        if ((getAssignMemberMethod = EventServiceGrpc.getAssignMemberMethod) == null) {
          EventServiceGrpc.getAssignMemberMethod = getAssignMemberMethod =
              io.grpc.MethodDescriptor.<com.empuje.grpc.ong.AssignMemberRequest, com.empuje.grpc.ong.ApiResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AssignMember"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.empuje.grpc.ong.AssignMemberRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.empuje.grpc.ong.ApiResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EventServiceMethodDescriptorSupplier("AssignMember"))
              .build();
        }
      }
    }
    return getAssignMemberMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.empuje.grpc.ong.RemoveMemberRequest,
      com.empuje.grpc.ong.ApiResponse> getRemoveMemberMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemoveMember",
      requestType = com.empuje.grpc.ong.RemoveMemberRequest.class,
      responseType = com.empuje.grpc.ong.ApiResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.empuje.grpc.ong.RemoveMemberRequest,
      com.empuje.grpc.ong.ApiResponse> getRemoveMemberMethod() {
    io.grpc.MethodDescriptor<com.empuje.grpc.ong.RemoveMemberRequest, com.empuje.grpc.ong.ApiResponse> getRemoveMemberMethod;
    if ((getRemoveMemberMethod = EventServiceGrpc.getRemoveMemberMethod) == null) {
      synchronized (EventServiceGrpc.class) {
        if ((getRemoveMemberMethod = EventServiceGrpc.getRemoveMemberMethod) == null) {
          EventServiceGrpc.getRemoveMemberMethod = getRemoveMemberMethod =
              io.grpc.MethodDescriptor.<com.empuje.grpc.ong.RemoveMemberRequest, com.empuje.grpc.ong.ApiResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RemoveMember"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.empuje.grpc.ong.RemoveMemberRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.empuje.grpc.ong.ApiResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EventServiceMethodDescriptorSupplier("RemoveMember"))
              .build();
        }
      }
    }
    return getRemoveMemberMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.empuje.grpc.ong.RegisterDistributionRequest,
      com.empuje.grpc.ong.ApiResponse> getRegisterDistributionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RegisterDistribution",
      requestType = com.empuje.grpc.ong.RegisterDistributionRequest.class,
      responseType = com.empuje.grpc.ong.ApiResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.empuje.grpc.ong.RegisterDistributionRequest,
      com.empuje.grpc.ong.ApiResponse> getRegisterDistributionMethod() {
    io.grpc.MethodDescriptor<com.empuje.grpc.ong.RegisterDistributionRequest, com.empuje.grpc.ong.ApiResponse> getRegisterDistributionMethod;
    if ((getRegisterDistributionMethod = EventServiceGrpc.getRegisterDistributionMethod) == null) {
      synchronized (EventServiceGrpc.class) {
        if ((getRegisterDistributionMethod = EventServiceGrpc.getRegisterDistributionMethod) == null) {
          EventServiceGrpc.getRegisterDistributionMethod = getRegisterDistributionMethod =
              io.grpc.MethodDescriptor.<com.empuje.grpc.ong.RegisterDistributionRequest, com.empuje.grpc.ong.ApiResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RegisterDistribution"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.empuje.grpc.ong.RegisterDistributionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.empuje.grpc.ong.ApiResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EventServiceMethodDescriptorSupplier("RegisterDistribution"))
              .build();
        }
      }
    }
    return getRegisterDistributionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.empuje.grpc.ong.Empty,
      com.empuje.grpc.ong.ListEventsResponse> getListEventsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListEvents",
      requestType = com.empuje.grpc.ong.Empty.class,
      responseType = com.empuje.grpc.ong.ListEventsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.empuje.grpc.ong.Empty,
      com.empuje.grpc.ong.ListEventsResponse> getListEventsMethod() {
    io.grpc.MethodDescriptor<com.empuje.grpc.ong.Empty, com.empuje.grpc.ong.ListEventsResponse> getListEventsMethod;
    if ((getListEventsMethod = EventServiceGrpc.getListEventsMethod) == null) {
      synchronized (EventServiceGrpc.class) {
        if ((getListEventsMethod = EventServiceGrpc.getListEventsMethod) == null) {
          EventServiceGrpc.getListEventsMethod = getListEventsMethod =
              io.grpc.MethodDescriptor.<com.empuje.grpc.ong.Empty, com.empuje.grpc.ong.ListEventsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListEvents"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.empuje.grpc.ong.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.empuje.grpc.ong.ListEventsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EventServiceMethodDescriptorSupplier("ListEvents"))
              .build();
        }
      }
    }
    return getListEventsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.empuje.grpc.ong.AssignDonationToEventRequest,
      com.empuje.grpc.ong.ApiResponse> getAssignDonationToEventMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AssignDonationToEvent",
      requestType = com.empuje.grpc.ong.AssignDonationToEventRequest.class,
      responseType = com.empuje.grpc.ong.ApiResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.empuje.grpc.ong.AssignDonationToEventRequest,
      com.empuje.grpc.ong.ApiResponse> getAssignDonationToEventMethod() {
    io.grpc.MethodDescriptor<com.empuje.grpc.ong.AssignDonationToEventRequest, com.empuje.grpc.ong.ApiResponse> getAssignDonationToEventMethod;
    if ((getAssignDonationToEventMethod = EventServiceGrpc.getAssignDonationToEventMethod) == null) {
      synchronized (EventServiceGrpc.class) {
        if ((getAssignDonationToEventMethod = EventServiceGrpc.getAssignDonationToEventMethod) == null) {
          EventServiceGrpc.getAssignDonationToEventMethod = getAssignDonationToEventMethod =
              io.grpc.MethodDescriptor.<com.empuje.grpc.ong.AssignDonationToEventRequest, com.empuje.grpc.ong.ApiResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AssignDonationToEvent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.empuje.grpc.ong.AssignDonationToEventRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.empuje.grpc.ong.ApiResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EventServiceMethodDescriptorSupplier("AssignDonationToEvent"))
              .build();
        }
      }
    }
    return getAssignDonationToEventMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.empuje.grpc.ong.RemoveDonationFromEventRequest,
      com.empuje.grpc.ong.ApiResponse> getRemoveDonationFromEventMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemoveDonationFromEvent",
      requestType = com.empuje.grpc.ong.RemoveDonationFromEventRequest.class,
      responseType = com.empuje.grpc.ong.ApiResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.empuje.grpc.ong.RemoveDonationFromEventRequest,
      com.empuje.grpc.ong.ApiResponse> getRemoveDonationFromEventMethod() {
    io.grpc.MethodDescriptor<com.empuje.grpc.ong.RemoveDonationFromEventRequest, com.empuje.grpc.ong.ApiResponse> getRemoveDonationFromEventMethod;
    if ((getRemoveDonationFromEventMethod = EventServiceGrpc.getRemoveDonationFromEventMethod) == null) {
      synchronized (EventServiceGrpc.class) {
        if ((getRemoveDonationFromEventMethod = EventServiceGrpc.getRemoveDonationFromEventMethod) == null) {
          EventServiceGrpc.getRemoveDonationFromEventMethod = getRemoveDonationFromEventMethod =
              io.grpc.MethodDescriptor.<com.empuje.grpc.ong.RemoveDonationFromEventRequest, com.empuje.grpc.ong.ApiResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RemoveDonationFromEvent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.empuje.grpc.ong.RemoveDonationFromEventRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.empuje.grpc.ong.ApiResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EventServiceMethodDescriptorSupplier("RemoveDonationFromEvent"))
              .build();
        }
      }
    }
    return getRemoveDonationFromEventMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.empuje.grpc.ong.ListDonationsByEventRequest,
      com.empuje.grpc.ong.ListDonationsByEventResponse> getListDonationsByEventMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListDonationsByEvent",
      requestType = com.empuje.grpc.ong.ListDonationsByEventRequest.class,
      responseType = com.empuje.grpc.ong.ListDonationsByEventResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.empuje.grpc.ong.ListDonationsByEventRequest,
      com.empuje.grpc.ong.ListDonationsByEventResponse> getListDonationsByEventMethod() {
    io.grpc.MethodDescriptor<com.empuje.grpc.ong.ListDonationsByEventRequest, com.empuje.grpc.ong.ListDonationsByEventResponse> getListDonationsByEventMethod;
    if ((getListDonationsByEventMethod = EventServiceGrpc.getListDonationsByEventMethod) == null) {
      synchronized (EventServiceGrpc.class) {
        if ((getListDonationsByEventMethod = EventServiceGrpc.getListDonationsByEventMethod) == null) {
          EventServiceGrpc.getListDonationsByEventMethod = getListDonationsByEventMethod =
              io.grpc.MethodDescriptor.<com.empuje.grpc.ong.ListDonationsByEventRequest, com.empuje.grpc.ong.ListDonationsByEventResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListDonationsByEvent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.empuje.grpc.ong.ListDonationsByEventRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.empuje.grpc.ong.ListDonationsByEventResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EventServiceMethodDescriptorSupplier("ListDonationsByEvent"))
              .build();
        }
      }
    }
    return getListDonationsByEventMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static EventServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EventServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EventServiceStub>() {
        @java.lang.Override
        public EventServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EventServiceStub(channel, callOptions);
        }
      };
    return EventServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static EventServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EventServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EventServiceBlockingStub>() {
        @java.lang.Override
        public EventServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EventServiceBlockingStub(channel, callOptions);
        }
      };
    return EventServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static EventServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EventServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EventServiceFutureStub>() {
        @java.lang.Override
        public EventServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EventServiceFutureStub(channel, callOptions);
        }
      };
    return EventServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void createEvent(com.empuje.grpc.ong.CreateEventRequest request,
        io.grpc.stub.StreamObserver<com.empuje.grpc.ong.ApiResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateEventMethod(), responseObserver);
    }

    /**
     */
    default void updateEvent(com.empuje.grpc.ong.UpdateEventRequest request,
        io.grpc.stub.StreamObserver<com.empuje.grpc.ong.ApiResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateEventMethod(), responseObserver);
    }

    /**
     */
    default void deleteEvent(com.empuje.grpc.ong.DeleteEventRequest request,
        io.grpc.stub.StreamObserver<com.empuje.grpc.ong.ApiResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteEventMethod(), responseObserver);
    }

    /**
     */
    default void assignMember(com.empuje.grpc.ong.AssignMemberRequest request,
        io.grpc.stub.StreamObserver<com.empuje.grpc.ong.ApiResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAssignMemberMethod(), responseObserver);
    }

    /**
     */
    default void removeMember(com.empuje.grpc.ong.RemoveMemberRequest request,
        io.grpc.stub.StreamObserver<com.empuje.grpc.ong.ApiResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRemoveMemberMethod(), responseObserver);
    }

    /**
     */
    default void registerDistribution(com.empuje.grpc.ong.RegisterDistributionRequest request,
        io.grpc.stub.StreamObserver<com.empuje.grpc.ong.ApiResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRegisterDistributionMethod(), responseObserver);
    }

    /**
     */
    default void listEvents(com.empuje.grpc.ong.Empty request,
        io.grpc.stub.StreamObserver<com.empuje.grpc.ong.ListEventsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListEventsMethod(), responseObserver);
    }

    /**
     */
    default void assignDonationToEvent(com.empuje.grpc.ong.AssignDonationToEventRequest request,
        io.grpc.stub.StreamObserver<com.empuje.grpc.ong.ApiResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAssignDonationToEventMethod(), responseObserver);
    }

    /**
     */
    default void removeDonationFromEvent(com.empuje.grpc.ong.RemoveDonationFromEventRequest request,
        io.grpc.stub.StreamObserver<com.empuje.grpc.ong.ApiResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRemoveDonationFromEventMethod(), responseObserver);
    }

    /**
     */
    default void listDonationsByEvent(com.empuje.grpc.ong.ListDonationsByEventRequest request,
        io.grpc.stub.StreamObserver<com.empuje.grpc.ong.ListDonationsByEventResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListDonationsByEventMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service EventService.
   */
  public static abstract class EventServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return EventServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service EventService.
   */
  public static final class EventServiceStub
      extends io.grpc.stub.AbstractAsyncStub<EventServiceStub> {
    private EventServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EventServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EventServiceStub(channel, callOptions);
    }

    /**
     */
    public void createEvent(com.empuje.grpc.ong.CreateEventRequest request,
        io.grpc.stub.StreamObserver<com.empuje.grpc.ong.ApiResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateEventMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateEvent(com.empuje.grpc.ong.UpdateEventRequest request,
        io.grpc.stub.StreamObserver<com.empuje.grpc.ong.ApiResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateEventMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteEvent(com.empuje.grpc.ong.DeleteEventRequest request,
        io.grpc.stub.StreamObserver<com.empuje.grpc.ong.ApiResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteEventMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void assignMember(com.empuje.grpc.ong.AssignMemberRequest request,
        io.grpc.stub.StreamObserver<com.empuje.grpc.ong.ApiResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAssignMemberMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void removeMember(com.empuje.grpc.ong.RemoveMemberRequest request,
        io.grpc.stub.StreamObserver<com.empuje.grpc.ong.ApiResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRemoveMemberMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void registerDistribution(com.empuje.grpc.ong.RegisterDistributionRequest request,
        io.grpc.stub.StreamObserver<com.empuje.grpc.ong.ApiResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRegisterDistributionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listEvents(com.empuje.grpc.ong.Empty request,
        io.grpc.stub.StreamObserver<com.empuje.grpc.ong.ListEventsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListEventsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void assignDonationToEvent(com.empuje.grpc.ong.AssignDonationToEventRequest request,
        io.grpc.stub.StreamObserver<com.empuje.grpc.ong.ApiResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAssignDonationToEventMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void removeDonationFromEvent(com.empuje.grpc.ong.RemoveDonationFromEventRequest request,
        io.grpc.stub.StreamObserver<com.empuje.grpc.ong.ApiResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRemoveDonationFromEventMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listDonationsByEvent(com.empuje.grpc.ong.ListDonationsByEventRequest request,
        io.grpc.stub.StreamObserver<com.empuje.grpc.ong.ListDonationsByEventResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListDonationsByEventMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service EventService.
   */
  public static final class EventServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<EventServiceBlockingStub> {
    private EventServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EventServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EventServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.empuje.grpc.ong.ApiResponse createEvent(com.empuje.grpc.ong.CreateEventRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateEventMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.empuje.grpc.ong.ApiResponse updateEvent(com.empuje.grpc.ong.UpdateEventRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateEventMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.empuje.grpc.ong.ApiResponse deleteEvent(com.empuje.grpc.ong.DeleteEventRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteEventMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.empuje.grpc.ong.ApiResponse assignMember(com.empuje.grpc.ong.AssignMemberRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAssignMemberMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.empuje.grpc.ong.ApiResponse removeMember(com.empuje.grpc.ong.RemoveMemberRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRemoveMemberMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.empuje.grpc.ong.ApiResponse registerDistribution(com.empuje.grpc.ong.RegisterDistributionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRegisterDistributionMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.empuje.grpc.ong.ListEventsResponse listEvents(com.empuje.grpc.ong.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListEventsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.empuje.grpc.ong.ApiResponse assignDonationToEvent(com.empuje.grpc.ong.AssignDonationToEventRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAssignDonationToEventMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.empuje.grpc.ong.ApiResponse removeDonationFromEvent(com.empuje.grpc.ong.RemoveDonationFromEventRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRemoveDonationFromEventMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.empuje.grpc.ong.ListDonationsByEventResponse listDonationsByEvent(com.empuje.grpc.ong.ListDonationsByEventRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListDonationsByEventMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service EventService.
   */
  public static final class EventServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<EventServiceFutureStub> {
    private EventServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EventServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EventServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.empuje.grpc.ong.ApiResponse> createEvent(
        com.empuje.grpc.ong.CreateEventRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateEventMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.empuje.grpc.ong.ApiResponse> updateEvent(
        com.empuje.grpc.ong.UpdateEventRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateEventMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.empuje.grpc.ong.ApiResponse> deleteEvent(
        com.empuje.grpc.ong.DeleteEventRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteEventMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.empuje.grpc.ong.ApiResponse> assignMember(
        com.empuje.grpc.ong.AssignMemberRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAssignMemberMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.empuje.grpc.ong.ApiResponse> removeMember(
        com.empuje.grpc.ong.RemoveMemberRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRemoveMemberMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.empuje.grpc.ong.ApiResponse> registerDistribution(
        com.empuje.grpc.ong.RegisterDistributionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRegisterDistributionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.empuje.grpc.ong.ListEventsResponse> listEvents(
        com.empuje.grpc.ong.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListEventsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.empuje.grpc.ong.ApiResponse> assignDonationToEvent(
        com.empuje.grpc.ong.AssignDonationToEventRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAssignDonationToEventMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.empuje.grpc.ong.ApiResponse> removeDonationFromEvent(
        com.empuje.grpc.ong.RemoveDonationFromEventRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRemoveDonationFromEventMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.empuje.grpc.ong.ListDonationsByEventResponse> listDonationsByEvent(
        com.empuje.grpc.ong.ListDonationsByEventRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListDonationsByEventMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_EVENT = 0;
  private static final int METHODID_UPDATE_EVENT = 1;
  private static final int METHODID_DELETE_EVENT = 2;
  private static final int METHODID_ASSIGN_MEMBER = 3;
  private static final int METHODID_REMOVE_MEMBER = 4;
  private static final int METHODID_REGISTER_DISTRIBUTION = 5;
  private static final int METHODID_LIST_EVENTS = 6;
  private static final int METHODID_ASSIGN_DONATION_TO_EVENT = 7;
  private static final int METHODID_REMOVE_DONATION_FROM_EVENT = 8;
  private static final int METHODID_LIST_DONATIONS_BY_EVENT = 9;

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
        case METHODID_CREATE_EVENT:
          serviceImpl.createEvent((com.empuje.grpc.ong.CreateEventRequest) request,
              (io.grpc.stub.StreamObserver<com.empuje.grpc.ong.ApiResponse>) responseObserver);
          break;
        case METHODID_UPDATE_EVENT:
          serviceImpl.updateEvent((com.empuje.grpc.ong.UpdateEventRequest) request,
              (io.grpc.stub.StreamObserver<com.empuje.grpc.ong.ApiResponse>) responseObserver);
          break;
        case METHODID_DELETE_EVENT:
          serviceImpl.deleteEvent((com.empuje.grpc.ong.DeleteEventRequest) request,
              (io.grpc.stub.StreamObserver<com.empuje.grpc.ong.ApiResponse>) responseObserver);
          break;
        case METHODID_ASSIGN_MEMBER:
          serviceImpl.assignMember((com.empuje.grpc.ong.AssignMemberRequest) request,
              (io.grpc.stub.StreamObserver<com.empuje.grpc.ong.ApiResponse>) responseObserver);
          break;
        case METHODID_REMOVE_MEMBER:
          serviceImpl.removeMember((com.empuje.grpc.ong.RemoveMemberRequest) request,
              (io.grpc.stub.StreamObserver<com.empuje.grpc.ong.ApiResponse>) responseObserver);
          break;
        case METHODID_REGISTER_DISTRIBUTION:
          serviceImpl.registerDistribution((com.empuje.grpc.ong.RegisterDistributionRequest) request,
              (io.grpc.stub.StreamObserver<com.empuje.grpc.ong.ApiResponse>) responseObserver);
          break;
        case METHODID_LIST_EVENTS:
          serviceImpl.listEvents((com.empuje.grpc.ong.Empty) request,
              (io.grpc.stub.StreamObserver<com.empuje.grpc.ong.ListEventsResponse>) responseObserver);
          break;
        case METHODID_ASSIGN_DONATION_TO_EVENT:
          serviceImpl.assignDonationToEvent((com.empuje.grpc.ong.AssignDonationToEventRequest) request,
              (io.grpc.stub.StreamObserver<com.empuje.grpc.ong.ApiResponse>) responseObserver);
          break;
        case METHODID_REMOVE_DONATION_FROM_EVENT:
          serviceImpl.removeDonationFromEvent((com.empuje.grpc.ong.RemoveDonationFromEventRequest) request,
              (io.grpc.stub.StreamObserver<com.empuje.grpc.ong.ApiResponse>) responseObserver);
          break;
        case METHODID_LIST_DONATIONS_BY_EVENT:
          serviceImpl.listDonationsByEvent((com.empuje.grpc.ong.ListDonationsByEventRequest) request,
              (io.grpc.stub.StreamObserver<com.empuje.grpc.ong.ListDonationsByEventResponse>) responseObserver);
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
          getCreateEventMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.empuje.grpc.ong.CreateEventRequest,
              com.empuje.grpc.ong.ApiResponse>(
                service, METHODID_CREATE_EVENT)))
        .addMethod(
          getUpdateEventMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.empuje.grpc.ong.UpdateEventRequest,
              com.empuje.grpc.ong.ApiResponse>(
                service, METHODID_UPDATE_EVENT)))
        .addMethod(
          getDeleteEventMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.empuje.grpc.ong.DeleteEventRequest,
              com.empuje.grpc.ong.ApiResponse>(
                service, METHODID_DELETE_EVENT)))
        .addMethod(
          getAssignMemberMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.empuje.grpc.ong.AssignMemberRequest,
              com.empuje.grpc.ong.ApiResponse>(
                service, METHODID_ASSIGN_MEMBER)))
        .addMethod(
          getRemoveMemberMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.empuje.grpc.ong.RemoveMemberRequest,
              com.empuje.grpc.ong.ApiResponse>(
                service, METHODID_REMOVE_MEMBER)))
        .addMethod(
          getRegisterDistributionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.empuje.grpc.ong.RegisterDistributionRequest,
              com.empuje.grpc.ong.ApiResponse>(
                service, METHODID_REGISTER_DISTRIBUTION)))
        .addMethod(
          getListEventsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.empuje.grpc.ong.Empty,
              com.empuje.grpc.ong.ListEventsResponse>(
                service, METHODID_LIST_EVENTS)))
        .addMethod(
          getAssignDonationToEventMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.empuje.grpc.ong.AssignDonationToEventRequest,
              com.empuje.grpc.ong.ApiResponse>(
                service, METHODID_ASSIGN_DONATION_TO_EVENT)))
        .addMethod(
          getRemoveDonationFromEventMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.empuje.grpc.ong.RemoveDonationFromEventRequest,
              com.empuje.grpc.ong.ApiResponse>(
                service, METHODID_REMOVE_DONATION_FROM_EVENT)))
        .addMethod(
          getListDonationsByEventMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.empuje.grpc.ong.ListDonationsByEventRequest,
              com.empuje.grpc.ong.ListDonationsByEventResponse>(
                service, METHODID_LIST_DONATIONS_BY_EVENT)))
        .build();
  }

  private static abstract class EventServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    EventServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.empuje.grpc.ong.OngProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("EventService");
    }
  }

  private static final class EventServiceFileDescriptorSupplier
      extends EventServiceBaseDescriptorSupplier {
    EventServiceFileDescriptorSupplier() {}
  }

  private static final class EventServiceMethodDescriptorSupplier
      extends EventServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    EventServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (EventServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new EventServiceFileDescriptorSupplier())
              .addMethod(getCreateEventMethod())
              .addMethod(getUpdateEventMethod())
              .addMethod(getDeleteEventMethod())
              .addMethod(getAssignMemberMethod())
              .addMethod(getRemoveMemberMethod())
              .addMethod(getRegisterDistributionMethod())
              .addMethod(getListEventsMethod())
              .addMethod(getAssignDonationToEventMethod())
              .addMethod(getRemoveDonationFromEventMethod())
              .addMethod(getListDonationsByEventMethod())
              .build();
        }
      }
    }
    return result;
  }
}
