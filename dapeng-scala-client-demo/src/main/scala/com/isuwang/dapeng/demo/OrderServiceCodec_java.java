//package com.isuwang.dapeng.demo;
//
//import com.isuwang.dapeng.core.TBeanSerializer;
//import com.isuwang.dapeng.demo.domain.Order;
//import com.isuwang.org.apache.thrift.TException;
//import com.isuwang.org.apache.thrift.protocol.TProtocol;
//
//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//import java.util.Optional;
//
///**
// * Autogenerated by Dapeng-Code-Generator (1.1.0)
// * <p>
// * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
// *
// * @generated
// **/
//public class OrderServiceCodec_java {
//    public static class OrderSerializer implements TBeanSerializer<Order> {
//
//        @Override
//        public void read(com.isuwang.dapeng.demo.domain.Order bean, TProtocol iprot) throws TException {
//
//            com.isuwang.org.apache.thrift.protocol.TField schemeField;
//            iprot.readStructBegin();
//
//            while (true) {
//                schemeField = iprot.readFieldBegin();
//                if (schemeField.type == com.isuwang.org.apache.thrift.protocol.TType.STOP) {
//                    break;
//                }
//
//                switch (schemeField.id) {
//
//                    case 1:
//                        if (schemeField.type == com.isuwang.org.apache.thrift.protocol.TType.I32) {
//                            int elem0 = iprot.readI32();
//                            bean.setId(elem0);
//                        } else {
//                            com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
//                        }
//                        break;
//
//                    case 2:
//                        if (schemeField.type == com.isuwang.org.apache.thrift.protocol.TType.STRING) {
//                            String elem0 = iprot.readString();
//                            bean.setOrderNo(elem0);
//                        } else {
//                            com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
//                        }
//                        break;
//
//                    case 3:
//                        if (schemeField.type == com.isuwang.org.apache.thrift.protocol.TType.I32) {
//                            com.isuwang.dapeng.demo.enums.PayTypeEnum elem0 = com.isuwang.dapeng.demo.enums.PayTypeEnum.findByValue(iprot.readI32());
//                            bean.setPayType(elem0);
//                        } else {
//                            com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
//                        }
//                        break;
//
//                    case 4:
//                        if (schemeField.type == com.isuwang.org.apache.thrift.protocol.TType.I32) {
//                            int elem0 = iprot.readI32();
//                            bean.setBuyerId(elem0);
//                        } else {
//                            com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
//                        }
//                        break;
//
//                    case 5:
//                        if (schemeField.type == com.isuwang.org.apache.thrift.protocol.TType.I32) {
//                            int elem0 = iprot.readI32();
//                            bean.setSellerId(elem0);
//                        } else {
//                            com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
//                        }
//                        break;
//
//                    case 6:
//                        if (schemeField.type == com.isuwang.org.apache.thrift.protocol.TType.STRING) {
//                            String elem0 = iprot.readString();
//                            bean.setRemark(Optional.of(elem0));
//                        } else {
//                            com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
//                        }
//                        break;
//
//
//                    default:
//                        com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
//
//                }
//                iprot.readFieldEnd();
//            }
//            iprot.readStructEnd();
//
//            validate(bean);
//        }
//
//        @Override
//        public void write(com.isuwang.dapeng.demo.domain.Order bean, TProtocol oprot) throws TException {
//
//            validate(bean);
//            oprot.writeStructBegin(new com.isuwang.org.apache.thrift.protocol.TStruct("Order"));
//
//
//            oprot.writeFieldBegin(new com.isuwang.org.apache.thrift.protocol.TField("id", com.isuwang.org.apache.thrift.protocol.TType.I32, (short) 1));
//            Integer elem0 = bean.getId();
//            oprot.writeI32(elem0);
//
//            oprot.writeFieldEnd();
//
//            oprot.writeFieldBegin(new com.isuwang.org.apache.thrift.protocol.TField("orderNo", com.isuwang.org.apache.thrift.protocol.TType.STRING, (short) 2));
//            String elem1 = bean.getOrderNo();
//            oprot.writeString(elem1);
//
//            oprot.writeFieldEnd();
//
//            oprot.writeFieldBegin(new com.isuwang.org.apache.thrift.protocol.TField("payType", com.isuwang.org.apache.thrift.protocol.TType.I32, (short) 3));
//            com.isuwang.dapeng.demo.enums.PayTypeEnum elem2 = bean.getPayType();
//            oprot.writeI32(elem2.getValue());
//
//            oprot.writeFieldEnd();
//
//            oprot.writeFieldBegin(new com.isuwang.org.apache.thrift.protocol.TField("buyerId", com.isuwang.org.apache.thrift.protocol.TType.I32, (short) 4));
//            Integer elem3 = bean.getBuyerId();
//            oprot.writeI32(elem3);
//
//            oprot.writeFieldEnd();
//
//            oprot.writeFieldBegin(new com.isuwang.org.apache.thrift.protocol.TField("sellerId", com.isuwang.org.apache.thrift.protocol.TType.I32, (short) 5));
//            Integer elem4 = bean.getSellerId();
//            oprot.writeI32(elem4);
//
//            oprot.writeFieldEnd();
//            if (bean.getRemark().isPresent()) {
//                oprot.writeFieldBegin(new com.isuwang.org.apache.thrift.protocol.TField("remark", com.isuwang.org.apache.thrift.protocol.TType.STRING, (short) 6));
//                String elem5 = bean.getRemark().get();
//                oprot.writeString(elem5);
//
//            }
//
//            oprot.writeFieldStop();
//            oprot.writeStructEnd();
//        }
//
//        public void validate(com.isuwang.dapeng.demo.domain.Order bean) throws TException {
//
//            if (bean.getOrderNo() == null)
//                throw new SoaException(SoaBaseCode.NotNull, "orderNo字段不允许为空");
//
//            if (bean.getPayType() == null)
//                throw new SoaException(SoaBaseCode.NotNull, "payType字段不允许为空");
//
//        }
//
//        @Override
//        public String toString(com.isuwang.dapeng.demo.domain.Order bean) {
//            return bean == null ? "null" : bean.toString();
//        }
//    }
//
//    public static class FindOrderRequestSerializer implements TBeanSerializer<com.isuwang.dapeng.demo.domain.FindOrderRequest> {
//
//        @Override
//        public void read(com.isuwang.dapeng.demo.domain.FindOrderRequest bean, TProtocol iprot) throws TException {
//
//            com.isuwang.org.apache.thrift.protocol.TField schemeField;
//            iprot.readStructBegin();
//
//            while (true) {
//                schemeField = iprot.readFieldBegin();
//                if (schemeField.type == com.isuwang.org.apache.thrift.protocol.TType.STOP) {
//                    break;
//                }
//
//                switch (schemeField.id) {
//
//                    case 1:
//                        if (schemeField.type == com.isuwang.org.apache.thrift.protocol.TType.I32) {
//                            com.isuwang.dapeng.demo.enums.PayTypeEnum elem0 = com.isuwang.dapeng.demo.enums.PayTypeEnum.findByValue(iprot.readI32());
//                            bean.setPayType(elem0);
//                        } else {
//                            com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
//                        }
//                        break;
//
//                    case 2:
//                        if (schemeField.type == com.isuwang.org.apache.thrift.protocol.TType.I32) {
//                            int elem0 = iprot.readI32();
//                            bean.setBuyerId(elem0);
//                        } else {
//                            com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
//                        }
//                        break;
//
//
//                    default:
//                        com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
//
//                }
//                iprot.readFieldEnd();
//            }
//            iprot.readStructEnd();
//
//            validate(bean);
//        }
//
//        @Override
//        public void write(com.isuwang.dapeng.demo.domain.FindOrderRequest bean, TProtocol oprot) throws TException {
//
//            validate(bean);
//            oprot.writeStructBegin(new com.isuwang.org.apache.thrift.protocol.TStruct("FindOrderRequest"));
//
//
//            oprot.writeFieldBegin(new com.isuwang.org.apache.thrift.protocol.TField("payType", com.isuwang.org.apache.thrift.protocol.TType.I32, (short) 1));
//            com.isuwang.dapeng.demo.enums.PayTypeEnum elem0 = bean.getPayType();
//            oprot.writeI32(elem0.getValue());
//
//            oprot.writeFieldEnd();
//
//            oprot.writeFieldBegin(new com.isuwang.org.apache.thrift.protocol.TField("buyerId", com.isuwang.org.apache.thrift.protocol.TType.I32, (short) 2));
//            Integer elem1 = bean.getBuyerId();
//            oprot.writeI32(elem1);
//
//            oprot.writeFieldEnd();
//
//            oprot.writeFieldStop();
//            oprot.writeStructEnd();
//        }
//
//        public void validate(com.isuwang.dapeng.demo.domain.FindOrderRequest bean) throws TException {
//
//            if (bean.getPayType() == null)
//                throw new SoaException(SoaBaseCode.NotNull, "payType字段不允许为空");
//
//        }
//
//        @Override
//        public String toString(com.isuwang.dapeng.demo.domain.FindOrderRequest bean) {
//            return bean == null ? "null" : bean.toString();
//        }
//    }
//
//
//    public static class findOrder_args {
//
//        private com.isuwang.dapeng.demo.domain.FindOrderRequest request;
//
//        public com.isuwang.dapeng.demo.domain.FindOrderRequest getRequest() {
//            return this.request;
//        }
//
//        public void setRequest(com.isuwang.dapeng.demo.domain.FindOrderRequest request) {
//            this.request = request;
//        }
//
//
//        @Override
//        public String toString() {
//            StringBuilder stringBuilder = new StringBuilder("{");
//
//            stringBuilder.append("\"").append("request").append("\":").append(this.request == null ? "null" : this.request.toString()).append(",");
//
//            if (stringBuilder.lastIndexOf(",") > 0)
//                stringBuilder.deleteCharAt(stringBuilder.lastIndexOf(","));
//            stringBuilder.append("}");
//
//            return stringBuilder.toString();
//        }
//
//    }
//
//
//    public static class findOrder_result {
//
//
//        private java.util.List<com.isuwang.dapeng.demo.domain.Order> success;
//
//        public java.util.List<com.isuwang.dapeng.demo.domain.Order> getSuccess() {
//            return success;
//        }
//
//        public void setSuccess(java.util.List<com.isuwang.dapeng.demo.domain.Order> success) {
//            this.success = success;
//        }
//
//
//        @Override
//        public String toString() {
//            StringBuilder stringBuilder = new StringBuilder("{");
//
//            stringBuilder.append("\"").append("success").append("\":").append(success).append(",");
//
//            stringBuilder.deleteCharAt(stringBuilder.lastIndexOf(","));
//            stringBuilder.append("}");
//
//            return stringBuilder.toString();
//        }
//
//
//    }
//
//    public static class FindOrder_argsSerializer implements TBeanSerializer<findOrder_args> {
//
//        @Override
//        public void read(findOrder_args bean, TProtocol iprot) throws TException {
//
//            com.isuwang.org.apache.thrift.protocol.TField schemeField;
//            iprot.readStructBegin();
//
//            while (true) {
//                schemeField = iprot.readFieldBegin();
//                if (schemeField.type == com.isuwang.org.apache.thrift.protocol.TType.STOP) {
//                    break;
//                }
//
//                switch (schemeField.id) {
//
//                    case 1:
//                        if (schemeField.type == com.isuwang.org.apache.thrift.protocol.TType.STRUCT) {
//                            com.isuwang.dapeng.demo.domain.FindOrderRequest elem0 = new com.isuwang.dapeng.demo.domain.FindOrderRequest();
//                            new FindOrderRequestSerializer().read(elem0, iprot);
//                            bean.setRequest(elem0);
//                        } else {
//                            com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
//                        }
//                        break;
//
//
//                    default:
//                        com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
//
//                }
//                iprot.readFieldEnd();
//            }
//            iprot.readStructEnd();
//
//            validate(bean);
//        }
//
//        @Override
//        public void write(findOrder_args bean, TProtocol oprot) throws TException {
//
//            validate(bean);
//            oprot.writeStructBegin(new com.isuwang.org.apache.thrift.protocol.TStruct("findOrder_args"));
//
//
//            oprot.writeFieldBegin(new com.isuwang.org.apache.thrift.protocol.TField("request", com.isuwang.org.apache.thrift.protocol.TType.STRUCT, (short) 1));
//            com.isuwang.dapeng.demo.domain.FindOrderRequest elem0 = bean.getRequest();
//            new FindOrderRequestSerializer().write(elem0, oprot);
//
//            oprot.writeFieldEnd();
//
//            oprot.writeFieldStop();
//            oprot.writeStructEnd();
//        }
//
//        public void validate(findOrder_args bean) throws TException {
//
//            if (bean.getRequest() == null)
//                throw new SoaException(SoaBaseCode.NotNull, "request字段不允许为空");
//
//            if (bean.getRequest() != null)
//                new FindOrderRequestSerializer().validate(bean.getRequest());
//
//        }
//
//
//        @Override
//        public String toString(findOrder_args bean) {
//            return bean == null ? "null" : bean.toString();
//        }
//
//    }
//
//    public static class FindOrder_resultSerializer implements TBeanSerializer<findOrder_result> {
//        @Override
//        public void read(findOrder_result bean, TProtocol iprot) throws TException {
//
//            com.isuwang.org.apache.thrift.protocol.TField schemeField;
//            iprot.readStructBegin();
//
//            while (true) {
//                schemeField = iprot.readFieldBegin();
//                if (schemeField.type == com.isuwang.org.apache.thrift.protocol.TType.STOP) {
//                    break;
//                }
//
//                switch (schemeField.id) {
//                    case 0:  //SUCCESS
//                        if (schemeField.type == com.isuwang.org.apache.thrift.protocol.TType.LIST) {
//                            com.isuwang.org.apache.thrift.protocol.TList _list0 = iprot.readListBegin();
//                            java.util.List<com.isuwang.dapeng.demo.domain.Order> elem0 = new java.util.ArrayList<>(_list0.size);
//                            for (int _i0 = 0; _i0 < _list0.size; ++_i0) {
//                                com.isuwang.dapeng.demo.domain.Order elem1 = new com.isuwang.dapeng.demo.domain.Order();
//                                new OrderSerializer().read(elem1, iprot);
//                                elem0.add(elem1);
//                            }
//                            iprot.readListEnd();
//                            bean.setSuccess(elem0);
//                        } else {
//                            com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
//                        }
//                        break;
//                  /*
//                  case 1: //ERROR
//                  bean.setSoaException(new SoaException());
//                  new SoaExceptionSerializer().read(bean.getSoaException(), iprot);
//                  break A;
//                  */
//                    default:
//                        com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
//                }
//                iprot.readFieldEnd();
//            }
//            iprot.readStructEnd();
//
//            validate(bean);
//        }
//
//        @Override
//        public void write(findOrder_result bean, TProtocol oprot) throws TException {
//
//            validate(bean);
//            oprot.writeStructBegin(new com.isuwang.org.apache.thrift.protocol.TStruct("findOrder_result"));
//
//
//            oprot.writeFieldBegin(new com.isuwang.org.apache.thrift.protocol.TField("success", com.isuwang.org.apache.thrift.protocol.TType.LIST, (short) 0));
//            java.util.List<com.isuwang.dapeng.demo.domain.Order> elem0 = bean.getSuccess();
//
//            oprot.writeListBegin(new com.isuwang.org.apache.thrift.protocol.TList(com.isuwang.org.apache.thrift.protocol.TType.STRUCT, elem0.size()));
//            for (com.isuwang.dapeng.demo.domain.Order elem1 : elem0) {
//                new OrderSerializer().write(elem1, oprot);
//            }
//            oprot.writeListEnd();
//
//
//            oprot.writeFieldEnd();
//
//            oprot.writeFieldStop();
//            oprot.writeStructEnd();
//        }
//
//
//        public void validate(findOrder_result bean) throws TException {
//
//            if (bean.getSuccess() == null)
//                throw new SoaException(SoaBaseCode.NotNull, "success字段不允许为空");
//
//        }
//
//
//        @Override
//        public String toString(findOrder_result bean) {
//            return bean == null ? "null" : bean.toString();
//        }
//    }
//
//    public static class findOrder<I extends com.isuwang.dapeng.demo.service.OrderService> extends SoaProcessFunction<I, findOrder_args, findOrder_result, FindOrder_argsSerializer, FindOrder_resultSerializer> {
//        public findOrder() {
//            super("findOrder", new FindOrder_argsSerializer(), new FindOrder_resultSerializer());
//        }
//
//        @Override
//        public findOrder_result getResult(I iface, findOrder_args args) throws TException {
//            findOrder_result result = new findOrder_result();
//
//            result.success = iface.findOrder(args.request);
//
//            return result;
//        }
//
//
//        @Override
//        public findOrder_args getEmptyArgsInstance() {
//            return new findOrder_args();
//        }
//
//        @Override
//        protected boolean isOneway() {
//            return false;
//        }
//    }
//
//
//    public static class getServiceMetadata_args {
//
//        @Override
//        public String toString() {
//            return "{}";
//        }
//    }
//
//
//    public static class getServiceMetadata_result {
//
//        private String success;
//
//        public String getSuccess() {
//            return success;
//        }
//
//        public void setSuccess(String success) {
//            this.success = success;
//        }
//
//        @Override
//        public String toString() {
//            StringBuilder stringBuilder = new StringBuilder("{");
//            stringBuilder.append("\"").append("success").append("\":\"").append(this.success).append("\",");
//            stringBuilder.deleteCharAt(stringBuilder.lastIndexOf(","));
//            stringBuilder.append("}");
//
//            return stringBuilder.toString();
//        }
//    }
//
//    public static class GetServiceMetadata_argsSerializer implements TBeanSerializer<getServiceMetadata_args> {
//
//        @Override
//        public void read(getServiceMetadata_args bean, TProtocol iprot) throws TException {
//
//            com.isuwang.org.apache.thrift.protocol.TField schemeField;
//            iprot.readStructBegin();
//
//            while (true) {
//                schemeField = iprot.readFieldBegin();
//                if (schemeField.type == com.isuwang.org.apache.thrift.protocol.TType.STOP) {
//                    break;
//                }
//                switch (schemeField.id) {
//                    default:
//                        com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
//
//                }
//                iprot.readFieldEnd();
//            }
//            iprot.readStructEnd();
//
//            validate(bean);
//        }
//
//
//        @Override
//        public void write(getServiceMetadata_args bean, TProtocol oprot) throws TException {
//
//            validate(bean);
//            oprot.writeStructBegin(new com.isuwang.org.apache.thrift.protocol.TStruct("getServiceMetadata_args"));
//            oprot.writeFieldStop();
//            oprot.writeStructEnd();
//        }
//
//        public void validate(getServiceMetadata_args bean) throws TException {
//        }
//
//        @Override
//        public String toString(getServiceMetadata_args bean) {
//            return bean == null ? "null" : bean.toString();
//        }
//
//    }
//
//    public static class GetServiceMetadata_resultSerializer implements TBeanSerializer<getServiceMetadata_result> {
//        @Override
//        public void read(getServiceMetadata_result bean, TProtocol iprot) throws TException {
//
//            com.isuwang.org.apache.thrift.protocol.TField schemeField;
//            iprot.readStructBegin();
//
//            while (true) {
//                schemeField = iprot.readFieldBegin();
//                if (schemeField.type == com.isuwang.org.apache.thrift.protocol.TType.STOP) {
//                    break;
//                }
//
//                switch (schemeField.id) {
//                    case 0:  //SUCCESS
//                        if (schemeField.type == com.isuwang.org.apache.thrift.protocol.TType.STRING) {
//                            bean.setSuccess(iprot.readString());
//                        } else {
//                            com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
//                        }
//                        break;
//                    default:
//                        com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
//                }
//                iprot.readFieldEnd();
//            }
//            iprot.readStructEnd();
//
//            validate(bean);
//        }
//
//        @Override
//        public void write(getServiceMetadata_result bean, TProtocol oprot) throws TException {
//
//            validate(bean);
//            oprot.writeStructBegin(new com.isuwang.org.apache.thrift.protocol.TStruct("getServiceMetadata_result"));
//
//            oprot.writeFieldBegin(new com.isuwang.org.apache.thrift.protocol.TField("success", com.isuwang.org.apache.thrift.protocol.TType.STRING, (short) 0));
//            oprot.writeString(bean.getSuccess());
//            oprot.writeFieldEnd();
//
//            oprot.writeFieldStop();
//            oprot.writeStructEnd();
//        }
//
//        public void validate(getServiceMetadata_result bean) throws TException {
//
//            if (bean.getSuccess() == null)
//                throw new SoaException(SoaBaseCode.NotNull, "success字段不允许为空");
//        }
//
//        @Override
//        public String toString(getServiceMetadata_result bean) {
//            return bean == null ? "null" : bean.toString();
//        }
//    }
//
//    public static class getServiceMetadata<I extends com.isuwang.dapeng.demo.service.OrderService> extends SoaProcessFunction<I, getServiceMetadata_args, getServiceMetadata_result, GetServiceMetadata_argsSerializer, GetServiceMetadata_resultSerializer> {
//        public getServiceMetadata() {
//            super("getServiceMetadata", new GetServiceMetadata_argsSerializer(), new GetServiceMetadata_resultSerializer());
//        }
//
//        @Override
//        public getServiceMetadata_result getResult(I iface, getServiceMetadata_args args) throws TException {
//            getServiceMetadata_result result = new getServiceMetadata_result();
//
//            try (InputStreamReader isr = new InputStreamReader(OrderServiceCodec.class.getClassLoader().getResourceAsStream("com.isuwang.dapeng.demo.service.OrderService.xml"));
//                 BufferedReader in = new BufferedReader(isr)) {
//                int len = 0;
//                StringBuilder str = new StringBuilder("");
//                String line;
//                while ((line = in.readLine()) != null) {
//
//                    if (len != 0) {
//                        str.append("\r\n").append(line);
//                    } else {
//                        str.append(line);
//                    }
//                    len++;
//                }
//                result.success = str.toString();
//
//            } catch (Exception e) {
//                e.printStackTrace();
//                result.success = "";
//            }
//
//            return result;
//        }
//
//        @Override
//        public getServiceMetadata_args getEmptyArgsInstance() {
//            return new getServiceMetadata_args();
//        }
//
//        @Override
//        protected boolean isOneway() {
//            return false;
//        }
//    }
//
//    @SuppressWarnings("unchecked")
//    public static class Processor<I extends com.isuwang.dapeng.demo.service.OrderService> extends SoaScalaBaseProcessor {
//        public Processor(I iface) {
//            super(iface, getProcessMap(new java.util.HashMap<>()));
//        }
//
//        @SuppressWarnings("unchecked")
//        private static <I extends com.isuwang.dapeng.demo.service.OrderService> java.util.Map<String, SoaProcessFunction<I, ?, ?, ? extends TBeanSerializer<?>, ? extends TBeanSerializer<?>>> getProcessMap(java.util.Map<String, SoaProcessFunction<I, ?, ?, ? extends TBeanSerializer<?>, ? extends TBeanSerializer<?>>> processMap) {
//
//            processMap.put("findOrder", new findOrder());
//
//            processMap.put("getServiceMetadata", new getServiceMetadata());
//
//            return processMap;
//        }
//    }
//
//}
