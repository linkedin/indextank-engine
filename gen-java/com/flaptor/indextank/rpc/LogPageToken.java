/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package com.flaptor.indextank.rpc;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.apache.thrift.*;
import org.apache.thrift.async.*;
import org.apache.thrift.meta_data.*;
import org.apache.thrift.transport.*;
import org.apache.thrift.protocol.*;

@SuppressWarnings("all") public class LogPageToken implements TBase<LogPageToken, LogPageToken._Fields>, java.io.Serializable, Cloneable {
  private static final TStruct STRUCT_DESC = new TStruct("LogPageToken");

  private static final TField TYPE_FIELD_DESC = new TField("type", TType.I32, (short)1);
  private static final TField TIMESTAMP_FIELD_DESC = new TField("timestamp", TType.I64, (short)2);
  private static final TField FILE_POSITION_FIELD_DESC = new TField("file_position", TType.I64, (short)5);
  private static final TField NEXT_TYPE_FIELD_DESC = new TField("next_type", TType.I32, (short)7);
  private static final TField NEXT_TIMESTAMP_FIELD_DESC = new TField("next_timestamp", TType.I64, (short)8);
  private static final TField OBSOLETE_1_FIELD_DESC = new TField("OBSOLETE_1", TType.I64, (short)3);
  private static final TField OBSOLETE_2_FIELD_DESC = new TField("OBSOLETE_2", TType.STRING, (short)4);
  private static final TField OBSOLETE_3_FIELD_DESC = new TField("OBSOLETE_3", TType.BOOL, (short)6);

  private PageType type;
  private long timestamp;
  private long file_position;
  private PageType next_type;
  private long next_timestamp;
  private long OBSOLETE_1;
  private String OBSOLETE_2;
  private boolean OBSOLETE_3;

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements TFieldIdEnum {
    /**
     * 
     * @see PageType
     */
    TYPE((short)1, "type"),
    TIMESTAMP((short)2, "timestamp"),
    FILE_POSITION((short)5, "file_position"),
    /**
     * 
     * @see PageType
     */
    NEXT_TYPE((short)7, "next_type"),
    NEXT_TIMESTAMP((short)8, "next_timestamp"),
    OBSOLETE_1((short)3, "OBSOLETE_1"),
    OBSOLETE_2((short)4, "OBSOLETE_2"),
    OBSOLETE_3((short)6, "OBSOLETE_3");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // TYPE
          return TYPE;
        case 2: // TIMESTAMP
          return TIMESTAMP;
        case 5: // FILE_POSITION
          return FILE_POSITION;
        case 7: // NEXT_TYPE
          return NEXT_TYPE;
        case 8: // NEXT_TIMESTAMP
          return NEXT_TIMESTAMP;
        case 3: // OBSOLETE_1
          return OBSOLETE_1;
        case 4: // OBSOLETE_2
          return OBSOLETE_2;
        case 6: // OBSOLETE_3
          return OBSOLETE_3;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __TIMESTAMP_ISSET_ID = 0;
  private static final int __FILE_POSITION_ISSET_ID = 1;
  private static final int __NEXT_TIMESTAMP_ISSET_ID = 2;
  private static final int __OBSOLETE_1_ISSET_ID = 3;
  private static final int __OBSOLETE_3_ISSET_ID = 4;
  private BitSet __isset_bit_vector = new BitSet(5);

  public static final Map<_Fields, FieldMetaData> metaDataMap;
  static {
    Map<_Fields, FieldMetaData> tmpMap = new EnumMap<_Fields, FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TYPE, new FieldMetaData("type", TFieldRequirementType.OPTIONAL, 
        new EnumMetaData(TType.ENUM, PageType.class)));
    tmpMap.put(_Fields.TIMESTAMP, new FieldMetaData("timestamp", TFieldRequirementType.OPTIONAL, 
        new FieldValueMetaData(TType.I64)));
    tmpMap.put(_Fields.FILE_POSITION, new FieldMetaData("file_position", TFieldRequirementType.OPTIONAL, 
        new FieldValueMetaData(TType.I64)));
    tmpMap.put(_Fields.NEXT_TYPE, new FieldMetaData("next_type", TFieldRequirementType.OPTIONAL, 
        new EnumMetaData(TType.ENUM, PageType.class)));
    tmpMap.put(_Fields.NEXT_TIMESTAMP, new FieldMetaData("next_timestamp", TFieldRequirementType.OPTIONAL, 
        new FieldValueMetaData(TType.I64)));
    tmpMap.put(_Fields.OBSOLETE_1, new FieldMetaData("OBSOLETE_1", TFieldRequirementType.OPTIONAL, 
        new FieldValueMetaData(TType.I64)));
    tmpMap.put(_Fields.OBSOLETE_2, new FieldMetaData("OBSOLETE_2", TFieldRequirementType.OPTIONAL, 
        new FieldValueMetaData(TType.STRING)));
    tmpMap.put(_Fields.OBSOLETE_3, new FieldMetaData("OBSOLETE_3", TFieldRequirementType.OPTIONAL, 
        new FieldValueMetaData(TType.BOOL)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    FieldMetaData.addStructMetaDataMap(LogPageToken.class, metaDataMap);
  }

  public LogPageToken() {
    this.type = PageType.initial;

  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public LogPageToken(LogPageToken other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    if (other.is_set_type()) {
      this.type = other.type;
    }
    this.timestamp = other.timestamp;
    this.file_position = other.file_position;
    if (other.is_set_next_type()) {
      this.next_type = other.next_type;
    }
    this.next_timestamp = other.next_timestamp;
    this.OBSOLETE_1 = other.OBSOLETE_1;
    if (other.is_set_OBSOLETE_2()) {
      this.OBSOLETE_2 = other.OBSOLETE_2;
    }
    this.OBSOLETE_3 = other.OBSOLETE_3;
  }

  public LogPageToken deepCopy() {
    return new LogPageToken(this);
  }

  @Override
  public void clear() {
    this.type = PageType.initial;

    set_timestamp_isSet(false);
    this.timestamp = 0;
    set_file_position_isSet(false);
    this.file_position = 0;
    this.next_type = null;
    set_next_timestamp_isSet(false);
    this.next_timestamp = 0;
    set_OBSOLETE_1_isSet(false);
    this.OBSOLETE_1 = 0;
    this.OBSOLETE_2 = null;
    set_OBSOLETE_3_isSet(false);
    this.OBSOLETE_3 = false;
  }

  /**
   * 
   * @see PageType
   */
  public PageType get_type() {
    return this.type;
  }

  /**
   * 
   * @see PageType
   */
  public LogPageToken set_type(PageType type) {
    this.type = type;
    return this;
  }

  public void unset_type() {
    this.type = null;
  }

  /** Returns true if field type is set (has been asigned a value) and false otherwise */
  public boolean is_set_type() {
    return this.type != null;
  }

  public void set_type_isSet(boolean value) {
    if (!value) {
      this.type = null;
    }
  }

  public long get_timestamp() {
    return this.timestamp;
  }

  public LogPageToken set_timestamp(long timestamp) {
    this.timestamp = timestamp;
    set_timestamp_isSet(true);
    return this;
  }

  public void unset_timestamp() {
    __isset_bit_vector.clear(__TIMESTAMP_ISSET_ID);
  }

  /** Returns true if field timestamp is set (has been asigned a value) and false otherwise */
  public boolean is_set_timestamp() {
    return __isset_bit_vector.get(__TIMESTAMP_ISSET_ID);
  }

  public void set_timestamp_isSet(boolean value) {
    __isset_bit_vector.set(__TIMESTAMP_ISSET_ID, value);
  }

  public long get_file_position() {
    return this.file_position;
  }

  public LogPageToken set_file_position(long file_position) {
    this.file_position = file_position;
    set_file_position_isSet(true);
    return this;
  }

  public void unset_file_position() {
    __isset_bit_vector.clear(__FILE_POSITION_ISSET_ID);
  }

  /** Returns true if field file_position is set (has been asigned a value) and false otherwise */
  public boolean is_set_file_position() {
    return __isset_bit_vector.get(__FILE_POSITION_ISSET_ID);
  }

  public void set_file_position_isSet(boolean value) {
    __isset_bit_vector.set(__FILE_POSITION_ISSET_ID, value);
  }

  /**
   * 
   * @see PageType
   */
  public PageType get_next_type() {
    return this.next_type;
  }

  /**
   * 
   * @see PageType
   */
  public LogPageToken set_next_type(PageType next_type) {
    this.next_type = next_type;
    return this;
  }

  public void unset_next_type() {
    this.next_type = null;
  }

  /** Returns true if field next_type is set (has been asigned a value) and false otherwise */
  public boolean is_set_next_type() {
    return this.next_type != null;
  }

  public void set_next_type_isSet(boolean value) {
    if (!value) {
      this.next_type = null;
    }
  }

  public long get_next_timestamp() {
    return this.next_timestamp;
  }

  public LogPageToken set_next_timestamp(long next_timestamp) {
    this.next_timestamp = next_timestamp;
    set_next_timestamp_isSet(true);
    return this;
  }

  public void unset_next_timestamp() {
    __isset_bit_vector.clear(__NEXT_TIMESTAMP_ISSET_ID);
  }

  /** Returns true if field next_timestamp is set (has been asigned a value) and false otherwise */
  public boolean is_set_next_timestamp() {
    return __isset_bit_vector.get(__NEXT_TIMESTAMP_ISSET_ID);
  }

  public void set_next_timestamp_isSet(boolean value) {
    __isset_bit_vector.set(__NEXT_TIMESTAMP_ISSET_ID, value);
  }

  public long get_OBSOLETE_1() {
    return this.OBSOLETE_1;
  }

  public LogPageToken set_OBSOLETE_1(long OBSOLETE_1) {
    this.OBSOLETE_1 = OBSOLETE_1;
    set_OBSOLETE_1_isSet(true);
    return this;
  }

  public void unset_OBSOLETE_1() {
    __isset_bit_vector.clear(__OBSOLETE_1_ISSET_ID);
  }

  /** Returns true if field OBSOLETE_1 is set (has been asigned a value) and false otherwise */
  public boolean is_set_OBSOLETE_1() {
    return __isset_bit_vector.get(__OBSOLETE_1_ISSET_ID);
  }

  public void set_OBSOLETE_1_isSet(boolean value) {
    __isset_bit_vector.set(__OBSOLETE_1_ISSET_ID, value);
  }

  public String get_OBSOLETE_2() {
    return this.OBSOLETE_2;
  }

  public LogPageToken set_OBSOLETE_2(String OBSOLETE_2) {
    this.OBSOLETE_2 = OBSOLETE_2;
    return this;
  }

  public void unset_OBSOLETE_2() {
    this.OBSOLETE_2 = null;
  }

  /** Returns true if field OBSOLETE_2 is set (has been asigned a value) and false otherwise */
  public boolean is_set_OBSOLETE_2() {
    return this.OBSOLETE_2 != null;
  }

  public void set_OBSOLETE_2_isSet(boolean value) {
    if (!value) {
      this.OBSOLETE_2 = null;
    }
  }

  public boolean is_OBSOLETE_3() {
    return this.OBSOLETE_3;
  }

  public LogPageToken set_OBSOLETE_3(boolean OBSOLETE_3) {
    this.OBSOLETE_3 = OBSOLETE_3;
    set_OBSOLETE_3_isSet(true);
    return this;
  }

  public void unset_OBSOLETE_3() {
    __isset_bit_vector.clear(__OBSOLETE_3_ISSET_ID);
  }

  /** Returns true if field OBSOLETE_3 is set (has been asigned a value) and false otherwise */
  public boolean is_set_OBSOLETE_3() {
    return __isset_bit_vector.get(__OBSOLETE_3_ISSET_ID);
  }

  public void set_OBSOLETE_3_isSet(boolean value) {
    __isset_bit_vector.set(__OBSOLETE_3_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case TYPE:
      if (value == null) {
        unset_type();
      } else {
        set_type((PageType)value);
      }
      break;

    case TIMESTAMP:
      if (value == null) {
        unset_timestamp();
      } else {
        set_timestamp((Long)value);
      }
      break;

    case FILE_POSITION:
      if (value == null) {
        unset_file_position();
      } else {
        set_file_position((Long)value);
      }
      break;

    case NEXT_TYPE:
      if (value == null) {
        unset_next_type();
      } else {
        set_next_type((PageType)value);
      }
      break;

    case NEXT_TIMESTAMP:
      if (value == null) {
        unset_next_timestamp();
      } else {
        set_next_timestamp((Long)value);
      }
      break;

    case OBSOLETE_1:
      if (value == null) {
        unset_OBSOLETE_1();
      } else {
        set_OBSOLETE_1((Long)value);
      }
      break;

    case OBSOLETE_2:
      if (value == null) {
        unset_OBSOLETE_2();
      } else {
        set_OBSOLETE_2((String)value);
      }
      break;

    case OBSOLETE_3:
      if (value == null) {
        unset_OBSOLETE_3();
      } else {
        set_OBSOLETE_3((Boolean)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case TYPE:
      return get_type();

    case TIMESTAMP:
      return new Long(get_timestamp());

    case FILE_POSITION:
      return new Long(get_file_position());

    case NEXT_TYPE:
      return get_next_type();

    case NEXT_TIMESTAMP:
      return new Long(get_next_timestamp());

    case OBSOLETE_1:
      return new Long(get_OBSOLETE_1());

    case OBSOLETE_2:
      return get_OBSOLETE_2();

    case OBSOLETE_3:
      return new Boolean(is_OBSOLETE_3());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been asigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case TYPE:
      return is_set_type();
    case TIMESTAMP:
      return is_set_timestamp();
    case FILE_POSITION:
      return is_set_file_position();
    case NEXT_TYPE:
      return is_set_next_type();
    case NEXT_TIMESTAMP:
      return is_set_next_timestamp();
    case OBSOLETE_1:
      return is_set_OBSOLETE_1();
    case OBSOLETE_2:
      return is_set_OBSOLETE_2();
    case OBSOLETE_3:
      return is_set_OBSOLETE_3();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof LogPageToken)
      return this.equals((LogPageToken)that);
    return false;
  }

  public boolean equals(LogPageToken that) {
    if (that == null)
      return false;

    boolean this_present_type = true && this.is_set_type();
    boolean that_present_type = true && that.is_set_type();
    if (this_present_type || that_present_type) {
      if (!(this_present_type && that_present_type))
        return false;
      if (!this.type.equals(that.type))
        return false;
    }

    boolean this_present_timestamp = true && this.is_set_timestamp();
    boolean that_present_timestamp = true && that.is_set_timestamp();
    if (this_present_timestamp || that_present_timestamp) {
      if (!(this_present_timestamp && that_present_timestamp))
        return false;
      if (this.timestamp != that.timestamp)
        return false;
    }

    boolean this_present_file_position = true && this.is_set_file_position();
    boolean that_present_file_position = true && that.is_set_file_position();
    if (this_present_file_position || that_present_file_position) {
      if (!(this_present_file_position && that_present_file_position))
        return false;
      if (this.file_position != that.file_position)
        return false;
    }

    boolean this_present_next_type = true && this.is_set_next_type();
    boolean that_present_next_type = true && that.is_set_next_type();
    if (this_present_next_type || that_present_next_type) {
      if (!(this_present_next_type && that_present_next_type))
        return false;
      if (!this.next_type.equals(that.next_type))
        return false;
    }

    boolean this_present_next_timestamp = true && this.is_set_next_timestamp();
    boolean that_present_next_timestamp = true && that.is_set_next_timestamp();
    if (this_present_next_timestamp || that_present_next_timestamp) {
      if (!(this_present_next_timestamp && that_present_next_timestamp))
        return false;
      if (this.next_timestamp != that.next_timestamp)
        return false;
    }

    boolean this_present_OBSOLETE_1 = true && this.is_set_OBSOLETE_1();
    boolean that_present_OBSOLETE_1 = true && that.is_set_OBSOLETE_1();
    if (this_present_OBSOLETE_1 || that_present_OBSOLETE_1) {
      if (!(this_present_OBSOLETE_1 && that_present_OBSOLETE_1))
        return false;
      if (this.OBSOLETE_1 != that.OBSOLETE_1)
        return false;
    }

    boolean this_present_OBSOLETE_2 = true && this.is_set_OBSOLETE_2();
    boolean that_present_OBSOLETE_2 = true && that.is_set_OBSOLETE_2();
    if (this_present_OBSOLETE_2 || that_present_OBSOLETE_2) {
      if (!(this_present_OBSOLETE_2 && that_present_OBSOLETE_2))
        return false;
      if (!this.OBSOLETE_2.equals(that.OBSOLETE_2))
        return false;
    }

    boolean this_present_OBSOLETE_3 = true && this.is_set_OBSOLETE_3();
    boolean that_present_OBSOLETE_3 = true && that.is_set_OBSOLETE_3();
    if (this_present_OBSOLETE_3 || that_present_OBSOLETE_3) {
      if (!(this_present_OBSOLETE_3 && that_present_OBSOLETE_3))
        return false;
      if (this.OBSOLETE_3 != that.OBSOLETE_3)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(LogPageToken other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    LogPageToken typedOther = (LogPageToken)other;

    lastComparison = Boolean.valueOf(is_set_type()).compareTo(typedOther.is_set_type());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_type()) {
      lastComparison = TBaseHelper.compareTo(this.type, typedOther.type);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(is_set_timestamp()).compareTo(typedOther.is_set_timestamp());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_timestamp()) {
      lastComparison = TBaseHelper.compareTo(this.timestamp, typedOther.timestamp);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(is_set_file_position()).compareTo(typedOther.is_set_file_position());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_file_position()) {
      lastComparison = TBaseHelper.compareTo(this.file_position, typedOther.file_position);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(is_set_next_type()).compareTo(typedOther.is_set_next_type());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_next_type()) {
      lastComparison = TBaseHelper.compareTo(this.next_type, typedOther.next_type);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(is_set_next_timestamp()).compareTo(typedOther.is_set_next_timestamp());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_next_timestamp()) {
      lastComparison = TBaseHelper.compareTo(this.next_timestamp, typedOther.next_timestamp);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(is_set_OBSOLETE_1()).compareTo(typedOther.is_set_OBSOLETE_1());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_OBSOLETE_1()) {
      lastComparison = TBaseHelper.compareTo(this.OBSOLETE_1, typedOther.OBSOLETE_1);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(is_set_OBSOLETE_2()).compareTo(typedOther.is_set_OBSOLETE_2());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_OBSOLETE_2()) {
      lastComparison = TBaseHelper.compareTo(this.OBSOLETE_2, typedOther.OBSOLETE_2);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(is_set_OBSOLETE_3()).compareTo(typedOther.is_set_OBSOLETE_3());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_OBSOLETE_3()) {
      lastComparison = TBaseHelper.compareTo(this.OBSOLETE_3, typedOther.OBSOLETE_3);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(TProtocol iprot) throws TException {
    TField field;
    iprot.readStructBegin();
    while (true)
    {
      field = iprot.readFieldBegin();
      if (field.type == TType.STOP) { 
        break;
      }
      switch (field.id) {
        case 1: // TYPE
          if (field.type == TType.I32) {
            this.type = PageType.findByValue(iprot.readI32());
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 2: // TIMESTAMP
          if (field.type == TType.I64) {
            this.timestamp = iprot.readI64();
            set_timestamp_isSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 5: // FILE_POSITION
          if (field.type == TType.I64) {
            this.file_position = iprot.readI64();
            set_file_position_isSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 7: // NEXT_TYPE
          if (field.type == TType.I32) {
            this.next_type = PageType.findByValue(iprot.readI32());
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 8: // NEXT_TIMESTAMP
          if (field.type == TType.I64) {
            this.next_timestamp = iprot.readI64();
            set_next_timestamp_isSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 3: // OBSOLETE_1
          if (field.type == TType.I64) {
            this.OBSOLETE_1 = iprot.readI64();
            set_OBSOLETE_1_isSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 4: // OBSOLETE_2
          if (field.type == TType.STRING) {
            this.OBSOLETE_2 = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 6: // OBSOLETE_3
          if (field.type == TType.BOOL) {
            this.OBSOLETE_3 = iprot.readBool();
            set_OBSOLETE_3_isSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        default:
          TProtocolUtil.skip(iprot, field.type);
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
    if (this.type != null) {
      if (is_set_type()) {
        oprot.writeFieldBegin(TYPE_FIELD_DESC);
        oprot.writeI32(this.type.getValue());
        oprot.writeFieldEnd();
      }
    }
    if (is_set_timestamp()) {
      oprot.writeFieldBegin(TIMESTAMP_FIELD_DESC);
      oprot.writeI64(this.timestamp);
      oprot.writeFieldEnd();
    }
    if (is_set_OBSOLETE_1()) {
      oprot.writeFieldBegin(OBSOLETE_1_FIELD_DESC);
      oprot.writeI64(this.OBSOLETE_1);
      oprot.writeFieldEnd();
    }
    if (this.OBSOLETE_2 != null) {
      if (is_set_OBSOLETE_2()) {
        oprot.writeFieldBegin(OBSOLETE_2_FIELD_DESC);
        oprot.writeString(this.OBSOLETE_2);
        oprot.writeFieldEnd();
      }
    }
    if (is_set_file_position()) {
      oprot.writeFieldBegin(FILE_POSITION_FIELD_DESC);
      oprot.writeI64(this.file_position);
      oprot.writeFieldEnd();
    }
    if (is_set_OBSOLETE_3()) {
      oprot.writeFieldBegin(OBSOLETE_3_FIELD_DESC);
      oprot.writeBool(this.OBSOLETE_3);
      oprot.writeFieldEnd();
    }
    if (this.next_type != null) {
      if (is_set_next_type()) {
        oprot.writeFieldBegin(NEXT_TYPE_FIELD_DESC);
        oprot.writeI32(this.next_type.getValue());
        oprot.writeFieldEnd();
      }
    }
    if (is_set_next_timestamp()) {
      oprot.writeFieldBegin(NEXT_TIMESTAMP_FIELD_DESC);
      oprot.writeI64(this.next_timestamp);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("LogPageToken(");
    boolean first = true;

    if (is_set_type()) {
      sb.append("type:");
      if (this.type == null) {
        sb.append("null");
      } else {
        sb.append(this.type);
      }
      first = false;
    }
    if (is_set_timestamp()) {
      if (!first) sb.append(", ");
      sb.append("timestamp:");
      sb.append(this.timestamp);
      first = false;
    }
    if (is_set_file_position()) {
      if (!first) sb.append(", ");
      sb.append("file_position:");
      sb.append(this.file_position);
      first = false;
    }
    if (is_set_next_type()) {
      if (!first) sb.append(", ");
      sb.append("next_type:");
      if (this.next_type == null) {
        sb.append("null");
      } else {
        sb.append(this.next_type);
      }
      first = false;
    }
    if (is_set_next_timestamp()) {
      if (!first) sb.append(", ");
      sb.append("next_timestamp:");
      sb.append(this.next_timestamp);
      first = false;
    }
    if (is_set_OBSOLETE_1()) {
      if (!first) sb.append(", ");
      sb.append("OBSOLETE_1:");
      sb.append(this.OBSOLETE_1);
      first = false;
    }
    if (is_set_OBSOLETE_2()) {
      if (!first) sb.append(", ");
      sb.append("OBSOLETE_2:");
      if (this.OBSOLETE_2 == null) {
        sb.append("null");
      } else {
        sb.append(this.OBSOLETE_2);
      }
      first = false;
    }
    if (is_set_OBSOLETE_3()) {
      if (!first) sb.append(", ");
      sb.append("OBSOLETE_3:");
      sb.append(this.OBSOLETE_3);
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
  }

}
