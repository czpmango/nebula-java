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
public class StatsItem implements TBase, java.io.Serializable, Cloneable, Comparable<StatsItem> {
  private static final TStruct STRUCT_DESC = new TStruct("StatsItem");
  private static final TField TAG_VERTICES_FIELD_DESC = new TField("tag_vertices", TType.MAP, (short)1);
  private static final TField EDGES_FIELD_DESC = new TField("edges", TType.MAP, (short)2);
  private static final TField SPACE_VERTICES_FIELD_DESC = new TField("space_vertices", TType.I64, (short)3);
  private static final TField SPACE_EDGES_FIELD_DESC = new TField("space_edges", TType.I64, (short)4);
  private static final TField POSITIVE_PART_CORRELATIVITY_FIELD_DESC = new TField("positive_part_correlativity", TType.MAP, (short)5);
  private static final TField NEGATIVE_PART_CORRELATIVITY_FIELD_DESC = new TField("negative_part_correlativity", TType.MAP, (short)6);
  private static final TField STATUS_FIELD_DESC = new TField("status", TType.I32, (short)7);

  public Map<byte[],Long> tag_vertices;
  public Map<byte[],Long> edges;
  public long space_vertices;
  public long space_edges;
  public Map<Integer,List<Correlativity>> positive_part_correlativity;
  public Map<Integer,List<Correlativity>> negative_part_correlativity;
  /**
   * 
   * @see JobStatus
   */
  public JobStatus status;
  public static final int TAG_VERTICES = 1;
  public static final int EDGES = 2;
  public static final int SPACE_VERTICES = 3;
  public static final int SPACE_EDGES = 4;
  public static final int POSITIVE_PART_CORRELATIVITY = 5;
  public static final int NEGATIVE_PART_CORRELATIVITY = 6;
  public static final int STATUS = 7;

  // isset id assignments
  private static final int __SPACE_VERTICES_ISSET_ID = 0;
  private static final int __SPACE_EDGES_ISSET_ID = 1;
  private BitSet __isset_bit_vector = new BitSet(2);

  public static final Map<Integer, FieldMetaData> metaDataMap;

  static {
    Map<Integer, FieldMetaData> tmpMetaDataMap = new HashMap<Integer, FieldMetaData>();
    tmpMetaDataMap.put(TAG_VERTICES, new FieldMetaData("tag_vertices", TFieldRequirementType.DEFAULT, 
        new MapMetaData(TType.MAP, 
            new FieldValueMetaData(TType.STRING), 
            new FieldValueMetaData(TType.I64))));
    tmpMetaDataMap.put(EDGES, new FieldMetaData("edges", TFieldRequirementType.DEFAULT, 
        new MapMetaData(TType.MAP, 
            new FieldValueMetaData(TType.STRING), 
            new FieldValueMetaData(TType.I64))));
    tmpMetaDataMap.put(SPACE_VERTICES, new FieldMetaData("space_vertices", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.I64)));
    tmpMetaDataMap.put(SPACE_EDGES, new FieldMetaData("space_edges", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.I64)));
    tmpMetaDataMap.put(POSITIVE_PART_CORRELATIVITY, new FieldMetaData("positive_part_correlativity", TFieldRequirementType.DEFAULT, 
        new MapMetaData(TType.MAP, 
            new FieldValueMetaData(TType.I32), 
            new ListMetaData(TType.LIST, 
                new StructMetaData(TType.STRUCT, Correlativity.class)))));
    tmpMetaDataMap.put(NEGATIVE_PART_CORRELATIVITY, new FieldMetaData("negative_part_correlativity", TFieldRequirementType.DEFAULT, 
        new MapMetaData(TType.MAP, 
            new FieldValueMetaData(TType.I32), 
            new ListMetaData(TType.LIST, 
                new StructMetaData(TType.STRUCT, Correlativity.class)))));
    tmpMetaDataMap.put(STATUS, new FieldMetaData("status", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.I32)));
    metaDataMap = Collections.unmodifiableMap(tmpMetaDataMap);
  }

  static {
    FieldMetaData.addStructMetaDataMap(StatsItem.class, metaDataMap);
  }

  public StatsItem() {
  }

  public StatsItem(
      Map<byte[],Long> tag_vertices,
      Map<byte[],Long> edges,
      long space_vertices,
      long space_edges,
      Map<Integer,List<Correlativity>> positive_part_correlativity,
      Map<Integer,List<Correlativity>> negative_part_correlativity,
      JobStatus status) {
    this();
    this.tag_vertices = tag_vertices;
    this.edges = edges;
    this.space_vertices = space_vertices;
    setSpace_verticesIsSet(true);
    this.space_edges = space_edges;
    setSpace_edgesIsSet(true);
    this.positive_part_correlativity = positive_part_correlativity;
    this.negative_part_correlativity = negative_part_correlativity;
    this.status = status;
  }

  public static class Builder {
    private Map<byte[],Long> tag_vertices;
    private Map<byte[],Long> edges;
    private long space_vertices;
    private long space_edges;
    private Map<Integer,List<Correlativity>> positive_part_correlativity;
    private Map<Integer,List<Correlativity>> negative_part_correlativity;
    private JobStatus status;

    BitSet __optional_isset = new BitSet(2);

    public Builder() {
    }

    public Builder setTag_vertices(final Map<byte[],Long> tag_vertices) {
      this.tag_vertices = tag_vertices;
      return this;
    }

    public Builder setEdges(final Map<byte[],Long> edges) {
      this.edges = edges;
      return this;
    }

    public Builder setSpace_vertices(final long space_vertices) {
      this.space_vertices = space_vertices;
      __optional_isset.set(__SPACE_VERTICES_ISSET_ID, true);
      return this;
    }

    public Builder setSpace_edges(final long space_edges) {
      this.space_edges = space_edges;
      __optional_isset.set(__SPACE_EDGES_ISSET_ID, true);
      return this;
    }

    public Builder setPositive_part_correlativity(final Map<Integer,List<Correlativity>> positive_part_correlativity) {
      this.positive_part_correlativity = positive_part_correlativity;
      return this;
    }

    public Builder setNegative_part_correlativity(final Map<Integer,List<Correlativity>> negative_part_correlativity) {
      this.negative_part_correlativity = negative_part_correlativity;
      return this;
    }

    public Builder setStatus(final JobStatus status) {
      this.status = status;
      return this;
    }

    public StatsItem build() {
      StatsItem result = new StatsItem();
      result.setTag_vertices(this.tag_vertices);
      result.setEdges(this.edges);
      if (__optional_isset.get(__SPACE_VERTICES_ISSET_ID)) {
        result.setSpace_vertices(this.space_vertices);
      }
      if (__optional_isset.get(__SPACE_EDGES_ISSET_ID)) {
        result.setSpace_edges(this.space_edges);
      }
      result.setPositive_part_correlativity(this.positive_part_correlativity);
      result.setNegative_part_correlativity(this.negative_part_correlativity);
      result.setStatus(this.status);
      return result;
    }
  }

  public static Builder builder() {
    return new Builder();
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public StatsItem(StatsItem other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    if (other.isSetTag_vertices()) {
      this.tag_vertices = TBaseHelper.deepCopy(other.tag_vertices);
    }
    if (other.isSetEdges()) {
      this.edges = TBaseHelper.deepCopy(other.edges);
    }
    this.space_vertices = TBaseHelper.deepCopy(other.space_vertices);
    this.space_edges = TBaseHelper.deepCopy(other.space_edges);
    if (other.isSetPositive_part_correlativity()) {
      this.positive_part_correlativity = TBaseHelper.deepCopy(other.positive_part_correlativity);
    }
    if (other.isSetNegative_part_correlativity()) {
      this.negative_part_correlativity = TBaseHelper.deepCopy(other.negative_part_correlativity);
    }
    if (other.isSetStatus()) {
      this.status = TBaseHelper.deepCopy(other.status);
    }
  }

  public StatsItem deepCopy() {
    return new StatsItem(this);
  }

  public Map<byte[],Long> getTag_vertices() {
    return this.tag_vertices;
  }

  public StatsItem setTag_vertices(Map<byte[],Long> tag_vertices) {
    this.tag_vertices = tag_vertices;
    return this;
  }

  public void unsetTag_vertices() {
    this.tag_vertices = null;
  }

  // Returns true if field tag_vertices is set (has been assigned a value) and false otherwise
  public boolean isSetTag_vertices() {
    return this.tag_vertices != null;
  }

  public void setTag_verticesIsSet(boolean __value) {
    if (!__value) {
      this.tag_vertices = null;
    }
  }

  public Map<byte[],Long> getEdges() {
    return this.edges;
  }

  public StatsItem setEdges(Map<byte[],Long> edges) {
    this.edges = edges;
    return this;
  }

  public void unsetEdges() {
    this.edges = null;
  }

  // Returns true if field edges is set (has been assigned a value) and false otherwise
  public boolean isSetEdges() {
    return this.edges != null;
  }

  public void setEdgesIsSet(boolean __value) {
    if (!__value) {
      this.edges = null;
    }
  }

  public long getSpace_vertices() {
    return this.space_vertices;
  }

  public StatsItem setSpace_vertices(long space_vertices) {
    this.space_vertices = space_vertices;
    setSpace_verticesIsSet(true);
    return this;
  }

  public void unsetSpace_vertices() {
    __isset_bit_vector.clear(__SPACE_VERTICES_ISSET_ID);
  }

  // Returns true if field space_vertices is set (has been assigned a value) and false otherwise
  public boolean isSetSpace_vertices() {
    return __isset_bit_vector.get(__SPACE_VERTICES_ISSET_ID);
  }

  public void setSpace_verticesIsSet(boolean __value) {
    __isset_bit_vector.set(__SPACE_VERTICES_ISSET_ID, __value);
  }

  public long getSpace_edges() {
    return this.space_edges;
  }

  public StatsItem setSpace_edges(long space_edges) {
    this.space_edges = space_edges;
    setSpace_edgesIsSet(true);
    return this;
  }

  public void unsetSpace_edges() {
    __isset_bit_vector.clear(__SPACE_EDGES_ISSET_ID);
  }

  // Returns true if field space_edges is set (has been assigned a value) and false otherwise
  public boolean isSetSpace_edges() {
    return __isset_bit_vector.get(__SPACE_EDGES_ISSET_ID);
  }

  public void setSpace_edgesIsSet(boolean __value) {
    __isset_bit_vector.set(__SPACE_EDGES_ISSET_ID, __value);
  }

  public Map<Integer,List<Correlativity>> getPositive_part_correlativity() {
    return this.positive_part_correlativity;
  }

  public StatsItem setPositive_part_correlativity(Map<Integer,List<Correlativity>> positive_part_correlativity) {
    this.positive_part_correlativity = positive_part_correlativity;
    return this;
  }

  public void unsetPositive_part_correlativity() {
    this.positive_part_correlativity = null;
  }

  // Returns true if field positive_part_correlativity is set (has been assigned a value) and false otherwise
  public boolean isSetPositive_part_correlativity() {
    return this.positive_part_correlativity != null;
  }

  public void setPositive_part_correlativityIsSet(boolean __value) {
    if (!__value) {
      this.positive_part_correlativity = null;
    }
  }

  public Map<Integer,List<Correlativity>> getNegative_part_correlativity() {
    return this.negative_part_correlativity;
  }

  public StatsItem setNegative_part_correlativity(Map<Integer,List<Correlativity>> negative_part_correlativity) {
    this.negative_part_correlativity = negative_part_correlativity;
    return this;
  }

  public void unsetNegative_part_correlativity() {
    this.negative_part_correlativity = null;
  }

  // Returns true if field negative_part_correlativity is set (has been assigned a value) and false otherwise
  public boolean isSetNegative_part_correlativity() {
    return this.negative_part_correlativity != null;
  }

  public void setNegative_part_correlativityIsSet(boolean __value) {
    if (!__value) {
      this.negative_part_correlativity = null;
    }
  }

  /**
   * 
   * @see JobStatus
   */
  public JobStatus getStatus() {
    return this.status;
  }

  /**
   * 
   * @see JobStatus
   */
  public StatsItem setStatus(JobStatus status) {
    this.status = status;
    return this;
  }

  public void unsetStatus() {
    this.status = null;
  }

  // Returns true if field status is set (has been assigned a value) and false otherwise
  public boolean isSetStatus() {
    return this.status != null;
  }

  public void setStatusIsSet(boolean __value) {
    if (!__value) {
      this.status = null;
    }
  }

  @SuppressWarnings("unchecked")
  public void setFieldValue(int fieldID, Object __value) {
    switch (fieldID) {
    case TAG_VERTICES:
      if (__value == null) {
        unsetTag_vertices();
      } else {
        setTag_vertices((Map<byte[],Long>)__value);
      }
      break;

    case EDGES:
      if (__value == null) {
        unsetEdges();
      } else {
        setEdges((Map<byte[],Long>)__value);
      }
      break;

    case SPACE_VERTICES:
      if (__value == null) {
        unsetSpace_vertices();
      } else {
        setSpace_vertices((Long)__value);
      }
      break;

    case SPACE_EDGES:
      if (__value == null) {
        unsetSpace_edges();
      } else {
        setSpace_edges((Long)__value);
      }
      break;

    case POSITIVE_PART_CORRELATIVITY:
      if (__value == null) {
        unsetPositive_part_correlativity();
      } else {
        setPositive_part_correlativity((Map<Integer,List<Correlativity>>)__value);
      }
      break;

    case NEGATIVE_PART_CORRELATIVITY:
      if (__value == null) {
        unsetNegative_part_correlativity();
      } else {
        setNegative_part_correlativity((Map<Integer,List<Correlativity>>)__value);
      }
      break;

    case STATUS:
      if (__value == null) {
        unsetStatus();
      } else {
        setStatus((JobStatus)__value);
      }
      break;

    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  public Object getFieldValue(int fieldID) {
    switch (fieldID) {
    case TAG_VERTICES:
      return getTag_vertices();

    case EDGES:
      return getEdges();

    case SPACE_VERTICES:
      return new Long(getSpace_vertices());

    case SPACE_EDGES:
      return new Long(getSpace_edges());

    case POSITIVE_PART_CORRELATIVITY:
      return getPositive_part_correlativity();

    case NEGATIVE_PART_CORRELATIVITY:
      return getNegative_part_correlativity();

    case STATUS:
      return getStatus();

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
    if (!(_that instanceof StatsItem))
      return false;
    StatsItem that = (StatsItem)_that;

    if (!TBaseHelper.equalsSlow(this.isSetTag_vertices(), that.isSetTag_vertices(), this.tag_vertices, that.tag_vertices)) { return false; }

    if (!TBaseHelper.equalsSlow(this.isSetEdges(), that.isSetEdges(), this.edges, that.edges)) { return false; }

    if (!TBaseHelper.equalsNobinary(this.space_vertices, that.space_vertices)) { return false; }

    if (!TBaseHelper.equalsNobinary(this.space_edges, that.space_edges)) { return false; }

    if (!TBaseHelper.equalsNobinary(this.isSetPositive_part_correlativity(), that.isSetPositive_part_correlativity(), this.positive_part_correlativity, that.positive_part_correlativity)) { return false; }

    if (!TBaseHelper.equalsNobinary(this.isSetNegative_part_correlativity(), that.isSetNegative_part_correlativity(), this.negative_part_correlativity, that.negative_part_correlativity)) { return false; }

    if (!TBaseHelper.equalsNobinary(this.isSetStatus(), that.isSetStatus(), this.status, that.status)) { return false; }

    return true;
  }

  @Override
  public int hashCode() {
    return Arrays.deepHashCode(new Object[] {tag_vertices, edges, space_vertices, space_edges, positive_part_correlativity, negative_part_correlativity, status});
  }

  @Override
  public int compareTo(StatsItem other) {
    if (other == null) {
      // See java.lang.Comparable docs
      throw new NullPointerException();
    }

    if (other == this) {
      return 0;
    }
    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetTag_vertices()).compareTo(other.isSetTag_vertices());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(tag_vertices, other.tag_vertices);
    if (lastComparison != 0) { 
      return lastComparison;
    }
    lastComparison = Boolean.valueOf(isSetEdges()).compareTo(other.isSetEdges());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(edges, other.edges);
    if (lastComparison != 0) { 
      return lastComparison;
    }
    lastComparison = Boolean.valueOf(isSetSpace_vertices()).compareTo(other.isSetSpace_vertices());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(space_vertices, other.space_vertices);
    if (lastComparison != 0) { 
      return lastComparison;
    }
    lastComparison = Boolean.valueOf(isSetSpace_edges()).compareTo(other.isSetSpace_edges());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(space_edges, other.space_edges);
    if (lastComparison != 0) { 
      return lastComparison;
    }
    lastComparison = Boolean.valueOf(isSetPositive_part_correlativity()).compareTo(other.isSetPositive_part_correlativity());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(positive_part_correlativity, other.positive_part_correlativity);
    if (lastComparison != 0) { 
      return lastComparison;
    }
    lastComparison = Boolean.valueOf(isSetNegative_part_correlativity()).compareTo(other.isSetNegative_part_correlativity());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(negative_part_correlativity, other.negative_part_correlativity);
    if (lastComparison != 0) { 
      return lastComparison;
    }
    lastComparison = Boolean.valueOf(isSetStatus()).compareTo(other.isSetStatus());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(status, other.status);
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
        case TAG_VERTICES:
          if (__field.type == TType.MAP) {
            {
              TMap _map42 = iprot.readMapBegin();
              this.tag_vertices = new HashMap<byte[],Long>(Math.max(0, 2*_map42.size));
              for (int _i43 = 0; 
                   (_map42.size < 0) ? iprot.peekMap() : (_i43 < _map42.size); 
                   ++_i43)
              {
                byte[] _key44;
                long _val45;
                _key44 = iprot.readBinary();
                _val45 = iprot.readI64();
                this.tag_vertices.put(_key44, _val45);
              }
              iprot.readMapEnd();
            }
          } else { 
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        case EDGES:
          if (__field.type == TType.MAP) {
            {
              TMap _map46 = iprot.readMapBegin();
              this.edges = new HashMap<byte[],Long>(Math.max(0, 2*_map46.size));
              for (int _i47 = 0; 
                   (_map46.size < 0) ? iprot.peekMap() : (_i47 < _map46.size); 
                   ++_i47)
              {
                byte[] _key48;
                long _val49;
                _key48 = iprot.readBinary();
                _val49 = iprot.readI64();
                this.edges.put(_key48, _val49);
              }
              iprot.readMapEnd();
            }
          } else { 
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        case SPACE_VERTICES:
          if (__field.type == TType.I64) {
            this.space_vertices = iprot.readI64();
            setSpace_verticesIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        case SPACE_EDGES:
          if (__field.type == TType.I64) {
            this.space_edges = iprot.readI64();
            setSpace_edgesIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        case POSITIVE_PART_CORRELATIVITY:
          if (__field.type == TType.MAP) {
            {
              TMap _map50 = iprot.readMapBegin();
              this.positive_part_correlativity = new HashMap<Integer,List<Correlativity>>(Math.max(0, 2*_map50.size));
              for (int _i51 = 0; 
                   (_map50.size < 0) ? iprot.peekMap() : (_i51 < _map50.size); 
                   ++_i51)
              {
                int _key52;
                List<Correlativity> _val53;
                _key52 = iprot.readI32();
                {
                  TList _list54 = iprot.readListBegin();
                  _val53 = new ArrayList<Correlativity>(Math.max(0, _list54.size));
                  for (int _i55 = 0; 
                       (_list54.size < 0) ? iprot.peekList() : (_i55 < _list54.size); 
                       ++_i55)
                  {
                    Correlativity _elem56;
                    _elem56 = new Correlativity();
                    _elem56.read(iprot);
                    _val53.add(_elem56);
                  }
                  iprot.readListEnd();
                }
                this.positive_part_correlativity.put(_key52, _val53);
              }
              iprot.readMapEnd();
            }
          } else { 
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        case NEGATIVE_PART_CORRELATIVITY:
          if (__field.type == TType.MAP) {
            {
              TMap _map57 = iprot.readMapBegin();
              this.negative_part_correlativity = new HashMap<Integer,List<Correlativity>>(Math.max(0, 2*_map57.size));
              for (int _i58 = 0; 
                   (_map57.size < 0) ? iprot.peekMap() : (_i58 < _map57.size); 
                   ++_i58)
              {
                int _key59;
                List<Correlativity> _val60;
                _key59 = iprot.readI32();
                {
                  TList _list61 = iprot.readListBegin();
                  _val60 = new ArrayList<Correlativity>(Math.max(0, _list61.size));
                  for (int _i62 = 0; 
                       (_list61.size < 0) ? iprot.peekList() : (_i62 < _list61.size); 
                       ++_i62)
                  {
                    Correlativity _elem63;
                    _elem63 = new Correlativity();
                    _elem63.read(iprot);
                    _val60.add(_elem63);
                  }
                  iprot.readListEnd();
                }
                this.negative_part_correlativity.put(_key59, _val60);
              }
              iprot.readMapEnd();
            }
          } else { 
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        case STATUS:
          if (__field.type == TType.I32) {
            this.status = JobStatus.findByValue(iprot.readI32());
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
    if (this.tag_vertices != null) {
      oprot.writeFieldBegin(TAG_VERTICES_FIELD_DESC);
      {
        oprot.writeMapBegin(new TMap(TType.STRING, TType.I64, this.tag_vertices.size()));
        for (Map.Entry<byte[], Long> _iter64 : this.tag_vertices.entrySet())        {
          oprot.writeBinary(_iter64.getKey());
          oprot.writeI64(_iter64.getValue());
        }
        oprot.writeMapEnd();
      }
      oprot.writeFieldEnd();
    }
    if (this.edges != null) {
      oprot.writeFieldBegin(EDGES_FIELD_DESC);
      {
        oprot.writeMapBegin(new TMap(TType.STRING, TType.I64, this.edges.size()));
        for (Map.Entry<byte[], Long> _iter65 : this.edges.entrySet())        {
          oprot.writeBinary(_iter65.getKey());
          oprot.writeI64(_iter65.getValue());
        }
        oprot.writeMapEnd();
      }
      oprot.writeFieldEnd();
    }
    oprot.writeFieldBegin(SPACE_VERTICES_FIELD_DESC);
    oprot.writeI64(this.space_vertices);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(SPACE_EDGES_FIELD_DESC);
    oprot.writeI64(this.space_edges);
    oprot.writeFieldEnd();
    if (this.positive_part_correlativity != null) {
      oprot.writeFieldBegin(POSITIVE_PART_CORRELATIVITY_FIELD_DESC);
      {
        oprot.writeMapBegin(new TMap(TType.I32, TType.LIST, this.positive_part_correlativity.size()));
        for (Map.Entry<Integer, List<Correlativity>> _iter66 : this.positive_part_correlativity.entrySet())        {
          oprot.writeI32(_iter66.getKey());
          {
            oprot.writeListBegin(new TList(TType.STRUCT, _iter66.getValue().size()));
            for (Correlativity _iter67 : _iter66.getValue())            {
              _iter67.write(oprot);
            }
            oprot.writeListEnd();
          }
        }
        oprot.writeMapEnd();
      }
      oprot.writeFieldEnd();
    }
    if (this.negative_part_correlativity != null) {
      oprot.writeFieldBegin(NEGATIVE_PART_CORRELATIVITY_FIELD_DESC);
      {
        oprot.writeMapBegin(new TMap(TType.I32, TType.LIST, this.negative_part_correlativity.size()));
        for (Map.Entry<Integer, List<Correlativity>> _iter68 : this.negative_part_correlativity.entrySet())        {
          oprot.writeI32(_iter68.getKey());
          {
            oprot.writeListBegin(new TList(TType.STRUCT, _iter68.getValue().size()));
            for (Correlativity _iter69 : _iter68.getValue())            {
              _iter69.write(oprot);
            }
            oprot.writeListEnd();
          }
        }
        oprot.writeMapEnd();
      }
      oprot.writeFieldEnd();
    }
    if (this.status != null) {
      oprot.writeFieldBegin(STATUS_FIELD_DESC);
      oprot.writeI32(this.status == null ? 0 : this.status.getValue());
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
    StringBuilder sb = new StringBuilder("StatsItem");
    sb.append(space);
    sb.append("(");
    sb.append(newLine);
    boolean first = true;

    sb.append(indentStr);
    sb.append("tag_vertices");
    sb.append(space);
    sb.append(":").append(space);
    if (this.getTag_vertices() == null) {
      sb.append("null");
    } else {
      sb.append(TBaseHelper.toString(this.getTag_vertices(), indent + 1, prettyPrint));
    }
    first = false;
    if (!first) sb.append("," + newLine);
    sb.append(indentStr);
    sb.append("edges");
    sb.append(space);
    sb.append(":").append(space);
    if (this.getEdges() == null) {
      sb.append("null");
    } else {
      sb.append(TBaseHelper.toString(this.getEdges(), indent + 1, prettyPrint));
    }
    first = false;
    if (!first) sb.append("," + newLine);
    sb.append(indentStr);
    sb.append("space_vertices");
    sb.append(space);
    sb.append(":").append(space);
    sb.append(TBaseHelper.toString(this.getSpace_vertices(), indent + 1, prettyPrint));
    first = false;
    if (!first) sb.append("," + newLine);
    sb.append(indentStr);
    sb.append("space_edges");
    sb.append(space);
    sb.append(":").append(space);
    sb.append(TBaseHelper.toString(this.getSpace_edges(), indent + 1, prettyPrint));
    first = false;
    if (!first) sb.append("," + newLine);
    sb.append(indentStr);
    sb.append("positive_part_correlativity");
    sb.append(space);
    sb.append(":").append(space);
    if (this.getPositive_part_correlativity() == null) {
      sb.append("null");
    } else {
      sb.append(TBaseHelper.toString(this.getPositive_part_correlativity(), indent + 1, prettyPrint));
    }
    first = false;
    if (!first) sb.append("," + newLine);
    sb.append(indentStr);
    sb.append("negative_part_correlativity");
    sb.append(space);
    sb.append(":").append(space);
    if (this.getNegative_part_correlativity() == null) {
      sb.append("null");
    } else {
      sb.append(TBaseHelper.toString(this.getNegative_part_correlativity(), indent + 1, prettyPrint));
    }
    first = false;
    if (!first) sb.append("," + newLine);
    sb.append(indentStr);
    sb.append("status");
    sb.append(space);
    sb.append(":").append(space);
    if (this.getStatus() == null) {
      sb.append("null");
    } else {
      String status_name = this.getStatus() == null ? "null" : this.getStatus().name();
      if (status_name != null) {
        sb.append(status_name);
        sb.append(" (");
      }
      sb.append(this.getStatus());
      if (status_name != null) {
        sb.append(")");
      }
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

