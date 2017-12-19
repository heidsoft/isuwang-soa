package com.isuwang.dapeng.impl.filters;


import com.isuwang.dapeng.api.FilterChain;
import com.isuwang.dapeng.api.FilterContext;
import com.isuwang.dapeng.api.HandlerFilter;
import com.isuwang.org.apache.thrift.TException;

public class TimeoutFilter implements HandlerFilter {

    @Override
    public void onEntry(FilterContext ctx, FilterChain next) throws TException {

        next.onEntry(ctx);


    }

    @Override
    public void onExit(FilterContext ctx, FilterChain prev) throws TException {

        prev.onExit(ctx);

    }
}