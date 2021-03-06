// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MessageTypes.proto

public final class MessageTypes {
  private MessageTypes() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface LocationOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Location)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required double lat = 1;</code>
     */
    boolean hasLat();
    /**
     * <code>required double lat = 1;</code>
     */
    double getLat();

    /**
     * <code>required double lng = 2;</code>
     */
    boolean hasLng();
    /**
     * <code>required double lng = 2;</code>
     */
    double getLng();

    /**
     * <code>required double accuracy = 3;</code>
     */
    boolean hasAccuracy();
    /**
     * <code>required double accuracy = 3;</code>
     */
    double getAccuracy();
  }
  /**
   * Protobuf type {@code Location}
   */
  public static final class Location extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:Location)
      LocationOrBuilder {
    // Use Location.newBuilder() to construct.
    private Location(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private Location(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final Location defaultInstance;
    public static Location getDefaultInstance() {
      return defaultInstance;
    }

    public Location getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private Location(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 9: {
              bitField0_ |= 0x00000001;
              lat_ = input.readDouble();
              break;
            }
            case 17: {
              bitField0_ |= 0x00000002;
              lng_ = input.readDouble();
              break;
            }
            case 25: {
              bitField0_ |= 0x00000004;
              accuracy_ = input.readDouble();
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return MessageTypes.internal_static_Location_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return MessageTypes.internal_static_Location_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              MessageTypes.Location.class, MessageTypes.Location.Builder.class);
    }

    public static com.google.protobuf.Parser<Location> PARSER =
        new com.google.protobuf.AbstractParser<Location>() {
      public Location parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Location(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<Location> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    public static final int LAT_FIELD_NUMBER = 1;
    private double lat_;
    /**
     * <code>required double lat = 1;</code>
     */
    public boolean hasLat() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required double lat = 1;</code>
     */
    public double getLat() {
      return lat_;
    }

    public static final int LNG_FIELD_NUMBER = 2;
    private double lng_;
    /**
     * <code>required double lng = 2;</code>
     */
    public boolean hasLng() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required double lng = 2;</code>
     */
    public double getLng() {
      return lng_;
    }

    public static final int ACCURACY_FIELD_NUMBER = 3;
    private double accuracy_;
    /**
     * <code>required double accuracy = 3;</code>
     */
    public boolean hasAccuracy() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>required double accuracy = 3;</code>
     */
    public double getAccuracy() {
      return accuracy_;
    }

    private void initFields() {
      lat_ = 0D;
      lng_ = 0D;
      accuracy_ = 0D;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasLat()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasLng()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasAccuracy()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeDouble(1, lat_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeDouble(2, lng_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeDouble(3, accuracy_);
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeDoubleSize(1, lat_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeDoubleSize(2, lng_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeDoubleSize(3, accuracy_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static MessageTypes.Location parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static MessageTypes.Location parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static MessageTypes.Location parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static MessageTypes.Location parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static MessageTypes.Location parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static MessageTypes.Location parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static MessageTypes.Location parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static MessageTypes.Location parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static MessageTypes.Location parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static MessageTypes.Location parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(MessageTypes.Location prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code Location}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Location)
        MessageTypes.LocationOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return MessageTypes.internal_static_Location_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return MessageTypes.internal_static_Location_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                MessageTypes.Location.class, MessageTypes.Location.Builder.class);
      }

      // Construct using MessageTypes.Location.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        lat_ = 0D;
        bitField0_ = (bitField0_ & ~0x00000001);
        lng_ = 0D;
        bitField0_ = (bitField0_ & ~0x00000002);
        accuracy_ = 0D;
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return MessageTypes.internal_static_Location_descriptor;
      }

      public MessageTypes.Location getDefaultInstanceForType() {
        return MessageTypes.Location.getDefaultInstance();
      }

      public MessageTypes.Location build() {
        MessageTypes.Location result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public MessageTypes.Location buildPartial() {
        MessageTypes.Location result = new MessageTypes.Location(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.lat_ = lat_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.lng_ = lng_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.accuracy_ = accuracy_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof MessageTypes.Location) {
          return mergeFrom((MessageTypes.Location)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(MessageTypes.Location other) {
        if (other == MessageTypes.Location.getDefaultInstance()) return this;
        if (other.hasLat()) {
          setLat(other.getLat());
        }
        if (other.hasLng()) {
          setLng(other.getLng());
        }
        if (other.hasAccuracy()) {
          setAccuracy(other.getAccuracy());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasLat()) {
          
          return false;
        }
        if (!hasLng()) {
          
          return false;
        }
        if (!hasAccuracy()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        MessageTypes.Location parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (MessageTypes.Location) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private double lat_ ;
      /**
       * <code>required double lat = 1;</code>
       */
      public boolean hasLat() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required double lat = 1;</code>
       */
      public double getLat() {
        return lat_;
      }
      /**
       * <code>required double lat = 1;</code>
       */
      public Builder setLat(double value) {
        bitField0_ |= 0x00000001;
        lat_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required double lat = 1;</code>
       */
      public Builder clearLat() {
        bitField0_ = (bitField0_ & ~0x00000001);
        lat_ = 0D;
        onChanged();
        return this;
      }

      private double lng_ ;
      /**
       * <code>required double lng = 2;</code>
       */
      public boolean hasLng() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>required double lng = 2;</code>
       */
      public double getLng() {
        return lng_;
      }
      /**
       * <code>required double lng = 2;</code>
       */
      public Builder setLng(double value) {
        bitField0_ |= 0x00000002;
        lng_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required double lng = 2;</code>
       */
      public Builder clearLng() {
        bitField0_ = (bitField0_ & ~0x00000002);
        lng_ = 0D;
        onChanged();
        return this;
      }

      private double accuracy_ ;
      /**
       * <code>required double accuracy = 3;</code>
       */
      public boolean hasAccuracy() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>required double accuracy = 3;</code>
       */
      public double getAccuracy() {
        return accuracy_;
      }
      /**
       * <code>required double accuracy = 3;</code>
       */
      public Builder setAccuracy(double value) {
        bitField0_ |= 0x00000004;
        accuracy_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required double accuracy = 3;</code>
       */
      public Builder clearAccuracy() {
        bitField0_ = (bitField0_ & ~0x00000004);
        accuracy_ = 0D;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:Location)
    }

    static {
      defaultInstance = new Location(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:Location)
  }

  public interface Test1OrBuilder extends
      // @@protoc_insertion_point(interface_extends:Test1)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required int32 a = 1;</code>
     */
    boolean hasA();
    /**
     * <code>required int32 a = 1;</code>
     */
    int getA();
  }
  /**
   * Protobuf type {@code Test1}
   */
  public static final class Test1 extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:Test1)
      Test1OrBuilder {
    // Use Test1.newBuilder() to construct.
    private Test1(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private Test1(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final Test1 defaultInstance;
    public static Test1 getDefaultInstance() {
      return defaultInstance;
    }

    public Test1 getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private Test1(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 8: {
              bitField0_ |= 0x00000001;
              a_ = input.readInt32();
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return MessageTypes.internal_static_Test1_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return MessageTypes.internal_static_Test1_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              MessageTypes.Test1.class, MessageTypes.Test1.Builder.class);
    }

    public static com.google.protobuf.Parser<Test1> PARSER =
        new com.google.protobuf.AbstractParser<Test1>() {
      public Test1 parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Test1(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<Test1> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    public static final int A_FIELD_NUMBER = 1;
    private int a_;
    /**
     * <code>required int32 a = 1;</code>
     */
    public boolean hasA() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required int32 a = 1;</code>
     */
    public int getA() {
      return a_;
    }

    private void initFields() {
      a_ = 0;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasA()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeInt32(1, a_);
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, a_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static MessageTypes.Test1 parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static MessageTypes.Test1 parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static MessageTypes.Test1 parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static MessageTypes.Test1 parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static MessageTypes.Test1 parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static MessageTypes.Test1 parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static MessageTypes.Test1 parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static MessageTypes.Test1 parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static MessageTypes.Test1 parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static MessageTypes.Test1 parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(MessageTypes.Test1 prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code Test1}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Test1)
        MessageTypes.Test1OrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return MessageTypes.internal_static_Test1_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return MessageTypes.internal_static_Test1_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                MessageTypes.Test1.class, MessageTypes.Test1.Builder.class);
      }

      // Construct using MessageTypes.Test1.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        a_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return MessageTypes.internal_static_Test1_descriptor;
      }

      public MessageTypes.Test1 getDefaultInstanceForType() {
        return MessageTypes.Test1.getDefaultInstance();
      }

      public MessageTypes.Test1 build() {
        MessageTypes.Test1 result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public MessageTypes.Test1 buildPartial() {
        MessageTypes.Test1 result = new MessageTypes.Test1(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.a_ = a_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof MessageTypes.Test1) {
          return mergeFrom((MessageTypes.Test1)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(MessageTypes.Test1 other) {
        if (other == MessageTypes.Test1.getDefaultInstance()) return this;
        if (other.hasA()) {
          setA(other.getA());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasA()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        MessageTypes.Test1 parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (MessageTypes.Test1) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int a_ ;
      /**
       * <code>required int32 a = 1;</code>
       */
      public boolean hasA() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required int32 a = 1;</code>
       */
      public int getA() {
        return a_;
      }
      /**
       * <code>required int32 a = 1;</code>
       */
      public Builder setA(int value) {
        bitField0_ |= 0x00000001;
        a_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int32 a = 1;</code>
       */
      public Builder clearA() {
        bitField0_ = (bitField0_ & ~0x00000001);
        a_ = 0;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:Test1)
    }

    static {
      defaultInstance = new Test1(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:Test1)
  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Location_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_Location_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Test1_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_Test1_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\022MessageTypes.proto\"6\n\010Location\022\013\n\003lat\030" +
      "\001 \002(\001\022\013\n\003lng\030\002 \002(\001\022\020\n\010accuracy\030\003 \002(\001\"\022\n\005" +
      "Test1\022\t\n\001a\030\001 \002(\005"
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
    internal_static_Location_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Location_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_Location_descriptor,
        new java.lang.String[] { "Lat", "Lng", "Accuracy", });
    internal_static_Test1_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_Test1_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_Test1_descriptor,
        new java.lang.String[] { "A", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
