// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PNBHAABHAOB.proto

package emu.grasscutter.net.proto;

public final class PNBHAABHAOBOuterClass {
  private PNBHAABHAOBOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface PNBHAABHAOBOrBuilder extends
      // @@protoc_insertion_point(interface_extends:PNBHAABHAOB)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.PNBHAABHAOB.IPEHLOGADMC LNEKOFLFAEI = 13;</code>
     * @return The enum numeric value on the wire for lNEKOFLFAEI.
     */
    int getLNEKOFLFAEIValue();
    /**
     * <code>.PNBHAABHAOB.IPEHLOGADMC LNEKOFLFAEI = 13;</code>
     * @return The lNEKOFLFAEI.
     */
    emu.grasscutter.net.proto.PNBHAABHAOBOuterClass.PNBHAABHAOB.IPEHLOGADMC getLNEKOFLFAEI();
  }
  /**
   * <pre>
   * CmdId: 29414
   * </pre>
   *
   * Protobuf type {@code PNBHAABHAOB}
   */
  public static final class PNBHAABHAOB extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:PNBHAABHAOB)
      PNBHAABHAOBOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use PNBHAABHAOB.newBuilder() to construct.
    private PNBHAABHAOB(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private PNBHAABHAOB() {
      lNEKOFLFAEI_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new PNBHAABHAOB();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private PNBHAABHAOB(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
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
            case 104: {
              int rawValue = input.readEnum();

              lNEKOFLFAEI_ = rawValue;
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.PNBHAABHAOBOuterClass.internal_static_PNBHAABHAOB_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.PNBHAABHAOBOuterClass.internal_static_PNBHAABHAOB_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.PNBHAABHAOBOuterClass.PNBHAABHAOB.class, emu.grasscutter.net.proto.PNBHAABHAOBOuterClass.PNBHAABHAOB.Builder.class);
    }

    /**
     * Protobuf enum {@code PNBHAABHAOB.IPEHLOGADMC}
     */
    public enum IPEHLOGADMC
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>HPKGGDFBHPI_GcgHintNone = 0;</code>
       */
      HPKGGDFBHPI_GcgHintNone(0),
      /**
       * <code>HPKGGDFBHPI_GcgHintGameNotFound = 1;</code>
       */
      HPKGGDFBHPI_GcgHintGameNotFound(1),
      UNRECOGNIZED(-1),
      ;

      /**
       * <code>HPKGGDFBHPI_GcgHintNone = 0;</code>
       */
      public static final int HPKGGDFBHPI_GcgHintNone_VALUE = 0;
      /**
       * <code>HPKGGDFBHPI_GcgHintGameNotFound = 1;</code>
       */
      public static final int HPKGGDFBHPI_GcgHintGameNotFound_VALUE = 1;


      public final int getNumber() {
        if (this == UNRECOGNIZED) {
          throw new java.lang.IllegalArgumentException(
              "Can't get the number of an unknown enum value.");
        }
        return value;
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       * @deprecated Use {@link #forNumber(int)} instead.
       */
      @java.lang.Deprecated
      public static IPEHLOGADMC valueOf(int value) {
        return forNumber(value);
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       */
      public static IPEHLOGADMC forNumber(int value) {
        switch (value) {
          case 0: return HPKGGDFBHPI_GcgHintNone;
          case 1: return HPKGGDFBHPI_GcgHintGameNotFound;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<IPEHLOGADMC>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          IPEHLOGADMC> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<IPEHLOGADMC>() {
              public IPEHLOGADMC findValueByNumber(int number) {
                return IPEHLOGADMC.forNumber(number);
              }
            };

      public final com.google.protobuf.Descriptors.EnumValueDescriptor
          getValueDescriptor() {
        if (this == UNRECOGNIZED) {
          throw new java.lang.IllegalStateException(
              "Can't get the descriptor of an unrecognized enum value.");
        }
        return getDescriptor().getValues().get(ordinal());
      }
      public final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptorForType() {
        return getDescriptor();
      }
      public static final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.PNBHAABHAOBOuterClass.PNBHAABHAOB.getDescriptor().getEnumTypes().get(0);
      }

      private static final IPEHLOGADMC[] VALUES = values();

      public static IPEHLOGADMC valueOf(
          com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
        if (desc.getType() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException(
            "EnumValueDescriptor is not for this type.");
        }
        if (desc.getIndex() == -1) {
          return UNRECOGNIZED;
        }
        return VALUES[desc.getIndex()];
      }

      private final int value;

      private IPEHLOGADMC(int value) {
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:PNBHAABHAOB.IPEHLOGADMC)
    }

    public static final int LNEKOFLFAEI_FIELD_NUMBER = 13;
    private int lNEKOFLFAEI_;
    /**
     * <code>.PNBHAABHAOB.IPEHLOGADMC LNEKOFLFAEI = 13;</code>
     * @return The enum numeric value on the wire for lNEKOFLFAEI.
     */
    @java.lang.Override public int getLNEKOFLFAEIValue() {
      return lNEKOFLFAEI_;
    }
    /**
     * <code>.PNBHAABHAOB.IPEHLOGADMC LNEKOFLFAEI = 13;</code>
     * @return The lNEKOFLFAEI.
     */
    @java.lang.Override public emu.grasscutter.net.proto.PNBHAABHAOBOuterClass.PNBHAABHAOB.IPEHLOGADMC getLNEKOFLFAEI() {
      @SuppressWarnings("deprecation")
      emu.grasscutter.net.proto.PNBHAABHAOBOuterClass.PNBHAABHAOB.IPEHLOGADMC result = emu.grasscutter.net.proto.PNBHAABHAOBOuterClass.PNBHAABHAOB.IPEHLOGADMC.valueOf(lNEKOFLFAEI_);
      return result == null ? emu.grasscutter.net.proto.PNBHAABHAOBOuterClass.PNBHAABHAOB.IPEHLOGADMC.UNRECOGNIZED : result;
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
      if (lNEKOFLFAEI_ != emu.grasscutter.net.proto.PNBHAABHAOBOuterClass.PNBHAABHAOB.IPEHLOGADMC.HPKGGDFBHPI_GcgHintNone.getNumber()) {
        output.writeEnum(13, lNEKOFLFAEI_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (lNEKOFLFAEI_ != emu.grasscutter.net.proto.PNBHAABHAOBOuterClass.PNBHAABHAOB.IPEHLOGADMC.HPKGGDFBHPI_GcgHintNone.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(13, lNEKOFLFAEI_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof emu.grasscutter.net.proto.PNBHAABHAOBOuterClass.PNBHAABHAOB)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.PNBHAABHAOBOuterClass.PNBHAABHAOB other = (emu.grasscutter.net.proto.PNBHAABHAOBOuterClass.PNBHAABHAOB) obj;

      if (lNEKOFLFAEI_ != other.lNEKOFLFAEI_) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + LNEKOFLFAEI_FIELD_NUMBER;
      hash = (53 * hash) + lNEKOFLFAEI_;
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.PNBHAABHAOBOuterClass.PNBHAABHAOB parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.PNBHAABHAOBOuterClass.PNBHAABHAOB parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PNBHAABHAOBOuterClass.PNBHAABHAOB parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.PNBHAABHAOBOuterClass.PNBHAABHAOB parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PNBHAABHAOBOuterClass.PNBHAABHAOB parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.PNBHAABHAOBOuterClass.PNBHAABHAOB parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PNBHAABHAOBOuterClass.PNBHAABHAOB parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.PNBHAABHAOBOuterClass.PNBHAABHAOB parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PNBHAABHAOBOuterClass.PNBHAABHAOB parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.PNBHAABHAOBOuterClass.PNBHAABHAOB parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PNBHAABHAOBOuterClass.PNBHAABHAOB parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.PNBHAABHAOBOuterClass.PNBHAABHAOB parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.PNBHAABHAOBOuterClass.PNBHAABHAOB prototype) {
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
     * <pre>
     * CmdId: 29414
     * </pre>
     *
     * Protobuf type {@code PNBHAABHAOB}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:PNBHAABHAOB)
        emu.grasscutter.net.proto.PNBHAABHAOBOuterClass.PNBHAABHAOBOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.PNBHAABHAOBOuterClass.internal_static_PNBHAABHAOB_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.PNBHAABHAOBOuterClass.internal_static_PNBHAABHAOB_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.PNBHAABHAOBOuterClass.PNBHAABHAOB.class, emu.grasscutter.net.proto.PNBHAABHAOBOuterClass.PNBHAABHAOB.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.PNBHAABHAOBOuterClass.PNBHAABHAOB.newBuilder()
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
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        lNEKOFLFAEI_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.PNBHAABHAOBOuterClass.internal_static_PNBHAABHAOB_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.PNBHAABHAOBOuterClass.PNBHAABHAOB getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.PNBHAABHAOBOuterClass.PNBHAABHAOB.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.PNBHAABHAOBOuterClass.PNBHAABHAOB build() {
        emu.grasscutter.net.proto.PNBHAABHAOBOuterClass.PNBHAABHAOB result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.PNBHAABHAOBOuterClass.PNBHAABHAOB buildPartial() {
        emu.grasscutter.net.proto.PNBHAABHAOBOuterClass.PNBHAABHAOB result = new emu.grasscutter.net.proto.PNBHAABHAOBOuterClass.PNBHAABHAOB(this);
        result.lNEKOFLFAEI_ = lNEKOFLFAEI_;
        onBuilt();
        return result;
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
        if (other instanceof emu.grasscutter.net.proto.PNBHAABHAOBOuterClass.PNBHAABHAOB) {
          return mergeFrom((emu.grasscutter.net.proto.PNBHAABHAOBOuterClass.PNBHAABHAOB)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.PNBHAABHAOBOuterClass.PNBHAABHAOB other) {
        if (other == emu.grasscutter.net.proto.PNBHAABHAOBOuterClass.PNBHAABHAOB.getDefaultInstance()) return this;
        if (other.lNEKOFLFAEI_ != 0) {
          setLNEKOFLFAEIValue(other.getLNEKOFLFAEIValue());
        }
        this.mergeUnknownFields(other.unknownFields);
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
        emu.grasscutter.net.proto.PNBHAABHAOBOuterClass.PNBHAABHAOB parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.PNBHAABHAOBOuterClass.PNBHAABHAOB) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int lNEKOFLFAEI_ = 0;
      /**
       * <code>.PNBHAABHAOB.IPEHLOGADMC LNEKOFLFAEI = 13;</code>
       * @return The enum numeric value on the wire for lNEKOFLFAEI.
       */
      @java.lang.Override public int getLNEKOFLFAEIValue() {
        return lNEKOFLFAEI_;
      }
      /**
       * <code>.PNBHAABHAOB.IPEHLOGADMC LNEKOFLFAEI = 13;</code>
       * @param value The enum numeric value on the wire for lNEKOFLFAEI to set.
       * @return This builder for chaining.
       */
      public Builder setLNEKOFLFAEIValue(int value) {
        
        lNEKOFLFAEI_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.PNBHAABHAOB.IPEHLOGADMC LNEKOFLFAEI = 13;</code>
       * @return The lNEKOFLFAEI.
       */
      @java.lang.Override
      public emu.grasscutter.net.proto.PNBHAABHAOBOuterClass.PNBHAABHAOB.IPEHLOGADMC getLNEKOFLFAEI() {
        @SuppressWarnings("deprecation")
        emu.grasscutter.net.proto.PNBHAABHAOBOuterClass.PNBHAABHAOB.IPEHLOGADMC result = emu.grasscutter.net.proto.PNBHAABHAOBOuterClass.PNBHAABHAOB.IPEHLOGADMC.valueOf(lNEKOFLFAEI_);
        return result == null ? emu.grasscutter.net.proto.PNBHAABHAOBOuterClass.PNBHAABHAOB.IPEHLOGADMC.UNRECOGNIZED : result;
      }
      /**
       * <code>.PNBHAABHAOB.IPEHLOGADMC LNEKOFLFAEI = 13;</code>
       * @param value The lNEKOFLFAEI to set.
       * @return This builder for chaining.
       */
      public Builder setLNEKOFLFAEI(emu.grasscutter.net.proto.PNBHAABHAOBOuterClass.PNBHAABHAOB.IPEHLOGADMC value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        lNEKOFLFAEI_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.PNBHAABHAOB.IPEHLOGADMC LNEKOFLFAEI = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearLNEKOFLFAEI() {
        
        lNEKOFLFAEI_ = 0;
        onChanged();
        return this;
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


      // @@protoc_insertion_point(builder_scope:PNBHAABHAOB)
    }

    // @@protoc_insertion_point(class_scope:PNBHAABHAOB)
    private static final emu.grasscutter.net.proto.PNBHAABHAOBOuterClass.PNBHAABHAOB DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.PNBHAABHAOBOuterClass.PNBHAABHAOB();
    }

    public static emu.grasscutter.net.proto.PNBHAABHAOBOuterClass.PNBHAABHAOB getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<PNBHAABHAOB>
        PARSER = new com.google.protobuf.AbstractParser<PNBHAABHAOB>() {
      @java.lang.Override
      public PNBHAABHAOB parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new PNBHAABHAOB(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<PNBHAABHAOB> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<PNBHAABHAOB> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.PNBHAABHAOBOuterClass.PNBHAABHAOB getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PNBHAABHAOB_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_PNBHAABHAOB_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021PNBHAABHAOB.proto\"\215\001\n\013PNBHAABHAOB\022-\n\013L" +
      "NEKOFLFAEI\030\r \001(\0162\030.PNBHAABHAOB.IPEHLOGAD" +
      "MC\"O\n\013IPEHLOGADMC\022\033\n\027HPKGGDFBHPI_GcgHint" +
      "None\020\000\022#\n\037HPKGGDFBHPI_GcgHintGameNotFoun" +
      "d\020\001B\033\n\031emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_PNBHAABHAOB_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_PNBHAABHAOB_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_PNBHAABHAOB_descriptor,
        new java.lang.String[] { "LNEKOFLFAEI", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}