package com.isuwang.soa;

      import com.isuwang.dapeng.core.*;
      import com.isuwang.org.apache.thrift.*;
      import java.util.ServiceLoader;
      import com.isuwang.soa.SchedualServiceCodec.*;
      import com.isuwang.soa.service.SchedualService;

      /**
       * Autogenerated by Dapeng-Code-Generator (1.2.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated

      **/
      public class SchedualServiceClient implements SchedualService{
        private final String serviceName;
        private final String version;

        private SoaConnectionPool pool;

      public SchedualServiceClient() {
        this.serviceName = "com.isuwang.soa.service.SchedualService";
        this.version = "1.0.0";

        ServiceLoader<SoaConnectionPoolFactory> factories = ServiceLoader.load(SoaConnectionPoolFactory.class);
        for (SoaConnectionPoolFactory factory: factories) {
          this.pool = factory.getPool();
          break;
        }
        this.pool.registerClientInfo(serviceName,version);
      }

      
        
       /**
       * 
       **/
          
            public String test() throws SoaException{

              String methodName = "test";

              test_args test_args = new test_args();
              

              test_result response = pool.send(serviceName,version,"test",test_args, new Test_argsSerializer(), new Test_resultSerializer());

              
                  
                      return response.getSuccess();
                    
                
          }
          
        

        

      /**
      * getServiceMetadata
      **/
      public String getServiceMetadata() throws SoaException {
        String methodName = "getServiceMetadata";
          getServiceMetadata_args getServiceMetadata_args = new getServiceMetadata_args();
          getServiceMetadata_result response = pool.send(serviceName,version,methodName,getServiceMetadata_args, new GetServiceMetadata_argsSerializer(), new GetServiceMetadata_resultSerializer());
          return response.getSuccess();
      }

      }
    