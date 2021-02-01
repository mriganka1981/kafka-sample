/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.example.sample.avro;

import org.apache.avro.specific.SpecificData;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@SuppressWarnings("all")
/** Avro for User */
@org.apache.avro.specific.AvroGenerated
public class User extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -2949459939329436587L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"User\",\"namespace\":\"com.example.sample.avro\",\"doc\":\"Avro for User\",\"fields\":[{\"name\":\"firstName\",\"type\":\"string\",\"doc\":\"First Name of User\"},{\"name\":\"lastName\",\"type\":\"string\",\"doc\":\"Last Name of User\"},{\"name\":\"age\",\"type\":\"int\",\"doc\":\"Age of User\"},{\"name\":\"height\",\"type\":\"float\",\"doc\":\"Height of User\"},{\"name\":\"weight\",\"type\":\"float\",\"doc\":\"Weight  of User\"},{\"name\":\"emails\",\"type\":{\"type\":\"array\",\"items\":\"string\",\"default\":[]}},{\"name\":\"adult\",\"type\":\"boolean\",\"doc\":\"is User Adult?\",\"default\":\"true\"},{\"name\":\"signTS\",\"type\":\"long\",\"doc\":\"Sign In Time\",\"logicalType\":\"timestamp-millis\"},{\"name\":\"address\",\"type\":{\"type\":\"record\",\"name\":\"Address\",\"doc\":\"Avro for Address\",\"fields\":[{\"name\":\"addressLine\",\"type\":\"string\",\"doc\":\"Address of User\"},{\"name\":\"city\",\"type\":\"string\",\"doc\":\"City of User\"},{\"name\":\"postcode\",\"type\":[\"string\",\"int\"],\"doc\":\"Postal of User\"},{\"name\":\"type\",\"type\":{\"type\":\"enum\",\"name\":\"EnumType\",\"symbols\":[\"RESIDENCE\",\"OFFICE\"]}}]}}],\"version\":\"1\"}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<User> ENCODER =
      new BinaryMessageEncoder<User>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<User> DECODER =
      new BinaryMessageDecoder<User>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<User> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<User> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<User>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this User to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a User from a ByteBuffer. */
  public static User fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  /** First Name of User */
  @Deprecated public java.lang.CharSequence firstName;
  /** Last Name of User */
  @Deprecated public java.lang.CharSequence lastName;
  /** Age of User */
  @Deprecated public int age;
  /** Height of User */
  @Deprecated public float height;
  /** Weight  of User */
  @Deprecated public float weight;
  @Deprecated public java.util.List<java.lang.CharSequence> emails;
  /** is User Adult? */
  @Deprecated public boolean adult;
  /** Sign In Time */
  @Deprecated public long signTS;
  @Deprecated public com.example.sample.avro.Address address;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public User() {}

  /**
   * All-args constructor.
   * @param firstName First Name of User
   * @param lastName Last Name of User
   * @param age Age of User
   * @param height Height of User
   * @param weight Weight  of User
   * @param emails The new value for emails
   * @param adult is User Adult?
   * @param signTS Sign In Time
   * @param address The new value for address
   */
  public User(java.lang.CharSequence firstName, java.lang.CharSequence lastName, java.lang.Integer age, java.lang.Float height, java.lang.Float weight, java.util.List<java.lang.CharSequence> emails, java.lang.Boolean adult, java.lang.Long signTS, com.example.sample.avro.Address address) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
    this.height = height;
    this.weight = weight;
    this.emails = emails;
    this.adult = adult;
    this.signTS = signTS;
    this.address = address;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return firstName;
    case 1: return lastName;
    case 2: return age;
    case 3: return height;
    case 4: return weight;
    case 5: return emails;
    case 6: return adult;
    case 7: return signTS;
    case 8: return address;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: firstName = (java.lang.CharSequence)value$; break;
    case 1: lastName = (java.lang.CharSequence)value$; break;
    case 2: age = (java.lang.Integer)value$; break;
    case 3: height = (java.lang.Float)value$; break;
    case 4: weight = (java.lang.Float)value$; break;
    case 5: emails = (java.util.List<java.lang.CharSequence>)value$; break;
    case 6: adult = (java.lang.Boolean)value$; break;
    case 7: signTS = (java.lang.Long)value$; break;
    case 8: address = (com.example.sample.avro.Address)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'firstName' field.
   * @return First Name of User
   */
  public java.lang.CharSequence getFirstName() {
    return firstName;
  }

  /**
   * Sets the value of the 'firstName' field.
   * First Name of User
   * @param value the value to set.
   */
  public void setFirstName(java.lang.CharSequence value) {
    this.firstName = value;
  }

  /**
   * Gets the value of the 'lastName' field.
   * @return Last Name of User
   */
  public java.lang.CharSequence getLastName() {
    return lastName;
  }

  /**
   * Sets the value of the 'lastName' field.
   * Last Name of User
   * @param value the value to set.
   */
  public void setLastName(java.lang.CharSequence value) {
    this.lastName = value;
  }

  /**
   * Gets the value of the 'age' field.
   * @return Age of User
   */
  public java.lang.Integer getAge() {
    return age;
  }

  /**
   * Sets the value of the 'age' field.
   * Age of User
   * @param value the value to set.
   */
  public void setAge(java.lang.Integer value) {
    this.age = value;
  }

  /**
   * Gets the value of the 'height' field.
   * @return Height of User
   */
  public java.lang.Float getHeight() {
    return height;
  }

  /**
   * Sets the value of the 'height' field.
   * Height of User
   * @param value the value to set.
   */
  public void setHeight(java.lang.Float value) {
    this.height = value;
  }

  /**
   * Gets the value of the 'weight' field.
   * @return Weight  of User
   */
  public java.lang.Float getWeight() {
    return weight;
  }

  /**
   * Sets the value of the 'weight' field.
   * Weight  of User
   * @param value the value to set.
   */
  public void setWeight(java.lang.Float value) {
    this.weight = value;
  }

  /**
   * Gets the value of the 'emails' field.
   * @return The value of the 'emails' field.
   */
  public java.util.List<java.lang.CharSequence> getEmails() {
    return emails;
  }

  /**
   * Sets the value of the 'emails' field.
   * @param value the value to set.
   */
  public void setEmails(java.util.List<java.lang.CharSequence> value) {
    this.emails = value;
  }

  /**
   * Gets the value of the 'adult' field.
   * @return is User Adult?
   */
  public java.lang.Boolean getAdult() {
    return adult;
  }

  /**
   * Sets the value of the 'adult' field.
   * is User Adult?
   * @param value the value to set.
   */
  public void setAdult(java.lang.Boolean value) {
    this.adult = value;
  }

  /**
   * Gets the value of the 'signTS' field.
   * @return Sign In Time
   */
  public java.lang.Long getSignTS() {
    return signTS;
  }

  /**
   * Sets the value of the 'signTS' field.
   * Sign In Time
   * @param value the value to set.
   */
  public void setSignTS(java.lang.Long value) {
    this.signTS = value;
  }

  /**
   * Gets the value of the 'address' field.
   * @return The value of the 'address' field.
   */
  public com.example.sample.avro.Address getAddress() {
    return address;
  }

  /**
   * Sets the value of the 'address' field.
   * @param value the value to set.
   */
  public void setAddress(com.example.sample.avro.Address value) {
    this.address = value;
  }

  /**
   * Creates a new User RecordBuilder.
   * @return A new User RecordBuilder
   */
  public static com.example.sample.avro.User.Builder newBuilder() {
    return new com.example.sample.avro.User.Builder();
  }

  /**
   * Creates a new User RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new User RecordBuilder
   */
  public static com.example.sample.avro.User.Builder newBuilder(com.example.sample.avro.User.Builder other) {
    return new com.example.sample.avro.User.Builder(other);
  }

  /**
   * Creates a new User RecordBuilder by copying an existing User instance.
   * @param other The existing instance to copy.
   * @return A new User RecordBuilder
   */
  public static com.example.sample.avro.User.Builder newBuilder(com.example.sample.avro.User other) {
    return new com.example.sample.avro.User.Builder(other);
  }

  /**
   * RecordBuilder for User instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<User>
    implements org.apache.avro.data.RecordBuilder<User> {

    /** First Name of User */
    private java.lang.CharSequence firstName;
    /** Last Name of User */
    private java.lang.CharSequence lastName;
    /** Age of User */
    private int age;
    /** Height of User */
    private float height;
    /** Weight  of User */
    private float weight;
    private java.util.List<java.lang.CharSequence> emails;
    /** is User Adult? */
    private boolean adult;
    /** Sign In Time */
    private long signTS;
    private com.example.sample.avro.Address address;
    private com.example.sample.avro.Address.Builder addressBuilder;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.example.sample.avro.User.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.firstName)) {
        this.firstName = data().deepCopy(fields()[0].schema(), other.firstName);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.lastName)) {
        this.lastName = data().deepCopy(fields()[1].schema(), other.lastName);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.age)) {
        this.age = data().deepCopy(fields()[2].schema(), other.age);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.height)) {
        this.height = data().deepCopy(fields()[3].schema(), other.height);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.weight)) {
        this.weight = data().deepCopy(fields()[4].schema(), other.weight);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.emails)) {
        this.emails = data().deepCopy(fields()[5].schema(), other.emails);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.adult)) {
        this.adult = data().deepCopy(fields()[6].schema(), other.adult);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.signTS)) {
        this.signTS = data().deepCopy(fields()[7].schema(), other.signTS);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.address)) {
        this.address = data().deepCopy(fields()[8].schema(), other.address);
        fieldSetFlags()[8] = true;
      }
      if (other.hasAddressBuilder()) {
        this.addressBuilder = com.example.sample.avro.Address.newBuilder(other.getAddressBuilder());
      }
    }

    /**
     * Creates a Builder by copying an existing User instance
     * @param other The existing instance to copy.
     */
    private Builder(com.example.sample.avro.User other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.firstName)) {
        this.firstName = data().deepCopy(fields()[0].schema(), other.firstName);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.lastName)) {
        this.lastName = data().deepCopy(fields()[1].schema(), other.lastName);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.age)) {
        this.age = data().deepCopy(fields()[2].schema(), other.age);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.height)) {
        this.height = data().deepCopy(fields()[3].schema(), other.height);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.weight)) {
        this.weight = data().deepCopy(fields()[4].schema(), other.weight);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.emails)) {
        this.emails = data().deepCopy(fields()[5].schema(), other.emails);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.adult)) {
        this.adult = data().deepCopy(fields()[6].schema(), other.adult);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.signTS)) {
        this.signTS = data().deepCopy(fields()[7].schema(), other.signTS);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.address)) {
        this.address = data().deepCopy(fields()[8].schema(), other.address);
        fieldSetFlags()[8] = true;
      }
      this.addressBuilder = null;
    }

    /**
      * Gets the value of the 'firstName' field.
      * First Name of User
      * @return The value.
      */
    public java.lang.CharSequence getFirstName() {
      return firstName;
    }

    /**
      * Sets the value of the 'firstName' field.
      * First Name of User
      * @param value The value of 'firstName'.
      * @return This builder.
      */
    public com.example.sample.avro.User.Builder setFirstName(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.firstName = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'firstName' field has been set.
      * First Name of User
      * @return True if the 'firstName' field has been set, false otherwise.
      */
    public boolean hasFirstName() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'firstName' field.
      * First Name of User
      * @return This builder.
      */
    public com.example.sample.avro.User.Builder clearFirstName() {
      firstName = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'lastName' field.
      * Last Name of User
      * @return The value.
      */
    public java.lang.CharSequence getLastName() {
      return lastName;
    }

    /**
      * Sets the value of the 'lastName' field.
      * Last Name of User
      * @param value The value of 'lastName'.
      * @return This builder.
      */
    public com.example.sample.avro.User.Builder setLastName(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.lastName = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'lastName' field has been set.
      * Last Name of User
      * @return True if the 'lastName' field has been set, false otherwise.
      */
    public boolean hasLastName() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'lastName' field.
      * Last Name of User
      * @return This builder.
      */
    public com.example.sample.avro.User.Builder clearLastName() {
      lastName = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'age' field.
      * Age of User
      * @return The value.
      */
    public java.lang.Integer getAge() {
      return age;
    }

    /**
      * Sets the value of the 'age' field.
      * Age of User
      * @param value The value of 'age'.
      * @return This builder.
      */
    public com.example.sample.avro.User.Builder setAge(int value) {
      validate(fields()[2], value);
      this.age = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'age' field has been set.
      * Age of User
      * @return True if the 'age' field has been set, false otherwise.
      */
    public boolean hasAge() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'age' field.
      * Age of User
      * @return This builder.
      */
    public com.example.sample.avro.User.Builder clearAge() {
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'height' field.
      * Height of User
      * @return The value.
      */
    public java.lang.Float getHeight() {
      return height;
    }

    /**
      * Sets the value of the 'height' field.
      * Height of User
      * @param value The value of 'height'.
      * @return This builder.
      */
    public com.example.sample.avro.User.Builder setHeight(float value) {
      validate(fields()[3], value);
      this.height = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'height' field has been set.
      * Height of User
      * @return True if the 'height' field has been set, false otherwise.
      */
    public boolean hasHeight() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'height' field.
      * Height of User
      * @return This builder.
      */
    public com.example.sample.avro.User.Builder clearHeight() {
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'weight' field.
      * Weight  of User
      * @return The value.
      */
    public java.lang.Float getWeight() {
      return weight;
    }

    /**
      * Sets the value of the 'weight' field.
      * Weight  of User
      * @param value The value of 'weight'.
      * @return This builder.
      */
    public com.example.sample.avro.User.Builder setWeight(float value) {
      validate(fields()[4], value);
      this.weight = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'weight' field has been set.
      * Weight  of User
      * @return True if the 'weight' field has been set, false otherwise.
      */
    public boolean hasWeight() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'weight' field.
      * Weight  of User
      * @return This builder.
      */
    public com.example.sample.avro.User.Builder clearWeight() {
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'emails' field.
      * @return The value.
      */
    public java.util.List<java.lang.CharSequence> getEmails() {
      return emails;
    }

    /**
      * Sets the value of the 'emails' field.
      * @param value The value of 'emails'.
      * @return This builder.
      */
    public com.example.sample.avro.User.Builder setEmails(java.util.List<java.lang.CharSequence> value) {
      validate(fields()[5], value);
      this.emails = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'emails' field has been set.
      * @return True if the 'emails' field has been set, false otherwise.
      */
    public boolean hasEmails() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'emails' field.
      * @return This builder.
      */
    public com.example.sample.avro.User.Builder clearEmails() {
      emails = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    /**
      * Gets the value of the 'adult' field.
      * is User Adult?
      * @return The value.
      */
    public java.lang.Boolean getAdult() {
      return adult;
    }

    /**
      * Sets the value of the 'adult' field.
      * is User Adult?
      * @param value The value of 'adult'.
      * @return This builder.
      */
    public com.example.sample.avro.User.Builder setAdult(boolean value) {
      validate(fields()[6], value);
      this.adult = value;
      fieldSetFlags()[6] = true;
      return this;
    }

    /**
      * Checks whether the 'adult' field has been set.
      * is User Adult?
      * @return True if the 'adult' field has been set, false otherwise.
      */
    public boolean hasAdult() {
      return fieldSetFlags()[6];
    }


    /**
      * Clears the value of the 'adult' field.
      * is User Adult?
      * @return This builder.
      */
    public com.example.sample.avro.User.Builder clearAdult() {
      fieldSetFlags()[6] = false;
      return this;
    }

    /**
      * Gets the value of the 'signTS' field.
      * Sign In Time
      * @return The value.
      */
    public java.lang.Long getSignTS() {
      return signTS;
    }

    /**
      * Sets the value of the 'signTS' field.
      * Sign In Time
      * @param value The value of 'signTS'.
      * @return This builder.
      */
    public com.example.sample.avro.User.Builder setSignTS(long value) {
      validate(fields()[7], value);
      this.signTS = value;
      fieldSetFlags()[7] = true;
      return this;
    }

    /**
      * Checks whether the 'signTS' field has been set.
      * Sign In Time
      * @return True if the 'signTS' field has been set, false otherwise.
      */
    public boolean hasSignTS() {
      return fieldSetFlags()[7];
    }


    /**
      * Clears the value of the 'signTS' field.
      * Sign In Time
      * @return This builder.
      */
    public com.example.sample.avro.User.Builder clearSignTS() {
      fieldSetFlags()[7] = false;
      return this;
    }

    /**
      * Gets the value of the 'address' field.
      * @return The value.
      */
    public com.example.sample.avro.Address getAddress() {
      return address;
    }

    /**
      * Sets the value of the 'address' field.
      * @param value The value of 'address'.
      * @return This builder.
      */
    public com.example.sample.avro.User.Builder setAddress(com.example.sample.avro.Address value) {
      validate(fields()[8], value);
      this.addressBuilder = null;
      this.address = value;
      fieldSetFlags()[8] = true;
      return this;
    }

    /**
      * Checks whether the 'address' field has been set.
      * @return True if the 'address' field has been set, false otherwise.
      */
    public boolean hasAddress() {
      return fieldSetFlags()[8];
    }

    /**
     * Gets the Builder instance for the 'address' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public com.example.sample.avro.Address.Builder getAddressBuilder() {
      if (addressBuilder == null) {
        if (hasAddress()) {
          setAddressBuilder(com.example.sample.avro.Address.newBuilder(address));
        } else {
          setAddressBuilder(com.example.sample.avro.Address.newBuilder());
        }
      }
      return addressBuilder;
    }

    /**
     * Sets the Builder instance for the 'address' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */
    public com.example.sample.avro.User.Builder setAddressBuilder(com.example.sample.avro.Address.Builder value) {
      clearAddress();
      addressBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'address' field has an active Builder instance
     * @return True if the 'address' field has an active Builder instance
     */
    public boolean hasAddressBuilder() {
      return addressBuilder != null;
    }

    /**
      * Clears the value of the 'address' field.
      * @return This builder.
      */
    public com.example.sample.avro.User.Builder clearAddress() {
      address = null;
      addressBuilder = null;
      fieldSetFlags()[8] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public User build() {
      try {
        User record = new User();
        record.firstName = fieldSetFlags()[0] ? this.firstName : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.lastName = fieldSetFlags()[1] ? this.lastName : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.age = fieldSetFlags()[2] ? this.age : (java.lang.Integer) defaultValue(fields()[2]);
        record.height = fieldSetFlags()[3] ? this.height : (java.lang.Float) defaultValue(fields()[3]);
        record.weight = fieldSetFlags()[4] ? this.weight : (java.lang.Float) defaultValue(fields()[4]);
        record.emails = fieldSetFlags()[5] ? this.emails : (java.util.List<java.lang.CharSequence>) defaultValue(fields()[5]);
        record.adult = fieldSetFlags()[6] ? this.adult : (java.lang.Boolean) defaultValue(fields()[6]);
        record.signTS = fieldSetFlags()[7] ? this.signTS : (java.lang.Long) defaultValue(fields()[7]);
        if (addressBuilder != null) {
          record.address = this.addressBuilder.build();
        } else {
          record.address = fieldSetFlags()[8] ? this.address : (com.example.sample.avro.Address) defaultValue(fields()[8]);
        }
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<User>
    WRITER$ = (org.apache.avro.io.DatumWriter<User>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<User>
    READER$ = (org.apache.avro.io.DatumReader<User>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}