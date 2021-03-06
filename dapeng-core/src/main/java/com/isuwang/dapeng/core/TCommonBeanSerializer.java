package com.isuwang.dapeng.core;

import com.isuwang.org.apache.thrift.TException;
import com.isuwang.org.apache.thrift.protocol.TProtocol;

/**
 * Created by ever on 2017/7/17.
 */
public interface TCommonBeanSerializer<T> {

    T read(TProtocol iproto) throws TException;

    void write(T bean, TProtocol oproto) throws TException;

    void validate(T bean) throws TException;

    String toString(T bean);
}
