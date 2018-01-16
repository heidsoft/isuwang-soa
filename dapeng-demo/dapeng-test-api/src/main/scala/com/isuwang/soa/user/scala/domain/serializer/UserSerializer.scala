package com.isuwang.soa.user.scala.domain.serializer

;

import com.isuwang.soa.user.scala.domain.serializer._;
import com.isuwang.soa.price.scala.domain.serializer._;
import com.isuwang.soa.order.scala.domain.serializer._;
import com.isuwang.soa.settle.scala.domain.serializer._;
import com.isuwang.dapeng.core._
import com.isuwang.org.apache.thrift._
import com.isuwang.org.apache.thrift.protocol._

/**
  * Autogenerated by Dapeng-Code-Generator (1.2.2)
  *
  * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
  *
  * @generated
  **/

class UserSerializer extends BeanSerializer[com.isuwang.soa.user.scala.domain.User] {

  @throws[TException]
  override def read(iprot: TProtocol): com.isuwang.soa.user.scala.domain.User = {

    var schemeField: com.isuwang.org.apache.thrift.protocol.TField = null
    iprot.readStructBegin()

    var id: Int = 0
    var name: String = null
    var phoneNumber: String = null
    var password: String = null


    while (schemeField == null || schemeField.`type` != com.isuwang.org.apache.thrift.protocol.TType.STOP) {

      schemeField = iprot.readFieldBegin

      schemeField.id match {

        case 1 =>
          schemeField.`type` match {
            case com.isuwang.org.apache.thrift.protocol.TType.I32 => id = iprot.readI32
            case _ => com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.`type`)
          }

        case 2 =>
          schemeField.`type` match {
            case com.isuwang.org.apache.thrift.protocol.TType.STRING => name = iprot.readString
            case _ => com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.`type`)
          }

        case 3 =>
          schemeField.`type` match {
            case com.isuwang.org.apache.thrift.protocol.TType.STRING => phoneNumber = iprot.readString
            case _ => com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.`type`)
          }

        case 4 =>
          schemeField.`type` match {
            case com.isuwang.org.apache.thrift.protocol.TType.STRING => password = iprot.readString
            case _ => com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.`type`)
          }

        case _ => com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.`type`)
      }
    }

    iprot.readFieldEnd
    iprot.readStructEnd

    val bean = com.isuwang.soa.user.scala.domain.User(id = id, name = name, phoneNumber = phoneNumber, password = password)
    validate(bean)

    bean
  }

  @throws[TException]
  override def write(bean: com.isuwang.soa.user.scala.domain.User, oprot: TProtocol): Unit = {

    validate(bean)
    oprot.writeStructBegin(new com.isuwang.org.apache.thrift.protocol.TStruct("User"))


    {
      val elem0 = bean.id
      oprot.writeFieldBegin(new com.isuwang.org.apache.thrift.protocol.TField("id", com.isuwang.org.apache.thrift.protocol.TType.I32, 1.asInstanceOf[Short]))
      oprot.writeI32(elem0)
      oprot.writeFieldEnd

    }
    {
      val elem1 = bean.name
      oprot.writeFieldBegin(new com.isuwang.org.apache.thrift.protocol.TField("name", com.isuwang.org.apache.thrift.protocol.TType.STRING, 2.asInstanceOf[Short]))
      oprot.writeString(elem1)
      oprot.writeFieldEnd

    }
    {
      val elem2 = bean.phoneNumber
      oprot.writeFieldBegin(new com.isuwang.org.apache.thrift.protocol.TField("phoneNumber", com.isuwang.org.apache.thrift.protocol.TType.STRING, 3.asInstanceOf[Short]))
      oprot.writeString(elem2)
      oprot.writeFieldEnd

    }
    {
      val elem3 = bean.password
      oprot.writeFieldBegin(new com.isuwang.org.apache.thrift.protocol.TField("password", com.isuwang.org.apache.thrift.protocol.TType.STRING, 4.asInstanceOf[Short]))
      oprot.writeString(elem3)
      oprot.writeFieldEnd

    }
    oprot.writeFieldStop
    oprot.writeStructEnd
  }

  @throws[TException]
  override def validate(bean: com.isuwang.soa.user.scala.domain.User): Unit = {

    if (bean.name == null)
      throw new SoaException(SoaCode.NotNull, "name字段不允许为空")

    if (bean.phoneNumber == null)
      throw new SoaException(SoaCode.NotNull, "phoneNumber字段不允许为空")

    if (bean.password == null)
      throw new SoaException(SoaCode.NotNull, "password字段不允许为空")

  }


  @throws[TException]
  override def toString(bean: com.isuwang.soa.user.scala.domain.User): String = if (bean == null) "null" else bean.toString

}
        
      