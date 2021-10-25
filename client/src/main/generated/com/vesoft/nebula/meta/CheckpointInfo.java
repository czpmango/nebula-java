/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.vesoft.nebula.meta;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;
import java.util.Collections;
import java.util.BitSet;
import java.util.Arrays;
import com.facebook.thrift.*;
import com.facebook.thrift.annotations.*;
import com.facebook.thrift.async.*;
import com.facebook.thrift.meta_data.*;
import com.facebook.thrift.server.*;
import com.facebook.thrift.transport.*;
import com.facebook.thrift.protocol.*;

@SuppressWarnings({ "unused", "serial" })
public class CheckpointInfo implements TBase, java.io.Serializable, Cloneable, Comparable<CheckpointInfo> {
  private static final TStruct STRUCT_DESC = new TStruct("CheckpointInfo");
  private static final TField HOST_FIELD_DESC = new TField("host", TType.STRUCT, (short)1);
  private static final TField CHECKPOINT_DIR_FIELD_DESC = new TField("checkpoint_dir", TType.STRING, (short)2);

  public com.vesoft.nebula.HostAddr host;
  public byte[] checkpoint_dir;
  public static final int HOST = 1;
  public static final int CHECKPOINT_DIR = 2;

  // isset id assignments

  public static final Map<Integer, FieldMetaData> metaDataMap;

  static {
    Map<Integer, FieldMetaData> tmpMetaDataMap = new HashMap<Integer, FieldMetaData>();
    tmpMetaDataMap.put(HOST, new FieldMetaData("host", TFieldRequirementType.DEFAULT, 
        new StructMetaData(TType.STRUCT, com.vesoft.nebula.HostAddr.class)));
    tmpMetaDataMap.put(CHECKPOINT_DIR, new FieldMetaData("checkpoint_dir", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMetaDataMap);
  }

  static {
    FieldMetaData.addStructMetaDataMap(CheckpointInfo.class, metaDataMap);
  }

  public CheckpointInfo() {
  }

  public CheckpointInfo(
      com.vesoft.nebula.HostAddr host,
      byte[] checkpoint_dir) {
    this();
    this.host = host;
    this.checkpoint_dir = checkpoint_dir;
  }

  public static class Builder {
    private com.vesoft.nebula.HostAddr host;
    private byte[] checkpoint_dir;

    public Builder() {
    }

    public Builder setHost(final com.vesoft.nebula.HostAddr host) {
      this.host = host;
      return this;
    }

    public Builder setCheckpoint_dir(final byte[] checkpoint_dir) {
      this.checkpoint_dir = checkpoint_dir;
      return this;
    }

    public CheckpointInfo build() {
      CheckpointInfo result = new CheckpointInfo();
      result.setHost(this.host);
      result.setCheckpoint_dir(this.checkpoint_dir);
      return result;
    }
  }

  public static Builder builder() {
    return new Builder();
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public CheckpointInfo(CheckpointInfo other) {
    if (other.isSetHost()) {
      this.host = TBaseHelper.deepCopy(other.host);
    }
    if (other.isSetCheckpoint_dir()) {
      this.checkpoint_dir = TBaseHelper.deepCopy(other.checkpoint_dir);
    }
  }

  public CheckpointInfo deepCopy() {
    return new CheckpointInfo(this);
  }

  public com.vesoft.nebula.HostAddr getHost() {
    return this.host;
  }

  public CheckpointInfo setHost(com.vesoft.nebula.HostAddr host) {
    this.host = host;
    return this;
  }

  public void unsetHost() {
    this.host = null;
  }

  // Returns true if field host is set (has been assigned a value) and false otherwise
  public boolean isSetHost() {
    return this.host != null;
  }

  public void setHostIsSet(boolean __value) {
    if (!__value) {
      this.host = null;
    }
  }

  public byte[] getCheckpoint_dir() {
    return this.checkpoint_dir;
  }

  public CheckpointInfo setCheckpoint_dir(byte[] checkpoint_dir) {
    this.checkpoint_dir = checkpoint_dir;
    return this;
  }

  public void unsetCheckpoint_dir() {
    this.checkpoint_dir = null;
  }

  // Returns true if field checkpoint_dir is set (has been assigned a value) and false otherwise
  public boolean isSetCheckpoint_dir() {
    return this.checkpoint_dir != null;
  }

  public void setCheckpoint_dirIsSet(boolean __value) {
    if (!__value) {
      this.checkpoint_dir = null;
    }
  }

  public void setFieldValue(int fieldID, Object __value) {
    switch (fieldID) {
    case HOST:
      if (__value == null) {
        unsetHost();
      } else {
        setHost((com.vesoft.nebula.HostAddr)__value);
      }
      break;

    case CHECKPOINT_DIR:
      if (__value == null) {
        unsetCheckpoint_dir();
      } else {
        setCheckpoint_dir((byte[])__value);
      }
      break;

    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  public Object getFieldValue(int fieldID) {
    switch (fieldID) {
    case HOST:
      return getHost();

    case CHECKPOINT_DIR:
      return getCheckpoint_dir();

    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  @Override
  public boolean equals(Object _that) {
    if (_that == null)
      return false;
    if (this == _that)
      return true;
    if (!(_that instanceof CheckpointInfo))
      return false;
    CheckpointInfo that = (CheckpointInfo)_that;

    if (!TBaseHelper.equalsNobinary(this.isSetHost(), that.isSetHost(), this.host, that.host)) { return false; }

    if (!TBaseHelper.equalsSlow(this.isSetCheckpoint_dir(), that.isSetCheckpoint_dir(), this.checkpoint_dir, that.checkpoint_dir)) { return false; }

    return true;
  }

  @Override
  public int hashCode() {
    return Arrays.deepHashCode(new Object[] {host, checkpoint_dir});
  }

  @Override
  public int compareTo(CheckpointInfo other) {
    if (other == null) {
      // See java.lang.Comparable docs
      throw new NullPointerException();
    }

    if (other == this) {
      return 0;
    }
    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetHost()).compareTo(other.isSetHost());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(host, other.host);
    if (lastComparison != 0) { 
      return lastComparison;
    }
    lastComparison = Boolean.valueOf(isSetCheckpoint_dir()).compareTo(other.isSetCheckpoint_dir());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(checkpoint_dir, other.checkpoint_dir);
    if (lastComparison != 0) { 
      return lastComparison;
    }
    return 0;
  }

  public void read(TProtocol iprot) throws TException {
    TField __field;
    iprot.readStructBegin(metaDataMap);
    while (true)
    {
      __field = iprot.readFieldBegin();
      if (__field.type == TType.STOP) { 
        break;
      }
      switch (__field.id)
      {
        case HOST:
          if (__field.type == TType.STRUCT) {
            this.host = new com.vesoft.nebula.HostAddr();
            this.host.read(iprot);
          } else { 
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        case CHECKPOINT_DIR:
          if (__field.type == TType.STRING) {
            this.checkpoint_dir = iprot.readBinary();
          } else { 
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        default:
          TProtocolUtil.skip(iprot, __field.type);
          break;
      }
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();


    // check for required fields of primitive type, which can't be checked in the validate method
    validate();
  }

  public void write(TProtocol oprot) throws TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    if (this.host != null) {
      oprot.writeFieldBegin(HOST_FIELD_DESC);
      this.host.write(oprot);
      oprot.writeFieldEnd();
    }
    if (this.checkpoint_dir != null) {
      oprot.writeFieldBegin(CHECKPOINT_DIR_FIELD_DESC);
      oprot.writeBinary(this.checkpoint_dir);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    return toString(1, true);
  }

  @Override
  public String toString(int indent, boolean prettyPrint) {
    String indentStr = prettyPrint ? TBaseHelper.getIndentedString(indent) : "";
    String newLine = prettyPrint ? "\n" : "";
    String space = prettyPrint ? " " : "";
    StringBuilder sb = new StringBuilder("CheckpointInfo");
    sb.append(space);
    sb.append("(");
    sb.append(newLine);
    boolean first = true;

    sb.append(indentStr);
    sb.append("host");
    sb.append(space);
    sb.append(":").append(space);
    if (this.getHost() == null) {
      sb.append("null");
    } else {
      sb.append(TBaseHelper.toString(this.getHost(), indent + 1, prettyPrint));
    }
    first = false;
    if (!first) sb.append("," + newLine);
    sb.append(indentStr);
    sb.append("checkpoint_dir");
    sb.append(space);
    sb.append(":").append(space);
    if (this.getCheckpoint_dir() == null) {
      sb.append("null");
    } else {
        int __checkpoint_dir_size = Math.min(this.getCheckpoint_dir().length, 128);
        for (int i = 0; i < __checkpoint_dir_size; i++) {
          if (i != 0) sb.append(" ");
          sb.append(Integer.toHexString(this.getCheckpoint_dir()[i]).length() > 1 ? Integer.toHexString(this.getCheckpoint_dir()[i]).substring(Integer.toHexString(this.getCheckpoint_dir()[i]).length() - 2).toUpperCase() : "0" + Integer.toHexString(this.getCheckpoint_dir()[i]).toUpperCase());
        }
        if (this.getCheckpoint_dir().length > 128) sb.append(" ...");
    }
    first = false;
    sb.append(newLine + TBaseHelper.reduceIndent(indentStr));
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
  }

}
