package com.isuwang.dapeng.core.definition;

import com.isuwang.dapeng.core.BeanSerializer;
import com.isuwang.dapeng.core.SoaException;

import java.util.concurrent.Future;

/**
 * Created by lihuimin on 2017/12/14.
 */
public abstract class SoaFunctionDefinition<I, REQ, RESP>  {

    public static abstract class Sync<I, REQ, RESP> extends SoaFunctionDefinition<I, REQ, RESP> {

        public Sync(String methodName, BeanSerializer<REQ> reqSerializer, BeanSerializer<RESP> respSerializer){
            super(methodName, reqSerializer, respSerializer);
        }

        public abstract RESP apply(I iface, REQ req) throws SoaException;
    }

    public static abstract class Async<I, REQ, RESP> extends SoaFunctionDefinition<I, REQ, RESP> {

        public Async(String methodName, BeanSerializer<REQ> reqSerializer, BeanSerializer<RESP> respSerializer){
            super(methodName, reqSerializer, respSerializer);
        }

        public abstract Future<RESP> apply(I iface, REQ req) throws SoaException;
    }

    public final String methodName;
    public final BeanSerializer<REQ> reqSerializer;
    public final BeanSerializer<RESP> respSerializer;

    public SoaFunctionDefinition(String methodName, BeanSerializer<REQ> reqSerializer, BeanSerializer<RESP> respSerializer) {
        this.methodName = methodName;
        this.reqSerializer = reqSerializer;
        this.respSerializer = respSerializer;
    }


}
