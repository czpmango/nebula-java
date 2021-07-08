/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.vesoft.nebula.storage;

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
public class KVGetResponse implements TBase, java.io.Serializable, Cloneable, Comparable<KVGetResponse> {
  private static final TStruct STRUCT_DESC = new TStruct("KVGetResponse");
  private static final TField RESULT_FIELD_DESC = new TField("result", TType.STRUCT, (short)1);
  private static final TField KEY_VALUES_FIELD_DESC = new TField("key_values", TType.MAP, (short)2);

  public ResponseCommon result;
  public Map<byte[],byte[]> key_values;
  public static final int RESULT = 1;
  public static final int KEY_VALUES = 2;

  // isset id assignments

  public static final Map<Integer, FieldMetaData> metaDataMap;

  static {
    Map<Integer, FieldMetaData> tmpMetaDataMap = new HashMap<Integer, FieldMetaData>();
    tmpMetaDataMap.put(RESULT, new FieldMetaData("result", TFieldRequirementType.REQUIRED, 
        new StructMetaData(TType.STRUCT, ResponseCommon.class)));
    tmpMetaDataMap.put(KEY_VALUES, new FieldMetaData("key_values", TFieldRequirementType.DEFAULT, 
        new MapMetaData(TType.MAP, 
            new FieldValueMetaData(TType.STRING), 
            new FieldValueMetaData(TType.STRING))));
    metaDataMap = Collections.unmodifiableMap(tmpMetaDataMap);
  }

  static {
    FieldMetaData.addStructMetaDataMap(KVGetResponse.class, metaDataMap);
  }

  public KVGetResponse() {
  }

  public KVGetResponse(
      ResponseCommon result) {
    this();
    this.result = result;
  }

  public KVGetResponse(
      ResponseCommon result,
      Map<byte[],byte[]> key_values) {
    this();
    this.result = result;
    this.key_values = key_values;
  }

  public static class Builder {
    private ResponseCommon result;
    private Map<byte[],byte[]> key_values;

    public Builder() {
    }

    public Builder setResult(final ResponseCommon result) {
      this.result = result;
      return this;
    }

    public Builder setKey_values(final Map<byte[],byte[]> key_values) {
      this.key_values = key_values;
      return this;
    }

    public KVGetResponse build() {
      KVGetResponse result = new KVGetResponse();
      result.setResult(this.result);
      result.setKey_values(this.key_values);
      return result;
    }
  }

  public static Builder builder() {
    return new Builder();
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public KVGetResponse(KVGetResponse other) {
    if (other.isSetResult()) {
      this.result = TBaseHelper.deepCopy(other.result);
    }
    if (other.isSetKey_values()) {
      this.key_values = TBaseHelper.deepCopy(other.key_values);
    }
  }

  public KVGetResponse deepCopy() {
    return new KVGetResponse(this);
  }

  public ResponseCommon getResult() {
    return this.result;
  }

  public KVGetResponse setResult(ResponseCommon result) {
    this.result = result;
    return this;
  }

  public void unsetResult() {
    this.result = null;
  }

  // Returns true if field result is set (has been assigned a value) and false otherwise
  public boolean isSetResult() {
    return this.result != null;
  }

  public void setResultIsSet(boolean __value) {
    if (!__value) {
      this.result = null;
    }
  }

  public Map<byte[],byte[]> getKey_values() {
    return this.key_values;
  }

  public KVGetResponse setKey_values(Map<byte[],byte[]> key_values) {
    this.key_values = key_values;
    return this;
  }

  public void unsetKey_values() {
    this.key_values = null;
  }

  // Returns true if field key_values is set (has been assigned a value) and false otherwise
  public boolean isSetKey_values() {
    return this.key_values != null;
  }

  public void setKey_valuesIsSet(boolean __value) {
    if (!__value) {
      this.key_values = null;
    }
  }

  @SuppressWarnings("unchecked")
  public void setFieldValue(int fieldID, Object __value) {
    switch (fieldID) {
    case RESULT:
      if (__value == null) {
        unsetResult();
      } else {
        setResult((ResponseCommon)__value);
      }
      break;

    case KEY_VALUES:
      if (__value == null) {
        unsetKey_values();
      } else {
        setKey_values((Map<byte[],byte[]>)__value);
      }
      break;

    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  public Object getFieldValue(int fieldID) {
    switch (fieldID) {
    case RESULT:
      return getResult();

    case KEY_VALUES:
      return getKey_values();

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
    if (!(_that instanceof KVGetResponse))
      return false;
    KVGetResponse that = (KVGetResponse)_that;

    if (!TBaseHelper.equalsNobinary(this.isSetResult(), that.isSetResult(), this.result, that.result)) { return false; }

    if (!TBaseHelper.equalsSlow(this.isSetKey_values(), that.isSetKey_values(), this.key_values, that.key_values)) { return false; }

    return true;
  }

  @Override
  public int hashCode() {
    return Arrays.deepHashCode(new Object[] {result, key_values});
  }

  @Override
  public int compareTo(KVGetResponse other) {
    if (other == null) {
      // See java.lang.Comparable docs
      throw new NullPointerException();
    }

    if (other == this) {
      return 0;
    }
    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetResult()).compareTo(other.isSetResult());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(result, other.result);
    if (lastComparison != 0) { 
      return lastComparison;
    }
    lastComparison = Boolean.valueOf(isSetKey_values()).compareTo(other.isSetKey_values());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(key_values, other.key_values);
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
        case RESULT:
          if (__field.type == TType.STRUCT) {
            this.result = new ResponseCommon();
            this.result.read(iprot);
          } else { 
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        case KEY_VALUES:
          if (__field.type == TType.MAP) {
            {
              TMap _map213 = iprot.readMapBegin();
              this.key_values = new HashMap<byte[],byte[]>(Math.max(0, 2*_map213.size));
              for (int _i214 = 0; 
                   (_map213.size < 0) ? iprot.peekMap() : (_i214 < _map213.size); 
                   ++_i214)
              {
                byte[] _key215;
                byte[] _val216;
                _key215 = iprot.readBinary();
                _val216 = iprot.readBinary();
                this.key_values.put(_key215, _val216);
              }
              iprot.readMapEnd();
            }
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
    if (this.result != null) {
      oprot.writeFieldBegin(RESULT_FIELD_DESC);
      this.result.write(oprot);
      oprot.writeFieldEnd();
    }
    if (this.key_values != null) {
      oprot.writeFieldBegin(KEY_VALUES_FIELD_DESC);
      {
        oprot.writeMapBegin(new TMap(TType.STRING, TType.STRING, this.key_values.size()));
        for (Map.Entry<byte[], byte[]> _iter217 : this.key_values.entrySet())        {
          oprot.writeBinary(_iter217.getKey());
          oprot.writeBinary(_iter217.getValue());
        }
        oprot.writeMapEnd();
      }
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
    StringBuilder sb = new StringBuilder("KVGetResponse");
    sb.append(space);
    sb.append("(");
    sb.append(newLine);
    boolean first = true;

    sb.append(indentStr);
    sb.append("result");
    sb.append(space);
    sb.append(":").append(space);
    if (this.getResult() == null) {
      sb.append("null");
    } else {
      sb.append(TBaseHelper.toString(this.getResult(), indent + 1, prettyPrint));
    }
    first = false;
    if (!first) sb.append("," + newLine);
    sb.append(indentStr);
    sb.append("key_values");
    sb.append(space);
    sb.append(":").append(space);
    if (this.getKey_values() == null) {
      sb.append("null");
    } else {
      sb.append(TBaseHelper.toString(this.getKey_values(), indent + 1, prettyPrint));
    }
    first = false;
    sb.append(newLine + TBaseHelper.reduceIndent(indentStr));
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
    if (result == null) {
      throw new TProtocolException(TProtocolException.MISSING_REQUIRED_FIELD, "Required field 'result' was not present! Struct: " + toString());
    }
  }

}
