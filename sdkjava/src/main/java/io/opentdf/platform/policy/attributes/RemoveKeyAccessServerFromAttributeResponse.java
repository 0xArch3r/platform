// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: policy/attributes/attributes.proto

// Protobuf Java Version: 3.25.3
package io.opentdf.platform.policy.attributes;

/**
 * Protobuf type {@code policy.attributes.RemoveKeyAccessServerFromAttributeResponse}
 */
public final class RemoveKeyAccessServerFromAttributeResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:policy.attributes.RemoveKeyAccessServerFromAttributeResponse)
    RemoveKeyAccessServerFromAttributeResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RemoveKeyAccessServerFromAttributeResponse.newBuilder() to construct.
  private RemoveKeyAccessServerFromAttributeResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RemoveKeyAccessServerFromAttributeResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new RemoveKeyAccessServerFromAttributeResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.opentdf.platform.policy.attributes.AttributesProto.internal_static_policy_attributes_RemoveKeyAccessServerFromAttributeResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.opentdf.platform.policy.attributes.AttributesProto.internal_static_policy_attributes_RemoveKeyAccessServerFromAttributeResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.opentdf.platform.policy.attributes.RemoveKeyAccessServerFromAttributeResponse.class, io.opentdf.platform.policy.attributes.RemoveKeyAccessServerFromAttributeResponse.Builder.class);
  }

  private int bitField0_;
  public static final int ATTRIBUTE_KEY_ACCESS_SERVER_FIELD_NUMBER = 1;
  private io.opentdf.platform.policy.attributes.AttributeKeyAccessServer attributeKeyAccessServer_;
  /**
   * <code>.policy.attributes.AttributeKeyAccessServer attribute_key_access_server = 1 [json_name = "attributeKeyAccessServer"];</code>
   * @return Whether the attributeKeyAccessServer field is set.
   */
  @java.lang.Override
  public boolean hasAttributeKeyAccessServer() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>.policy.attributes.AttributeKeyAccessServer attribute_key_access_server = 1 [json_name = "attributeKeyAccessServer"];</code>
   * @return The attributeKeyAccessServer.
   */
  @java.lang.Override
  public io.opentdf.platform.policy.attributes.AttributeKeyAccessServer getAttributeKeyAccessServer() {
    return attributeKeyAccessServer_ == null ? io.opentdf.platform.policy.attributes.AttributeKeyAccessServer.getDefaultInstance() : attributeKeyAccessServer_;
  }
  /**
   * <code>.policy.attributes.AttributeKeyAccessServer attribute_key_access_server = 1 [json_name = "attributeKeyAccessServer"];</code>
   */
  @java.lang.Override
  public io.opentdf.platform.policy.attributes.AttributeKeyAccessServerOrBuilder getAttributeKeyAccessServerOrBuilder() {
    return attributeKeyAccessServer_ == null ? io.opentdf.platform.policy.attributes.AttributeKeyAccessServer.getDefaultInstance() : attributeKeyAccessServer_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(1, getAttributeKeyAccessServer());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getAttributeKeyAccessServer());
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof io.opentdf.platform.policy.attributes.RemoveKeyAccessServerFromAttributeResponse)) {
      return super.equals(obj);
    }
    io.opentdf.platform.policy.attributes.RemoveKeyAccessServerFromAttributeResponse other = (io.opentdf.platform.policy.attributes.RemoveKeyAccessServerFromAttributeResponse) obj;

    if (hasAttributeKeyAccessServer() != other.hasAttributeKeyAccessServer()) return false;
    if (hasAttributeKeyAccessServer()) {
      if (!getAttributeKeyAccessServer()
          .equals(other.getAttributeKeyAccessServer())) return false;
    }
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasAttributeKeyAccessServer()) {
      hash = (37 * hash) + ATTRIBUTE_KEY_ACCESS_SERVER_FIELD_NUMBER;
      hash = (53 * hash) + getAttributeKeyAccessServer().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.opentdf.platform.policy.attributes.RemoveKeyAccessServerFromAttributeResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.opentdf.platform.policy.attributes.RemoveKeyAccessServerFromAttributeResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.opentdf.platform.policy.attributes.RemoveKeyAccessServerFromAttributeResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.opentdf.platform.policy.attributes.RemoveKeyAccessServerFromAttributeResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.opentdf.platform.policy.attributes.RemoveKeyAccessServerFromAttributeResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.opentdf.platform.policy.attributes.RemoveKeyAccessServerFromAttributeResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.opentdf.platform.policy.attributes.RemoveKeyAccessServerFromAttributeResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.opentdf.platform.policy.attributes.RemoveKeyAccessServerFromAttributeResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static io.opentdf.platform.policy.attributes.RemoveKeyAccessServerFromAttributeResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static io.opentdf.platform.policy.attributes.RemoveKeyAccessServerFromAttributeResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.opentdf.platform.policy.attributes.RemoveKeyAccessServerFromAttributeResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.opentdf.platform.policy.attributes.RemoveKeyAccessServerFromAttributeResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(io.opentdf.platform.policy.attributes.RemoveKeyAccessServerFromAttributeResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code policy.attributes.RemoveKeyAccessServerFromAttributeResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:policy.attributes.RemoveKeyAccessServerFromAttributeResponse)
      io.opentdf.platform.policy.attributes.RemoveKeyAccessServerFromAttributeResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.opentdf.platform.policy.attributes.AttributesProto.internal_static_policy_attributes_RemoveKeyAccessServerFromAttributeResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.opentdf.platform.policy.attributes.AttributesProto.internal_static_policy_attributes_RemoveKeyAccessServerFromAttributeResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.opentdf.platform.policy.attributes.RemoveKeyAccessServerFromAttributeResponse.class, io.opentdf.platform.policy.attributes.RemoveKeyAccessServerFromAttributeResponse.Builder.class);
    }

    // Construct using io.opentdf.platform.policy.attributes.RemoveKeyAccessServerFromAttributeResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getAttributeKeyAccessServerFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      attributeKeyAccessServer_ = null;
      if (attributeKeyAccessServerBuilder_ != null) {
        attributeKeyAccessServerBuilder_.dispose();
        attributeKeyAccessServerBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.opentdf.platform.policy.attributes.AttributesProto.internal_static_policy_attributes_RemoveKeyAccessServerFromAttributeResponse_descriptor;
    }

    @java.lang.Override
    public io.opentdf.platform.policy.attributes.RemoveKeyAccessServerFromAttributeResponse getDefaultInstanceForType() {
      return io.opentdf.platform.policy.attributes.RemoveKeyAccessServerFromAttributeResponse.getDefaultInstance();
    }

    @java.lang.Override
    public io.opentdf.platform.policy.attributes.RemoveKeyAccessServerFromAttributeResponse build() {
      io.opentdf.platform.policy.attributes.RemoveKeyAccessServerFromAttributeResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.opentdf.platform.policy.attributes.RemoveKeyAccessServerFromAttributeResponse buildPartial() {
      io.opentdf.platform.policy.attributes.RemoveKeyAccessServerFromAttributeResponse result = new io.opentdf.platform.policy.attributes.RemoveKeyAccessServerFromAttributeResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(io.opentdf.platform.policy.attributes.RemoveKeyAccessServerFromAttributeResponse result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.attributeKeyAccessServer_ = attributeKeyAccessServerBuilder_ == null
            ? attributeKeyAccessServer_
            : attributeKeyAccessServerBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof io.opentdf.platform.policy.attributes.RemoveKeyAccessServerFromAttributeResponse) {
        return mergeFrom((io.opentdf.platform.policy.attributes.RemoveKeyAccessServerFromAttributeResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.opentdf.platform.policy.attributes.RemoveKeyAccessServerFromAttributeResponse other) {
      if (other == io.opentdf.platform.policy.attributes.RemoveKeyAccessServerFromAttributeResponse.getDefaultInstance()) return this;
      if (other.hasAttributeKeyAccessServer()) {
        mergeAttributeKeyAccessServer(other.getAttributeKeyAccessServer());
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              input.readMessage(
                  getAttributeKeyAccessServerFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private io.opentdf.platform.policy.attributes.AttributeKeyAccessServer attributeKeyAccessServer_;
    private com.google.protobuf.SingleFieldBuilderV3<
        io.opentdf.platform.policy.attributes.AttributeKeyAccessServer, io.opentdf.platform.policy.attributes.AttributeKeyAccessServer.Builder, io.opentdf.platform.policy.attributes.AttributeKeyAccessServerOrBuilder> attributeKeyAccessServerBuilder_;
    /**
     * <code>.policy.attributes.AttributeKeyAccessServer attribute_key_access_server = 1 [json_name = "attributeKeyAccessServer"];</code>
     * @return Whether the attributeKeyAccessServer field is set.
     */
    public boolean hasAttributeKeyAccessServer() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.policy.attributes.AttributeKeyAccessServer attribute_key_access_server = 1 [json_name = "attributeKeyAccessServer"];</code>
     * @return The attributeKeyAccessServer.
     */
    public io.opentdf.platform.policy.attributes.AttributeKeyAccessServer getAttributeKeyAccessServer() {
      if (attributeKeyAccessServerBuilder_ == null) {
        return attributeKeyAccessServer_ == null ? io.opentdf.platform.policy.attributes.AttributeKeyAccessServer.getDefaultInstance() : attributeKeyAccessServer_;
      } else {
        return attributeKeyAccessServerBuilder_.getMessage();
      }
    }
    /**
     * <code>.policy.attributes.AttributeKeyAccessServer attribute_key_access_server = 1 [json_name = "attributeKeyAccessServer"];</code>
     */
    public Builder setAttributeKeyAccessServer(io.opentdf.platform.policy.attributes.AttributeKeyAccessServer value) {
      if (attributeKeyAccessServerBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        attributeKeyAccessServer_ = value;
      } else {
        attributeKeyAccessServerBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.policy.attributes.AttributeKeyAccessServer attribute_key_access_server = 1 [json_name = "attributeKeyAccessServer"];</code>
     */
    public Builder setAttributeKeyAccessServer(
        io.opentdf.platform.policy.attributes.AttributeKeyAccessServer.Builder builderForValue) {
      if (attributeKeyAccessServerBuilder_ == null) {
        attributeKeyAccessServer_ = builderForValue.build();
      } else {
        attributeKeyAccessServerBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.policy.attributes.AttributeKeyAccessServer attribute_key_access_server = 1 [json_name = "attributeKeyAccessServer"];</code>
     */
    public Builder mergeAttributeKeyAccessServer(io.opentdf.platform.policy.attributes.AttributeKeyAccessServer value) {
      if (attributeKeyAccessServerBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          attributeKeyAccessServer_ != null &&
          attributeKeyAccessServer_ != io.opentdf.platform.policy.attributes.AttributeKeyAccessServer.getDefaultInstance()) {
          getAttributeKeyAccessServerBuilder().mergeFrom(value);
        } else {
          attributeKeyAccessServer_ = value;
        }
      } else {
        attributeKeyAccessServerBuilder_.mergeFrom(value);
      }
      if (attributeKeyAccessServer_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     * <code>.policy.attributes.AttributeKeyAccessServer attribute_key_access_server = 1 [json_name = "attributeKeyAccessServer"];</code>
     */
    public Builder clearAttributeKeyAccessServer() {
      bitField0_ = (bitField0_ & ~0x00000001);
      attributeKeyAccessServer_ = null;
      if (attributeKeyAccessServerBuilder_ != null) {
        attributeKeyAccessServerBuilder_.dispose();
        attributeKeyAccessServerBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.policy.attributes.AttributeKeyAccessServer attribute_key_access_server = 1 [json_name = "attributeKeyAccessServer"];</code>
     */
    public io.opentdf.platform.policy.attributes.AttributeKeyAccessServer.Builder getAttributeKeyAccessServerBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getAttributeKeyAccessServerFieldBuilder().getBuilder();
    }
    /**
     * <code>.policy.attributes.AttributeKeyAccessServer attribute_key_access_server = 1 [json_name = "attributeKeyAccessServer"];</code>
     */
    public io.opentdf.platform.policy.attributes.AttributeKeyAccessServerOrBuilder getAttributeKeyAccessServerOrBuilder() {
      if (attributeKeyAccessServerBuilder_ != null) {
        return attributeKeyAccessServerBuilder_.getMessageOrBuilder();
      } else {
        return attributeKeyAccessServer_ == null ?
            io.opentdf.platform.policy.attributes.AttributeKeyAccessServer.getDefaultInstance() : attributeKeyAccessServer_;
      }
    }
    /**
     * <code>.policy.attributes.AttributeKeyAccessServer attribute_key_access_server = 1 [json_name = "attributeKeyAccessServer"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.opentdf.platform.policy.attributes.AttributeKeyAccessServer, io.opentdf.platform.policy.attributes.AttributeKeyAccessServer.Builder, io.opentdf.platform.policy.attributes.AttributeKeyAccessServerOrBuilder> 
        getAttributeKeyAccessServerFieldBuilder() {
      if (attributeKeyAccessServerBuilder_ == null) {
        attributeKeyAccessServerBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.opentdf.platform.policy.attributes.AttributeKeyAccessServer, io.opentdf.platform.policy.attributes.AttributeKeyAccessServer.Builder, io.opentdf.platform.policy.attributes.AttributeKeyAccessServerOrBuilder>(
                getAttributeKeyAccessServer(),
                getParentForChildren(),
                isClean());
        attributeKeyAccessServer_ = null;
      }
      return attributeKeyAccessServerBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:policy.attributes.RemoveKeyAccessServerFromAttributeResponse)
  }

  // @@protoc_insertion_point(class_scope:policy.attributes.RemoveKeyAccessServerFromAttributeResponse)
  private static final io.opentdf.platform.policy.attributes.RemoveKeyAccessServerFromAttributeResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.opentdf.platform.policy.attributes.RemoveKeyAccessServerFromAttributeResponse();
  }

  public static io.opentdf.platform.policy.attributes.RemoveKeyAccessServerFromAttributeResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RemoveKeyAccessServerFromAttributeResponse>
      PARSER = new com.google.protobuf.AbstractParser<RemoveKeyAccessServerFromAttributeResponse>() {
    @java.lang.Override
    public RemoveKeyAccessServerFromAttributeResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<RemoveKeyAccessServerFromAttributeResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RemoveKeyAccessServerFromAttributeResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.opentdf.platform.policy.attributes.RemoveKeyAccessServerFromAttributeResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
